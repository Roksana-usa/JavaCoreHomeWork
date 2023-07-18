package hw12Polymorphism;


public class TestFamily {
	
	public static void main(String[] args) {
		System.out.println();
	
		// Method overloaded
		Sister sister=new Sister();
		sister.sister();
		sister.sister(20, 30, "60");
		sister.sister(20, 30, 40, "45");
		sister.sister(25, 26, 27, 28, 29);
		sister.sister(45, 50, 26, 26, 16);
		
		System.out.println("This is all about niece class");	
		
		// Method overridden
		Niece niece = new Niece();
		niece.sister();
		niece.sister(24, 30, "35");
		niece.sister(24, 25, 26, "35");
	}

}
