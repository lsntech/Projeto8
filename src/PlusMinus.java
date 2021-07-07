import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PlusMinus {



    public static void plusMinus(List<Integer> arr) {

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        int len = arr.size();

        for (int i = 0; i < len; i++) {

            if(arr.get(i) >= 1)
                positives++;
            else if(arr.get(i) < 0)
                negatives++;

            else zeros++;


        }

        System.out.printf("%.6f\n", (double) positives/len);
        System.out.printf("%.6f\n", (double) negatives/len);
        System.out.printf("%.6f\n", (double) zeros/len);



    }


    public static void main(String[] args) {


        int[] arra = {1,1,0,-1,-1};
        int[] arra2 = {-4, 3, -9, 0, 4, 1};
        List<Integer> you  = Arrays.stream( arra2 ).boxed().collect( Collectors.toList() );

        plusMinus(you);


//        int positives = 0;
//        int negatives = 0;
//        int zeros = 0;
//        int len = arra2.length;
//
//        for (int i = 0; i < len; i++) {
//
//            if(arra2[i] >= 1)
//                positives++;
//            else if(arra2[i] < 0)
//                negatives++;
//            else zeros++;
//
//
//        }
//
//        System.out.printf("%.6f\n", (double) positives/len);
//        System.out.printf("%.6f\n", (double) negatives/len);
//        System.out.printf("%.6f\n", (double) zeros/len);







    }



}
