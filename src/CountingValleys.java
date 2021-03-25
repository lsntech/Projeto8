public class CountingValleys {

  public static int countingValleys(int steps, String path) {

      int v = 0;
      int sl = 0;

      for (int i = 0; i < steps; i++) {

          char c = path.charAt(i);
          sl += c == 'U' ? 1 : -1;

          if(sl == 0 && c == 'U')
                    ++v;

      }

      return v;
  }




    public static void main(String[] args) {

        String path = "UDDDUDUUUDDDUDUU";
        int steps = path.length();


        System.out.println(countingValleys(steps, path));

    }



}
