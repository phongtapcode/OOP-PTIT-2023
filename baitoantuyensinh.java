import java.util.*;
class Thisinh{
    String ma,name;
    double toan,ly,hoa;
    public Thisinh(String ma,String name, double toan,double ly, double hoa){
        this.ma=ma;
        this.name=name;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }
    public String Information(){
        double diemcong=2.5;
        if (this.ma.substring(0, 3).equals("KV1")){
            diemcong=0.5;
        }else if(this.ma.substring(0, 3).equals("KV2")){
            diemcong=1.0;
        }
        double tongdiem=this.ly+this.hoa+this.toan*2;
        String tong;
        if(((double)tongdiem==(int)tongdiem)){
            tong=String.format("%.0f",tongdiem);
        }else{
            tong=String.format("%.1f", tongdiem);
        }
        String dc;
        if(((double)diemcong==(int)diemcong)){
            dc=String.format("%.0f", diemcong);
        }else{
            dc=String.format("%.1f", diemcong);
        }
        String notice = new String("TRUOT");
        if(tongdiem+diemcong>=24){
            notice="TRUNG TUYEN";
        }
        return String.format("%s %s %s %s %s", this.ma,this.name, dc,tong,notice);
    }
}
public class baitoantuyensinh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.nextLine();
        String name =scanner.nextLine();
        double toan = scanner.nextDouble();
        double ly = scanner.nextDouble();
        double hoa = scanner.nextDouble();
        Thisinh a = new Thisinh(ma, name, toan, ly, hoa);
        System.out.println(a.Information());
    }
}
