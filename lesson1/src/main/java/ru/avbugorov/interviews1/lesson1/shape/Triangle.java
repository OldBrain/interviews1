package ru.avbugorov.interviews1.lesson1.shape;

import static java.lang.Math.*;

public class Triangle extends Shape {
  private double a;
  private double b;
  private double c;
  private float angleBetween;
  private double h;

  public Triangle() {
  }

  public Triangle(double b, double h) {
    this.b = b;
    this.h = h;
    setName("Треугольник");
  }

  //Перегрузка-полиморфизм
  public Triangle(double a, double b, double c, double h) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.h = h;

    setName("Треугольник");
  }

  //Перегрузка-полиморфизм
  public Triangle(double a, double b, float angleBetween) {
    this.angleBetween = angleBetween;
    this.a = a;
    this.b = b;
    setName("Треугольник");
  }

  @Override
  protected Double getPerimeter() {
    if (angleBetween == 0) {
      return getPerimeter(a, b, c);
    }
    if (c == 0 && angleBetween != 0) {
      return getPerimeter(a, b, angleBetween);
    }
    System.out.println("Неверные исходные данные для расчета");
    return null;
  }

  //Перегрузка-полиморфизм
  public Double getPerimeter(double a, double b, double c) {
    return a + b + c;
  }

  //Перегрузка-полиморфизм
  public Double getPerimeter(double a, double b, float angleBetween) {
    return Double.valueOf(round(sqrt(a * a + b * b - 2 * b * a * cos(toRadians(angleBetween)) + a + b)));
  }

  @Override
  protected Double getSquare() {
    if (h != 0 && b != 0) {
      return getSquare(b, h);
    }
    if (a != 0 && b != 0 && angleBetween != 0) {
      return getSquare(a, b, angleBetween);
    }
    System.out.println("Неверные исходные данные для расчета");
    return null;
  }

  //Перегрузка-полиморфизм
  public Double getSquare(double a, double b, float angleBetween) {
    return Double.valueOf(round(b * a * sin(toRadians(angleBetween)) / 2));
  }

  //Перегрузка-полиморфизм
  public Double getSquare(double b, double h) {
    return b * h / 2;
  }


}
