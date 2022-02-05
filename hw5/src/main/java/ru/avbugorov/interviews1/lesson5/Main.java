package ru.avbugorov.interviews1.lesson5;

import ru.avbugorov.interviews1.lesson5.dao.StudentDao;
import ru.avbugorov.interviews1.lesson5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
  static StudentDao studentDao = new StudentDao();

  public static void main(String[] args) {
    studentDao.save(initStudentList(1000));
    studentDao.getAll().forEach(st -> System.out.println(st));
    System.out.println();

    Long index = 998l;
    Student student = new Student();
    student.setId(index);
    student.setName("NameAfterUpdate");
    student.setMark("MarkAfterUpdate");

    System.out.println(updateEntityStudentAndGetResult(index, student));
    System.out.println();
    System.out.println(deleteEntityStudentByIDAndGetResult(index));
    System.out.println();
    System.out.println(updateEntityStudentAndGetResult(index, student));
    System.out.println();
    index = 2000l;
    System.out.println(deleteEntityStudentByIDAndGetResult(index));

  }


  private static String updateEntityStudentAndGetResult(Long index, Student student) {
    return studentDao.update(student) ?
        "Успешное выполнение метода \"update\". Результат работы : entity:" + studentDao.returnStudentById(index) :
        "Метод update не смог обновить значения. Entity c \"Id\" = " + index + " не найдена";
  }

  private static String deleteEntityStudentByIDAndGetResult(Long index) {
    return studentDao.deleteById(index) ?
        "Успешное выполнение метода \"deleteById\": entity c \"Id\" = " + index + " удалена" :
        "Метод \"deleteById\" не смог найти entity c \"Id\" = " + index;
  }

  /**
   * Метод генериркут рандомный ArrayList Student с количеством записей quantity
   *
   * @return ArrayList Student
   * @Params quantity количество элементов
   */
  private static List<Student> initStudentList(Integer quantity) {
    List studentList = new ArrayList();
    for (int i = 0; i < quantity; i++) {
      Student student = new Student();
      student.setName("Name" + (i + 1));
      student.setMark("Mark" + (i + 1));
      studentList.add(student);
    }
    return studentList;
  }
}
