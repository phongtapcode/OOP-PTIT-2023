import java.util.*;
public class danhsachcanh
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
    for(int i=1; i<n; i++){
        for(int j=i+1; j<=n; j++){
            if(a[i][j]==1){
                System.out.println("("+i+","+j+")");
            }
        }
    }
    }
  }

