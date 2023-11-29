import java.util.*;
import java.io.*;
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
public class danhsachdoanhnghiep {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DN> arr = new ArrayList<>();
        while (t-->0) {
            DN a = new DN(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr, new Comparator<DN>() {
            @Override
            public int compare(DN a,DN b){
                    return a.getId().compareTo(b.getId());
            }
        });
        for(DN i: arr){
            System.out.println(i);
        }
    }
}