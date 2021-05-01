package bank;

public class Main {

	public static void main(String [] args) {
		
		Bank HDFC = new Bank("HDFC");
		HDFC.addNewBranch("Mannivakkam");
		HDFC.getBranch("Mannivakkam").addNewCustomer("Barath", 100000.0);
		HDFC.getBranch("Mannivakkam").addNewCustomer("Tejesh", 100000.0);
		HDFC.getBranch("Mannivakkam").addNewCustomer("Rakesh", 100000.0);
		HDFC.getBranch("Mannivakkam").addNewTransaction("Barath", 100.0);
		HDFC.getBranch("Mannivakkam").addNewTransaction("Shiva", 1000.0);
		HDFC.getBranch("Mannivakkam").printCustomers();
		
	}

	
}
