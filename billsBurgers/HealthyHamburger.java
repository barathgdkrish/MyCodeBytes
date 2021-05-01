package billsBurgers;

public class HealthyHamburger extends Hamburger{
	
	
	private boolean pepper;
	private boolean herbs;
	public HealthyHamburger() {
		
		super("Brown Rye","Pork",10);
		super.setName(getClass().getSimpleName());
		this.pepper = false;
		this.herbs = false;
		super.setExtraCarrot(false);
		super.setExtraLettuce(false);
		super.setExtraOnion(false);
		super.setExtraTomato(false);
	}

	public void showHealthyPrice() {
		System.out.println("\nThe cost of "+super.getName()+" is as followed");
		System.out.println("\nBase Price: "+super.getBasePrice() +"$");
		double additionalsCost2=super.getAdditionalsCost();
		if(pepper) {
			additionalsCost2=this.pepper?2.0:0.0;
			System.out.println("\nPepper: 2$");
		}
		if(herbs) {
			additionalsCost2+=this.herbs?2.0:0.0;
			System.out.println("\nHerbs : 2$");
		}
		System.out.println("\nTotal cost is: "+(super.getBasePrice()+additionalsCost2)+"$");
	}

	public void setPepper(boolean pepper) {
		this.pepper = pepper;
	}

	public void setHerbs(boolean herbs) {
		this.herbs = herbs;
	}

}
