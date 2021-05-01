package commonbytes;
import java.util.Scanner;

public class SortArrays {

	private static int[] myIntArray;
	public static void main(String[] args) {
		
		setMyIntArray();
		SortMyIntArrayDescending();
		System.out.print("\nThe sorted array is: [ ");
		
		
	}
	public void printArray(int[] myIntArray) {
		
		for(int i=0;i<myIntArray.length-1;i++) 
		{
			System.out.println("Element "+i+" contains "+myIntArray[i]); 
		} 
	}
	public static void SortMyIntArrayDescending() {
		int tempInt;
		for(int i=0;i<myIntArray.length;i++) {
			for(int j=i+1;j<myIntArray.length;j++) {
				/* myIntArray[i]=tempArray[i]>tempArray[j]?tempArray[i]:tempArray[j]; */
				if(myIntArray[i]<myIntArray[j]) {
					tempInt = myIntArray[i];
					myIntArray[i]=myIntArray[j];
					myIntArray[j]=tempInt;
				}
			}
//			System.out.print(" "+ myIntArray[i]+ "");
		}
	}
	public static void setMyIntArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: \r");
		int num = sc.nextInt();
		myIntArray = new int[num];
		for(int i=0;i<myIntArray.length;i++)
		{	
			System.out.println("Enter element "+(i+1)+" : ");
			myIntArray[i] = sc.nextInt();
		}
		sc.close();
	}

}
