import java.util.*;

public class JavaStrings {


    public  static void APISolution(int k, String input){

        SortedSet<String> s = new TreeSet<String>();

        for (int i = 0; i <= input.length()-k; i++) {
             s.add(input.substring(i,(i+k)));
        }

        System.out.println(s.first() + "\n" + s.last());

    }


    public static void isPalindrome(String s){

        String reversed = "";
        String result;

        for (int i = s.length()-1; i >= 0; i--){
            reversed+= s.charAt(i);
        }

        result = (reversed.compareTo(s) == 0)? "Yes" : "No";
        System.out.println(result);

    }


    public  static String APISolution2(String input, int k){

        String smallest = "";
        String largest = "";
        List<String> str = new ArrayList<>();

        for (int i = 0; i <= input.length()-k; i++) {
             str.add(input.substring(i,i+k));
        }

        Collections.sort(str);

        smallest = str.get(0);
        largest  = str.get(str.size()-1);


        return smallest + "\n" + largest;

    }


    public  static String APISolution3(String input, int k){

        String smallest = "";
        String largest = "";
        String substring = "";


        for (int i = 0; i <= input.length()-k; i++) {
            substring = input.substring(i,i+k);

            if (substring.compareTo(smallest) < 0){
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }


        }

        return smallest + "\n" + largest;

    }

    public static String getSmallestAndLargest(String s, int k) {

        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;

        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);

            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }





    public static void main(String[] args) {

//
//        String input = "welcometojava";
//        int k  = 3;
//        int range = 0;
//        String sub = "";
//
//        System.out.println(APISolution3(input,k));


        isPalindrome("ama");





    }



}
