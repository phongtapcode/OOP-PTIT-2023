import java.util.*;
public class chuanhoaxauhoten1
{
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t>0){
		String a = scanner.nextLine();
		String[] str = a.trim().split("\\s+");
		for(int i=0; i<str.length; i++){
		    str[i] = str[i].toLowerCase();
		    char h = Character.toUpperCase(str[i].charAt(0));
		    System.out.print(h);
		    for(int j=1; j<str[i].length(); j++){
		        System.out.print(str[i].charAt(j));
		    }
		    System.out.print(" ");
		}
		System.out.print("\n");
		t--;
	}
}
}
