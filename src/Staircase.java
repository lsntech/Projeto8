public class Staircase {


    public static void main(String[] args) {


        int n  = 6;

        String str = "";
        String formated = "";

        for (int i = 1; i < n+1; i++) {

            for (int j = i-1; j < i; j++) {
                str+="#";
            }

            formated = String.format("%"+n+"s",str);
            System.out.println(formated);


        }



    }


}
