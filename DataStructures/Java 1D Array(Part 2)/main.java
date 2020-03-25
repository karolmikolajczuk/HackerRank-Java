import java.util.*;

public class Solution {
  
    private static boolean possibleToSolve(int[] game, int leap, int position) {
        if (position < 0 || game[position] == 1) return false;
        if (position+1 >= game.length || position+leap >= game.length) return true;

        game[position] = 1;

        return possibleToSolve(game, leap, position+leap) ||
               possibleToSolve(game, leap, position+1) ||
               possibleToSolve(game, leap, position-1);
    }
    
    // yes/no
    private static boolean canWin(int leap, int[] game, int position) {
        return possibleToSolve(game, leap, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

