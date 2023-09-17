import java.util.Scanner;
public class tinhtongnsonguyenduongdautien
{
  public static void main (String[]args)
  {
    Scanner cin = new Scanner (System.in);
    int t = cin.nextInt ();
    while (t>0)
      {
	long a = cin.nextLong ();
	  System.out.println (a*(a+1)/2);
	  t--;
      }
  }
}
