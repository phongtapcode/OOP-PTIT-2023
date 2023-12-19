import java.util.*;
class Tran{
    private String ma,name;
    private long gia;
    public Tran(String ma,String name,long gia){
        this.ma = ma;
        this.name = name;
        this.gia = gia;
    }
    public String getName(){
        return name;
    }
    public long getGia(){
        return gia;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+gia;
    }
}
class Doibong{
    private String id,name;
    private long price;
    public Doibong(String id,String name,long price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public long getPrice(){
        return price;
    }
}
public class caulacbobongda2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Doibong> db = new ArrayList<>();
        while (t-->0) {
            db.add(new Doibong(sc.nextLine(), sc.nextLine(), sc.nextLong()));
            sc.nextLine();
        }
        t = sc.nextInt();
        sc.nextLine();
        ArrayList<Tran> tran = new ArrayList<>();
        while (t-->0) {
            String ma = sc.next();
            long sl = Long.parseLong(sc.next());
            for(Doibong i: db){
                if(i.getId().equals(ma.substring(1,3))){
                    tran.add(new Tran(ma, i.getName(), sl*i.getPrice()));
                    break;
                }
            }
        }
        Collections.sort(tran,new Comparator<Tran>() {
            public int compare(Tran a, Tran b){
                if(a.getGia()==b.getGia()){
                    return a.getName().compareTo(b.getName());
                }else{
                    return -Long.compare(a.getGia(), b.getGia());
                }
            }
        });
        for(Tran i: tran){
            System.out.println(i);
        }
    }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000