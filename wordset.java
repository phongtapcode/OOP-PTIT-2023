import java.io.FileNotFoundException;
import java.util.*;
class WordSet{
    private String ws;
    public WordSet(String ws){
        this.ws = ws.toLowerCase();
    }
    public String getWs(){
        return ws;
    }
    public String union(WordSet s2){
        String a[] = ws.trim().split("\\s+");
        String b[] = s2.getWs().trim().split("\\s+");   
        TreeSet<String> ts = new TreeSet<>();
        for(int i=0; i<a.length; i++){
            ts.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            ts.add(b[i]);
        }
        String res = "";
        for(String i: ts){
            res+=i+" ";
        }
        return res;
    }
    public String intersection(WordSet s2){
        String a[] = ws.trim().split("\\s+");
        String b[] = s2.getWs().trim().split("\\s+");   
        TreeSet<String> ts = new TreeSet<>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i].equals(b[j])){
                    ts.add(a[i]);
                }
            }
        }
        String res = "";
        for(String i: ts){
            res+=i+" ";
        }
        return res;
    }
}
public class wordset {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2)); 
    }
}
