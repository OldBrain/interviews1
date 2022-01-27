package ru.avbugorov.interviews1.lesson1.shape;

public class Rectangle extends Shape {
  private double a;
  private double b;

  //Перегрузка-полиморфизм
  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
    setName(shapeNameGenerate(a, b));
  }

  private String shapeNameGenerate(double a, double b) {
    if (a == b) {
      return "Квадрат";
    } else {
      return "Прямоугольник";
    }
  }

  @Override
  protected Double getPerimeter() {
    return a * 2 + b * 2;
  }

  @Override
  protected Double getSquare() {
    return a * b;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }
}
