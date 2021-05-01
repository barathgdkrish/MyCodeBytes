package abstractclasses;

public class Crow extends Bird implements ICanFly{

	public Crow(String name) {
		super(name);
		}

	@Override
	public void fly() {
		System.out.println("I'm intelligent and am Flying now !!!");
		
	}

}
