import java.util.*;
class Thisinh{
    public static int cnt=1;
    private String name,ns,id;
    private float diem1,diem2,diem3,tong;
    public Thisinh(String name, String ns, float diem1,float diem2, float diem3){
        this.id = Integer.toString(cnt);
        cnt++;
        this.name = name;
        this.ns = ns;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = total();
    }
    public float total(){
        return diem1+diem2+diem3;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+ns+" "+String.format("%.1f",tong);
    }
}
public class timthukhoacuakithi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Thisinh> thisinh = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String ns = sc.nextLine();
            float diem1 = sc.nextFloat();
            float diem2 = sc.nextFloat();
            float diem3 = sc.nextFloat();
            sc.nextLine();
            Thisinh ts = new Thisinh(name, ns, diem1, diem2, diem3);
            thisinh.add(ts);
        }
        float max = 0;
        for(Thisinh i: thisinh){
            if(i.total()>max){
                max=i.total();
            }
        }
        for(Thisinh i: thisinh){
            if(i.total()==max){
                System.out.println(i);
            }
        }
    }
}
