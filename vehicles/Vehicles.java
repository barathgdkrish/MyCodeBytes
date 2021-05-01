package vehicles;

public abstract class Vehicles {
private String vehicle;
private String Steering;
private short gears;
private double speed;

protected Vehicles(String vehicle,String steering, short gears, double speed) {
	this.vehicle = vehicle;
	this.Steering = steering;
	this.gears = gears;
	this.speed = speed;
}

public String getVehicle() {
	return vehicle;
}

public String getSteering() {
	return Steering;
}

public short getGears() {
	return gears;
}

public double getSpeed() {
	return speed;
}



}
