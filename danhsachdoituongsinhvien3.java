
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student {

    public static int NUM_STUDENT = 1;
    private String id, name, lop, dob;
    private float gpa;

    private String formatname(String name){
        String str[] = name.trim().split("\\s+");
        String currentName = new String("");
        for(int i=0; i<str.length; i++){
            String a = new String("");
            str[i]=str[i].toLowerCase();
            a+=Character.toUpperCase(str[i].charAt(0));
            a+=str[i].substring(1);
            currentName+=a+" ";
        }
        return currentName;
    }
    public Student(String name, String lop, String dob, float gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", NUM_STUDENT++);
        
        this.name = formatname(name);
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = formatter.format(formatter.parse(dob));
    }
    public float getGpa(){
        return gpa;
    }

    @Override
    public String toString() {
        return id + " " + name+ lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
public class danhsachdoituongsinhvien3 {
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Student> student = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String cls = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Student stu = new Student(name, lop, cls, gpa);
            student.add(stu);
        }
        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Float.compare(student2.getGpa(), student1.getGpa());
            }
        });
        for(Student i: student){
            System.out.println(i);
        }
        sc.close();
    }catch(ParseException e){}
    }
}
// 1
// Nguyen Van An
// D20CQCN01-B
// 2/12/2002
// 3.19
