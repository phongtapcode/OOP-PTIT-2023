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
public class lietkesinhvientheonganh {
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
        // Collections.sort(sinhvien,new Comparator<Sinhvien>() {
        //     @Override
        //     public int compare(Sinhvien a,Sinhvien b){
        //         if (a.getClassName().equals(b.getClassName())) {
        //             return a.getMa().compareTo(b.getMa());
        //         }
        //         return a.getClassName().compareTo(b.getClassName());
        //     }
        // });
        int t = sc.nextInt();
        sc.nextLine();
        for(int j=1; j<=t; j++){
            String cl = sc.nextLine().toUpperCase();
            String id = new String ("");
            if(cl.equals("KE TOAN")){
                id = "DCKT";
            }else if(cl.equals("CONG NGHE THONG TIN")){
                id="DCCN";
            }else if(cl.equals("AN TOAN THONG TIN")){
                id="DCAT";
            }
            else if(cl.equals("VIEN THONG")){
                id="DCVT";
            }else if(cl.equals("DIEN TU")){
                id="DCDT";
            }

            System.out.println("DANH SACH SINH VIEN NGANH "+cl.toUpperCase()+":");
        for(Sinhvien i: sinhvien){
            String ma1 = i.getMa().toUpperCase();
            if(id.equals("DCCN") || id.equals("DCAT")){
                if(ma1.contains(id) && i.getClassName().charAt(0)!='E'){
                    System.out.println(i);
                }
            }
            else{
                if(ma1.contains(id)){
                    System.out.println(i);
                }
            }
        }
    }
    }
}
