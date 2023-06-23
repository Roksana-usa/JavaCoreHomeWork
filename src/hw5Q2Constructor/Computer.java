package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", and Made in the USA? Ans: " + madeInUSA);
	}

	public Computer(String brand, int price, String model, String operatingSystem, char grade, boolean madeInUSA) {
		System.out.println("My brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", and Made in the USA? Ans: " + madeInUSA);

	}
}
/*
 * Q 1: HW05A: Create a package name "hw5Q2Constructor" in your Home Work
 * project. Inside the package, a) Create a class "Computer". Declare some
 * variables -- brand, model, operating system, price, grade (consider grade as
 * char), and madeInUSA (boolean type). Declare default constructor and more
 * than one parameterized constructor. Use only one System.out.println() in each
 * constructor. b) Create another class ComputerTest. Create objects from the
 * Computer class, as many as you want inside the main method. Initialize all
 * the constructors. My expectation is to see in the console, the first outcome
 * as -> This is from the default Constructor of Computer class. The second
 * outcome is -> My Brand: Apple, Model: MacBook Air, Operating system: MacOS
 * Mojave, Price: $800, Grade: A, and Made in the USA? Ans: false. I want the
 * third outcome in the console for your configuration. Organize your code. Push
 * in the GitHub. Paste your GitHub link below.
 * 
 * 
 * 
 */
