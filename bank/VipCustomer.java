package bank;

public class VipCustomer {

	private String name;
	private String emailId;
	private double creditLimit;
	
	public static void main(String[] args) {
		
	VipCustomer vip = new VipCustomer("Barath","barathgdkrish@hotmail.com",10000000);
	
	System.out.println(vip.getName());
	System.out.println(vip.getEmailId());
	System.out.println(vip.getCreditLimit());
	}
	VipCustomer()
	{
		this("John Doe","johndoe@email.com",0.0);
	}
	VipCustomer(String name,String emailId)
	{
		this(name,emailId,0.0);
	}
	VipCustomer(String name, String emailId, double creditLimit)
	{
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public String getEmailId() {
		return emailId;
	}
	public double getCreditLimit() {
		return creditLimit;
	}

}
