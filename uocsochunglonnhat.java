import java.util.*;
import java.io.*;
public class uocsochunglonnhat {
    public static int UCLN (int a, int b){
        int res = 0;
        while(b!=0){
            res = a%b;
            a = b;
            b = res;
        }
        return a;
    }
    public static int BCNN(int a, int b){
        return (a * b)/UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){ 
            int n = sc.nextInt();
            int []a = new int[n]; int []b = new int[n + 1];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
            b[0] = a[0];
            for(int i = 1;i<=n - 1;i++) b[i] = BCNN(a[i], a[i - 1]);
            b[n] = a[n - 1];
            for(int i = 0;i<=n;i++) System.out.print(b[i] + " ");
            System.out.println();
        }
    }
}
