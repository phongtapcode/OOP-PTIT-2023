import java.util.*;
import java.io.*;
import java.math.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;
import java.math.*;
public class codeptit {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long tong = 0;
        int cnt=0;
        String a = "";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                tong+=Math.pow(2,cnt);
            }
            cnt++;
            if(cnt==3){
                cnt=0;
                a+=Long.toString(tong);
                tong=0;
            }
        }       
                if(tong==0 && s.length()%3!=0){
                    a+=Long.toString(tong);
                }
            for(int i=a.length()-1; i>=0; i--){
                System.out.print(a.charAt(i));
            }
    }
}
