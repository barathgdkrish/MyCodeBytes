package room;

public class Home {

	public static void main(String[] args) {

		Furniture furniture = new Furniture("Cot", "King", "Sleeping", 1);
		Doors doors = new Doors("White", false, "Bathroom");
		Electricals electricMachines = new Electricals("Fan", "120W", "Cool the room");
		Stationaries stationaries = new Stationaries("Parker", "Pen", "Write");
		Room room = new Room(furniture, electricMachines, stationaries, doors); 
		
		room.getDoors().openClose();
		System.out.println(room.getElectricals().getPurpose());
		room.getDoors().openClose();
		
		
	}

}
