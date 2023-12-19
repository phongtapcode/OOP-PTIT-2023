import java.util.*;
import java.io.*;
class Dien{
    public static int cnt = 1;
    private String name,type,ma;
    private long sd,ttdm,tvdm,vat,tong;
    public Dien(String name,String type,long dau,long cuoi){
        String [] str = name.toLowerCase().trim().split("\\s+");
        String s = "";
        for(String i: str){
            s+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        this.name = s;
        if(cnt>=10){
            this.ma = "KH"+Integer.toString(cnt);
        }else{
            this.ma = "KH0"+Integer.toString(cnt); 
        }
        long dinhmuc = 0;
        if(type.equals("A")){
            dinhmuc = 100;
        }else if(type.equals("B")){
            dinhmuc = 500;
        }else {
            dinhmuc = 200;
        }
        long sd = cuoi-dau;
        long tvdm = 0;
        if(sd<dinhmuc){
            this.ttdm = sd*450;
            tvdm = 0;
        }else{
            this.ttdm = dinhmuc*450;
            tvdm = (sd-dinhmuc)*1000;
        }
        this.tvdm = tvdm;
        this.vat = tvdm*5/100;
        this.tong = this.ttdm+this.tvdm+this.vat;
        cnt++;
}       
public long getTong(){
    return tong;
}
@Override
public String toString(){
    return ma+" "+name+ ttdm+" "+tvdm+" "+vat+" "+tong;
}
}
public class tinhtiendien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Dien> a = new ArrayList<>();
        while (t-->0) {
            sc.nextLine();
            a.add(new Dien(sc.nextLine(),sc.next(),Long.parseLong(sc.next()),Long.parseLong(sc.next())));
        }
        Collections.sort(a,new Comparator<Dien>() {
            public int compare(Dien a,Dien b){
                return -Long.compare(a.getTong(), b.getTong());
            }
        });
        for(Dien i: a){
            System.out.println(i);
        }
    }
}
