import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {


    public static int birthdayCakeCandles(List<Integer> candles) {

        /*    Return how many times the biggest number repeat itself
         *
         *     Sort(A)
         *     last = A[LastIndex]
         *     for i to A.length
         *         if i == A[i]
         *            count++;
         *     return counter
         *
         * */

        Collections.sort(candles);

        int last = candles.get(candles.size()-1);
        int counter = 0;

        for (int i = 0; i < candles.size(); i++) {
            if(last == candles.get(i) ){
                counter++;
            }
        }

        return counter;

    }


    public static void main(String[] args) {





        int[] candles = {4,4,4,1,2,3,3,3,3};


        List<Integer> lista = new ArrayList<>(Arrays.asList(4,4,4,1,2,3,3,3,3));

        int r = birthdayCakeCandles(lista);

        System.out.println(r);


//        Arrays.sort(candles);
//
//        System.out.println(Arrays.toString(candles));
//
//        int last = candles[candles.length-1];
//        int counter = 0;
//
//        for (int i = 0; i < candles.length; i++) {
//            if(last == candles[i] ){
//                counter++;
//            }
//        }
//
//        System.out.println(counter);







    }



}
