import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

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


    public static void main(String[] args) {


        getPairValue();



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




