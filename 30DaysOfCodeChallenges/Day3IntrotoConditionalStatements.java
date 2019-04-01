import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
       //same challange as "Java If-Else" form Java introduction
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
            if (n % 2 == 0) 
       {
         if (n < 6) 
         ans = "Not Weird";
         else if (n < 21) 
         ans = "Weird";
         else 
         ans = "Not Weird";
        } 
       else 
       ans = "Weird";
      System.out.println(ans);
   }
}
