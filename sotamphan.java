import java.util.*;
public class sotamphan
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt ();
      scanner.nextLine ();
    while (t > 0)
      {
	String a = scanner.nextLine ();
	int ok=1;
       for(int i=0; i<a.length(); i++){
           if(a.charAt(i)!='0' && a.charAt(i)!='1' &&a.charAt(i)!='2' ){
               ok=0;
           }
       }
       if(ok==1){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
	  t--;
      }
  }
}
