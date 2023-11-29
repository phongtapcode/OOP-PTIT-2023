import java.util.*;
public class quayphai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int cnt=1;
            for(int i=1; i<n; i++){
                if(a[i]>a[i-1]){
                    cnt++;
                }else{
                    break;
                }
            }
            System.out.println(cnt%n);
        }
    }
}
