package bank;

import java.util.ArrayList;

class Branch {
	private String branchName;
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public Branch(String branchName) {

		this.branchName = branchName;
	}

	public void addNewCustomer(String customerName, double initialTransaction) {
		if (findPosition_CustomerName(customerName) < 0)
			this.customers.add(new Customer(customerName, initialTransaction));
		else
			System.out.println("The customer " + customerName + " already exists");
	}

	
	/*
	 * private int findPosition_Customer(Customer customer) { return
	 * customers.indexOf(customer); }
	 */
	
	private int findPosition_CustomerName(String customerName) {
		for(int i=0;i<customers.size();i++) {
			if(customerName.equals(customers.get(i).getCustomerName()))
					return i;
		}
		return -1;
	}
	

	public void addNewTransaction(String customerName, double transaction) {
		int position = findPosition_CustomerName(customerName);
		if (position < 0) {
			System.out.println("Customer " + customerName + " not found in the database");
			return;
		}
		customers.get(position).addTransactions(transaction);
	}

	public String getBranchName() {
		return branchName;
	}

	public void printCustomers() {
		for (int i = 0; i < customers.size(); i++) {
			customers.get(i).printCustomerTransactions();
		}
	}
}
