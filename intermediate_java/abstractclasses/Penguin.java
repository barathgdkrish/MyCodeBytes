package abstractclasses;

public class Penguin extends Bird implements ICanFly{

	public Penguin(String name) {
		super(name);
		}

	@Override
	public void fly() {
		System.out.println("I'm intelligent and not very good at Flying :(");
		
	}

}
