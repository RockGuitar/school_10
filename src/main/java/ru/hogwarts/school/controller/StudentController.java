package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;

import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController ( StudentService studentService ) {
        this.studentService = studentService;
    }

    @GetMapping("{studentKey}")
    public Student readStudent ( @PathVariable Long studentKey ) {
        return studentService.readStudent(studentKey);
    }

    @GetMapping("{minAge},{maxAge}")
    public Collection<Student> readStudents ( @PathVariable int minAge, @PathVariable int maxAge ) {
        return studentService.findByAgeBetween(minAge, maxAge);
    }

    @PostMapping()
    public Student createStudent ( @RequestBody Student student ) {
        return studentService.createStudent(student);
    }

    @PutMapping
    public Student updateStudent ( @RequestBody Student student ) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping
    public void deleteStudent ( @RequestParam("key") Long studentKey ) {
        studentService.deleteStudent(studentKey);
    }
}

