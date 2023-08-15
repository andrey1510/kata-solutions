package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.Student;
import w3resource.streams.StudentsSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentsSorterTests {

    List<Student> testList = new ArrayList<>(Arrays.asList(
            new Student("Bill", 4),
            new Student("John", 1),
            new Student("Michael", 3),
            new Student("Steve", 2)
        )
    );

    List<Student> expectedList = new ArrayList<>(Arrays.asList(
            new Student("John", 1),
            new Student("Steve", 2),
            new Student("Michael", 3),
            new Student("Bill", 4)
         )
    );

    @Test
    public void testSortStudents() {
        Assertions.assertEquals(expectedList, StudentsSorter.sortStudents(testList));
    }
}



