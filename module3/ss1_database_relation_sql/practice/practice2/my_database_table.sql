create database if not exists student_management;
use student_management;
create table class(
id int,
`name` varchar(50)
);
alter table class
add primary key (id);
insert into class (
	id,
    `name`
) value (1,'C0722G1');
select `name` from class;

-- Teacher
create table teacher(
id int primary key,
`name` varchar(50),
age int,
country varchar(50)
);
alter table teacher 
add primary key (id);
insert into teacher(
id,
`name`,
age,
country
)value(1,"Nguyen phuoc sang",18,'vietnamese'),
	  (2,"Le ta ha phuong",19,'canada');
update teacher
set country = 'vietnamese'
where id=2;

set SQL_SAFE_UPDATES =0;
update teacher
set country="Japan";
set SQL_SAFE_UPDATES =1;
update teacher
set `name`="Nguyen tan " where id=2;
