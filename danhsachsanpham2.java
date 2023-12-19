import java.io.*;
import java.util.*;
class SP{
    private String id,name;
    private int price,bh;
    public SP(String id,String name,int price,int bh){
        this.id = id;
        this.name = name;
        this.price = price;
        this.bh = bh;
    }
    public String getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+price+" "+bh;
    }
}
public class danhsachsanpham2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\test.txt"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SP> a = new ArrayList<>();
        while (t-->0) {
            a.add(new SP(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a,new Comparator<SP>(){
            public int compare(SP a, SP b){
                if(a.getPrice() == b.getPrice()){
                    return a.getId().compareTo(b.getId());
                }
                return -Integer.compare(a.getPrice(), b.getPrice());
            }
        });
        for (SP i: a){
            System.out.println(i);
        }
    }
}
