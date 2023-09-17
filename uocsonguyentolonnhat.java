import java.util.*;
public class uocsonguyentolonnhat
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0){
		long a = scanner.nextLong();
		long max1=0;
		
		for(int i=2; i<=(int)Math.sqrt(a); i++){
		    while(a%i==0){
		        a/=i;
		        max1=Math.max(max1,i);
		    }
		}
		if(a!=1){
		    max1=Math.max(max1,a);
		}
		System.out.println(max1);
	}
	}
}