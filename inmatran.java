import java.util.*;
public class inmatran
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt();
    while(t>0){
    int n = scanner.nextInt ();
    int[][] a = new int[n][n];
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    a[i][j] = scanner.nextInt ();
	  }
      }
    for(int i=0; i<n; i++){
        if(i%2==0){
            for(int j=0 ;j<n; j++){
                System.out.print(a[i][j]+" ");
            }
        }else{
        for(int j=n-1; j>=0; j--){
            System.out.print(a[i][j]+" ");
        }
        }
    }
    System.out.print("\n");
    t--;
    }
  }
}
