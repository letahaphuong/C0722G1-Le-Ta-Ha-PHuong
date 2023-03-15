USE management_sell;
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT  order_id,order_date,order_total_price FROM `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT customer.customer_name, product.product_name 
FROM customer
INNER JOIN `order` ON customer.customer_id = `order`.customer_id
INNER JOIN order_detail ON `order`.order_id = order_detail.order_id
INNER JOIN product ON order_detail.product_id = product.product_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT customer.customer_name, `order`.customer_id 
FROM customer
LEFT JOIN `order` ON customer.customer_id = `order`.customer_id  
WHERE `order`.customer_id IS NULL;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại 
-- mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
SELECT order_detail.order_id,product.product_price,order_detail.order_QTY,
product.product_name, `order`.order_date,order_detail.order_QTY * product.product_price AS `total`
FROM `order` 
JOIN order_detail ON `order`.order_id = order_detail.order_id
JOIN product ON order_detail.product_id = product.product_id;









