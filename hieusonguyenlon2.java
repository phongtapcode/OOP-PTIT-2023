import java.math.BigInteger;
import java.util.Scanner;
public class hieusonguyenlon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        BigInteger a = new BigInteger(s1), b = new BigInteger(s2);
        System.out.println(a.subtract(b));
    }
}
