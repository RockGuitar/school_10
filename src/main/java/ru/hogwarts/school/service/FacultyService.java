package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;

@Service
public interface FacultyService {

    Faculty createFaculty ( Faculty faculty );

    Faculty readFaculty ( Long id );

    Faculty updateFaculty ( Faculty faculty );

    void deleteFaculty ( Long id );

    Faculty findFacultyByColorOrNameIgnoreCase ( String color, String name );

    String findLongestFacultyName();


}
