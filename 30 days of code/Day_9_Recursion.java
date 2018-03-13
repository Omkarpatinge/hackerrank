import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public int factorial(int n){
         if(n==1)
             return 1;
         else 
           return(n*factorial(n-1));
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print(s.factorial(sc.nextInt()));
    }
}