import java.util.*;

public class JavaHashset {


    public static void main(String[] args) {

        HashSet<String> pairs = new HashSet<>();

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {

            pair_left[i] = s.next();
            pair_right[i] = s.next();
            pairs.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pairs.size());

        }









    }



}
