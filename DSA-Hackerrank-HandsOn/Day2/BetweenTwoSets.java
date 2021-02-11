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

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
     static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 

     static int findGCD(List<Integer>arr, int n) 
    { 
        int result = arr.get(0); 
        for (int i = 1; i < n; i++){ 
            result = gcd(arr.get(i), result); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    } 
  
     static ArrayList<Integer> commDiv(List<Integer> a,int b) 
    { 
        ArrayList<Integer> ls1=new ArrayList<Integer>();
        // find
        int n = findGCD(a, a.size()); 
        int result = 0; 
        ls1.add(n);
        for (int i=b; i<=n/2; i++) 
        { 
            // if 'i' is factor of n 
            if (n%i==0) 
            { 
                ls1.add(i);
            }
        }
        return ls1;
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) 
    {
       
        Collections.sort(a);
        Collections.sort(b);
        int amax=a.get(a.size()-1);
        ArrayList<Integer> ls=new ArrayList<>();
        ls=commDiv(b,amax);
        int f=0;
        int c=0;
        for(int j=0;j<ls.size();j++)
        {
            int x=ls.get(j);
            
            for(int i=0;i<a.size();i++)
            {
                int y=a.get(i);
                if(x%y==0)
                {
                    f=1;
                }
                else
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            c++;
        }
        return c;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
