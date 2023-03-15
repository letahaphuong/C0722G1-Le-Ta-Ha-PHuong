USE student_management;
SELECT * FROM student
WHERE student_name LIKE ('%h');

SELECT * FROM class
WHERE month(start_date)=12;

SELECT * FROM `subject`
WHERE credit >=3 AND credit <=5;

SET SQL_SAFE_UPDATES = 0;
UPDATE student
SET class_id=2
WHERE student_name ="Hung";
SET SQL_SAFE_UPDATES =1;

SELECT student.student_name,`subject`.sub_name,mark.mark 
FROM (student JOIN (`subject` JOIN mark ON `subject`.sub_id=mark.sub_id)
ON student.student_id=mark.student_id)
ORDER BY mark DESC,student_name ASC; 