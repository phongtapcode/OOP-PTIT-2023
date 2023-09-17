import java.util.*;
public class giaiphuongtrinhbacnhat
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a==0 && b!=0){
		    System.out.println("VN");
		}
		else if(a==0 && b==0){
		    System.out.println("VSN");
		}else{
		    int n=2;
		    System.out.println(String.format("%."+n+"f",(double)(-b)/a));
		}
	}
}
