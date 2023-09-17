import java.util.*;
class Thisinh{
    String name,sn;
    double diem1,diem2,diem3;
    public Thisinh(String name, String sn,double diem1,double diem2,double diem3){
        this.name=name;
        this.sn = sn;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public void thongtin(){
        System.out.print(this.name+" "+this.sn+" ");
        System.out.printf("%.1f",this.diem1+this.diem2+this.diem3);
    }
}
public class khaibaothisinh {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String sn = scanner.nextLine();
    Double diem1 = scanner.nextDouble();
    Double diem2 = scanner.nextDouble();
    Double diem3 = scanner.nextDouble();
    Thisinh a = new Thisinh(name, sn, diem1,diem2,diem3);
    a.thongtin();
   } 
}
