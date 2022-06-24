package Homeworksuper;

public class Task2
{
}
class Shape{

    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{

    Circle(double radius){
        super (radius);
    }
}