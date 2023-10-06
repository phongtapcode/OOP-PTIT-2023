import java.util.*;
class Nhanvien{
    public static int cnt = 1;
    private String name,gender,ns,address,mst,dayBegin,id;
    public Nhanvien(String name,String gender,String ns, String address, String mst, String dayBegin){
        if(cnt>=10){
            this.id = "000"+Integer.toString(cnt);
        }else{
            this.id = "0000"+Integer.toString(cnt);
        }
        cnt++;
        this.name = name;
        this.gender = gender;
        this.ns = ns;
        this.address=address;
        this.mst = mst;
        this.dayBegin = dayBegin;
    }
    public int sx(){
        String str[] = ns.trim().split("/");
        String a = new String("");
        for(int i =str.length-1; i>=0; i--){
            a+=str[i];
        }
        int b = Integer.parseInt(a);
        return b;
    }
    @Override
    public String toString(){
        return id+ " " +name+" "+gender+" "+ns+" "+address+" "+mst+" "+dayBegin;
    }
}
public class danhsachdoituongnhanvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Nhanvien> nhanvien = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String ns = sc.nextLine();
            String address = sc.nextLine();
            String mst = sc.nextLine();
            String dayBegin = sc.nextLine();
            Nhanvien nv = new Nhanvien(name, gender, ns, address, mst, dayBegin);
            nhanvien.add(nv);
        }
        // Collections.sort(nhanvien, new Comparator<Nhanvien>() {
        //     @Override
        //     public int compare(Nhanvien nv1, Nhanvien nv2){
        //         return Integer.compare(nv1.sx(),nv2.sx());
        //     }
        // });
        for(Nhanvien i: nhanvien){
            System.out.println(i);
        }
    }
}
// Nguyen Van A
// Nam
// 22/10/1982
// Mo Lao-Ha Dong-Ha Noi
// 8333012345
// 31/12/2013
// Ly Thi B
// Nu
// 15/10/1988
// Mo Lao-Ha Dong-Ha Noi
// 8333012346
// 22/08/2011
// Hoang Thi C
// Nu
// 04/02/1981
// Mo Lao-Ha Dong-Ha Noi
// 8333012347
// 22/08/2011