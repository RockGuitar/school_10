CREATE TABLE cars
(
    car_model TEXT PRIMARY KEY,
    car_brand TEXT,
    car_value INTEGER
);

CREATE TABLE persons
(
    name             TEXT PRIMARY KEY,
    age              SMALLINT,
    driving_license  BOOLEAN,
    person_car_model TEXT REFERENCES cars (car_model)
);
