import java.util.*;
import java.io.*;
public class sokhacnhautrongfile1 {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new File("DATA.in"));
                int cnt[] = new int[1005];
                for (int i=0; i<1005; i++){
                    cnt[i]=0;
                }
                
                while(scanner.hasNext()){
                    int a = Integer.parseInt(scanner.next());
                    cnt[a]++;
                }
                for (int i=0; i<1005; i++){
                    if(cnt[i]!=0){
                        System.out.println(i+" "+cnt[i]);
                    }
                }
        }catch(FileNotFoundException e){}
    }
}
