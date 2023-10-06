import java.util.*;
class Mathang{
    public static int cnt=1;
    private String name,ns,id,loai;
    private float giaban,giamua,loinhuan;
    public Mathang(String name, String loai,float giaban,float giamua){
        this.id = Integer.toString(cnt);
        cnt++;
        this.name = name;
        this.loai = loai;
        this.giaban = giaban;
        this.giamua = giamua;
        this.loinhuan = result();
    }
    public float result(){
        return giaban-giamua;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+loai+" "+String.format("%.2f",loinhuan);
    }
}
public class sapxepdanhsachmathang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Mathang> mathang = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String loai = sc.nextLine();
            float giaban = sc.nextFloat();
            float giamua = sc.nextFloat();
            sc.nextLine();
            Mathang mh = new Mathang(name, loai, giamua,giaban);
            mathang.add(mh);
        }
        Collections.sort(mathang,new Comparator<Mathang>() {
            @Override
            public int compare(Mathang a,Mathang b){
                return -Float.compare(a.result(), b.result());
            }
        });
        for(Mathang i: mathang){
            System.out.println(i);
        }

    }
}
