import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        // stworz obiekty/zmienne
        Scanner input = new Scanner(System.in);
        int size_of_list = input.nextInt();
        List<Integer> just_list = new ArrayList<Integer>();

        for(int i=0; i<size_of_list; i++) {
            just_list.add(input.nextInt());
        }
        
        // ilosc zapytan
        int number_of_queries = input.nextInt();

        // dla kazdego zapytania wykonaj
        for (int test_number = 0; test_number < number_of_queries; test_number++) {
            String method = input.next();
            if (method.contains("Insert") == true) {
                int x = input.nextInt();
                int number = input.nextInt();
                just_list.add(x, number);
            } else {
                int index = input.nextInt();
                just_list.remove(index);
            }
        }

        // wypisz
        for (int i=0; i<just_list.size(); i++) {
            System.out.print(just_list.get(i) + " ");
        }
    }
}

