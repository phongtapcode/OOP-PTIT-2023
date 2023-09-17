import java.util.*;
public class phantichthuasonguyento
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int j=1; j<=t;  j++){
		    int a =scanner.nextInt();
		    int i=2;
		    int dem=0;
		    System.out.print("Test " +j+": ");
		    while(a>1){
		        if(a%i==0){
		            dem++;
		            a/=i;
		        }else{
		            if(dem!=0){
		                System.out.print(i+"("+dem+") ");
		            }
		            i++;
		            dem=0;
		        }
		    }
		    System.out.println(i+"("+dem+")");
		}
	}
}

