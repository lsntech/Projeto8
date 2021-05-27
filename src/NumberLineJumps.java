public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if(v1 > v2)
            return ( (x1-x2) % (v2-v1) == 0  )? "YES": "NO";
        else
            return "NO";
    }

    static String kangaroo2(int x1, int v1, int x2, int v2) {

        if (v1 > v2) {

            int remainder = (x1 - x2) % (v2 - v1);

            if (remainder == 0) {
                return "YES";
            }
        }
        return "NO";

    }


    static int getMin(int a, int b){

        if(a < b)
            return a;
        else
            return b;

    }


    public static void main(String[] args) {



   //     System.out.println(kangaroo(x1, v1, x2, v2));
        int x1    = 0;
        int v1    = 2;
        int x2 = 5, v2 = 3;

        System.out.println(kangaroo2(x1, v1, x2, v2));


    }


}
