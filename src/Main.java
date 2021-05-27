import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void getPairValue(){
        int d,q,n,x,y;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(n);


        for(int i = 0; i < n; i++){

            lines.add(new ArrayList<>());
            d = scanner.nextInt();

            for (int j = 0; j < d; j++) {
                lines.get(i).add(scanner.nextInt());
            }

        }

        q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            x = scanner.nextInt();
            y = scanner.nextInt();

            try {
                System.out.println(lines.get(x - 1).get(y - 1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }

        }
    }

    static Integer[] rotLeft(Integer[] a, int d) {

        Deque<Integer> deque = new ArrayDeque<Integer>(Arrays.asList(a));

        for (int i = 0; i < d; i++) {
            int temp = deque.pop();
            deque.add(temp);
        }

        Integer[] n = deque.toArray(new Integer[deque.size()]);

        return n;
    }



    public static void main(String[] args) {


           Integer[] a = {1,2,3,4,5};
           Integer[] b = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
           Integer[] iarra = new Integer[10];

//           Deque<Integer> deque = new ArrayDeque<Integer>(Arrays.asList(b));
//
//           int rotations = 10;
//
//           for (int i = 0; i < rotations; i++) {
//               int temp = deque.pop();
//               deque.add(temp);
//           }

       // Integer[] n = deque.toArray(new Integer[deque.size()]);

        System.out.println(b[0]);

//        Integer[] arr = rotLeft(b, 10);
//
//        for (Integer n: arr) {
//            System.out.printf("%d ", n);
//        }




//        for (int i = b.length-1; i > 0 ; i--) {
//            System.out.println(b[i]);
//        }

//        int len = b.length-1;
//
//        for (int i = 0; i < len; i++) {
//
//            int temp = b[i];
//            b[i] = b[len--]; // 41 | 51
//            b[len-i] = temp;
//            System.out.printf("b[i]: %d , b[len-i]: %d \n", b[i], b[len-i]);
//
//        }
//
//       System.out.println(Arrays.toString(b));





    //    getPairValue();



//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < lines.get(i).size(); j++) {
//                System.out.print(lines.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }


//
//        int[][] numbers = {{41,77,74,22,44}, {12}, {37, 34, 36, 52}, {}, {3, 20, 22, 33} };
//
//        int n = 5;
//
//        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(n);
//
//
//        // initialization.
//        for (int i = 0; i < n; i++) {
//            lines.add(new ArrayList<>());
//
//        }
//
//        int d = 5;
//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < numbers[i].length; j++) {
//                 lines.get(i).add(numbers[i][j]);
//            }
//
//        }
//
//        System.out.print(lines.get(0).get(2) + " ");



//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(lines.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }




//
//        for(int i=0; i < vertexCount; i++) {
//            graph.add(new ArrayList());
//        }
//
//        graph.get(0).add(1);
//        graph.get(1).add(2);
//        graph.get(2).add(0);
//
//        graph.get(1).add(0);
//        graph.get(2).add(1);
//        graph.get(0).add(2);
//
//        System.out.println(graph.get(1).get(0));
//
//        vertexCount = graph.size();
//        for (int i = 0; i < vertexCount; i++) {
//            int edgeCount = graph.get(i).size();
//            for (int j = 0; j < edgeCount; j++) {
//                Integer startVertex = i;
//                Integer endVertex = graph.get(i).get(j);
//                System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
//            }
//        }


    }


}




