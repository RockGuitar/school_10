-- liquibase formatted sql

-- changeset nikitaOleynik:1
CREATE INDEX student_name_search_index ON student (name);
CREATE INDEX faculty_color_and_name_search_index ON faculty (color, name);