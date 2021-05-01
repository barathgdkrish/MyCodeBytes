package commonbytes;
import java.util.Arrays;
import java.util.Scanner;

public class MimimumElementChallenge {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] intArray = readIntegers(3);
		System.out.println("user has entered "+Arrays.toString(intArray));
		System.out.println("the miminum value of the set is: "+findMin(intArray));

	}
	private static int findMin(int[] intArray) {
		int temp=intArray[0];
		for(int i=1;i<intArray.length;i++) {
			if(temp>intArray[i])
				temp = intArray[i];
		}
		return temp;
		
	}
	private static int[] readIntegers(int num) {
		int[] intArray = new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<intArray.length;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			boolean hasNextInt = sc.hasNextInt();
			boolean hasNextString = sc.hasNextLine();
			if(hasNextInt) {				
				intArray[i]=sc.nextInt();
				sc.nextLine();
			}
			else if(hasNextString){
				System.out.println("Enter a valid number");
			}
		}
		
		sc.close();
		return intArray;
		
	}

}
