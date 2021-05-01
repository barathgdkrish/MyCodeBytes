package commonbytes;
import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input,min=0,max=0;
		boolean first=true;
		System.out.println("\nEnter number:");
		while(sc.hasNextInt())
		{
			System.out.println("\nEnter number:");
			input = sc.nextInt();
			sc.nextLine();
			if(first) {
				first = false;
				min = input;
				max = input;
			}
			if(input>max)
				max = input;
			if(input<min)
				min = input;
		}
		System.out.println("Minimim Number: "+min+" Maximum Number: "+max);
		sc.close();
	}

}
