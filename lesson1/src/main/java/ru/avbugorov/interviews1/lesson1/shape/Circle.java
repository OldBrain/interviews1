package ru.avbugorov.interviews1.lesson1.shape;

import static java.lang.Math.*;

public class Circle extends Shape {
  double radius;

  //Перегрузка-полиморфизм
  public Circle(double radius) {
    this.radius = radius;
    setName("Круг");
  }

  @Override
  protected Double getPerimeter() {
    return Double.valueOf(round(2 * PI * radius));
  }

  @Override
  protected Double getSquare() {
    return Double.valueOf(round(PI * radius * radius));
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
