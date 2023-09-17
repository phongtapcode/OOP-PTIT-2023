import java.util.*;
public class boisonhonhatcuansonguyenduongdautien
{
    public static long ucln(long a,long b){
        if(b==0)return a;
        return ucln(b,a%b);
    }
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	    long bcnn[] = new long[105];
	    bcnn[1]=1;
	    bcnn[2]=2;
	    for(int i=3; i<=100; i++){
	        bcnn[i] = (long)i*bcnn[i-1]/ucln((long)i,bcnn[i-1]);
	    }
		int t = scanner.nextInt();
		
		while(t-->0){
		int a = scanner.nextInt();
		System.out.println(bcnn[a]);
	}
	}
}