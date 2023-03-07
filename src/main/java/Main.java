import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("123", "Florian");
        Student student2 = new Student("456", "Matthias");

        Student[] allStudents = new Student[2];

        allStudents[0] = student1;
        allStudents[1] = student2;

        StudentDB studentDB = new StudentDB(allStudents);

        System.out.println(studentDB);
        System.out.println(studentDB.getAllStudents());
        System.out.println(studentDB.randomStudent());

        //System.out.println("Testx" + studentDB.findById("45666"));
        try {
            studentDB.findById("4356435");
        } catch (IOException e) {
            System.out.println("No output because" + e);
        }
    }
}
