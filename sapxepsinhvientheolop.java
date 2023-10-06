import java.util.*;
class Sinhvien{
    public static int cnt=1;
    private String name,ma,lop,email;
    public Sinhvien(String ma, String name,String lop,String email){
        this.name = name;
        this.ma = ma;
        this.lop = lop;
        this.email = email;
    }
    public String getClassName(){
        return lop;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+lop+" "+email;
    }
}
public class sapxepsinhvientheolop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Sinhvien> sinhvien = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String ma = sc.nextLine();
            String name = sc.nextLine();
             String lop = sc.nextLine();
              String email = sc.nextLine();
            Sinhvien sv = new Sinhvien(ma, name, lop, email);
            sinhvien.add(sv);
        }
        Collections.sort(sinhvien,new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien a,Sinhvien b){
                if (a.getClassName().equals(b.getClassName())) {
                    return a.getMa().compareTo(b.getMa());
                }
                return a.getClassName().compareTo(b.getClassName());
            }
        });
        for(Sinhvien i: sinhvien){
            System.out.println(i);
        }
    }
}
