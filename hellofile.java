import java.util.*;
import java.io.*;
public class hellofile {
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
        }
        }catch(FileNotFoundException e){}
    }
}
