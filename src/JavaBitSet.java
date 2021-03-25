import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.StringTokenizer;

public class JavaBitSet {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String[] st = s.split("\\s+");

        // StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st[0]);
        int M = Integer.parseInt(st[1]);

        BitSet bit1 = new BitSet(N);
        BitSet bit2 = new BitSet(N);

        while(M-- > 0)
        {
            s = br.readLine().trim();
            st = s.split("\\s+");

            String op = st[0];
            int a = Integer.parseInt(st[1]);
            int b = Integer.parseInt(st[2]);

            switch(op)
            {
                case "AND":
                    if(a==1)
                        bit1.and(bit2);
                    else
                        bit2.and(bit1);
                    break;
                case "OR":
                    if(a==1)
                        bit1.or(bit2);
                    else
                        bit2.or(bit1);
                    break;
                case "XOR":
                    if(a==1)
                        bit1.xor(bit2);
                    else
                        bit2.xor(bit1);
                    break;
                case "FLIP":
                    if(a==1)
                        bit1.flip(b);
                    else
                        bit2.flip(b);
                    break;
                case "SET":
                    if(a==1)
                        bit1.set(b);
                    else
                        bit2.set(b);
                    break;

            }
            System.out.println(bit1.cardinality()+" "+bit2.cardinality());

        }

    }


}
