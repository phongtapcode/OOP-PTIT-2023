import java.util.*;
public class giaocua2dayso
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer> c = new TreeSet<>();
        for(int i=0; i<n; i++){
            if(Arrays.binarySearch(b,a[i])>=0){
                c.add(a[i]);
            }
        }
        for(int i: c){
            System.out.print(i+" ");
        }
        System.out.print("\n");
  }
}

