package ru.hogwarts.school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;


@Service
public class FacultyServiceImpl implements FacultyService {

    Logger facultyLogger = LoggerFactory.getLogger(FacultyServiceImpl.class);

    private FacultyRepository facultyRepository;

    public FacultyServiceImpl ( FacultyRepository facultyRepository ) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty ( Faculty faculty ) {
        facultyLogger.info("Вызван метод для создания факультета");
        return facultyRepository.save(faculty);
    }

    public Faculty readFaculty ( Long id ) {
        facultyLogger.info("Вызван метод для поиска факультета");
        return facultyRepository.findById(id).orElseThrow();
    }

    public Faculty updateFaculty ( Faculty faculty ) {
        facultyLogger.info("Вызван метод для обновления факультета");
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty ( Long id ) {
        facultyLogger.info("Вызван метод для удаления факультета");
        facultyRepository.deleteById(id);
    }

    public Faculty findFacultyByColorOrNameIgnoreCase ( String color, String name ) {
        facultyLogger.info("Вызван метод для поиска факультета по цвету или имени без учета регистра");
        return facultyRepository.findFacultyByColorOrNameIgnoreCase(color, name);
    }
}
