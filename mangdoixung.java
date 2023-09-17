import java.util.*;
public class mangdoixung
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt ();
      scanner.nextLine ();
    while (t > 0)
      {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=scanner.nextInt();
        }
        String ok="YES";
        for(int i=0; i<n; i++){
            if(a[i]!=a[n-i-1]){
                ok="NO";
        }
        }
        System.out.println(ok);
	t--;
      }
  }
}

