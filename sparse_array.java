import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] data = new String[n];
        for(int i=0;i<n;i++){
          data[i]=sc.next();
        }
        int query=sc.nextInt();
        for(int i=0;i<query;i++){
            String temp=sc.next();
            int count=0;
            for(int j=0;j<n;j++){
                if(data[j].equals(temp)){
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}