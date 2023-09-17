import java.util.*;
public class hopcua2dayso
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> c = new TreeSet<>();
        for(int i=0; i<n; i++){
            a[i]=scanner.nextInt();
            c.add(a[i]);
        }
        for(int i=0; i<m; i++){
            b[i]=scanner.nextInt();
            c.add(b[i]);
        }
        
        for(int i: c){
            System.out.print(i+" ");
        }
        System.out.print("\n");
  }
}

