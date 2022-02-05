package ru.avbugorov.interviews1.lesson1.shape;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(10);
    Shape rectangle = new Rectangle(8, 9);
    Shape square = new Rectangle(5, 5);
    Shape triangle0 = new Triangle(10d, 10d, 30f);
    Shape triangle1 = new Triangle(10d, 10d, 30d, 15d);
    Shape[] shapes = {circle,
        rectangle,
        square,
        triangle0,
        triangle1};

    for (Shape s : shapes) {
      System.out.println(s.getName() + " площадь=" + s.getSquare() + " периметр=" + s.getPerimeter());
    }

    Triangle triangle2 = new Triangle();
    System.out.println("Периметр треугольника =" + triangle2.getPerimeter(2d, 2d, 2d));
    System.out.println("Периметр треугольника =" + triangle2.getPerimeter(2d, 2d, 60f));
    System.out.println("Площадь треугольника =" + triangle2.getSquare(10d, 15d));
    System.out.println("Площадь треугольника =" + triangle2.getSquare(4d, 3d, 25f));
  }
}
