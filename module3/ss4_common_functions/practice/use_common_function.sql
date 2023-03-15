USE student_management;

-- Bước 2: Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
SELECT address, COUNT(student_id) AS 'Số lượng học viên'
FROM student
GROUP BY address;

-- Bước 3: Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
SELECT s.student_id,s.student_name, AVG(mark)
FROM student s join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
SELECT s.student_id,s.student_name, AVG(mark)
FROM student s  join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name
HAVING AVG(mark)>15;

-- Bước 5: Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
SELECT s.student_id,s.student_name, AVG(mark)
FROM student s  join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name
HAVING AVG(mark)>= ALL(SELECT AVG(mark) FROM mark GROUP BY mark.student_id);
