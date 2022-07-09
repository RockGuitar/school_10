ALTER TABLE student
    ADD COLUMN faculty_id BIGINT REFERENCES faculty (id);

SELECT student.age, student.name, faculty.color, faculty.name
FROM student
         FULL JOIN faculty ON student.faculty_id = faculty.id;

SELECT student.age, student.name, avatar.student_id
FROM student
         INNER JOIN avatar ON student.id = avatar.student_id;