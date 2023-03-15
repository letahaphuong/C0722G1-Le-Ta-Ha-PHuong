USE classicmodels;
EXPLAIN SELECT * FROM customers 
WHERE customerName = 'Land of Toys Inc.';

ALTER TABLE customers ADD INDEX idx_customerName(customerName);

EXPLAIN SELECT * FROM customers
WHERE customerName = 'Land of Toys Inc.'; 

ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName,contactLastName);
EXPLAIN SELECT * FROM customers
WHERE contactFirstName = 'Jean' AND contactLastName='King';
-- thực hành 3
DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

--  SELECT customerName FROM customers;
SELECT * FROM customers WHERE customerNumber =175;
END //

DELIMITER ;
CALL findAllCustomers();
DROP PROCEDURE findAllCustomers;

-- thực hành 4
DELIMITER //
CREATE PROCEDURE getCusById
(IN cusNum INT(11))
BEGIN 
SELECT * FROM customers WHERE customerNumber =cusNum;
END //
DELIMITER ;
CALL getCusByID(175);

DELIMITER //
CREATE PROCEDURE GetCustomersCountByCity (
	IN in_city VARCHAR(50),
    OUT total INT
)
BEGIN 
SELECT COUNT(customerNumber)
INTO total
FROM customers
WHERE cityy =in_city;
END//
DELIMITER ;
CALL GetCustomersCountByCity('Lyon', @total);
SELECT @total;

-- CREATE view

CREATE VIEW customer_views AS
SELECT customerNumber,customerName, phone
FROM customers;
SELECT * FROM customer_views;
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';