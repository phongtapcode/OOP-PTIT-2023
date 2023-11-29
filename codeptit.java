import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class SP{
    public static int cnt=1;
    private String ma,name,maphong,ngayden,ngaydi;
    private int ngay;
    public SP(String name,String maphong,String ngayden,String ngaydi){
        this.name = name;
        this.maphong = maphong;
        if(cnt<10){
            this.ma = "KH0"+Integer.toString(cnt);
        }else{
            this.ma = "KH"+Integer.toString(cnt);          
        }
        cnt++;
        int a =Integer.parseInt(ngaydi.substring(0,2))-Integer.parseInt(ngayden.substring(0,2));
        int b =  Integer.parseInt(ngaydi.substring(3,5))-Integer.parseInt(ngayden.substring(3,5));
        int c = Integer.parseInt(ngaydi.substring(6))-Integer.parseInt(ngayden.substring(6));
        this.ngay = a+b*30+c*365;
    }
    public int getDate(){
        return ngay;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+maphong+" "+ngay;
    }
}
public class codeptit { 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\\\Users\\\\Admin\\\\Desktop\\\\test.txt"));
        int t =Integer.parseInt(sc.nextLine());
        ArrayList<SP> sp = new ArrayList<>();
        while (t-->0) {
            sp.add(new SP(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sp,new Comparator<SP>() {
            public int compare(SP a,SP b){
                return -Integer.compare(a.getDate(), b.getDate());
            }
        });
        for(SP i: sp){
            System.out.println(i);
        }
    }
}