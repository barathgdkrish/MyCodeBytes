package commonbytes;

public class hasCommonDigits {

	public static void main(String[] args) {
		int num1=12,num2=42;
		if(num1<10||num1>99||num2<10||num2>99)
            System.out.println("false");
            
        int a,b,c,d;
        b=num1%10;
        num1/=10;
        a=num1;
        d=num2%10;
        num2/=10;
        c=num2;
        if(a==c||a==d||b==c||b==d)
        	System.out.println("true");
        else System.out.println("false");
	}

}
