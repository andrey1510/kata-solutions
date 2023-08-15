package w3resource.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsSorter {

    public static List <Student> sortStudents(List <Student> students){
        return students.stream()
                .sorted(Comparator.comparing(Student::getCourse))
                .collect(Collectors.toList());
    }

}

