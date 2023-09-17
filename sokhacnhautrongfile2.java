import java.util.*;
import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class sokhacnhautrongfile2 {
    public static void main(String[] args){
        try{
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int cnt[] = new int[1005];
            for(int i=0; i<100000; i++){
                int a = sc.readInt();
                cnt[a]++;
            }
        for(int i=0; i<1000; i++){
            if(cnt[i]>0){
                System.out.println(i+" "+cnt[i]);
            }
        }
        }catch(IOException e){}
    }
}
