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
public class danhsachdoanhnghiepnhansinhvienthuctap1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DN> arr = new ArrayList<>();
        sc.nextLine();
        while (t-->0) {
            sc.nextLine();
            DN a = new DN(sc.nextLine(),sc.nextLine(),sc.nextInt());
            arr.add(a);
        }
        Collections.sort(arr, new Comparator<DN>() {
            @Override
            public int compare(DN a,DN b){
                if(a.getSl()==b.getSl()){
                    return a.getId().compareTo(b.getId());
                }else{
                    return -Integer.compare(a.getSl(), b.getSl());
                }
            }
        });
        for(DN i: arr){
            System.out.println(i);
        }
    }
}
