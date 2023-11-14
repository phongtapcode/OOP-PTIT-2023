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
        String arr[] = name.trim().split("\\s+");
        return arr[arr.length-1];
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
public class sapxepdanhsachgiangvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Giangvien> gv = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            gv.add(new Giangvien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(gv,new Comparator<Giangvien>() {
            @Override
            public int compare(Giangvien a, Giangvien b){
              if(a.getName().equals(b.getName())){
                return a.getId().compareTo(b.getId());
              }else{
                return a.getName().compareTo(b.getName());
              }
            }
        });
        for(Giangvien i: gv){
         System.out.println(i);
        }
    }
}
