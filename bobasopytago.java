import java.util.Arrays;
import java.util.Scanner;
public class bobasopytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n];
            long []b = new long[n];
            for(int i = 0;i<n;i++){ 
                a[i] = sc.nextInt();
                b[i] = 1l*a[i] * a[i];
            }
            Arrays.sort(b);
            int check = 0;
            for(int i=n-1;i>=2;i--){
        		int check1 = 0;//ton tai cap so co tong = v[i]
        		//Kiem tra xem co cap so tong = v[i]?
        		int l = 0, r = i - 1;
        		while(l<r){
                    if(b[l]+b[r]==b[i]) {
            			check1 = 1;
            			break;
                    }
                    if(b[l]+b[r]<b[i]) l++;
                    else  r--;
    		    }
    		    if(check1==1){
                    check=1;
                    break;
    		    }
            }
            if(check==1)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}