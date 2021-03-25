import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class JavaList {

    public static void main(String[] args) throws IOException {


        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int value;

        for (int i = 0; i < 5; i++) {
            value = scanner.nextInt();
            list.add(value);
        }

        System.out.println(list);





    }


}



