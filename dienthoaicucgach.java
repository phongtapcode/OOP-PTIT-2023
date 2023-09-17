import java.util.*;
public class dienthoacucgach{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String a = scanner.nextLine();
            a = a.toUpperCase();
            String tn = new String("");
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i)>='A' && a.charAt(i)<='C'){
                    tn+='2';
                }else if(a.charAt(i)>='D' && a.charAt(i)<='F'){
                    tn+='3';
            }else if(a.charAt(i)>='G' && a.charAt(i)<='I'){
                    tn+='4';
            }
            else if(a.charAt(i)>='J' && a.charAt(i)<='L'){
                    tn+='5';
            }
            else if(a.charAt(i)>='M' && a.charAt(i)<='O'){
                    tn+='6';
            }
            else if(a.charAt(i)>='P' && a.charAt(i)<='S'){
                    tn+='7';
            }else if(a.charAt(i)>='T' && a.charAt(i)<='V'){
                    tn+='8';
            }
            else if(a.charAt(i)>='W' && a.charAt(i)<='Z'){
                    tn+='9';
            }
        }
        String ok = new String("YES");
        for (int i=0; i<tn.length(); i++){
            if(tn.charAt(i)!=tn.charAt(tn.length()-i-1)){
                ok="NO";
                break;
            }
        }
        System.out.println(ok);
    }
}
}