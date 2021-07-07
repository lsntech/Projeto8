import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birds = new HashMap<>();
        int key = 0;

        for(int i = 0; i < arr.size(); i++){
            if(birds.containsKey(arr.get(i))){
                birds.put(arr.get(i), birds.get(arr.get(i)) + 1);
            }else{
                birds.put(arr.get(i), 1);
            }
        }
        key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }




    public static void main(String[] args) {


        List<Integer> array = new ArrayList<>(List.of(1, 2, 4, 4 ,2, 3));

        System.out.println(migratoryBirds(array));


    }












































}
