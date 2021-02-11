import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       String hr1="",min1,sec1;
       int len=s.length();
       String hr=s.substring(0,2); 
       String ampm=s.substring(len-2,len);
       if(ampm.equals("AM"))
       {
           if(hr.equals("12"))
                hr1="00";
            else
                hr1=hr;
       }
       else
       {
            if(hr.equals("12"))
                hr1="12";
            else
                hr1= String.valueOf(Integer.parseInt(hr)+12);
       }
       String time=hr1+s.substring(2,len-2);
       return time;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
