package ru.avbugorov.interviews1.lesson1.shape;


public abstract class Shape {
  private String name;
  private Double perimeter;
  private Double square;


  public Shape() {
  }

  protected abstract Double getPerimeter();

  protected abstract Double getSquare();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
