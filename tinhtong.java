import java.io.*;
import java.util.*;
public class tinhtong {
    public static void main(String[] args){
        try{
            long sum=0;
        Scanner scanner = new Scanner(new File("DATA.in"));
            while(scanner.hasNext()){              
                String s = scanner.next();
                try{
                sum+=Integer.parseInt(s);
                }catch(Exception e){
                }
            }
            System.out.println(sum);
        }catch(FileNotFoundException e){

        }
    }
}
