import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {

        this.students = students;
    }

    public Student[] getAllStudents() {

        return students;
    }

    public Student randomStudent() {
        int random = (int)(Math.random() * students.length);
        return students[random];
    }

    public Student findById (String id) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getId()==(id))
            return students[i];

        }
        return null;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

