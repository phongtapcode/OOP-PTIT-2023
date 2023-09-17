import java.util.*;

class PS{
    long ts,ms;
    public PS(long ts,long ms){
        this.ts = ts;
        this.ms = ms;
    }
    private long gcd(long a,long b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public String rutgon(){
        String a = new String("");
        long b = gcd(this.ms, this.ts);
        return String.format("%d/%d",this.ts/b,this.ms/b);
    }
}
public class phanso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long ts = scanner.nextLong();
        long ms = scanner.nextLong();
        PS c = new PS(ts, ms);
        System.out.println(c.rutgon());
    }
}
