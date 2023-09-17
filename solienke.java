import java.util.Scanner;
public class solienke
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t>0){
		String a = scanner.nextLine();
		int ok=1;
		int dem=0;
		for(int i=0; i<a.length()-1; i++){
		    if(Math.abs(a.charAt(i)-a.charAt(i+1))!=1){
		        ok=0;
		        break;
		    }
		}
		if(ok==1){
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
