import java.util.Scanner;
public class xauconlonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0, end = 0;
        char max;
        while(start < s.length()){
            //Tìm min trong [start; end]
            max = s.charAt(start);
            for(int i = start; i<s.length();i++){
                if (s.charAt(i)>max) max = s.charAt(i);
            }
            //In ra các phần tử = max
            for(int i = start; i<s.length();i++){
                if (s.charAt(i)==max){ 
                    System.out.print(max);
                    end = i;
                }
            }
            start = end + 1;
        }
    }
}
