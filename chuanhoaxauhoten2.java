import java.util.*;
public class chuanhoaxauhoten2
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt ();
      scanner.nextLine ();
    while (t > 0)
      {
	String a = scanner.nextLine ();
	  String[] str = a.trim ().split ("\\s+");
	for (int i = 1; i < str.length; i++)
	  {
	    str[i] = str[i].toLowerCase ();
	    char h = Character.toUpperCase (str[i].charAt (0));
	      System.out.print (h);
	    for (int j = 1; j < str[i].length (); j++)
	      {
		System.out.print (str[i].charAt (j));
	      }
	    if (i != str.length-1)
	      {
		System.out.print (" ");
	      }
	  }
	  System.out.print(", ");
	  System.out.println(str[0].toUpperCase());
	t--;
      }
  }
}
