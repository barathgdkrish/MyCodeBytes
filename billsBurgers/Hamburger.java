package billsBurgers;

public class Hamburger {
	
	private String name;
	private double basePrice;
	private String breadroll;
	private String meat;
	private boolean extraLettuce;
	private boolean extraTomato;
	private boolean extraCarrot;
	private boolean extraOnion;

	public void setExtraLettuce(boolean extraLettuce) {
		this.extraLettuce = extraLettuce;
	}
	public void setExtraTomato(boolean extraTomato) {
		this.extraTomato = extraTomato;
	}
	public void setExtraCarrot(boolean extraCarrot) {
		this.extraCarrot = extraCarrot;
	}
	public void setExtraOnion(boolean extraOnion) {
		this.extraOnion = extraOnion;
	}
	public Hamburger(String breadroll,String meat,int basePrice) {
		
		this.breadroll = breadroll;
		this.meat = meat;
		this.basePrice = basePrice;
		this.extraCarrot = false;
		this.extraLettuce = false;
		this.extraOnion = false;
		this.extraTomato = false;
		this.name = this.breadroll+" "+this.meat+" "+getClass().getSimpleName();		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public double getBasePrice() {
		return this.basePrice;
	}

	public void showPrice() {
		System.out.println("\nThe cost of "+this.name+" is as followed");
		System.out.println("\nBase Price: "+this.basePrice +"$");
		if(extraLettuce) {
		System.out.println("\nExtra Lettuce: 2$");
		}
		if(extraTomato) {
			System.out.println("\nExtra Tomato: 2$");
		}
		if(extraCarrot) {
			System.out.println("\nExtra carrot: 2$");
		}
		if(extraOnion) {
			System.out.println("\nExtra Onion: 2$");
		}
		System.out.println("\nTotal cost is: "+(this.basePrice+getAdditionalsCost())+"$");
	}
	protected double getAdditionalsCost() {
		double additionalsCost=0.0;
		additionalsCost+= this.extraLettuce?2.0:0.0;
		additionalsCost+= this.extraTomato?2.0:0.0;
		additionalsCost+= this.extraCarrot?2.0:0.0;
		additionalsCost+= this.extraOnion?2.0:0.0;
		return additionalsCost;		
	}
}
