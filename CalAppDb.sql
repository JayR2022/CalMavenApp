CREATE DATABASE IF NOT EXISTS cal_app;
USE cal_app;
CREATE TABLE IF NOT EXISTS users(
user_id int AUTO_INCREMENT,
forename varchar(100) NOT NULL,
surname varchar(100) NOT NULL,
PRIMARY KEY(user_id)
);

INSERT INTO users
	(forename, surname)
VALUES 
	("Jay", "R"),
    ("Ed","W");
    
-- DROP TABLE IF EXISTS users;