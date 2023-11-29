import java.util.*;
import java.io.*;
public class lietketheothutuxuathien {

    public static String Chuanhoa(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> st1 = new LinkedHashSet<>();
        LinkedHashSet<String> st2 = new LinkedHashSet<>();
        for (String x : a) {
            String[] tmp = x.trim().toLowerCase().split("\\s+");
            for (String y : tmp) {
                st1.add(y);
            }
        }
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            st2.add(s);
        }
        for (String x : st2) {
            if (st1.contains(x)) {
                System.out.println(x);
            }
        }
    }
}