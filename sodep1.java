import java.util.*;
public class sodep1
{
    public static boolean checkstn(String a){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)%2!=0)return false;
            if(a.charAt(i)!=a.charAt(a.length()-i-1))return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t>0){
		String a = scanner.nextLine();
		if(checkstn(a)==true){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		t--;
		}
	}
}
