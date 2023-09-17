import java.util.*;
public class tapturiengcuahaixau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            String str[] = a.trim().split("\\s+");
            TreeSet<String> c = new TreeSet<>();
            for(int i=0; i<str.length; i++){
                if(!b.contains(str[i])){
                    c.add(str[i]);
                }
            }
            for(String i: c){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
// abc ab ab ab abcd
// ab abc