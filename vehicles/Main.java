package vehicles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Taxi taxi = new Taxi(4, 3, true);
		Toyota toyota = new Toyota(6, 4, false);
		Audi audi = new Audi(8, 4, false);
		BMW bmw = new BMW(10, 4, false);
		Benz benz = new Benz(12, 4, false);
		taxi.startEngine();
		toyota.startEngine();
		audi.startEngine();
		bmw.startEngine();
		benz.startEngine();
		System.out.println(taxi.className());
		Scanner sc = new Scanner(System.in);
		short count = 0;
		while(count<10) {
			
		count++;
		
		if(sc.nextInt()==1) {	
		taxi.accelerate();
		toyota.accelerate();
		audi.accelerate();
		bmw.accelerate();
		benz.accelerate();
		}else {
			
			taxi.brake();
			toyota.brake();
			audi.brake();
			bmw.brake();
			benz.brake();
		}
		sc.nextLine();
	}
		sc.close();
}
}
