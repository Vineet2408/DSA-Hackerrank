import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     public static int cost(int s[][],int m[][])
     {
        int c=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c=c+(int)(Math.abs(s[i][j]-m[i][j]));
            }
        }
        return c;
    }
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s)
     {
         ArrayList<Integer> costMagic=new ArrayList<Integer>();
         int b[][]={{8,1,6},{3,5,7},{4,9,2}};
         int b1[][]={{6,1,8},{7,5,3},{2,9,4}};
         int b2[][]={{4,9,2},{3,5,7},{8,1,6}};
         int b3[][]={{2,9,4},{7,5,3},{6,1,8}};
         int b4[][]={{8,3,4},{1,5,9},{6,7,2}};
         int b5[][]={{4,3,8},{9,5,1},{2,7,6}};
         int b6[][]={{6,7,2},{1,5,9},{8,3,4}};
         int b7[][]={{2,7,6},{9,5,1},{4,3,8}};        

         int c=cost(s,b);
         costMagic.add(c);
         c=cost(s,b1);
         costMagic.add(c);
         c=cost(s,b2);
         costMagic.add(c);
          c=cost(s,b3);
         costMagic.add(c);
          c=cost(s,b4);
         costMagic.add(c);
          c=cost(s,b5);
         costMagic.add(c);
          c=cost(s,b6);
         costMagic.add(c);
          c=cost(s,b7);
         costMagic.add(c);
      int min= Collections.min(costMagic);
      return min;

         
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
