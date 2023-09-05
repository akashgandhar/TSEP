import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    List<Student> students = new ArrayList<Student>();
    public List<Student> displayStudent(){
        students.add(new Student(1, "John", 1000));
        students.add(new Student(2, "Mary", 2000));
        students.add(new Student(3, "Peter", 3000));
        students.add(new Student(4, "David", 4000));
        students.add(new Student(5, "Paul", 5000));
        return students;
    }
    public Student addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter name: "); 
        String name = scanner.next();
        System.out.println("Enter salary: ");
        float salary = scanner.nextFloat();
        Student student = new Student(id, name, salary);
        students.add(student);
        return student;
    }
}
