package commonbytes;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		int[] myIntArray = setMyIntArray();
		System.out.println("The original array: "+Arrays.toString(myIntArray));
		reverse(myIntArray);
		System.out.println("The original array: "+Arrays.toString(myIntArray));
	}
	private static int[] setMyIntArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: \r");
		int num = sc.nextInt();
		int[] myIntArray = new int[num];
		for(int i=0;i<myIntArray.length;i++)
		{	
			System.out.println("Enter element "+(i+1)+" : ");
			myIntArray[i] = sc.nextInt();
		}
		sc.close();
		return myIntArray;
	}
	private static void reverse(int[] intArray) {
		int temp;
		for(int i=0;i<intArray.length/2;i++) {
			temp = intArray[i];
			intArray[i]=intArray[intArray.length-1-i];
			intArray[intArray.length-1-i] = temp;			
		}
		
	}
	

}
