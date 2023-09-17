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
    public String rutgon(PS b){
        long tuso = this.ts*b.ms+b.ts*this.ms;
        long mauso = this.ms*b.ms;
        long c = gcd((long)Math.pow(tuso,2), (long)Math.pow(mauso,2));
        tuso = (long)Math.pow(tuso,2)/c;
        mauso = (long)Math.pow(mauso,2)/c;
        long d = gcd(this.ts*b.ts*tuso,this.ms*b.ms*mauso);

        return String.format("%d/%d %d/%d",tuso,mauso,(this.ts*b.ts*tuso)/d,(this.ms*b.ms*mauso)/d);
    }
}
public class tinhtoanphanso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
        long ts = scanner.nextLong();
        long ms = scanner.nextLong();
        PS a = new PS(ts, ms);
        ts = scanner.nextLong();
        ms = scanner.nextLong();
        PS b = new PS(ts, ms);
        System.out.println(a.rutgon(b));
    }
    }
}
