import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class Name{
    private String name;
    public Name(String name){
        name = name.toLowerCase();
        String a[] = name.trim().split("\\s+");
        String init = "";
        for(int i=0; i<a.length; i++){
            init+=a[i].substring(0,1).toUpperCase()+a[i].substring(1)+" ";
        }
        this.name = init;
    }
    public String getName(){
        String a[] = name.trim().split("\\s+");
        return a[a.length-1];
    }
    public String getHo(){
        String a[] = name.trim().split("\\s+");
        String init = "";
        for(int i=0; i<a.length-1; i++){
            init+=a[i].substring(0,1).toUpperCase()+a[i].substring(1)+" ";
        }
        return init;
    }    
    @Override
    public String toString(){
        return name;
    }
}
public class chuanhoavasapxep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> name = new ArrayList<>();
        while (sc.hasNextLine()) {
            name.add(new Name(sc.nextLine()));
        }
        Collections.sort(name,new Comparator<Name>() {
            public int compare(Name a, Name b){
                if(a.getName().equals(b.getName())){
                    return a.getHo().compareTo(b.getHo());
                }else{
                    return a.getName().compareTo(b.getName());
                }
            }
        });
        for(Name i: name){
            System.out.println(i);
        }
    }
}
