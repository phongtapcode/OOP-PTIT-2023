import java.util.*;
class Nhanvien{
    String name,chucvu;
    long luongngay,songaycong;

    public Nhanvien(String name,long luongngay,long songaycong,String chucvu){
        this.name = name;
        this.chucvu=chucvu;
        this.luongngay = luongngay;
        this.songaycong = songaycong;
    }
    public String Information(){
        long luong = luongngay*this.songaycong;
        long thuong=0;
        if(this.songaycong>25){
            thuong=luong*20/100;
        }else if(this.songaycong>=22 && this.songaycong<25){
            thuong=luong*10/100;
        }
        long phucap;
        if(this.chucvu.equals("GD")){
            phucap=250000;
        }else if(this.chucvu.equals("PGD")){
            phucap=200000;
        }else if(this.chucvu.equals("TP")){
            phucap=180000;
        }else{
            phucap=150000;
        }
        long thunhap = luong+thuong+phucap;
        return String.format("NV01 %s %d %d %d %d", this.name,luong,thuong,phucap,thunhap);
    }
}
public class baitoantinhcong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        long luongngay = scanner.nextLong();
        long songaycong = scanner.nextLong();
        scanner.nextLine();
        String chucvu = scanner.nextLine();
        Nhanvien a = new Nhanvien(name, luongngay, songaycong, chucvu);
        System.out.println(a.Information());
    }    
}
