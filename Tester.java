import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        List<Student> students = service.displayStudent();
        System.out.println(students);
        Collections.sort(students, new StudentComparator());
        System.out.println(service.addStudent());
        System.out.println(students );
    }
}


