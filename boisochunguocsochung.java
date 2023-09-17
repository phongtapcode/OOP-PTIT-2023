import java.util.*;
public class boisochunguocsochung
{
    public static long ucln(long a, long b){
        if(b==0)return a;
        return ucln(b,a%b);
    }
    
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0){
		long a = scanner.nextInt(),b=scanner.nextInt();
		System.out.println((a*b)/ucln(a,b)+" "+ucln(a,b));
	}
	}
}
