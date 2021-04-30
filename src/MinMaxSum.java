import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {


    public static void main(String[] args) {



        int[] ar = {1,3,5,7,9};
       // int[] ar = {1,2,3,4,5};
        List<Integer> arr = new ArrayList<>(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279));

        Collections.sort(arr);

        System.out.println(arr);


        int range  = 4;
        long[] result = new long[2];

        int round = 0;
        long min, max;

        while(round < 2) {

            for (int i = round; i < range; i++) {
                result[round] += arr.get(i);
            }
            round++;
            range++;
        }

        min = result[0];
        max = result[1];

        System.out.println(min + " " + max);














//        int p1 = arr[0];
//        int p2 = arr.length;
//        int selection  = 4;
//
//        int[] r = new int[2];
//
//        int x = 0;
//
//        while(x < 2) {
//
//            for (int i = x; i < selection; i++) {
//                 r[x] += arr[i];
//            }
//            x++;
//            selection++;
//        }
//
//        System.out.println(Arrays.toString(r));





    }







    public static void naiveSolution(){

        int[] arr = {1,3,5,7,9};

        // naive loops
        int i = 0;
        int min = 0, max = 0;
        int len = arr.length;

        while(i < len-1){
            min += arr[i];
            i++;
        }

        i = 1;

        while(i < len){
            max += arr[i];
            i++;
        }

        System.out.println(min + " " + max);

    }





}
