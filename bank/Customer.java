package bank;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	
	public Customer(String customerName, double initialTransaction){
		this.customerName = customerName;
		this.transactions.add(initialTransaction);
		System.out.println("Customer "+customerName+" added, Initial Transaction "+initialTransaction+" $");
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void addTransactions(double transaction) {
		this.transactions.add(transaction);
	}
	
	public void printCustomerTransactions() {
		System.out.println("\nCustomer "+this.customerName+" has the following transactions");
		for(int i=0;i<this.transactions.size();i++) {
		System.out.println((i+1)+". "+" Transaction of "+transactions.get(i)+" $");
		}
	}
	
	
}
