import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author: kylin
 * Date: 2017/8/30
 * 独立的小易.
 */
public class Case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            BigInteger x = new BigInteger(scanner.nextInt()+"");
            BigInteger f = new BigInteger(scanner.nextInt()+"");
            BigInteger d = new BigInteger(scanner.nextInt()+"");
            BigInteger p = new BigInteger(scanner.nextInt()+"");
            BigInteger result = null;
            if(f.compareTo(d.divide(x))>=0){
                result = d.divide(x);
            }else{
                result = (d.add(f.multiply(p))).divide(p.add(x));
            }
            System.out.println(result.toString());
        }
    }
}
