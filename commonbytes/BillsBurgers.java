package commonbytes;
import billsBurgers.*;


public class BillsBurgers {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Bill's Burgers");
		
		Hamburger hamburger = new Hamburger("Plainbread", "Bacon", 2);
		HealthyHamburger healthy = new HealthyHamburger();
		DeluxeHamburger deluxe = new DeluxeHamburger();
		hamburger.showPrice();
		hamburger.setExtraCarrot(true);
		hamburger.setExtraLettuce(true);
		hamburger.setExtraOnion(false);
		hamburger.setExtraTomato(true);
		hamburger.showPrice();
		System.out.print('\n');
		healthy.showHealthyPrice();
		healthy.setExtraCarrot(true);
		healthy.setExtraLettuce(true);
		healthy.setExtraOnion(false);
		healthy.setExtraTomato(true);
		healthy.setHerbs(true);
		healthy.setPepper(false);
		healthy.showHealthyPrice();
		System.out.print('\n');
		deluxe.showDeluxePrice();
		deluxe.setExtraCarrot(true);
		deluxe.setExtraLettuce(true);
		deluxe.setExtraOnion(false);
		deluxe.setExtraTomato(true);
		deluxe.setDrinks(true);
		deluxe.setChips(true);
		deluxe.showDeluxePrice();
	}

}
