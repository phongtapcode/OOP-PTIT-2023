import java.util.*;
public class bosungdayso
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
		    a[i] = scanner.nextInt();
		}
		int ok=0;
		if(a[0]!=1){
		    for(int i=1; i<a[0]; i++){
		        System.out.println(i);
		        ok=1;
		    }
		}
		for(int i=0;i<n-1; i++){
		    if(a[i+1]-a[i]!=1){
		        for(int j=a[i]+1; j<a[i+1]; j++){
		            System.out.println(j);
		            ok=1;
		        }
		    }
		}
		if(ok==0){
		    System.out.println("Excellent!");
		}
	}
}
