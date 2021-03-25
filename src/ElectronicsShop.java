import java.lang.reflect.Array;
import java.util.*;


public class ElectronicsShop {



    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         Very expensive shit solution.
        */

        int t = 0;
        List<Integer> r = new ArrayList<>();

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {

                t = keyboards[i] + drives[j];

                if(t <= b)
                    r.add(t);
            }
        }

        Collections.sort(r);



        if(r.size() > 0){ return r.get(r.size()-1);}
        else{  return -1; }

    }




    public static void main(String[] args) {

        int b = 10;
        int k[] = {3, 1};
        int u[] = {5, 2, 8};
        List<Integer> r = new ArrayList<>();

        System.out.println(getMoneySpent(k, u, b));


    }

}
