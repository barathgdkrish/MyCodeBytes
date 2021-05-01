package commonbytes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
        String [] stringSplit = s.split("[A-Z]+");
        String [] text = s.split("[0-9:]+");
        String [] timeSplit = stringSplit[0].split(":");
        int hour = Integer.parseInt(timeSplit[0]);
        if(text[text.length-1].equals("AM")){
            if(hour == 12){
               timeSplit[0] = "00";
            }
        }else{
            if(hour != 12)
            {
                hour+=12;
                timeSplit[0] = String.valueOf(hour);
            }
        }
        return new String (timeSplit[0]+":"+timeSplit[1]+":"+timeSplit[2]);
    }
    public static void main(String[] args) throws IOException {
        Scanner bw = new Scanner(System.in);
    	String s = bw.nextLine();

        String result = timeConversion(s);
        result.trim();
         
        System.out.println(result);

        bw.close();
    }
}
