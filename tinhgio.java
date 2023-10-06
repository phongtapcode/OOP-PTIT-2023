import java.util.*;
class Gamer{
    private String ma,name;
    private int hours,minutes;
    public Gamer(String ma, String name,String timein,String timeout){
        int minute,hour;
        String in[] = timein.trim().split(":");
        String out[] = timeout.trim().split(":");
        int hour1 = Integer.parseInt(in[0]);
        int minute1 = Integer.parseInt(in[1]);
        int hour2 = Integer.parseInt(out[0]);
        int minute2 = Integer.parseInt(out[1]);
        minute = minute2-minute1>=0? minute2-minute1:60+minute2-minute1;
        if(minute2-minute1>=0){
            minute = minute2-minute1;
        }else{
            minute = 60 + minute2-minute1;
            hour1++;
        }
        if(hour2-hour1>=0){
            hour=hour2-hour1;
        }else{
            hour=24+hour2-hour1;
        }
        this.ma=ma;
        this.name=name;
        this.hours=hour;
        this.minutes=minute;
    }
    public int total(){
        return hours*60+minutes;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+hours+" gio "+minutes+" phut";
    }
}
public class tinhgio {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Gamer> game = new  ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String timein = sc.nextLine();
            String timeout = sc.nextLine();
            Gamer a = new Gamer(ma, name, timein, timeout);
            game.add(a);
        }
        Collections.sort(game,new Comparator<Gamer>() {
            @Override
            public int compare(Gamer a,Gamer b){
                return -Float.compare(a.total(), b.total());
            }
        });
        for(Gamer i : game){
            System.out.println(i);
        }
    }
}
