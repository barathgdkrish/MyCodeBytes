package room;

public class Electricals {

	private String name;
	private String wattage;
	private String purpose;
	public String getName() {
		return name;
	}
	public String getWattage() {
		return wattage;
	}
	public String getPurpose() {
		return purpose;
	}
	protected Electricals(String name, String wattage, String purpose) {
		
		this.name = name;
		this.wattage = wattage;
		this.purpose = purpose;
	}
}
