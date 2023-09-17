import java.util.*;
public class sodep3
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
           if(a.charAt(i)!='2' && a.charAt(i)!='3' &&a.charAt(i)!='5' &&a.charAt(i)!='7'){
               ok=0;
           }
           if(a.charAt(i)!=a.charAt(a.length()-i-1)){
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
