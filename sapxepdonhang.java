import java.util.*;
class Donhang{
    private String name,id,stt;
    private long giamgia,tien;
    public Donhang(String name,String id,long price,long cnt){
        this.name = name;
        this.id = id;
        this.stt = id.substring(1,4);
        if(id.substring(4).equals("1")){
            this.giamgia = (price*cnt*50)/100;
        }else{
            this.giamgia = (price*cnt*30)/100;
        }
        this.tien = price*cnt - this.giamgia;
    }
    public String getStt(){
        return stt;
    }
    @Override
    public String toString(){
        return name+" "+id+" "+stt+" "+giamgia+" "+tien;
    }
}
public class sapxepdonhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Donhang> dh = new ArrayList<>();
        long t = sc.nextLong();
        sc.nextLine();
        for(long i=0; i<t; i++){
            dh.add(new Donhang(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong()));
            sc.nextLine();
        }
        Collections.sort(dh, new Comparator<Donhang>() {
            public int compare(Donhang a,Donhang b){
                return a.getStt().compareTo(b.getStt());
            }
        });
        for(Donhang i: dh){
            System.out.println(i);
        }
    }
}
// 3
// Kaki 2
// K0252
// 80000
// 15
// Jean 1
// J2011
// 200000
// 24
// Jean 2
// J0982
// 150000
// 12