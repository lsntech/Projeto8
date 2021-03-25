import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.format("%d\n%d", a.add(b), a.multiply(b));

    }


}
