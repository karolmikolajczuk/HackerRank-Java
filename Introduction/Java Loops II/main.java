import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int last = 0;
            for(int j=0; j<n; j++)
            {
                int power_of_two = 1;
                for (int m=0; m<j; m++)
                {
                    power_of_two *= 2;
                }
                int result = power_of_two * b;
                if (j==0)
                {
                    result += a;
                }
                last += result;
                System.out.print(last + " ");
            }
            System.out.println("");
        }
        in.close();

    }
}

