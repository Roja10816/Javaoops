package jattask6;

	public class Circle {
	    // Data member to store the radius of the circle
	    private double radius;

	    // Constructor with no arguments (sets a default radius)
	    public Circle() {
	        this.radius = 1.0; // Default radius is 1.0
	    }

	    // Constructor with one argument to initialize the radius
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate and return the circumference of the circle
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    // Main method to test the Circle class
	    public static void main(String[] args) {
	        // Create a Circle object using the no-argument constructor
	        Circle circle1 = new Circle();
	        System.out.println("Circumference of circle with default radius: " + circle1.calculateCircumference());

	        // Create a Circle object using the constructor with radius argument
	        Circle circle2 = new Circle(5.0);
	        System.out.println("Circumference of circle with radius 5.0: " + circle2.calculateCircumference());
	    }
	}



