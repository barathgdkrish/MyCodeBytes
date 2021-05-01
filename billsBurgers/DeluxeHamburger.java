package billsBurgers;

public class DeluxeHamburger extends Hamburger{

	private boolean chips;
	private boolean drinks;
	
	public DeluxeHamburger() {
		super("Parmeson Oregano","Beef",15);
		super.setName(getClass().getSimpleName());
		this.chips = false;
		this.drinks = false;	
	}

	public void setChips(boolean chips) {
		this.chips = chips;
	}

	public void setDrinks(boolean drinks) {
		this.drinks = drinks;
	}
	public void showDeluxePrice() {
		System.out.println("\nThe cost of "+super.getName()+" is as followed");
		System.out.println("\nBase Price: "+super.getBasePrice() +"$");
		double additionalsCost2=0.0;
		if(chips) {
			additionalsCost2=this.chips?2.0:0.0;
			System.out.println("\nchips: 2$");
		}
		if(drinks) {
			additionalsCost2+=this.drinks?2.0:0.0;
			System.out.println("\ndrinks : 2$");
		}
		System.out.println("\nTotal cost is: "+(super.getBasePrice()+additionalsCost2)+"$");
	}

	@Override
	public void setExtraLettuce(boolean extraLettuce) {
		System.out.println("\nYou cannot add this addon to a Deluxeburger");
	}

	@Override
	public void setExtraTomato(boolean extraTomato) {
		System.out.println("\nYou cannot add this addon to a Deluxeburger");
	}

	@Override
	public void setExtraCarrot(boolean extraCarrot) {
		System.out.println("\nYou cannot add this addon to a Deluxeburger");
	}

	@Override
	public void setExtraOnion(boolean extraOnion) {
		System.out.println("\nYou cannot add this addon to a Deluxeburger");
	}
	
	}