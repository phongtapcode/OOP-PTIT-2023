import java.util.*;
import java.io.*;
public class daycontangdan {
    static String b[];
    static ArrayList<String> str = new ArrayList<>();
    public static void Try(int length,String a){
        if(a.length()==length){
            int dem=0;
            ArrayList<Integer> c = new ArrayList<>();
            for(int i=0; i<length; i++){
                if(a.charAt(i)=='1'){
                    dem++;
                    int same = Integer.parseInt(b[i]);
                    c.add(same);
                }
            }
            if(dem>=2){
                int ok=1;
                for(int i=1; i<c.size(); i++){
                    if (c.get(i)<c.get(i-1)){
                        ok=0;
                    }
            }
            if(ok==1){
                    String str1="";
                    for(int i=0; i<c.size(); i++){
                       str1+=Integer.toString(c.get(i))+" ";
                    }
                    str.add(str1);
            }
            }
            return;
        }
        Try(length,a + "0");
        Try(length,a + "1");
    }

    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("DAYSO.in"));
            int n = sc.nextInt();
            b = new String[n];
            int dem=0;
            while(sc.hasNext()){
                b[dem] = sc.next();
                dem++;
            }
            // for(int i=0; i<n; i++){
            //     System.out.println(b[i]);
            // }
            Try(n,"");
            Collections.sort(str);
            for(int i=0; i<str.size(); i++){
                System.out.println(str.get(i));
            }
        }catch(FileNotFoundException e){}
    }
}
