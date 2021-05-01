package room;

public class Doors {
	
	private String color;
	private boolean open;
	private String leadsTo;
	protected Doors(String color, boolean open, String leadsTo) {
		super();
		this.color = color;
		this.open = open;
		this.leadsTo = leadsTo;
	}
	public void openClose() {
		this.open = !this.open;
		System.out.println("Door is now "+(this.open?"open":"close"));
	}
	public String getColor() {
		return color;
	}
	public boolean isOpen() {
		return open;
	}
	public String getLeadsTo() {
		return leadsTo;
	}

}
