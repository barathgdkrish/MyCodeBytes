package commonbytes;

public class PrimitiveTypesAndOperators {

	public static void main(String[] args) {
		
		double myDouble = 20.0;
		double hisDouble =80.0;
		
		boolean bool = (((myDouble+hisDouble)*100)%40 == 0)? true:false;
		System.out.println(bool);
		if(!bool) 
		{
			System.out.println("Got some remainder");		
		}
	}
}
