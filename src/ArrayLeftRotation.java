import java.util.*;

public class ArrayLeftRotation {


//    static int[] rotLeft(int[] a, int d) {
//
//
//        Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(Arrays.asList(arr));
//
//        for (int i = 0; i < 4; i++) {
//
//            int x = arrayDeque.pop();
//            arrayDeque.addLast(x);
//
//        }
//
//
//
//    }


    static int[] rotLeft(int[] a, int d) {

        for (int i = 1; i < d + 1; i++) {

            for (int j = 0; j < d; j++) {

                a[j] = a[j + 1];

            }

            a[d] = i;

        }
        return a;
    }

    public static void main(String[] args) {


        int n = 4;
        int[] arr = {11, 22, 33, 44, 55};
        int k = arr.length;


        rotLeft(arr, n);

        System.out.println("asdfasf");


        System.out.println(Arrays.toString(arr));
        


        
        
        
        
//        int[] r = rotLeft(arr, n);
//
//        System.out.println(Arrays.toString(r));


//
//
//        for (int i = 1; i < n+1; i++) {
//
//
//            for (int j = 0; j < n; j++) {
//
//                arr[j] = arr[j+1];
//
//            }
//
//            arr[n] = i;
//
//
//
//          }

        //  System.out.println(Arrays.toString(arr));


    }


}




