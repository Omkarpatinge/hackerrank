import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            long number= sc.nextLong();
            if(number==1){
                System.out.println("Not prime");
            }
            else if(number==2){
                System.out.println("Prime");
            }
            else if(number%2==0){
                System.out.println("Not prime");
            }
            else{
                int flag=1;//prime
                for(long j=3;Math.pow(j,2)<=number;j++){
                    if(number%j==0){
                        flag=0;//not prime
                        break;
                    }
                }
                if(flag==1){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
            }
        }
    }
}
