import java.util.*;
import java.io.*;
public class tongchuso {
    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException,IOException{
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) file.readObject();
        for(String i:arr){
            String s = i.toLowerCase();
            int tong = 0;
            String d = "";
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)>='0' && s.charAt(j)<='9'){
                    d+=s.charAt(j);
                    tong+=s.charAt(j)-'0';
                }   
            }
            for (int j=0; j<d.length(); j++){
                if(d.charAt(j)!='0'){
                    System.out.print(d.substring(j));
                    break;
                }
            }
            System.out.println(" "+tong);}
        }
    }

