package abstractclasses;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		// Bird parrot = new Bird("Parrot"); CANNOT Instantiate an Abstract class
		Crow crow = new Crow("Raven");
		crow.breathe();
		crow.eat();
		crow.fly();
		Penguin penguin = new Penguin("Emperor");
		penguin.breathe();
		penguin.eat();
		penguin.fly();

	}
}
