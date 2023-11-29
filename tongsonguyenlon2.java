import java.math.BigInteger;
import java.util.Scanner;
public class tongsonguyenlon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        BigInteger c = new BigInteger(a), d = new BigInteger(b);
        System.out.println(c.add(d));
    }
}
