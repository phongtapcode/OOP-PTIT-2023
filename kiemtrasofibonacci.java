import java.util.*;
public class kiemtrasofibonacci
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    int t = scanner.nextInt ();
        long fibo[] = new long[93];
    fibo[1]=0;
    fibo[2]=1;
    for(int i=3; i<=92; i++){
        fibo[i]=fibo[i-2]+fibo[i-1];
    }
    while (t-- > 0)
      {
	long n = scanner.nextLong ();
        if(Arrays.binarySearch(fibo,n)>=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
      }
  }
}
