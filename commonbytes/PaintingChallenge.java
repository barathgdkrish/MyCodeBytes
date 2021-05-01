package commonbytes;
import java.util.Scanner;

public class PaintingChallenge {

	public static void main(String[] args) {
		System.out.println("Enter width: ");
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		System.out.println("Enter areaPerBucket: ");
		double areaPerBucket = sc.nextDouble();
		System.out.println("Enter extraBuckets: ");
		if(sc.hasNextInt()) {
		int extraBuckets = sc.nextInt();
		System.out.println("The Number of buckets needed is: "+getBucketCount(width,height,areaPerBucket,extraBuckets));
		}else if(sc.hasNextLine()){
			System.out.println("The Number of buckets needed is: "+getBucketCount(width,height,areaPerBucket));
		}
		sc.close();
	}
	public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets)
    {
		if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0)
        return -1;
		
		return (int) Math.ceil((double)(width*height/areaPerBucket))-extraBuckets;	
    }
	public static int getBucketCount (double width, double height, double areaPerBucket)
    {
		if(width<=0||height<=0||areaPerBucket<=0)
        return -1;
		
		return (int) Math.ceil((double)(width*height/areaPerBucket));	
    }
	public static int getBucketCount (double area, double areaPerBucket)
    {
		if(area<=0||areaPerBucket<=0)
        return -1;
		
		return (int) Math.ceil((double)(area/areaPerBucket));	
    }

}
