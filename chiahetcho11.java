import java.util.*;
public class chiahetcho11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            int tongchan=0;
            int tongle=0;
            String a = scanner.nextLine();
            for(int i=0; i<a.length(); i++){
                if(i%2==0){
                    tongchan+=a.charAt(i)-'0';
                }else{
                    tongle+=a.charAt(i)-'0';
                }
            }
            if((tongchan-tongle)%11==0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }}