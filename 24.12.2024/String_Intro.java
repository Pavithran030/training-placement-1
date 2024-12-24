import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int s1,s2;
        System.out.println(A.length()+B.length());
        for (int i=0;i<A.length();i++)
        {
            if(A.charAt(i)<B.charAt(i) || A.charAt(i)==B.charAt(i)){
                System.out.println("No");
                break;
            }
            else if(A.charAt(i)>B.charAt(i)){
                System.out.println("Yes");
                break;
            }
        }
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
        
        
    }
}




