import java.util.*;
class Student{
    String name,gt,sn,adress,cmt,ngayki;
    public Student(String name, String gt, String sn, String adress,String cmt,String ngayki){
        this.name=name;
        this.gt = gt;
        this.sn=sn;
        this.adress=adress;
        this.cmt = cmt;
        this.ngayki = ngayki;
    }
    public void Information(){
        System.out.print("00001 "+this.name+" "+this.gt+" "+this.sn+" "+this.adress+" "+this.cmt+" "+this.ngayki); 
        // String ns = "";
        // if(this.sn.length()==8){
        //     ns = "0"+this.sn.substring(0, 2)+"0"+this.sn.substring(2);
        // }else if(this.sn.length()==9){
        //     if(this.sn.charAt(1)=='/'){
        //         ns+="0"+this.sn.substring(0);
        //     }else{
        //         ns+=this.sn.substring(0, 3)+"0"+this.sn.substring(3);
        //     }
        // }else{
        //     ns+=this.sn;
        // }
        // System.out.print(ns+" ");
        // System.out.printf("%.2f",this.diem);
    }
}
public class khaibaolopnhanvien {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String gt = scanner.nextLine();
        String sn = scanner.nextLine();
        String adress = scanner.nextLine();
        String cmt = scanner.nextLine();
        String ngayki = scanner.nextLine();
        Student a = new Student(name, gt, sn, adress, cmt, ngayki);
        a.Information();
    }
}
