import java.util.*;

public class lietketohop1 {
    static int n,k;
    static int a[];
    static int dem=0;
    public static void Try(int i){
        for (int j=a[i-1]+1; j<=n-k+i; j++){
            a[i]=j;
            if(i==k){
                for(int h=1;h<=k; h++){
                    System.out.print(a[h]+" ");
                }
                dem++;
                System.out.println();
            }else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        k=scanner.nextInt();
        a = new int[k+2];
        a[0]=0;
        Try(1);
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
