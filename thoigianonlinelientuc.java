import java.util.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.LocalDateTime;
class TS{
    private String name;
    private long time;
    public TS(String name,String dau,String cuoi){
        this.name = name;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime a = LocalDateTime.parse(dau,format);
        LocalDateTime b = LocalDateTime.parse(cuoi, format);
        Duration dura = Duration.between(a, b);
        this.time = dura.toMinutes();
    }
    public long getTime(){
        return time;
    }
    @Override
    public String toString(){
        return name+" "+time;
    }
}
public class thoigianonlinelientuc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<TS> ts = new ArrayList<>();
        while (t-->0) {
            ts.add(new TS(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ts,new Comparator<TS>(){
            public int compare(TS a,TS b){
                return -Long.compare(a.getTime(), b.getTime());
            }
        });
        for(TS i: ts){
            System.out.println(i);
        }
    }
}
