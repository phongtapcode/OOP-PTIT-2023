import java.util.Scanner;
public class sokhonglienke
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t>0){
		String a = scanner.nextLine();
		int ok=1;
		int dem=0;
		int tong=0;
		for(int i=0; i<a.length()-1; i++){
		    tong+=a.charAt(i)-'0';
		    if(Math.abs(a.charAt(i)-a.charAt(i+1))!=2){
		        ok=0;
		    }
		}
		tong+=a.charAt(a.length()-1)-'0';
		if(ok==1 && tong%10==0){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		t--;
		}
		scanner.close();
	}
}
