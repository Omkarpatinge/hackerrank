import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       
        int date[] = new int[6];
        for(int i=0;i<6;i++){
            date[i]=sc.nextInt();
        }
    
        if(date[2]-date[5]>0){
            //next year
            System.out.println(10000);
        }
        else{
            //same year or earlier
            if(date[2]-date[5]==0){
                //same year
                if(date[1]-date[4]>0){
                    //next month
                     System.out.println(500*(date[1]-date[4]));
                }
                else{
                    if(date[1]-date[4]==0){
                        //same month
                        if(date[0]-date[3]>0){
                            System.out.println(15*(date[0]-date[3]));
                        }
                        else{
                            //before or on deadline
                            System.out.println(0);
                        }
                    }
                    else{
                        //returned before deadline
                        System.out.println(0);
                    }
                }
            }
            else{
                //returned before deadline
                System.out.println(0);
            }
        }
    }
}