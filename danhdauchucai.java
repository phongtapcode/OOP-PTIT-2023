import java.util.*;
public class danhdauchucai
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		Set<Character> b = new TreeSet<>();
		for(int i = 0; i<a.length(); i++){
		    b.add(a.charAt(i));
		}
		System.out.println(b.size());
	}
}
