import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BreakingRecords {


    public static List<Integer> breakingRecords(List<Integer> scores) {

        int score = scores.get(0);
        int min = score, max = score;
        List<Integer> records = new ArrayList<>(2);
        records.add(0,max);
        records.add(1, min);

        for (int i = 1; i < scores.size(); i++) {

            score = scores.get(i);
         //   System.out.println(score);

            if(score > max) {
                max++;
                records.set(0, records.get(0)+1);
            }

            if(score < min){
                min++;
                records.set(1, records.get(0)+1);
            }

        }

        return records;


    }


    public static int[] breakingRecords(int[] scores){

        int[] records = new int[2];

        // int score = s[0];
        int score = scores[0];
        int min = score,max = score;

        for (int i = 1; i < scores.length; i++) {

            score = scores[i];

            if(score > max) {
                max = score;
                records[0] += 1;
            }

            if(score < min){
                min = score;
                records[1] += 1;
            }


        }

        return records;

    }


    public static void main(String[] args) {


        int[] s = {10, 5, 20, 20, 4, 5, 2, 25, 1};
//        int[] s = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] records = new int[2];
//
//        List<Integer> ss = new ArrayList<>(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
//
//        System.out.println(breakingRecords(ss));

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int[] r = breakingRecords(numbers);

        System.out.println(r[0] + " " + r[1]);



//        // int score = s[0];
//        int score = numbers[0];
//        int min = score,max = score;
//
//        for (int i = 1; i < n; i++) {
//
//            score = numbers[i];
//
//            if(score > max) {
//                max = score;
//                records[0] += 1;
//            }
//
//            if(score < min){
//                min = score;
//                records[1] += 1;
//            }
//
//
//        }








    }



}
