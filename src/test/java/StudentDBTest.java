import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_shouldReturnArrayWithStudents() {
        //GIVEN
        Student max = new Student("123", "Max");
        Student[] testStudents = new Student[1];
        testStudents[0] = max;

        StudentDB studentDb = new StudentDB(testStudents);

        //WHEN
        Student[] actual = studentDb.getAllStudents();

        //THEN
        Student[] expected = {new Student("123", "Max")};
        assertArrayEquals(actual, expected);
    }
}
