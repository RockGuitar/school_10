package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;

@Service
public interface StudentService {

    Student createStudent ( Student student );

    Student readStudent ( Long id );

    Student updateStudent ( Student student );

    void deleteStudent ( Long id );

    Collection<Student> findByAgeBetween ( int min, int max );

    Collection<Student> getStudentsWithFirstLetterAsA ();

    public double getAverageAge ();
}
