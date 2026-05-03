DROP DATABASE IF EXISTS currency_db;
CREATE DATABASE currency_db;
USE currency_db;

CREATE TABLE Currency (
    id INT NOT NULL AUTO_INCREMENT,
    abbreviation VARCHAR(10),
    name VARCHAR(50),
    rateToUsd DOUBLE,
    PRIMARY KEY (id)
    );

INSERT INTO Currency (abbreviation, name, rateToUsd) VALUES('USD','US Dollar',1.0),
                                                           ('EUR','Euro',0.92),
                                                           ('GBP','British Pound',0.79),
                                                           ('JPY','Yen',150);