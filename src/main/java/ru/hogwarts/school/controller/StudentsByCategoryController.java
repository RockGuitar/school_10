package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentServiceImpl;

import java.util.List;

@RestController
public class StudentsByCategoryController {

    private StudentServiceImpl studentServiceImpl;

    public StudentsByCategoryController ( StudentServiceImpl studentServiceImpl ) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping("/last-five")
    public List<Student> getLastFiveStudents () {
        return studentServiceImpl.getLastFiveStudents();
    }

    @GetMapping("/amount")
    public int getStudentsAmount () {
        return studentServiceImpl.getStudentsAmount();
    }

    @GetMapping("/average-age")
    public int getStudentsAverageAge () {
        return studentServiceImpl.getStudentsAverageAge();
    }
}
