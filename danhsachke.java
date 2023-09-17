import java.util.*;
public class danhsachke
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

    int n = scanner.nextInt ();
    int[][] a = new int[n+1][n+1];
    for (int i = 1; i <= n; i++)
      {
	for (int j = 1; j <= n; j++)
	  {
	    a[i][j] = scanner.nextInt ();
	  }
      }
     ArrayList<Integer>[] b = new ArrayList[n+1];
     for(int i=1; i<=n; i++){
         b[i] = new ArrayList<Integer>();
     }
    for(int i=1; i<=n; i++){
        for(int j=0; j<=n; j++){
            if(a[i][j]==1){
                b[i].add(j);
            }
        }
    }
    for(int i=1; i<=n; i++){
        System.out.print("List("+i+") = " );
        for(int j=0; j<b[i].size();j++){
            System.out.print(b[i].get(j)+" ");
        }
        System.out.print("\n");
    }
    }
  }

