package printer;

public class Main {

	public static void main(String[] args) {
		
		Printer printer = new Printer(49, true);
		System.out.println("Toner added "+printer.addToner(50));
		System.out.println("# of papers to be printed in "+printer.printPages(120));
		System.out.println("Printed pages "+printer.getPagesPrinted());
	}

}
