import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {


    public static void main(String[] args) {


        Map<String, Integer> list = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++)
        {

            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            list.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(list.containsKey(s)) {
                System.out.println(s + "=" + list.get(s));
            }else{
                System.out.println("Not found");
            }

        }








    }



}
