import java.util.*;
import java.io.*;
public class chuanhoaxauhotentrongfile {
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNextLine()){
        a.add(sc.nextLine());
        }
        for(int i=0; i<a.size()-1; i++){
            String b = a.get(i);
            b = b.toLowerCase();
            String c[] = b.trim().split("\\s+");
            for (int j=0; j<c.length; j++){
                System.out.print(Character.toUpperCase(c[j].charAt(0)));
                System.out.print(c[j].substring(1)+" ");
            }
            System.out.println();
        }
        }catch(FileNotFoundException e){}
    }
}