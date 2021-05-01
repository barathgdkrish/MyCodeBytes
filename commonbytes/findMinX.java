package commonbytes;
import java.util.Arrays;
import java.util.Scanner;

/*Given an array arr[] of size N and an array Q[] consisting of M integers, each representing a query, 
the task for each query Q[i] is to find the smallest index of an array element whose value is greater 
than or equal to Q[i]. 

If no such index exists, then print -1.
*/
public class findMinX {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Array Arr[] : ");
	String arrString = sc.nextLine().trim();
	System.out.println("Enter query array Q[] : ");
	String qString = sc.nextLine().trim();
	
	String[] stringArray = arrString.split(" ");
	String[] qArray = qString.split(" ");
	
	int[] intArr = new int[stringArray.length];
	int[] intQ = new int[qArray.length];
	
//	For comparing single digit values of the arrays, use the commented code
	  for(int i = 0;i<Math.max(stringArray.length, qArray.length);i++) {
		  if(i<stringArray.length) {
		  intArr[i]= Integer.parseInt(stringArray[i]);//Character.getNumericValue(stringArray[i]); 
		  } 
		  if(i<qArray.length) {
		  intQ[i]= Integer.parseInt(qArray[i]);//Character.getNumericValue(qArray[i]); 
		  } 
	  }
	  	Arrays.sort(intArr);
//		sort(intArr);
		findMinimumIndex(intArr,intQ);
		sc.close();
		
	}
	
	private static void findMinimumIndex(int[] intArr, int[] intQ) {
		System.out.println("Sorted input Array: "+Arrays.toString(intArr)+" Queries: "+Arrays.toString(intQ));
		for(int i=0;i<intQ.length;i++) {
			
			int low = 0;
	        int high = intArr.length - 1;
	        int index=-1;
	        while (low <= high) {
	            int mid = (low + high) >>> 1;
	            int midVal = intArr[mid];

	            if (midVal < intQ[i])
	                low = mid + 1;
	            else{
	                index = mid;
	                high = mid - 1;
	            	
	            }
	           
	        }
	        System.out.println(intQ[i]+" is at position "+(index>=0?index:-1));
			
		}
	}
	private static void sort(int[] intArray) {
		boolean bool = true;
		while(bool) {
			bool=false;
			for(int i = 0;i<intArray.length-1;i++) {
				if(intArray[i]>intArray[i+1])
				{
					int temp = intArray[i];
					intArray[i]= intArray[i+1];
					intArray[i+1] = temp;
					bool = true; 
				}
			}
			
		}
	}

}
