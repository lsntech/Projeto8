import java.io.CharArrayReader;
import java.util.*;

public class Anagrams {


  public static char[] insertionSort(char[] str){

      int i =0, j=0;
      char temp;
      int size = str.length;

      for (i = 1; i < size; i++) {
          temp = str[i];
          j = i - 1;

          while ((j>=0) && (str[i] > temp)){
              str[i+1] = str[j];
              j--;
          }
          str[j+1] = temp;
          System.out.println(temp );

      }

      return str;
   }

  public static long factorial(long n){

      long r = 1;

      for (long i = 2; i <= n; i++) {
          r *= i;
      }

      return r;
  }

  public static int factorial_recursive(int n){

      if (n == 0)
           return 1;

      return n * factorial_recursive(n - 1);
  }

  public static long getMaxPermutations(String s){

      return factorial(s.length());
  }


  public static char[] noobSorting(char[] chars){
        // Extreme Go Horse sorting.

      char temp;

      for (int i = 0; i < chars.length; i++) {

          for (int j = 0; j < chars.length-1; j++) {

              if(chars[j] > chars[j+1]){
                   temp = chars[j];
                   chars[j] = chars[j+1];
                   chars[j+1] = temp;
                }
            }
      }

      return chars;
  }

  static boolean isAnagram(String firstWord, String secondWord) {

      char[] chara = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
      char[] charb = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();

      String ra = String.valueOf(noobSorting(chara));
      String rb = String.valueOf(noobSorting(charb));

      return  ra.compareTo(rb) == 0 ? true : false;
  }



  public static void main(String[] args) {

      String a = "anagram";
      String b = "margana";
      String abc = "manbcdefopqrstuvwxyzghijkl";
      StringBuilder stringBuilder = new StringBuilder();


      System.out.println(factorial(15));

      for (char c = 'a'; c <= 'z'; c++){
            stringBuilder.append(c);
      }

      System.out.println(stringBuilder);

      System.out.println(isAnagram(stringBuilder.toString(), abc));

  }



}
