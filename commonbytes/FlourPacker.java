package commonbytes;
import java.util.Scanner;

public class FlourPacker {

	public static void main(String[] args) {
		
		System.out.println("Enter bigCount: ");
		Scanner sc = new Scanner(System.in);
		int bigCount = sc.nextInt();
		System.out.println("Enter smallCount: ");
		int smallCount = sc.nextInt();
		System.out.println("Enter goal: ");
		int goal = sc.nextInt();
		System.out.println("The canpack's possibility is: "+canPack(bigCount,smallCount,goal));
		sc.close();
	}
	    public static boolean canPack(int bigCount, int smallCount, int goal)
	    {
	        if(bigCount<0||smallCount<0||goal<0)
	            return false;
	        
	        if(((bigCount*5)+(smallCount*1))==goal)
	        {
	            return true;
	        }
	        if(((bigCount*5)+(smallCount*1))>goal)
	        {
	            int copygoal = goal;
	            for(int i=1;i<=bigCount;i++)
	            {   
	                copygoal-=5;
	                if(copygoal<0)
	                {
	                    copygoal+=5;
	                    break;
	                }
	            }
	            for(int i=1;i<=smallCount;i++)
	            { 
	                copygoal-=1;
	                if(copygoal<0)
	                {
	                    copygoal+=1;
	                    break;
	                }
	            }
	            if(copygoal==0)
	                return true;
	            else return false;
	        }
	        return false;
	        
	    }
	}
