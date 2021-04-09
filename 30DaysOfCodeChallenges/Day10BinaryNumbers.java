import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int binary[] = new int[40];    
        int index = 0;    
        
        while(n > 0){    
            binary[index++] = n%2;    
            n = n/2;    
        }    
        
        for(int i = index-1;i >= 0;i--){    
            System.out.print(binary[i]);    
        }    
        System.out.println();
        //TODO: Count consecutive 1's
        scanner.close();
    }
}
