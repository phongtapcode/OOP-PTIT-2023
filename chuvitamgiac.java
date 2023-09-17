import java.util.*;
class Tamgiac{
    double x,y;
    public Tamgiac(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Double distance(Tamgiac a){
        return Math.sqrt(Math.pow(a.y-this.y, 2)+Math.pow(a.x-this.x, 2));
    }
}
public class chuvitamgiac {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t-->0){
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Tamgiac tg1 = new Tamgiac(x, y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Tamgiac tg2 = new Tamgiac(x, y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Tamgiac tg3 = new Tamgiac(x, y);
        double canh1 = tg1.distance(tg2);
        double canh2 = tg2.distance(tg3);
        double canh3 = tg3.distance(tg1);
        if(canh1+canh2<=canh3 || canh1+canh3<=canh2 || canh2+canh3<=canh1){
            System.out.println("INVALID");
        }else{
        System.out.printf("%.3f\n",canh1+canh2+canh3);
        }
    }
}
}