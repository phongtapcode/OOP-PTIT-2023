import java.util.*;
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
public class caulacbobongda1 {
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
        while (t-->0) {
            String ma = sc.next();
            long sl = Long.parseLong(sc.next());
            System.out.print(ma+" ");
            for(Doibong i: db){
                if(i.getId().equals(ma.substring(1,3))){
                    System.out.println(i.getName()+" "+sl*i.getPrice());
                    break;
                }
            }
            
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