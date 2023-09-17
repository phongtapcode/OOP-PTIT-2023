import java.util.Scanner;
public class tonggiaithua
{
    public static long gt(int n){
        long tich=1;
        for(int i=1; i<=n; i++){
            tich*=i;
        }
        return tich;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		long tong=0;
		for(int i = 1; i<=a; i++){
		    tong+=gt(i);
		}
		System.out.println(tong);
	}
}
