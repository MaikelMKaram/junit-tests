import java.security.PrivateKey;
import java.util.ArrayList;

public class Student {

    private Long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(Long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

}
