public class JavaGenerics{





    public static void main(String[] args) {

        Printer p = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        p.printArray(intArray);
        p.printArray(stringArray);




    }


}


class Printer<T>{

    public void printArray(T[] arra){

        for (T a: arra) {
            System.out.println(a);
        }

    }


}