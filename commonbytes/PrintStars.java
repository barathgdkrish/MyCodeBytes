package commonbytes;

public class PrintStars {

	public static void main(String[] args) {
		printSquareStar(11);
		
	}
	public static void printSquareStar(int number)
	{
		if(number<5)
		{
			System.out.println("Invalid Value");
		}
		for(int row=1;row<=number;row++)
		{
			for(int col=1;col<=number;col++)
			{
				if(row==1||col==1||row==(number)||col==(number)||(col==(number-row+1))||(row==col))
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

}
