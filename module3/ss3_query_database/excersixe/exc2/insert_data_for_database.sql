USE management_sell;
INSERT INTO customer (customer_name,customer_age)
VALUE('Minh Quan',10),
('Ngoc Oanh',20),('Hong Ha',50);

INSERT INTO `order`(order_id,customer_id,order_date)
VALUE(1,1,'2006-3-21'),
(2,2,'2006-3-23'),
(3,1,'2006-3-16');

INSERT INTO product(product_id,product_name,product_price)
VALUE(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

INSERT INTO order_detail(order_id,product_id,order_QTY)
VALUE(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);