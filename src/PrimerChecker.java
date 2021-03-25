import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

class Prime{

  public void checkPrime(int... args){

      int last = args[args.length-1];

      if(last == 2)
           System.out.println("2");

      if(isPrime(last)){

          for (int j = 0; j <= last ; j++) {
               if (isPrime(j))
                    System.out.format("%d ", j);
          }
            System.out.println("");

      }

  }

  private static boolean isPrime(int number) {

        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);

    }



}




public class PrimerChecker {


  public static void main(String[] args) {

      try{

          BufferedReader br = new BufferedReader(new InputStreamReader(in));
          int n1=Integer.parseInt(br.readLine());
          int n2=Integer.parseInt(br.readLine());
          int n3=Integer.parseInt(br.readLine());
          int n4=Integer.parseInt(br.readLine());
          int n5=Integer.parseInt(br.readLine());

          Prime ob = new Prime();
          ob.checkPrime(n1);
          ob.checkPrime(n1,n2);
          ob.checkPrime(n1,n2,n3);
          ob.checkPrime(n1,n2,n3,n4,n5);

          Method[] methods = Prime.class.getDeclaredMethods();
          Set<String> set = new HashSet<>();
          boolean overload = false;

          for(int i = 0;i<methods.length;i++)
            {
              if(set.contains(methods[i].getName()))
               {
                  overload=true;
                  break;
               }
                 set.add(methods[i].getName());

          }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}


