import java.math.BigInteger;
import java.sql.SQLOutput;

public class PrimalityTest {

  public static void main(String[] args) {

        // int n = 12;
      String n = "13";
      BigInteger A = new BigInteger(n);

      String r = A.isProbablePrime(1)? "prime" : "not prime";

      System.out.println(r);



  }


}
