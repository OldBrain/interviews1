package ru.avbugorov.interviews1.lesson5.config;

import org.hibernate.SessionFactory;


public class ApplicationSessionFactoryHolder {

  public static SessionFactory sessionFactory() {
    return new org.hibernate.cfg.Configuration()
        .configure("hibernate.cfg.xml")
        .buildSessionFactory();
  }

}
