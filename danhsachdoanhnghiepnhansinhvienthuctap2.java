import java.util.*;
class DN{
    private String id,name;
    private int sl;
    public DN(String id, String name, int sl){
        this.id = id;
        this.name = name;
        this.sl = sl;
    }
    public String getId(){
        return id;
    }
    public int getSl(){
        return sl;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+sl;
    }
}
public class danhsachdoanhnghiepnhansinhvienthuctap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DN> arr = new ArrayList<>();
        sc.nextLine();
        while (t-->0) {
            DN a = new DN(sc.nextLine(),sc.nextLine(),sc.nextInt());
            arr.add(a);
            sc.nextLine();
        }
         t = sc.nextInt();
        while(t-->0){
            int a =sc.nextInt();
            int b = sc.nextInt();
            ArrayList<DN> ar = new ArrayList<>();
            for(DN i: arr){
                if(i.getSl() >=a && i.getSl()<=b){
                    ar.add(i);
                }
            }
            Collections.sort(ar, new Comparator<DN>() {
                @Override
                public int compare(DN a,DN b){
                    if(a.getSl()==b.getSl()){
                        return a.getId().compareTo(b.getId());
                    }else{
                        return -Integer.compare(a.getSl(), b.getSl());
                    }
                }
            });
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DN i: ar){
                System.out.println(i);
            }
        }
    }
}
