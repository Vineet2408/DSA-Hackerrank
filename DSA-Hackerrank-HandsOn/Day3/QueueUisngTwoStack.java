import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noElements = in.nextInt();
        
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        
        int n;
        
        for (int i = 0 ; i < noElements ; i++) {
            n = in.nextInt();
            
            if (n == 1)
            {
                st1.push(in.nextInt());
            } 
            else if (n == 2)
            {
                if(st2.isEmpty())
                {
                    while(!st1.isEmpty())
                    {
                        st2.push(st1.pop());
                    }                    
                }
                
                if (!st2.isEmpty()){                                
                    st2.pop(); 
                }

            }
            else if (n == 3)
            {       
                if(st2.isEmpty())
                {
                    while(!st1.isEmpty())
                    {
                        st2.push(st1.pop());
                    }
                    System.out.println(st2.peek());
                } 
                else 
                {
                    System.out.println(st2.peek());
                }
            }
        }
    }
}