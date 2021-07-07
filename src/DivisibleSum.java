import java.util.*;

public class DivisibleSum {

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {

        int count = 0;

        for (int i = 0; i < arr.size(); i++) {

            for (int j = 0; j < arr.size(); j++) {

                int sum = arr.get(i) + arr.get(j);

                if((sum % k) == 0){

                    if(i < j) {
                        count++;
                        System.out.println(arr.get(i) + ", " + arr.get(j));
                    }

                }


            }


        }

        return count;

    }



    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6};
        int len = arr.length;
        int k = 5;

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));


        System.out.println(divisibleSumPairs(numbers.size(), k, numbers));


//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//
//                int sum = arr[i] + arr[j];
//
//                if((sum % k) == 0){
//
//                    if(i < j)
//                        System.out.println(arr[i]+ ", " + arr[j]);
//
//                }
//
//
//            }
//
//
//        }





    }


}
