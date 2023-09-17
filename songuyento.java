import java.util.Scanner;
public class songuyento
{   
    public static int checksnt(int n){
        if(n<2)return 0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int t = scanner.nextInt();
	    while(t>0){
		int a = scanner.nextInt();
		if(checksnt(a)==1){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		t-=1;
	}
	}
}
