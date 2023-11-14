import java.io.*;
import java.util.*;
public class capsonguyentotrongfile1 {
    public static Boolean checksnt(int n){
        if(n<2)return false;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>)in2.readObject();
        HashMap<Integer,Integer> arr = new HashMap<>();
        ArrayList<Integer> c = new ArrayList<>();
        Collections.sort(a);
        for(int i: a){
            if(checksnt(i) && !arr.containsKey(i) && i<500000){
                if(b.indexOf(1000000-i)!=-1 && checksnt(1000000-i)){
                    arr.put(i, 1000000-i);
                    c.add(i);
                }
            }
        }   
        for(int i: c){
            System.out.println(i+" "+arr.get(i));
        }
    }
}
