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

create table Permision(

id int(11) primary key,

name varchar(50)

);
create table User_Permision(

permision_id int(11),

user_id int(11)

);


insert into Permision(id, name) values(1, 'add');

insert into Permision(id, name) values(2, 'edit');

insert into Permision(id, name) values(3, 'delete');

insert into Permision(id, name) values(4, 'view');

SELECT * FROM users ORDER BY name ASC ;