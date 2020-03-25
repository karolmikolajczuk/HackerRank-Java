import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        if (s == null || s.trim().equals("") || s.equals(""))
        {
            System.out.println("0");
        }
        else
        {
        s = s.trim();
        String[] lis = s.split("[ !,?._'@]+");

        System.out.println(lis.length);
        for(int i=0; i<lis.length; i++) {
            System.out.println(lis[i]);
        }
        }

    }
}

