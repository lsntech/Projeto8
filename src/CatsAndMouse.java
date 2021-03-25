public class CatsAndMouse {

  static String catAndMouse(int x, int y, int z) {

      int d1  = (z > x)? z - x : x - z;
      int d2  = (z > y)? z - y : y - z;

      String r = (d1 < d2)? "Cat A" : "Cat B";

      if( d1 == d2)
           r = "Mouse C";

      return r;
  }


  public static void main(String[] args) {

      int a = 3;
      int b = 3;
      int c = 6;

      System.out.println(catAndMouse(a,b,c));

    }


}
