public class ScopeMinMaxDiff {


    public static void main(String[] args) {

        int[] a = {1,2,4,5,9};

        Difference difference = new Difference(a);

        difference.computeDifference();


        System.out.print(difference.maximumDifference);


    }


}


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] arr){
        this.elements = arr;
    }

    public int computeDifference(){

        int n = elements.length;
        maximumDifference = 0;

        // O(n^2)
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {

                int s = (elements[j] - elements[i]);
                s = (s < 0) ? -s : s;

                if(s > maximumDifference)
                    maximumDifference = s;

            }

        }

        return maximumDifference;

    }

    public int computeDifference2(){

        int n = elements.length;
        maximumDifference = 0;
        int max = elements[0], min = elements[0];


        // O(n)
        for (int i = 1; i < n; i++) {

            if(elements[i] < min) min = elements[i];
            if(elements[i] > max) max = elements[i];

        }

        maximumDifference = Math.abs(max - min);
        return maximumDifference;

    }





}


