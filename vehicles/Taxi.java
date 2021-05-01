package vehicles;

public class Taxi extends Car{
	
	private boolean engine;
	private int cylinders;
	private int wheels;
	private int gear;
	private int speed;
	protected Taxi(int cylinders, int wheels, boolean isAutomatic) {
		super("Taxi", cylinders, wheels, isAutomatic);
		this.engine = false;
		this.cylinders = cylinders;
		this.wheels = wheels;
		this.gear = 0;
		this.speed = 0;
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
	public String className() {
		
		return getClass().getSimpleName();
	}

}
