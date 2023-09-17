import java.util.*;
public class matrannhiphan
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
	int n = scanner.nextInt ();
	int a[][] = new int[n][3];
	int dem = 0;
	for (int i = 0; i < n; i++)
	  {
	    int dem0 = 0;
	    int dem1 = 1;
	    for (int j = 0; j < 3; j++)
	      {
		a[i][j] = scanner.nextInt ();
		if (a[i][j] == 1)
		  {
		    dem1++;
		  }
		else
		  {
		    dem0++;
		  }
	      }
	    if (dem1 > dem0)
	      {
		dem++;
	      }
	  }
	System.out.println (dem);
      }
  }

