import java.util.*;
import java.io.*;
public class thongketukhacnhautrongfilenhiphan {
    public static int check(String s){
        for (int i=0; i<s.length(); i++){
            if((s.charAt(i)<'a' || s.charAt(i)>'z') && ((s.charAt(i)<'0' || s.charAt(i)>'9'))){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> b = (ArrayList<String>) file.readObject();
        HashMap<String,Integer> map = new HashMap<>();
        TreeSet<String> set = new TreeSet<>();
        ArrayList<String> arr = new ArrayList<>();
        String s = "";
        for(String i: b){
            s+=i+" ";
        }
        String dau = ",.?!:;()-/";
        for (int i=0; i<dau.length(); i++){
            String cur = ""+dau.charAt(i);
            s = s.replace(cur, " ");
        }
        s = s.toLowerCase();
        String[] tach = s.trim().split("\\s+");
        for(int i=0; i<tach.length; i++){
            set.add(tach[i]);
            if(map.get(tach[i])==null){
                map.put(tach[i],1);
            }else{
                int x = map.get(tach[i])+1;
                map.put(tach[i], x);
            }
        }
        for(String i: set){
            arr.add(i);
        }
        Collections.sort(arr,new Comparator<String>(){
            public int compare(String a,String b){
                if (map.get(a)==map.get(b)){
                    return a.compareTo(b);
                }
                return -Integer.compare(map.get(a), map.get(b));
            }
        });
        for(String i: arr){
            if(check(i)==1){
                System.out.println(i+" "+map.get(i));
            }
        }
    }
}
