import java.util.*;
import java.io.*;

public class lietketukhacnhau {
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\java.txt"));
        Set<String> a= new TreeSet<>();
            while(sc.hasNext()){
            String str = sc.next();
            str = str.toLowerCase();
            a.add(str);
            // System.out.println(str);
            }
            for(String i: a){
                System.out.println(i);
            }
        }catch(FileNotFoundException a){}
    }
}
