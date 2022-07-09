package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findByAgeBetween ( int minAge, int maxAge );

    @Query(value = "SELECT COUNT(name) FROM student", nativeQuery = true)
    int getStudentsAmount ();

    @Query(value = "SELECT AVG(age) AS average_age FROM student", nativeQuery = true)
    int getStudentsAverageAge ();

    @Query(value = "SELECT * FROM student ORDER BY id DESC limit 5;", nativeQuery = true)
    List<Student> getLastFiveStudents ();
}
