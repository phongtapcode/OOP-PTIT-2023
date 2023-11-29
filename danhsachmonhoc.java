import java.io.IOException;
import java.util.*;
import java.io.*;
class Monhoc{
    private String ma,name;
    private int sotc;
    public Monhoc(String ma,String name,int sotc){
        this.ma = ma;
        this.name = name;
        this.sotc = sotc;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+sotc;
    }
}
public class danhsachmonhoc {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Monhoc> mh = new ArrayList<>();
        for(int i=1; i<=n; i++){
            mh.add(new Monhoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(mh,new Comparator<Monhoc>() {
            public int compare(Monhoc a,Monhoc b){
                return a.getName().compareTo(b.getName());
            }
        });
        for(Monhoc i: mh){
            System.out.println(i);
        }
    }
}
