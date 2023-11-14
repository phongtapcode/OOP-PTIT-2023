import java.util.*;
public class souuthe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String a = sc.nextLine();
            int chan=0;
            int le=0;
            String ok = "YES";
            if(a.charAt(0)=='0'){
                ok="INVALID";
                System.out.println(ok);
                continue;
            }
            
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i)>='0' && a.charAt(i)<='9'){
                    if((a.charAt(i)-'0')%2==0){
                        chan++;
                    }else{
                        le++;
                    }
                }else{
                    ok="INVALID";
                }
            }
            if((a.length()%2==0 && chan>le) || (a.length()%2!=0 && chan<le)){
                
            }else{
                ok="NO";
            }
            System.out.println(ok);
        }
    }
}
