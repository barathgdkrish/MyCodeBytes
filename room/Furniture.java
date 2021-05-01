package room;

public class Furniture {
	private String furnitures;
	private String size;
	private String purpose;
	private int count;
	protected Furniture(String furnitures, String size, String purpose,int count) {
		
		this.furnitures = furnitures;
		this.size = size;
		this.purpose = purpose;
		this.count = count;
	}
	
	public String furnitures() {
		return furnitures;
	}
	public String getSize() {
		return size;
	}
	public String getPurpose() {
		return purpose;
	}
	public int getCount() {
		return count;
	}
}
