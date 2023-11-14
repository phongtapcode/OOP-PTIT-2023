import java.util.*;
public class tinhluythua {
    public static long pow(long a, long b){
        long res = 1L;
        while(b != 0){
            if (b%2==1) res = (res*a)%1000000007;
            a = (a * a) %1000000007;
            b/=2;
        }
        return res;
    }
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0){
                break;
            }
            System.out.println(pow(a,b));
        }
    }
}
