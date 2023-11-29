import java.util.Scanner;
public class rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = s.length();
        while(true){
            int check = 0;
            for(int i = 0; i < n - 1; i++){
                if (s.charAt(i) == s.charAt(i + 1)){
                    check = 1;
                    s = s.substring(0, i) + s.substring(i + 2);
                    n -= 2;
                }   
            }
            if (check == 0) break;
        }
        if (!s.equals("")) System.out.println(s);
        else System.out.println("Empty String");
    }
}