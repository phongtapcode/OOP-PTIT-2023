import java.io.*;
import java.util.*;
public class loaibosonguyen {
    public static int check1(String s) { // Kiểm tra xem xâu có là số 10 chữ số không
        if (s.length() > 10) return 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return 0;
        }
        return 1;
    }

    public static long check(String s) { // Kiểm tra xem xâu có là số kiểu int không
        if (check1(s) == 0) return 0;
        long x = Long.parseLong(s);
        if (x > Integer.MAX_VALUE) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in")); // Đọc từ file DATA.in
            ArrayList<String> a = new ArrayList<>();
            while (sc.hasNext()) {
                String s = sc.next();
                if (check(s) == 0) a.add(s);
            }
            Collections.sort(a); 
            for (String x : a) System.out.print(x + " ");
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}