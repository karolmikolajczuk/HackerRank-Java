import java.io.*;
import java.util.*;

public class Solution {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int N = input.nextInt();
        int M = input.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        BitSet[] bits = new BitSet[3];

        bits[1] = B1;
        bits[2] = B2;
        
        while (M-- > 0) {
            String operation = input.next();
            int x = input.nextInt();
            int y = input.nextInt();

            switch(operation) {
                case "AND": 
                    bits[x].and(bits[y]);
                break;
                case "XOR":
                    bits[x].xor(bits[y]);
                break;
                case "SET":
                    bits[x].set(y);
                break;
                case "FLIP":
                    bits[x].flip(y);
                break;
                case "OR":
                    bits[x].or(bits[y]);
            }

            System.out.printf("%d %d%n", B1.cardinality(), B2.cardinality());
        }
        

    }
}

