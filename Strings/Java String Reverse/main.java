import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if (A.compareTo(reverse(A)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static String reverse(String s) {
        String a = "";
        for (int i=s.length()-1; i>=0; i--) {
            a += s.charAt(i);
        }
        return a;
    }
}



