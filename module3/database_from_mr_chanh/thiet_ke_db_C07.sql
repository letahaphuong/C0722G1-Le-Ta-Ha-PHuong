create database if not exists c0722g1;
use c0722g1;
create table class(
id int auto_increment primary key,
`name` varchar(20)
);
create table room(
id int auto_increment primary key,
`name` varchar(20),
class_id int,
foreign key (class_id) references class(id)
);
create table jame (
username varchar(50) primary key,
`password` varchar(50)
);
create table student(
id int auto_increment primary key,
`name` varchar(50),
birthday date,
gender boolean,
email varchar(50),
point float,
username varchar(50) unique,
class_id int,
foreign key (username) references jame(username),
foreign key (class_id) references class(id)
);
create table instructor(
id int auto_increment primary key,
`name` varchar(50),
birthday date,
salary float
);
create table instructor_class (
 instructor_id int,
 class_id int,
 primary key(instructor_id,class_id),
 foreign key (instructor_id) references instructor(id),
 foreign key (class_id) references class(id),
 start_time date,
 end_time date
);







