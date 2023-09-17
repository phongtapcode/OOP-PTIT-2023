import java.util.*;
public class sodep2
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt ();
      scanner.nextLine ();
    while (t > 0)
      {
	String a = scanner.nextLine ();
	int tong=0;
       for(int i=0; i<a.length(); i++){
           tong+=a.charAt(i)-'0';
       }
       if(tong%10==0 && a.charAt(a.length()-1)=='8'){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
	  t--;
      }
  }
}
