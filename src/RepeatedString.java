import java.util.StringTokenizer;


/* NOT MY SOLUTION ;( */

public class RepeatedString {


    static long repeatedString(String s, long n) {

        int c = 0, ca = 0;
        long r = n % s.length();

        for (int i = s.length(); i-- > 0; ) {
            if (s.charAt(i) == 'a') {
                ++c;
                if (i < r)
                    ++ca;

            }
        }

        return ((n - r) / s.length() * c) + ca;

    }


    public static void main(String[] args) {

        String s = "a";
        StringBuilder stringBuilder = new StringBuilder();
        long n = 1000000000000L;


        System.out.println(repeatedString(s, n));


//        for (int i = 0; i < n; i++) {
//
//            char c = s.charAt(i%s.length());
//            if(c == 'a')
//                frenq++;
//
//            stringBuilder.append(c);
//
////            stringBuilder.append(s.charAt(i%s.length()));
////            if(i%s.length() == 0)
////                frenq++;
//        }
//
//        String str = stringBuilder.toString();
//
//        System.out.println(str);
//        System.out.println(frenq);


    }


}
