USE furamaresort_database;

INSERT INTO `furamaresort_database`.`attach_facility` (`id`, `name`, `cost`, `unit`, `status`) VALUES ('1', 'Karaoke', '10000', 'giờ', 'tiện nghi, hiện tại');
INSERT INTO `furamaresort_database`.`attach_facility` (`id`, `name`, `cost`, `unit`, `status`) VALUES ('2', 'Thuê xe máy', '10000', 'chiếc', 'hỏng 1 xe');
INSERT INTO `furamaresort_database`.`attach_facility` (`id`, `name`, `cost`, `unit`, `status`) VALUES ('3', 'Thuê xe đạp', '20000', 'chiếc', 'tốt');
INSERT INTO `furamaresort_database`.`attach_facility` (`id`, `name`, `cost`, `unit`, `status`) VALUES ('4', 'Buffet buổi sáng', '15000', 'suất', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `furamaresort_database`.`attach_facility` (`id`, `name`, `cost`, `unit`, `status`) VALUES ('5', 'Buffet buổi trưa', '90000', 'suất', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `furamaresort_database`.`attach_facility` (`id`, `name`, `cost`, `unit`, `status`) VALUES ('6', 'Buffet buổi tối', '16000', 'suất', 'đầy đủ đồ ăn, tráng miệng');

SET FOREIGN_KEY_CHECKS = 0; 

INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('1', '2020-12-08', '2020-12-08', '0', '3', '1', '3');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('2', '2020-07-14', '2020-07-21', '200000', '7', '3', '1');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('3', '2021-03-15', '2021-03-17', '50000', '3', '4', '2');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('4', '2021-01-14', '2021-01-18', '100000', '7', '5', '5');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('5', '2021-07-14', '2021-07-15', '0', '7', '2', '6');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('6', '2021-06-01', '2021-06-03', '0', '7', '7', '6');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('7', '2021-09-02', '2021-09-05', '100000', '7', '4', '4');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('8', '2021-06-17', '2021-06-18', '150000', '3', '4', '1');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('9', '2020-11-19', '2020-11-19', '0', '3', '4', '3');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('10', '2021-04-12', '2021-04-14', '0', '10', '3', '5');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('11', '2021-04-25', '2021-04-25', '0', '2', '2', '1');
INSERT INTO `furamaresort_database`.`contract` (`id`, `start_date`, `end_date`, `deposit`, `employee_id`, `customer_id`, `facility_id`) VALUES ('12', '2021-05-25', '2021-05-27', '0', '7', '10', '1');

INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('1', '5', '2', '4');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('2', '8', '2', '5');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('3', '15', '2', '6');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('4', '1', '3', '1');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('5', '11', '3', '2');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('6', '1', '1', '3');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('7', '2', '1', '2');
INSERT INTO `furamaresort_database`.`contract_detail` (`id`, `contract_id`, `attach_facility_id`, `quantity`) VALUES ('8', '2', '12', '2');

INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('1', '5', 'Nguyễn Thị Hào', '1970-11-07', 0, '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('2', '3', 'Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('3', '1', 'Trương Đình Nghệ', '1990-02-27', 1, '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('4', '1', 'Dương Văn Quan', '1981-07-08', 1, '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('5', '4', 'Hoàng Trần Nhi Nhi', '1995-12-09', 0, '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('6', '4', 'Tôn Nữ Mộc Châu', '2005-12-06', 0, '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('7', '1', 'Nguyễn Mỹ Kim', '1984-04-08', 0, '856453123', '0912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('8', '3', 'Nguyễn Thị Hào', '1999-04-08', 0,'965656433', '0763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('9', '1', 'Trần Đại Danh', '1994-07-01', 1, '432341235', '0643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi');
INSERT INTO `furamaresort_database`.`customer` (`id`, `customer_type_id`, `name`, `date_of_birth`, `gender`, `id_card`, `phone_number`, `email`, `address`) VALUES ('10', '2', 'Nguyễn Tâm Đắc', '1989-07-01', 1, '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng');


INSERT INTO `furamaresort_database`.`customer_type` (`id`, `name`) VALUES ('1', 'Diamond');
INSERT INTO `furamaresort_database`.`customer_type` (`id`, `name`) VALUES ('2', 'Platinium');
INSERT INTO `furamaresort_database`.`customer_type` (`id`, `name`) VALUES ('3', 'Gold');
INSERT INTO `furamaresort_database`.`customer_type` (`id`, `name`) VALUES ('4', 'Silver');
INSERT INTO `furamaresort_database`.`customer_type` (`id`, `name`) VALUES ('5', 'Member');

INSERT INTO `furamaresort_database`.`division` (`id`, `name`) VALUES ('1', 'Sale-Marketing');
INSERT INTO `furamaresort_database`.`division` (`id`, `name`) VALUES ('2', 'Hành chính');
INSERT INTO `furamaresort_database`.`division` (`id`, `name`) VALUES ('3', 'Phục vụ');
INSERT INTO `furamaresort_database`.`division` (`id`, `name`) VALUES ('4', 'Quản lý');

INSERT INTO `furamaresort_database`.`education_degree` (`id`, `name`) VALUES ('1', 'Trung Cấp');
INSERT INTO `furamaresort_database`.`education_degree` (`id`, `name`) VALUES ('2', 'Cao Đẳng');
INSERT INTO `furamaresort_database`.`education_degree` (`id`, `name`) VALUES ('3', 'Đại Học');
INSERT INTO `furamaresort_database`.`education_degree` (`id`, `name`) VALUES ('4', 'Sau Đại Học');

INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('1', 'Nguyễn Văn An', '1970-11-07', '456231786', '10000000', '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', '1', '3', '1', 'annguyen');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('2', 'Lê Văn Bình', '1997-04-09', '654231234', '7000000', '654231234', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', '1', '2', '2', 'binhlv');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('3', 'Hồ Thị Yến', '1995-12-12', '999231723', '14000000', '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', '1', '3', '2', 'thiyen');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('4', 'Võ Công Toản', '1980-04-04', '123231365', '17000000', '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', '1', '4', '4', 'toan0404');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('5', 'Nguyễn Bỉnh Phát', '1999-12-09', '454363232', '6000000', '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', '2', '1', '1', 'phatphat');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('6', 'Khúc Nguyễn An Nghi', '2000-11-08', '964542311', '7000000', '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', '2', '2', '3', 'annghi20');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('7', 'Nguyễn Hữu Hà', '1993-01-01', '534323231', '8000000', '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', '2', '3', '2', 'nhh0101');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('8', 'Nguyễn Hà Đông', '1989-09-03', '234414123', '9000000', '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', '2', '4', '4', 'donghanguyen');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('9', 'Tòng Hoang', '1982-09-03', '256781231', '6000000', '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', '2', '4', '4', 'hoangtong');
INSERT INTO `furamaresort_database`.`employee` (`id`, `name`, `date_of_birth`, `id_card`, `salary`, `phone_number`, `email`, `address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('10', 'Nguyễn Công Đạo', '1994-01-08', '755434343', '8000000', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', '2', '3', '2', 'nguyencongdao12');

INSERT INTO `furamaresort_database`.`facility` (`id`, `name`, `area`, `cost`, `max_people`, `rent_type_id`, `facility_type_id`, `standard_room`, `description_other_convenience`, `pool_area`, `number_of_floors`, `facility_free`) VALUES ('1', 'Villa Beach Front', 25000, '1000000', '10', '3', '1', 'vip', 'Có hồ bơi', 500, 4, 'null');
INSERT INTO `furamaresort_database`.`facility` (`id`, `name`, `area`, `cost`, `max_people`, `rent_type_id`, `facility_type_id`, `standard_room`, `description_other_convenience`, `pool_area`, `number_of_floors`, `facility_free`) VALUES ('2', 'House Princess 01', 14000, '5000000', '7', '2', '2', 'vip', 'Có thêm bếp nướng', null, 3, 'null');
INSERT INTO `furamaresort_database`.`facility` (`id`, `name`, `area`, `cost`, `max_people`, `rent_type_id`, `facility_type_id`, `standard_room`, `description_other_convenience`, `pool_area`, `number_of_floors`, `facility_free`) VALUES ('3', 'Room Twin 01', 5000, '1000000', '2', '4', '3', 'normal', 'Có tivi', null, null, '1 Xe máy, 1 Xe đạp');
INSERT INTO `furamaresort_database`.`facility` (`id`, `name`, `area`, `cost`, `max_people`, `rent_type_id`, `facility_type_id`, `standard_room`, `description_other_convenience`, `pool_area`, `number_of_floors`, `facility_free`) VALUES ('4', 'Villa No Beach Front', 22000, '9000000', '8', '3', '1', 'normal', 'Có hồ bơi', 300, 3, 'null');
INSERT INTO `furamaresort_database`.`facility` (`id`, `name`, `area`, `cost`, `max_people`, `rent_type_id`, `facility_type_id`, `standard_room`, `description_other_convenience`, `pool_area`, `number_of_floors`, `facility_free`) VALUES ('5', 'House Princess 02', 10000, '4000000', '5', '3', '2', 'normal', 'Có thêm bếp nướng', null, 2, 'null');
INSERT INTO `furamaresort_database`.`facility` (`id`, `name`, `area`, `cost`, `max_people`, `rent_type_id`, `facility_type_id`, `standard_room`, `description_other_convenience`, `pool_area`, `number_of_floors`, `facility_free`) VALUES ('6', 'Room Twin 02', 3000, '900000', '2', '4', '3', 'normal', 'Có tivi', null, null, '1 Xe máy');


INSERT INTO `furamaresort_database`.`facility_type` (`id`, `name`) VALUES ('1', 'Villa');
INSERT INTO `furamaresort_database`.`facility_type` (`id`, `name`) VALUES ('2', 'House');
INSERT INTO `furamaresort_database`.`facility_type` (`id`, `name`) VALUES ('3', 'Room');

INSERT INTO `furamaresort_database`.`position` (`id`, `name`) VALUES ('1', 'Quản Lý');
INSERT INTO `furamaresort_database`.`position` (`id`, `name`) VALUES ('2', 'Nhân Viên');

INSERT INTO `furamaresort_database`.`rent_type` (`id`, `name`) VALUES ('1', 'year');
INSERT INTO `furamaresort_database`.`rent_type` (`id`, `name`) VALUES ('2', 'month');
INSERT INTO `furamaresort_database`.`rent_type` (`id`, `name`) VALUES ('3', 'day');
INSERT INTO `furamaresort_database`.`rent_type` (`id`, `name`) VALUES ('4', 'hour');

INSERT INTO `furamaresort_database`.`role` (`id`, `role_name`) VALUES ('1', 'admin');
INSERT INTO `furamaresort_database`.`role` (`id`, `role_name`) VALUES ('2', 'user');

INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('annguyen', 'YP921W');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('binhlv', 'AW998K');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('thiyen', 'VK993J');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('toan0404', 'RY259D');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('phatphat', 'JM792P');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('annghi20', 'HJ499A');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('nhh0101', 'NA955L');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('donghanguyen', 'RP592Y');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('hoangtong', 'LD578G');
INSERT INTO `furamaresort_database`.`user` (`username`, `password`) VALUES ('nguyencongdao12', 'XB972P');

INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('1', 'annguyen');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('1', 'binhlv');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('1', 'thiyen');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('1', 'toan0404');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('2', 'phatphat');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('2', 'annghi20');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('2', 'nhh0101');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('2', 'donghanguyen');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('2', 'hoangtong');
INSERT INTO `furamaresort_database`.`user_role` (`role_id`, `username`) VALUES ('2', 'nguyencongdao12');
