import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        BigInteger bigint = input.nextBigInteger();
        BigInteger secondbigint = input.nextBigInteger();

        System.out.println(bigint.add(secondbigint));
        System.out.println(bigint.multiply(secondbigint));
    }
}

