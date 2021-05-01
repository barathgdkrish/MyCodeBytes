package computer;

public class Main {

	public static void main(String[] args) {

			Dimensions dimensions = new Dimensions(20, 20, 5);
			Case theCase = new Case("Alienware", "Dell", "240", dimensions);
			Monitor theMonitor = new Monitor("LED2.0", "Samsung", 32, new Resolution(2540, 1440));
			Motherboard theMotherboard = new Motherboard("R-15", "Dell", 4, 6, "A14");
			
			PC newPC = new PC(theCase, theMonitor, theMotherboard);
			
			newPC.getTheCase().powerButton();
			newPC.getTheMotherboard().loadProgram("Windows 8.1");
			newPC.getTheMonitor().drawPixelAt(1500,1200, "red");
					
	}

}
