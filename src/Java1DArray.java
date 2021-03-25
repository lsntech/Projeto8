import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java1DArray {



//
//    public static void main(String[] args) {
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
//            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
//        }
//        scan.close();
//    }
//
//
//    public static boolean canWin(int leap, int[] game) {
//
//        int steps = 0;
//
//        int n = game.length;
//        int end = n -1;
//
//        for (int i = 0; i < n; i++) {
//
//            if(game[i] == 0){
//                steps++;
//            }
//
//            if(game[i] == 1){
//                steps--;
//            }
//        }
//
//        if(steps >= end | steps == 0){
//       //     System.out.println("Can win");
//            return true;
//        }else if(steps < 0){
//         //   System.out.println("Cant Win");
//            return false;
//        }
//
//       // System.out.println(steps);
//        return false;
//
//    }


    public static boolean isValidJump(int position, int size){

        return (position > size)? false : true;

      }

    public static boolean canWin(int leap, int[] game) {

        int pos = 0;
        int n = game.length;

        for (int i = 0; i < n - 1; i++) {

            if (game[pos + 1] == 0) {
                pos += 1;
            } else if (game[pos + 1] == 1) {

                if (pos + leap >= n - 1) {

                    return true;

                } else {
                    if (game[pos + leap] == 0) {
                        pos += leap;

                    } else {
                        return false;

                    }
                }

            }

            if (pos >= n - 1) {
                return true;
            }

        }
         return false;
    }

    public static void main(String[] args) {

        int q = 4; // loop
        // int n = 6; // size
        int leap = 3; // salto

        int[] game = new int[6];

        game[0] = 0;
        game[1] = 0;
        game[2] = 1;
        game[3] = 1;
        game[4] = 1;
        game[5] = 0;

        System.out.println(canWin(leap, game));


 }









}



