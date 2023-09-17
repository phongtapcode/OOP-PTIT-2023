import java.util.*;
class Giaovien{
    String ma,ten;
    long money;
    public Giaovien(String ma, String ten, long money){
        this.ma=ma;
        this.ten=ten;
        this.money = money;
    }
    public String Information(){
        int a = Integer.parseInt(this.ma.substring(2));
        long phucap;
        if(this.ma.substring(0, 2).equals("HT")){
            phucap=2000000;
        }else if(this.ma.substring(0,2).equals("HP")){
            phucap=900000;
        }else{
            phucap=500000;
        }
        long tienluong = this.money*a+phucap;
        return String.format("%s %s %d %d %d",this.ma,this.ten,a,phucap,tienluong);
    }
}
public class tinhthunhapgiaovien {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        String ma = scanner.nextLine();
        String ten = scanner.nextLine();
        long money = scanner.nextLong();
        Giaovien a = new Giaovien(ma, ten, money);
        System.out.println(a.Information());
    }
}
