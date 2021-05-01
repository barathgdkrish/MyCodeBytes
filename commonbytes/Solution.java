package commonbytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
	public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int count=0;
        int i=candles.size()-1;
        while(candles.get(candles.size()-1)==candles.get(i)){
                count++;
                i--;
        }
        return count;
    }

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(2);
		Collections.sort(list);
		System.out.println(list.toString());
		
    	List<List<Integer>> arr = new ArrayList<List<Integer>>();
    	List<Integer> a1 = new ArrayList<Integer>();
    	List<Integer> a2 = new ArrayList<Integer>();
    	List<Integer> a3 = new ArrayList<Integer>();
    	List<Integer> a4 = new ArrayList<Integer>();
    	a1.add(3);
    	a2.add(11);
    	a2.add(2);
    	a2.add(4);
    	a3.add(4);
    	a3.add(5);
    	a3.add(6);
    	a4.add(10);
    	a4.add(8);
    	a4.add(-12);
    	
    	
    	arr.add(a1);
    	arr.add(a2);
    	arr.add(a3);
    	arr.add(a4);
    	System.out.println(arr.size());
    	System.out.println(diagonalDifference(arr));
    	
    }
	
    public static int diagonalDifference(List<List<Integer>> arr) {
		int count1=0,count2=0;
    	for(int i=1,k=arr.size()-2;i<arr.size();i++,k--) {
    		for(int j=0 ; j < arr.get(i).size();j++) {
    			
    			if(i-1 == j) {
    				count1+=arr.get(i).get(j);
    			}
    			if(j==k)
    			{
					count2+=arr.get(i).get(j);
					System.out.print("\n");
					 
    			}
    		}
    	}

    	int sum = count1-count2;
    	return sum>0?sum:(sum*-1);
    }
    
}

