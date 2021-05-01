package commonbytes;

public class getLargestPrimeFactor {

	public static void main(String[] args) {
		
		System.out.println(getLargestPrime(217111));

	}
	
	public static int getLargestPrime(int number)
	{
		if(number<0)
			return -1;
		int largestPrimeFactor=number;
		short count;
		for(int i=2;i<=number/3;i++)
		{
			count=0;
			if(number%i==0)
			{
				
				for(int j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==0||i==2||i==3)
				{
					largestPrimeFactor = i;
				}
			}
				
		}

		return largestPrimeFactor;
	}	

}
