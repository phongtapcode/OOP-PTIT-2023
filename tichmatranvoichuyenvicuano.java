import java.util.*;
public class tichmatranvoichuyenvicuano {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int hang = sc.nextInt();
            int cot = sc.nextInt();
            int a[][] = new int [hang+1][cot+1];
            int b[][] = new int [cot+1][hang+1];
            for(int i=1; i<=hang; i++){
                for(int j=1; j<=cot; j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int c[][] = new int [hang+1][hang+1];
            for(int i=1; i<=hang; i++){
                for(int j=1; j<=hang; j++){
                    for(int k=1; k<=cot; k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test "+t+":");
            for(int i=1; i<=hang; i++){
                for(int j=1; j<=hang; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }             
        }
    }
}
