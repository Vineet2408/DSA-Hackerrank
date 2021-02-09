import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] a) 
    {
        int max=-99999999;
        int sum1=0,sum2=0,sum3=0,fsum=0;
        for(int i=2;i<6;i++)
        {
            for(int j=2;j<6;j++)
            {
                sum1=a[i-2][j-2]+a[i-2][j-1]+a[i-2][j];
                sum2=a[i-1][j-1];
                sum3=a[i][j-2]+a[i][j-1]+a[i][j];
                fsum=sum1+sum2+sum3;
                if(fsum>max)
                max=fsum;
                
            }
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
