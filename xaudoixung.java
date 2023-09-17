import java.util.*;
public class xaudoixung
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt ();
      scanner.nextLine ();
    while (t > 0)
      {
	String a = scanner.nextLine ();
	int dem = 0;
	for (int i = 0; i < a.length () / 2; i++)
	  {
	    if (a.charAt (i) != a.charAt (a.length () - i - 1))
	      {
		dem++;
	      }
	  }
	if (dem == 1 || (dem == 0 && a.length () % 2 == 1))
	  {
	    System.out.println ("YES");
	  }
	else
	  {
	    System.out.println ("NO");
	  }
	t--;
      }
  }
}
