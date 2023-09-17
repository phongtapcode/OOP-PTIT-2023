import java.util.*;
public class daotu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
        String b = scanner.nextLine();
        String a[] = b.trim().split("\\s+");
        for (int i=0; i<a.length; i++){
            for(int j=a[i].length()-1;j>=0; j--){
                System.out.print(a[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        }
    }
}
