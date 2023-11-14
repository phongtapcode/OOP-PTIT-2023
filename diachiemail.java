import java.util.*;
public class diachiemail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> dd = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine();
            String[] arr = a.trim().toLowerCase().split("\\s+");
            String s = arr[arr.length-1];
            for(int i=0; i<=arr.length-2; i++){
                s+=arr[i].charAt(0);
            }
            dd.add(s);
            int cnt = Collections.frequency(dd,s);
            s+=(cnt==1?"":cnt)+"@ptit.edu.vn";
            System.out.println(s);
        }
    }
}
