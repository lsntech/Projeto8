import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GradingStudents {


    public static List<Integer> gradingStudents(List<Integer> grades) {

        int m = 0;
        List<Integer> r = new ArrayList<>();

        for (Integer g: grades) {

            m = g +(5 - g % 5);

            if(m >= 40)
                r.add( (m - g < 3)? m : g );
                else  r.add(g);
        }

        return r;

    }




    public static void main(String[] args) {

        Integer[] testA = {73,67,38,33};

        List<Integer> test = new ArrayList(Arrays.asList(testA));
        List<Integer> result = new ArrayList<>();

        result = gradingStudents(test);



        System.out.println(result);


    }



}
