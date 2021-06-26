import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubArrayDivision {


    public static int birthday2(int[] a, int m, int d) {

        int ways = 0;
        int sum = 0;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i; j < i + m; j++) {

                sum += a[j];

            }

            if (sum == d)
                ways++;

            sum = 0;


        }

        return ways;

    }

    static int birthday(int[] a, int d, int m) {

        int sum = 0;
        int ways = 0;
        int len = a.length;

        for (int i=0;i<m;i++){
            sum += a[i];
        }
        for (int i=0;i< len-m+1;i++) {
            if (sum==d) {
                ways++;
            }
            if (i+m < len){
                sum = sum - a[i] + a[i+m];
            }
        }
        return ways;
    }


    static int solve(int n, int[] s, int d, int m){
        int total=0;
        for (int i=0;i<=n-m;i++){
            if(Arrays.stream(s, i, i+m).sum() == d)
                total++;
        }
        return total;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.close();



        System.out.println(birthday(s, d, m));


//        int[] a = {1,2,1,3,2};
//        int[] b = {1, 1, 1, 1, 1, 1};
//        int[] c = {1};
//
//        int d = 4;
//        int m = 1;
//        int cc = 0;
//        int s = 0;
//        int internalIndex = 0;
//
//        int p = 0;
//
//        int last = 0;
//        int k = 0;
//
//        int size = a.length-1;
//
//        System.out.println(birthday(c, m, d));


//        for (int i = 0; i < size; i++) {
//
//            for (int j = i; j < i+m; j++) {
//
//                c += a[j];
//
//            }
//            System.out.println(c);
//
//            if(c == d)
//                k++;
//
//            c = 0;
//
//
//
//        }
//
//        System.out.println(k);






}








}
