import java.util.*;
import java.io.*;
class WordSet{
    private TreeSet<String> ts;
    public WordSet(String s) throws IOException{
        ts = new TreeSet<>();
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            this.ts.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String res = "";
        for(String x: ts){
            res+= x + "\n";
        }
        return res;
    }
}
public class lietketukhacnhau {
    public static void main(String[] args) throws IOException{
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
