package mobilephone;

public class Contacts {
	private String contactName;
	private String contactNumber;

	protected Contacts(String contactName, String contactNumber) {
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	public void setContact(String name, String number) {
		this.contactName = name;
		this.contactNumber = number;
	}

}
