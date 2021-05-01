package vehicles;

public class Toyota extends Car{
	
	private boolean engine;
	private int cylinders;
	private int wheels;
	private int gear;
	private int speed;
	protected Toyota(int cylinders, int wheels, boolean isAutomatic) {
		super("Toyota", cylinders, wheels, isAutomatic);
		this.engine = false;
		this.cylinders = cylinders;
		this.wheels = wheels;
		this.gear = 0;
		this.speed = 0;
	}
	public void startEngine() {
		this.engine = true;
		System.out.println("Toyota is started");
	}
	public boolean getEngine() {
		return engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	public int getGear() {
		return gear;
	}
	public int getSpeed() {
		return speed;
	}

}
