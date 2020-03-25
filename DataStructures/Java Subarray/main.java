import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int count = 0;

        Scanner input = new Scanner(System.in);
        int array_size = input.nextInt();
        int[] arr = new int[array_size];

        for (int i=0; i<array_size; i++) {
            arr[i] = input.nextInt();
        }

        
        for (int i=0; i<array_size; i++) {
            for (int j=0; j<array_size-i; j++) {
                int sum_of_subarray = 0;
                for (int z=0+j; z<=i+j; z++) {
                    sum_of_subarray += arr[z];                    
                }
                if (sum_of_subarray < 0) count++;
            }
        }

        System.out.println(count);
    }
}

