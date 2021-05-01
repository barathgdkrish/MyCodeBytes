package commonbytes;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result{

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int count=0;
        Iterator<Integer> iterator = candles.iterator();
        
        int i=candles.size()-1;
        System.out.println(i);
        System.out.println(candles.get(candles.size()-1));
        while(iterator.hasNext()){
                
        			if(candles.get(i)==iterator.next());
        			count++;
                
                if(i<0) {
                	break;
                }
        }
        return count;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
//		  BufferedWriter bufferedWriter = new BufferedWriter(Wrinew
//		  Fileter(System.getenv("OUTPUT_PATH")));
		 

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        System.out.println(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
