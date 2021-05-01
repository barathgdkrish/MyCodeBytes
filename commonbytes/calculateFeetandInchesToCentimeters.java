package commonbytes;

public class calculateFeetandInchesToCentimeters {

	public static void main(String[] args)
	{
		double feets = 3.0,inches = 4,onlyInches = 14.0;
		System.out.println("feets & Inches to Centimeters: "+calcFeetsandInchesToCentimeters(feets,inches)+" cm");
		System.out.println("Only inches to centimeters: "+ calcFeetsandInchesToCentimeters(onlyInches)+" cm");
	}
	public static double calcFeetsandInchesToCentimeters(double feets,double inches)
	{
		System.out.println("Feets: "+feets+" Inches: "+inches);
		if(feets>=0.0 && inches >=0.0 && inches <12.0)
		{
			return ((feets * 12 * 2.54)+(inches * 2.54));
		}
		else
			return -1;
	}
	public static double calcFeetsandInchesToCentimeters(double onlyInches)
	{
		System.out.println("onlyInches :"+onlyInches);
		if(onlyInches<0.0)
			return -1;
		
		if(onlyInches<12.0)
		{
			return onlyInches*2.54;
		}
		int feets = (int)onlyInches/12;
		return calcFeetsandInchesToCentimeters(feets,(onlyInches%12));
		
	}
}
