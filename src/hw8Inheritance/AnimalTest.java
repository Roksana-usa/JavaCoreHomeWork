package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		System.out.println("\n 1. Animal Class. \n");
		Animal animal = new Animal();
		animal.animalInfo();// Parent class.

		System.out.println("\n 2. Mammal class. \n ");
		Mammal mammal = new Mammal(); // Child class and Example of Single Inheritance.
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n 3. Bird class. \n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();// Example of Hierarchical inheritance.

		System.out.println("\n 4. Robin Class. \n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.animalInfo();
		robin.birdsInfo();

		System.out.println("\n 5. Dog Class. \n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.animalInfo();
		dog.mammalInfo();

		System.out.println("\n 6. Bulldog Class.\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.animalInfo();
		bullDog.mammalInfo();

		System.out.println("\n 7. Snake Class. \n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.animalInfo();

		System.out.println("\n 8. Cobra Class.\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.animalInfo();// Example of multilevel inheritance.

		System.out.println("\n 9. Reptile Class. \n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

	}

}
