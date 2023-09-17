import java.util.*;

class PS{
    long ts,ms;
    public PS(){
        ts=1;
        ms=1;
    }
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
    public String rutgon(PS b){
        long tuso = this.ts*b.ms+b.ts*this.ms;
        long mauso = this.ms*b.ms;
        long c = gcd(tuso, mauso);
        return String.format("%d/%d",tuso/c,mauso/c);
    }
}
public class tongphanso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long ts = scanner.nextLong();
        long ms = scanner.nextLong();
        PS a = new PS(ts, ms);
        ts = scanner.nextLong();
        ms = scanner.nextLong();
        PS b = new PS(ts, ms);
        System.out.println(a.rutgon(b));
    }
}
