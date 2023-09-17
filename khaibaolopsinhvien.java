import java.util.*;
class Student{
    String name,lop,sn;
    double diem;
    public Student(String name, String lop, String sn, double diem){
        this.name=name;
        this.lop = lop;
        this.sn=sn;
        this.diem=diem;
    }
    public void Information(){
        System.out.print("B20DCCN001 "+this.name+" "+this.lop+" "); 
        String ns = "";
        if(this.sn.length()==8){
            ns = "0"+this.sn.substring(0, 2)+"0"+this.sn.substring(2);
        }else if(this.sn.length()==9){
            if(this.sn.charAt(1)=='/'){
                ns+="0"+this.sn.substring(0);
            }else{
                ns+=this.sn.substring(0, 3)+"0"+this.sn.substring(3);
            }
        }else{
            ns+=this.sn;
        }
        System.out.print(ns+" ");
        System.out.printf("%.2f",this.diem);
    }
}
public class khaibaolopsinhvien {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lop = scanner.nextLine();
        String sn = scanner.nextLine();
        Double diem = scanner.nextDouble();
        Student a = new Student(name, lop, sn,diem);
        a.Information();
    }
}
