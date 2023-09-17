import java.util.*;
class Point{
    private double x;
    private double y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point a){
        this.x = a.x;
        this.y = a.y;
    }
    public double distance(Point a){
        return Math.sqrt(Math.pow(this.y-a.y,2)+Math.pow(this.x - a.x, 2));
    }
    public double distance(Point a,Point b){
        return Math.sqrt(Math.pow(b.y-a.y,2)+Math.pow(b.x - a.x,2));
    }
    @Override
    public String toString(){
        return "Phong ba";
    }
}
public class khaibaoloppoint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Point a = new Point(x,y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point b = new Point(x,y);
        System.out.printf("%.4f\n",a.distance(b));
    }
}
}
