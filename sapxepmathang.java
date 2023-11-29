import java.io.File;
import java.io.IOException;
import java.util.*;
class Mathang{
    public static int cnt=1;
    private String name,ns,id,loai;
    private float giaban,giamua,loinhuan;
    public Mathang(String name, String loai,float giaban,float giamua){
        if(cnt<10){
            this.id = "MH0"+Integer.toString(cnt);
        }else{
            this.id = "MH"+Integer.toString(cnt);
        }
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
public class sapxepmathang {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mathang> mathang = new ArrayList<>();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String loai = sc.nextLine();
            float giaban = Float.parseFloat(sc.nextLine());
            float giamua = Float.parseFloat(sc.nextLine());
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
