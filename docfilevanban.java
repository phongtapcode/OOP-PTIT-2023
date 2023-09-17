import java.util.*;
import java.io.*;
public class docfilevanban {
    public static void main(String[] args){
        try{
        Scanner scanner = new Scanner(new File("DATA.in"));
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }catch (FileNotFoundException e){
        System.out.println("Không tìm thấy tệp tin.");
        e.printStackTrace();
    }
    }
}
