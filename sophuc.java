import java.util.*;
class Sp{
    int phanthuc,phanao;
    public Sp(int phanthuc,int phanao){
        this.phanthuc = phanthuc;
        this.phanao=phanao;
    }
    public void Result(Sp a){
        int pt = this.phanthuc+a.phanthuc;
        int pa = this.phanao+a.phanao;
        
        int pt1 = pt*this.phanthuc-pa*this.phanao;
        int pa1 = pt*this.phanao+pa*this.phanthuc;

        int pt2 = pt*pt-pa*pa;
        int pa2 = 2*pt*pa;
        System.out.println(pt1+" " + ((pa1<0)?"- ":"+ ")+ ((pa1<0)?-pa1:pa1)+"i, "+pt2+" " + ((pa2<0)?"- ":"+ ")+ ((pa2<0)?-pa2:pa2)+"i");
        // return String.format("%d + %di, %d + %di",pt1,pa1,pt2,pa2);
    }
}
public class sophuc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
        int pt = scanner.nextInt();
        int pa = scanner.nextInt();
        Sp a = new Sp(pt, pa);
        pt = scanner.nextInt();
        pa = scanner.nextInt();
        Sp b = new Sp(pt, pa);
        a.Result(b);
        // System.out.println(a.Result(b));
    }
}
}
