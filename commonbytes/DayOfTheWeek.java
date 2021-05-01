package commonbytes;
import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
	
		System.out.println(isLeapYear(1800));
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day Number: ");
		int a=sc.nextInt();		
		switch(a) {		
		case 0 : System.out.println("Sunday");
				break;
		case 1 : System.out.println("Monday");
				break;
		case 2 : System.out.println("Tuesday");
				break;		
		case 3 : System.out.println("Wednesday");
				break;
		case 4 : System.out.println("Thursday");
				break;
		case 5 : System.out.println("Friday");
				break;
		case 6 : System.out.println("Saturday");
				break;
		default : System.out.println("Invalid Day");
		}
		sc.close();
		}

		
	}
	
	    
	    public static boolean isLeapYear(int year)
	    {
	        if(year<4 || year>9998)
	            return false;
	        
	        switch(year%4)
	        {
	            case 0: switch(year%100)
	                    {
	                        case 0: switch(year%400) 
	                        		{
	                        		case 0: return true;
	                                default: return false;
	                                }
	                                
	                        default: return true;
	                    }
	                    
	            default: return false;
	        }
	    }
	    public static int getDaysInMonth(int month, int year)
	    {
	        if(month<1||month>12||year<1||year>9999)
	        {
	            return -1;
	        }
	        boolean leapYear = isLeapYear(year);
	        switch(month)
	        {
	            case 1: return 31;
	            case 2: if(leapYear)
	                        return 29;
	                    else return 28;
	            case 3: return 31;
	            case 4: return 30;
	            case 5: return 31;
	            case 6: return 30;
	            case 7: return 31;
	            case 8: return 31;
	            case 9: return 30;
	            case 10: return 31;
	            case 11: return 30;
	            case 12: return 31;
	            default: return -1;
	        }
	    }
	    
}
