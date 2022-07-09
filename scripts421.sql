ALTER TABLE student
    ADD CONSTRAINT age_constraint CHECK (age > 16);

ALTER TABLE student
    ADD CONSTRAINT unique_name_constraint UNIQUE (name);

ALTER TABLE faculty
    ADD CONSTRAINT unique_color_and_name_constraint UNIQUE (color, name);

ALTER TABLE student
    ALTER COLUMN age SET DEFAULT (20);