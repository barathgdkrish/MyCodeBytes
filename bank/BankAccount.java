package bank;

import java.util.Scanner;

public class BankAccount {

	private int bankAccountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNumber;
	public static void main(String[] args) {

		BankAccount Me = new BankAccount();
		System.out.println("Enter Customer's Name: ");
		Scanner sc = new Scanner(System.in);
		Me.setCustomerName(sc.nextLine());
		System.out.println("Enter bank Account Number: ");
		Me.setBankAccountNumber(sc.nextInt());
		System.out.println("Enter Existing Balance: ");
		Me.setBalance(sc.nextDouble());
		System.out.println("Enter Customer's Email: ");
		Me.setEmail(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter Customer's Phone Number: ");
		Me.setPhoneNumber(sc.nextLong());
		short count=0;
		while(count<3)
		{
			count ++;
			if(sc.hasNextLine()) {

				
			System.out.println("Enter 1 for Withdrawal and 2 for Deposits");
			int i = sc.nextInt();
			sc.nextLine();
			if(i==1) {
				System.out.println("Enter amount to be withdrawn: ");
				Me.withdrawFunds(sc.nextDouble());
			}
			if(i==2) {
				System.out.println("Enter amount to be deposited: ");
				Me.depositFunds(sc.nextDouble());
			}
			System.out.println("Customer Information:\n");
			System.out.println(Me.getCustomerName());
			System.out.println(Me.getEmail());
			System.out.println(Me.getPhoneNumber());
			System.out.println(Me.getBankAccountNumber());
			System.out.println(Me.getBalance());
			}else {
				System.out.println("Invalid option");
				count--;
			}
		}
		
		sc.close();
	}
	public void depositFunds(double funds) {
		if(funds>0) {
			this.balance+=funds;
			System.out.println("New balance is: "+this.balance);
		}
		else this.withdrawFunds(funds);
	}
	public void withdrawFunds(double funds) {
		funds=funds<0?funds:funds*-1;
		if (this.balance+funds<0)
			System.out.println("Insufficient funds");
		else this.balance+=funds;
			
		System.out.println("New balance is: "+this.balance);
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	

}
