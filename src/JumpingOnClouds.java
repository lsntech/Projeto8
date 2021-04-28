public class JumpingOnClouds {


    public static int jumpingOnClouds(int[] c) {

        int jumps = 0;
        int len = c.length;

        for (int i = 0; i < len; i++, jumps++) {

            if (i < len - 2 && c[i + 2] == 0)
                i++;

        }

        return jumps - 1;


    }


    public static void main(String[] args) {


        int[] c = {0, 0, 1, 0, 1, 0};


        System.out.println(jumpingOnClouds(c));


    }


}



