import java.util.*;
class SinhVien{
    private String id,name,lop,email,dn,ma;
    public static int cnt = 1;
    public SinhVien(String ma, String name, String lop, String email,String dn){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
        this.id = Integer.toString(cnt);
        cnt++;
    }
    public String getName(){
        return name;
    }
    public String getDn(){
        return dn;
    }
    @Override
    public String toString(){
        return id+" "+ma+" "+name+" "+lop+" "+email+" "+dn;
    }
    }

public class danhsachthuctap1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(t-->0){
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String dn = sc.nextLine();
            ArrayList<SinhVien> a = new ArrayList<>();
            for(SinhVien i: sv){
                if(i.getDn().equals(dn)){
                    a.add(i);
                }
            }
            Collections.sort(a,new Comparator<SinhVien>() {
                public int compare(SinhVien b, SinhVien c){
                    return b.getName().compareTo(c.getName());
                }
            });
            for(SinhVien i: a){
                System.out.println(i);
            }
        }
    }
}
// 6
// B17DCCN016 
// Le Khac Tuan Anh 
// D17HTTT2   
// test1@stu.ptit.edu.vn
// VIETTEL
// B17DCCN107 
// Dao Thanh Dat    
// D17CNPM5   
// test2@stu.ptit.edu.vn
// FPT
// B17DCAT092 
// Cao Danh Huy     
// D17CQAT04-B
// test3@stu.ptit.edu.vn
// FPT
// B17DCCN388 
// Cao Sy Hai Long  
// D17CNPM2   
// test4@stu.ptit.edu.vn
// VNPT
// B17DCCN461 
// Dinh Quang Nghia 
// D17CNPM2   
// test5@stu.ptit.edu.vn
// FPT
// B17DCCN554 
// Bui Xuan Thai    
// D17CNPM1   
// test6@stu.ptit.edu.vn
// GAMELOFT
// 1
// FPT