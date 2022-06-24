package class20hw;
/*
Write program: Shape class has a constructor that takes the radius
 and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code

 */
class Shape {

    double radius;

    Shape(double radius) {
        this.radius = radius;
    }


    class circle extends Shape {

        circle(double radius) {
            super(radius);
        }

        void calculateANdprintArea() {
            double area = Math.PI * Math.pow(radius, 2);
        }
    }

    public void main(String[] args) {
        circle rcircle = new circle(2);
        rcircle.calculateANdprintArea();

    }
}