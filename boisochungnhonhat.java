import java.math.BigInteger;
import java.util.Scanner;
public class boisochungnhonhat {
    public static BigInteger UCLN(BigInteger a, BigInteger b){
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger temp = b;
            b = a.mod(b);
            a = temp;
        }
        return a;
    }
    public static BigInteger BCNN(BigInteger a, BigInteger b){
         return a.multiply(b).divide(UCLN(a, b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger big1 = new BigInteger(s1);
            BigInteger big2 = new BigInteger(s2);
            System.out.println(BCNN(big1, big2));
        }
    }
}
