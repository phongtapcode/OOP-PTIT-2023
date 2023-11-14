import java.util.*;
class Diem{ 
    private String id,name,lop;
    private float diem1,diem2,diem3;
    int stt;
    public Diem(String id,String name,String lop,float diem1,float diem2,float diem3){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+lop+" "+String.format("%.1f", diem1)+" "+String.format("%.1f", diem2)+" "+String.format("%.1f", diem3);
    }
}
public class bangdiemthanhphan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Diem> arr = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            Diem a = new Diem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            sc.nextLine();
            arr.add(a);
        }
        Collections.sort(arr,new Comparator<Diem>() {
            @Override
            public int compare(Diem a,Diem b){
                return a.getName().compareTo(b.getName());
            }
        });
        int cnt=1;
        for(Diem i: arr){
            System.out.println(cnt+" "+i);
            cnt++;
        }
    }
}
