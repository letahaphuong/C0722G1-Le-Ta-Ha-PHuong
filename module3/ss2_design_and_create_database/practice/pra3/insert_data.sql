USE student_management;
INSERT INTO class(
class_name,
start_date,
`status`
) VALUE('A1','2008-12-20', 1),
('A2','2008-12-22', 1),
('B3',current_date, 0);

INSERT INTO student(
student_name,
address,
phone,
`status`,
class_id
)VALUE('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO student(
student_name,
address,
`status`,
class_id
)VALUE('Hoa', 'Hai phong', 1, 1);
INSERT INTO student(
student_name,
address,
phone,
`status`,
class_id
)VALUE('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO `subject`(sub_id,sub_name,credit,`status`)
VALUE(1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO mark(sub_id,student_id,mark,exam_times)
VALUE(1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);





