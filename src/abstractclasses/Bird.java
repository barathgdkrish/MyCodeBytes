package abstractclasses;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(super.getName()+getClass().getSimpleName()+" is pecking");		
	}

	@Override
	public void breathe() {
		System.out.println(super.getName()+getClass().getSimpleName()+" is breathing");
	}

}
