import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NegativeSubArray {

    private static int negativeSubArray(int [] array) {

        int count = 0;
        int sum   = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                sum += array[j];
                if (sum < 0)
                    count++;

            }
            sum = 0;
        }
        return count;

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
             array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(negativeSubArray(array));




    }



}
