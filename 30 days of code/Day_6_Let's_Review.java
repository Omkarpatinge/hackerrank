import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            char[] e=new char[s.length()/2+1];
            char[] o=new char[s.length()/2+1];
            int ec=0;
            int oc=0;
            for(int j=0; j<s.length(); j++){
                if(j%2==0){
                 e[ec]=s.charAt(j);
                    ec++;
                } 
                else{
                    o[oc]=s.charAt(j);
                    oc++;
      }  
            }
            for(int j=0;j<ec;j++)
                System.out.print(e[j]);
            System.out.print(" ");
            for(int j=0;j<oc;j++)
                System.out.print(o[j]);
            System.out.println();
            
    }
    }
}