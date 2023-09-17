import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class sokhacnhautrongfile3 {
    public static void main(String[] args){
        try{
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
            List<Integer>  list = (ArrayList<Integer>) obj.readObject();
            int cnt[] = new int[1005];
            for(Integer i: list){
                cnt[i]++;
            }
            for(int i=0; i<=1000; i++){
                if(cnt[i]>0){
                    System.out.println(i+" "+cnt[i]);
                }
            }
        } catch (ClassNotFoundException e) {}
        }catch(IOException e){}
    }
}
