import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class sapxepmatran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cot = sc.nextInt();
            int a[][] = new int[n+1][m+1];
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int b[] = new int[n+1];
            for(int i=1; i<=n; i++){
                b[i] = a[i][cot];
            }
            Arrays.sort(b);
            for(int i=1; i<=n; i++){
                a[i][cot] = b[i];
            }           
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                     System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }            
        }
    }
}
