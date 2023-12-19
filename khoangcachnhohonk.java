import java.util.*;
import java.io.*;
public class khoangcachnhohonk {
    public static int upper_bound(int a[], int n, int l, int r, int x) {
        int res = n;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] > x) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), k = sc.nextInt();
            int []a = new int[n];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for(int i = 0;i<n - 1;i++){
                int tmp = upper_bound(a, n, i + 1, n - 1, k + a[i] - 1);
                res+=tmp - i - 1;
            }
            System.out.println(res);
        }
    }
}
