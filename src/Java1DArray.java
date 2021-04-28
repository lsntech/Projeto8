import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java1DArray {


    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base Cases
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1; // marks as visited

        // Recursive Cases
        return isSolvable(leap, game, i + leap) ||
                isSolvable(leap, game, i + 1) ||
                isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {

        int leap = 5; // salto

        int[] game = new int[6];

        game[0] = 0;
        game[1] = 0;
        game[2] = 0;
        game[3] = 1;
        game[4] = 1;
        game[5] = 1;



//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            scan.close();

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }

    }






