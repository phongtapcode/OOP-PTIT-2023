import java.util.Scanner;

public class sapxepchon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i]=sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            int pos=i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] <a[pos]) pos=j;
            }
                if (a[i] >a[pos]) {
                    int temp = a[i];
                    a[i] = a[pos];
                    a[pos]=temp;
                    }
            
                System.out.print("Buoc " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) System.out.print(a[k] + " ");
                System.out.println();
            
        }
    }
}