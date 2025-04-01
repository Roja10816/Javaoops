package jattask6;

	// Define the Person class
	public class Person {
	    // Declare attributes
	    private String name;
	    private int age;

	    // Constructor to initialize name and age
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    // Main method to test the Person class
	    public static void main(String[] args) {
	        // Create an instance of Person
	        Person person = new Person("Alice", 25);

	        // Access and display the attributes using getter methods
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
	}



