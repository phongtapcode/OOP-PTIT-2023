import java.util.Scanner;

class Rectange{
    private double w,h;
    private String color;
    public Rectange(){
        w=1;
        h=1;
    }
    public Rectange(double w,double h,String color){
        this.w = w;
        this.h = h;
        this.color = color;
    }
    public String setColor(String color){
        return color.substring(0, 1).toUpperCase()+color.substring(1).toLowerCase();
    }
    public double setFindArea(){
        return this.w*this.h;
    }
    public double findPerimeter(){
        return 2*(this.w+this.h);
    }
}
public class khaibaolophinhchunhat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        String color = scanner.next();
        Rectange a = new Rectange(w, h, color);
        if(h>0 && w>0){
        System.out.println((int)a.findPerimeter()+" "+(int)a.setFindArea()+" "+a.setColor(color));
        }else{
            System.out.println("INVALID");
        }
    }
}
