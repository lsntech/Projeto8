import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Result{


    // Funciona com input pequena, acima de 3000 da erro.

//    public static int countSubstrings(String str, int l, int r){
//
//        Set<String> subsSet = new HashSet<>();
//        String substring = "";
//
//        if(l > str.length() || r > str.length())
//            return 0;
//
//        for (int i = l; i <= r; i++) {
//
//            for (int j = r+1; j > i; j--) {
//
//                substring = str.substring(i,j);
//                subsSet.add(substring);
//
//            }
//        }
//
//        return subsSet.size();
//
//    }


    public static int countSubstrings(String str, int l, int r){

        char[] chars = str.toCharArray();

        Set<String> subsSet = new HashSet<>();
        String substring = "";

        if(l > str.length() || r > str.length())
            return 0;

        for (int i = l; i <= r; i++) {

            for (int j = r+1; j > i; j--) {

                substring = str.substring(i,j);
                subsSet.add(substring);

            }
        }

        return subsSet.size();

    }






}


public class HowManySubstrings {




    public static void main(String[] args) {


        Set<String> subsSet = new HashSet<>();

        // String s = "aabaa";
      //  int l = 0, r = 2;

      //  System.out.println(countSubstrings(s,l,r));


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int l = 0, r = 0;

        String s = scanner.next();

        for (int i = 0; i < q; i++) {

            l = scanner.nextInt();
            r = scanner.nextInt();

            System.out.println(Result.countSubstrings(s, l,r));

        }









//        String substring = "";



    //    System.out.println(s.substring(l,r));

//        for (int i = l; i <= r; i++) {
//
//            for (int j = r; j > i; j--) {
//                substring = s.substring(i,j);
//                subsSet.add(substring);
//         //       System.out.println(s.substring(i,j));
//           //     System.out.printf("i: %d , j: %d \n", i,j);
//
//            }
//
//        }
//
//        System.out.println(subsSet.toString());
//        System.out.println(subsSet.size());



//        for (int i = l, j = r; i < 10 && j > l; i++, j--) {
//
//            System.out.printf("i: %d , j: %d \n", i,j);
//
//        }


//        for (int i = 0; i < s.length(); i++) {
//
//            sub = s.substring(l,r);
//
//
//
//
//        }





    }



}
