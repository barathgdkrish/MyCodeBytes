package commonbytes;
import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter=0,sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter number #"+i+":");
			if(sc.hasNextInt())
			{
				sum+=sc.nextInt();
				counter++;
				
			}else {
				System.out.println("Invalid Number\n");
				
			}
			sc.nextLine();
		}
		sc.close();
		System.out.println("Valid numbers: "+counter+" Their Sum: "+sum);
	}

}
