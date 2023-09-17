import java.util.*;
public class sochinhphuong
{   
    public static boolean check(int n){
        if(n<0)return false;
        int a = (int)Math.sqrt(n);
        return a*a==n;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t>0){
		    int a = scanner.nextInt();
		    if(check(a)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
