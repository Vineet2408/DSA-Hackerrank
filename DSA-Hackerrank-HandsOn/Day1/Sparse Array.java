import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(HashMap<String,Integer> map, String[] q) 
    {
        int res[]=new int[q.length];
        for(int i=0;i<q.length;i++)
        {
            if(map.containsKey(q[i]))
            res[i]=map.get(q[i]);
            else
            res[i]=0;
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        HashMap<String,Integer> map=new HashMap<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            
            if(map.containsKey(stringsItem))
            map.put(stringsItem,map.get(stringsItem)+1);
            else
            map.put(stringsItem,1);
            
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(map, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
