import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {

        int n = 0;
        int m = 0;
        int len = arr.size();

        for (int i = 0; i < len; i++) {

            n += arr.get(i).get(i);
            m += arr.get((len-1)-i).get(i);

        }

        int r = n - m;

        if(r < 0)
            r = -r;

        return r;

    }





    public static void main(String[] args) {


        int[][] A = {{1,  -5, 2},
                     {-3,  7, 9},
                     {4,  -1, 6}};

        int[][] B = {{1,  -5, 2, 3},
                     {-3,  7, 9, 4},
                     {4,  -1, 6, 5},
                     {5,  -1, 6, 8}};

        List<List<Integer>> intList = new ArrayList<List<Integer>>();

        intList.add(new ArrayList<Integer>(Arrays.asList(1,  -5, 2, 3)));
        intList.add(new ArrayList<Integer>(Arrays.asList(-3,  7, 9, 4)));
        intList.add(new ArrayList<Integer>(Arrays.asList(4,  -1, 6, 5)));
        intList.add(new ArrayList<Integer>(Arrays.asList(5,  -1, 6, 8)));


        System.out.println(diagonalDifference(intList));


        int a11 = 0, a22 = 0, a33 = 0;

        int mod = 4;
        int n = 0;
        int m = 0;
        int len = A.length;

        for (int i = 0; i < len; i++) {

            n += A[i][i];
            m += A[(len-1)-i][i];

        }

   //     System.out.printf("n: %d , m: %d \n", n,m);




//        for (int i = 0; i < A.length; i++) {
//
//         //   System.out.println(Arrays.toString(A[i]));
//
//            for (int j = 0; j < A[i].length; j++) {
//               // System.out.print(A[i][j] + " ");
//
//                if(i == 0 & j == 0) // a11
//                    a11 = A[i][j];
//                if(i == 1 & j == 1) // a22
//                    a22 = A[i][j];
//                if(i == 2 & j == 2) // a22
//                    a33 = A[i][j];
//
//            }
//
//           /// System.out.println("");
//
//        }





    }



}
