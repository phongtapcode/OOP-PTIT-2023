import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class tachdoivatinhtong {
    public static void main(String[] args){
        try{
        Scanner scanner = new Scanner(new File("DATA.in"));
        String a = scanner.nextLine();

        while(a.length()>1){
            int mid = a.length()/2;
            // System.out.println(a.substring(0, mid));
            // System.out.println(a.substring(mid, a.length()));
            BigInteger b = new BigInteger(a.substring(0, mid));
            BigInteger c = new BigInteger(a.substring(mid, a.length()));
            BigInteger d = b.add(c);
            a = d.toString();
            System.out.println(a);
        }
        scanner.close();
        }catch(FileNotFoundException e){}
    }
}
