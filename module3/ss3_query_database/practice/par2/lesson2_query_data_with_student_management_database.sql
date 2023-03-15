USE student_management;
SELECT 
    *
FROM
    student;
SELECT 
    *
FROM
    student
WHERE
    status = TRUE;
SELECT 
    *
FROM
    `subject`
WHERE
    credit < 10;
SELECT 
    student.student_id, student.student_name, class.class_name
FROM
    student
        JOIN
    class ON student.class_id = class.class_id;
SELECT 
    student.student_id, student.student_name, class.class_name
FROM
    student
        JOIN
    class ON student.class_id = class.class_id
WHERE
    class.class_name = 'A1';
SELECT 
    student.student_id,
    student.student_name,
    subject.subject_name,
    mark.mark
FROM
    student
        JOIN
    mark ON student.student_id = mark.student_id
        JOIN
    `subject` ON mark.subject_id = `subject`.subject_id
WHERE
    `subject`.subject_name = 'CF';