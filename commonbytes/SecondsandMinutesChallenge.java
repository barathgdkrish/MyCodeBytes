package commonbytes;

public class SecondsandMinutesChallenge {

	public static void main(String[] args)
	{
		int minutes = 119,seconds = 29,onlySeconds = 3690;
		System.out.println("Minutes & Seconds to h m s: "+getDurationString(minutes,seconds));
		System.out.println("Only seconds to h m s: "+ getDurationString(onlySeconds));
		printEqual(1,2,3);
	}
	public static String getDurationString(int minutes,int seconds)
	{
		System.out.println("Minutes: "+minutes+" Seconds: "+seconds);
		if(minutes>=0 && seconds>=0 && seconds<59)
		{
			return (((int)minutes/60)+"h "+minutes%60+"m "+seconds+"s");
		}
		else
			return "Invalid value";
	}
	public static String getDurationString(int onlySeconds)
	{
		System.out.println("onlySeconds :"+onlySeconds);
		if(onlySeconds<0)
			return "Invalid value";
		
		return getDurationString((int)onlySeconds/60,(onlySeconds%60));
		
	}
	
	public static void printEqual(int a, int b, int c)
    {
        if(a<0||b<0||c<0)
            System.out.println("Invalid Value");
        String S = (a==b&&b==c)?"All numbers are equal":(a==b||b==c||c==a)?"Neither all are equal or different":"All numbers are different";    
        System.out.println(S);
    }
	
}

