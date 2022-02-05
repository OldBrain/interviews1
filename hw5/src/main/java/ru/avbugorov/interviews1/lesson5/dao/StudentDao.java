package ru.avbugorov.interviews1.lesson5.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.avbugorov.interviews1.lesson5.config.ApplicationSessionFactoryHolder;
import ru.avbugorov.interviews1.lesson5.model.Student;

import java.util.List;

public class StudentDao {
  final private SessionFactory sessionFactory;


  public StudentDao() {
    this.sessionFactory = ApplicationSessionFactoryHolder.sessionFactory();
  }

  public List<Student> getAll() {
    List<Student> tempList;
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    tempList = session.createQuery("from Student ").list();
    session.getTransaction().commit();
    return tempList;
  }

  public void save(Student student) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(student);
    session.getTransaction().commit();
  }

  public void save(List<Student> students) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    students.forEach(st -> session.save(st));
    session.getTransaction().commit();
  }

  public Student returnStudentById(long id) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    Student student = session.get(Student.class, id);
    session.getTransaction().commit();
    return student;
  }

  public boolean update(Student student) {
    if (returnStudentById(student.getId())==null) {
      return false;
    }
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.saveOrUpdate(student);
    session.getTransaction().commit();
    return true;
  }

  public boolean deleteById(Long id) {
    if (returnStudentById(id)==null) {
      return false;
    }
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    Student product = session.get(Student.class, id);
    session.delete(product);
    session.getTransaction().commit();
    return true;
  }
}
