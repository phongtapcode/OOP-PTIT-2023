import java.util.*;
import java.io.*;
public class dayconlientiepcotongbangk {
    public static void check(int a[],int n,long k){
        long sum=0;
        HashSet<Long> set =new HashSet<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==k || a[i]==k){
                System.out.println("YES");
                return;
            }
            if(set.contains(sum-k)){
                System.out.println("YES");
                return;
            }
            set.add(sum);
        }
        System.out.println("NO"); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            int[] a =new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            check(a,n,k);
        }
    }
}