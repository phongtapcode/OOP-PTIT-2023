import java.util.Scanner;
import java.util.TreeSet;
class IntSet{
    private int a[];
    public IntSet(int a[]){
        this.a = a;
    }
    public int[] getA(){
        return a;
    }
    public IntSet union(IntSet b){
        TreeSet<Integer> c = new TreeSet<>();
        for(int i=0;i<a.length; i++){
            c.add(a[i]);
        }
        for(int i=0;i<b.getA().length; i++){
            c.add(b.getA()[i]);
        }
        int d[] = new int[c.size()];
        int cnt=0;
        for(int i: c){
            d[cnt]=i;
            cnt++;
        }
        return new IntSet(d);
    }
    @Override
    public String toString(){
        String str = "";
        for(int i=0; i<a.length; i++){
            str+=a[i]+" ";
        }
        return str;
    }
}
public class lopintset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
