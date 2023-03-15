CREATE DATABASE IF NOT EXISTS demo;
USE demo;
CREATE TABLE users(
id INT(3) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(120) NOT NULL,
email VARCHAR(220) NOT NULL,
country VARCHAR(120),
PRIMARY KEY(id) 
);
INSERT INTO users(`name`,email,country)
VALUES('Minh','minh@codegym.vn','Viet nam');
INSERT INTO users(`name`,email,country)
VALUES('Kante','kante@che.uk','Kenia');

SELECT * FROM users ORDER BY name ASC ;