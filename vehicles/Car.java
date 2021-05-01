package vehicles;

public class Car{

	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	private int gear;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public int getGear() {
		return gear;
	}
	private boolean isAutomatic;
	public boolean getEngine() {
		return engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	protected Car(String name,int cylinders, int wheels, boolean isAutomatic) {
		this.name = name;
		this.engine = false;
		this.cylinders = cylinders;
		this.wheels = wheels;
		this.isAutomatic = isAutomatic;
		this.gear = 0;
		this.speed = 0;
	}
	
	public void startEngine() {
		this.engine = true;
		System.out.println("The car is started");
	}
	public void accelerate() {
		if(this.isAutomatic) {
			System.out.println("The "+this.name+" is accelerating");
		}else {
		if(this.gear<4)
			this.gear++;
		else {
			System.out.println(this.name+ "is at Max Speed !!!");
		}
		this.speed = gear*20;
		
		System.out.println("The speed of "+this.name+" been increased to "+this.speed+" at gear "+this.gear);
	}
	}
	public void brake() {
		if(this.isAutomatic) {
			System.out.println("The "+this.name+" is decelerating");
		}else {
		if(this.gear<=0)
			System.out.println("The engine is idle..");
		else {
			this.gear--;
			this.speed-=20;
			
		System.out.println("The speed of "+this.name+" has been reduced to "+this.speed+" at gear "+this.gear);
			
		}
	}
	}
	public String getName() {
		return name;
	}
}
