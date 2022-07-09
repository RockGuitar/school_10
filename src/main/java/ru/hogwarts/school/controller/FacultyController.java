package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController ( FacultyService facultyService ) {
        this.facultyService = facultyService;
    }

    @GetMapping("{facultyKey}")
    public Faculty readFaculty ( @PathVariable Long facultyKey ) {
        return facultyService.readFaculty(facultyKey);
    }

    @GetMapping("{color},{name}")
    public Faculty readFaculties ( @PathVariable String color, @PathVariable String name ) {
        return facultyService.findFacultyByColorOrNameIgnoreCase(color, name);
    }

    @PostMapping()
    public Faculty createFaculty ( @RequestBody Faculty faculty ) {
        return facultyService.createFaculty(faculty);
    }

    @PutMapping
    public Faculty updateFaculty ( @RequestBody Faculty faculty ) {
        return facultyService.updateFaculty(faculty);
    }

    @DeleteMapping
    public void deleteFaculty ( @RequestParam("key") Long facultyKey ) {
        facultyService.deleteFaculty(facultyKey);
    }
}
