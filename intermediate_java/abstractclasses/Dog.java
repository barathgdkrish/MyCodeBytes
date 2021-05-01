package abstractclasses;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(super.getName()+" "+getClass().getSimpleName()+" is eating");		
	}

	@Override
	public void breathe() {
		System.out.println(super.getName()+getClass().getSimpleName()+" is breathing");
	}

}
