import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {


        int applesNumber = 0, orangeNumber = 0;
        int n = apples.size();
        int m = oranges.size();

        for (int i = 0; i < n; i++) {

            int range = apples.get(i)+a;
            if( range <= t & range >= s)
                applesNumber++;


        }

        for (int i = 0; i < m; i++) {

            int range = oranges.get(i)+b;
            if( range <= t & range >= s)
                orangeNumber++;


        }

        System.out.println(applesNumber);
        System.out.println(orangeNumber);


    }


    public static void main(String[] args) {


        List<Integer> apples  = new ArrayList<Integer>(Arrays.asList(2,3,-4));
        List<Integer> oranges = new ArrayList<Integer>(Arrays.asList(3,-2,-4));
        int n = apples.size();
        int m = oranges.size();
        int s = 7, t = 10;  // house area
        int a = 4, b = 12; // trees

        int[] aa = {2,3,4,5,6};
        int[] bb = {4,6,7};

        int j = 0, i = 0;

        do{
            j++;
            i++;
            System.out.println("i: "+ i);
            System.out.println("j: "+ j);


        }while( (j < bb.length) && (i < aa.length));

//
//        for (int i = 0; i < Math.min(aa.length,bb.length) ; i++) {
//            System.out.println(aa[i]);
//        }



//        int count_a = 0, count_o = 0;
//
//        for (int i = 0; i < n; i++) {
//             //apples.set(i, apples.get(i)+a);
//             int range = apples.get(i)+a;
//             if( range <= t & range >= s){
//                 count_a++;
//             }
//
//        }
//
//        for (int i = 0; i < m; i++) {
//            // oranges.set(i, oranges.get(i)+b);
//            int range = oranges.get(i)+b;
//            if( range <= t & range >= s){
//                count_o++;
//            }
//        }

//
//        System.out.println(oranges);
//        System.out.println(apples);
//
//        System.out.println("apples : " + count_a);
//        System.out.println("oranges: " + count_o);

       // countApplesAndOranges(s,t,a,b,apples,oranges);




    }



}
