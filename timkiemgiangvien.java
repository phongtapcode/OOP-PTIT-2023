import java.util.*;
class Giangvien{
    private String name,bomon,id;
    public static int cnt = 1;
    public Giangvien(String name,String bomon){
        if(cnt<10){
            this.id = "GV0"+Integer.toString(cnt);
        }else{
            this.id = "GV"+Integer.toString(cnt);           
        }
        cnt++;
        this.name=name;
        this.bomon = bomon;
    }
    public String getName(){
        return name;
    }
    public String getBoMon(){
    String arr[] = bomon.trim().split("\\s+");
    String a = new String("");
    for(int i=0; i<arr.length; i++){
        a+=arr[i].toUpperCase().charAt(0);
    }
    return a;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+this.getBoMon();
    }
}
public class timkiemgiangvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Giangvien> gv = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            gv.add(new Giangvien(sc.nextLine(), sc.nextLine()));
        }
        // Collections.sort(gv,new Comparator<Giangvien>() {
        //     @Override
        //     public int compare(Giangvien a, Giangvien b){
        //       if(a.getName().equals(b.getName())){
        //         return a.getId().compareTo(b.getId());
        //       }else{
        //         return a.getName().compareTo(b.getName());
        //       }
        //     }
        // });
        t=sc.nextInt();
        sc.nextLine();
        while (t-->0) {
        String str = sc.nextLine();
        System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+str+":");
            for(Giangvien i: gv){
                String bm = i.getName().toLowerCase();
                if(bm.contains(str.toLowerCase())){
                    System.out.println(i);
                }
            }        
        }
    }
}
