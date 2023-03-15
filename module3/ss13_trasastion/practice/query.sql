USE demo;
DELIMITER //
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN 
SELECT users.name,users.email,users.country
FROM users
WHERE users.id=user_id;
END//
DELIMITER ;
DROP TABLE users;
 
CALL get_user_by_id(13);
DELIMITER //
CREATE PROCEDURE insert_user(
IN user_name VARCHAR(50),
IN user_email VARCHAR(50),
IN user_country VARCHAR(50)
)
BEGIN
INSERT INTO users(name,email,country)
VALUE (user_name,user_name,user_country);
END//
DELIMITER ;
CALL insert_user(2,"Tấn","Japan");
SELECT * FROM users;

DELIMITER //
CREATE PROCEDURE display_list_user()
BEGIN 
SELECT * FROM users;
END//
DELIMITER ;
CALL display_list_user();

DELIMITER //
CREATE PROCEDURE update_info(IN name VARCHAR(50),IN email VARCHAR(50),IN country VARCHAR(50),IN id_user INT)
BEGIN 
update users set name = name,email= email, country =country where id = id_user;
END//
DELIMITER ;

CALL update_info("sang",'sang@gamil','vietnam',15);

DELIMITER //
CREATE PROCEDURE `delete`(IN user_id INT)
BEGIN 
delete from users where id =user_id;
END//
DELIMITER ;

call `delete`(18);


