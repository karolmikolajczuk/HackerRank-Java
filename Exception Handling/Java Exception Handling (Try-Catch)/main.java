import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {
            int x = input.nextInt();
            int y = input.nextInt();

            System.out.println(x/y);
        } catch (InputMismatchException e) { 
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

