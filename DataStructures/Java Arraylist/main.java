import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // przygotuj scanner
        Scanner input = new Scanner(System.in);

        // odczytaj ilosc wierszy
        int number_of_rows = input.nextInt();

        // stworz tablice tablic na integer
        ArrayList<ArrayList<Integer>> array_of_arrays = new ArrayList<>();

        // odczytaj tyle wierszy
        for (int i=0; i<number_of_rows; i++) {

            // rozmiar wiersza
            int size_of_row = input.nextInt();
     
            // stworz tablice integerow
            ArrayList<Integer> temp_array = new ArrayList<>();

            // przeczytaj tyle integerow do tablicy
            for (int j=0; j<size_of_row; j++) {

                // dodaj kazdy integer do tablicy
                temp_array.add(input.nextInt());               
            }

            // dodaj tablice do tablicy
            array_of_arrays.add(temp_array);
        }

        // odczytaj ilosc zapytan
        int queries_of_x_y = input.nextInt();

        // dla kazdego zapytania
        for (int i=0; i<queries_of_x_y; i++) {

            int x = input.nextInt();
            int y = input.nextInt();

            // sprawdz czy jest taka kolumna i taki wiersz
            // jezeli nie: wypisz ERROR jezeli tak: wypisz liczbe z tablicy
            if (x>0 && x<=number_of_rows) {
                if (array_of_arrays.get(x-1).size() >= y) {
                    System.out.println(array_of_arrays.get(x-1).get(y-1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}

