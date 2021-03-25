import java.util.ArrayList;
import java.util.Stack;

public class JavaVarargs {

    public static void main(String[] args) {


        Add obj = new Add();
        obj.add(1,2);
        obj.add(1,2,3);
        obj.add(1,2,3,4,5);
        obj.add(1,2,3,4,5,6);


    }


}


class Add {

    public void add(int... numbers) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int total = 0;

        for (int number : numbers) {

            arrayList.add(number);
            total += number;

        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer n: arrayList) {
            stringBuilder.append(n + "+");
        }

        String result = stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("+")).toString();


        System.out.println(result + "=" + total);

    }



 }

