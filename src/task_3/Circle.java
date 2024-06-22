package task_3;

public class Circle {
	// data member
    private double radius;
	private double pi;

    // Constructor with zero arguments 
    public Circle() {
        radius = 2.0;
    }
    // Constructor with two arguments
    public Circle(double radius,double pi) {
        this.radius = radius;
        this.pi = pi;
    }
     // circumference calculation
    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
       
    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1: Radius = " + circle1.getRadius() + ", Circumference = " + circle1.calculateCircumference());

        Circle circle2 = new Circle(2.5,3.14);
        System.out.println("Circle 2: Radius = " + circle2.getRadius() + ", Circumference = " + circle2.calculateCircumference());
    }
}

