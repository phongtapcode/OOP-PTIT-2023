import java.util.*;
public class demsolanxuathien
{
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int t = scanner.nextInt();
	    for(int j=1; j<=t; j++){
	    int n = scanner.nextInt();
	    boolean[] danhdau = new boolean[10000000];
		int[] dem = new int[10000000];
		int[] a = new int[n];
		for(int i=0; i<n; i++){
		    a[i] = scanner.nextInt();
		    dem[a[i]]++;
		    danhdau[i]=false;
		}
		System.out.println("Test "+j +":");
		for(int i=0; i<n; i++){
		    if(danhdau[a[i]]==false){
		        danhdau[a[i]]=true;
		        System.out.println(a[i] + " xuat hien "+ dem[a[i]] +" lan");
		    }
		}
	    }
	}
}
