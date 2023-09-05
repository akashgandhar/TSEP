import java.util.Comparator;

/**
 * StudentComparator
 */
public class StudentComparator implements Comparator<Student> {
    
        @Override
        public int compare(Student o1, Student o2) {
            int x = o1.name.compareTo(o2.name);
                return x;
        }
    
}