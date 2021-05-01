package room;

public class Room {
	private Furniture furniture;
	private Electricals electricals;
	private Stationaries stationaries;
	private Doors doors;
	public Furniture getFurniture() {
		return furniture;
	}
	public Electricals getElectricals() {
		return electricals;
	}
	public Stationaries getStationaries() {
		return stationaries;
	}
	protected Room(Furniture furniture, Electricals electricals, Stationaries stationaries,Doors doors) {
		super();
		this.furniture = furniture;
		this.electricals = electricals;
		this.stationaries = stationaries;
		this.doors = doors;
	}
	public Doors getDoors() {
		return doors;
	}
	
}
