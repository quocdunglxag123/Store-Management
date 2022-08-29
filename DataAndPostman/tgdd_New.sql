use tgdd;
/* category */
insert into category (category_id,category_name) values (1,"phone");
insert into category (category_id,category_name) values (2,"laptop");
insert into category (category_id,category_name) values (3,"tablet");
insert into category (category_id,category_name) values (4,"Accessory");
insert into category (category_id,category_name) values (5,"Smartwatch");
insert into category (category_id,category_name) values (6,"watch");
insert into category (category_id,category_name) values (7,"PC,Printer");

/* manufacturer */
insert into manufacturer (manufacturer_id,branch_name,address) values (1,"iPhone","USA");
insert into manufacturer (manufacturer_id,branch_name,address) values (2,"Samsung","Korea");
insert into manufacturer (manufacturer_id,branch_name,address) values (3,"OPPO","China");
insert into manufacturer (manufacturer_id,branch_name,address) values (4,"xiaomi","China");
insert into manufacturer (manufacturer_id,branch_name,address) values (5,"vivo","China");
insert into manufacturer (manufacturer_id,branch_name,address) values (6,"realme","China");
insert into manufacturer (manufacturer_id,branch_name,address) values (7,"nokia","Japan");
insert into manufacturer (manufacturer_id,branch_name,address) values (8,"mobell","Singapore");
insert into manufacturer (manufacturer_id,branch_name,address) values (9,"itel","China");
insert into manufacturer (manufacturer_id,branch_name,address) values (10,"Masstel","VietNam");

/* product */
INSERT INTO product VALUES
    (1,'500 mAh','16MP','blue','Điện thoại Xiaomi Redmi Note 11S sẵn sàng đem đến cho bạn những trải nghiệm vô cùng hoàn hảo về chơi game, các tác vụ sử dụng hằng ngày hay sự ấn tượng từ vẻ đẹp bên ngoài.',0.8,'Xiaomi Redmi Note 11S','Android',950,' 12 months','12GB','8GB','6.43 inch',true,'dollar','full HD',1,4),
    (2,'N/A','N/A','black','Màn hình Asus LCD VY249HE 23.8 inch Full HD mang đến hình ảnh sắc nét, chân thật, cho bạn tận hưởng những trải nghiệm sống động như đang trong chính thế giới ảo.',1,'Asus VY249HE 23.8 inch Full HD','N/A',900,'6 months','N/A','N/A','23.8',false,'dollar','full HD',7,5),
    (3,'N/A','N/A','white','Sản phẩm đồng hồ mang thương hiệu Elio với nhiều mẫu mã năng động, trẻ trung nhưng không kém phần tinh tế và sang trọng, phù hợp với tất cả mọi người hoạt động ở nhiều lĩnh vực từ dân văn phòng đến doanh nhân.',0.85,'ELIO 33 mm Nữ EL100-01','watchOS',300,'3 months','N/A','N/A','N/A',true,'dollar','N/A',6,7),
    (4,'N/A','N/A','gray','Apple Watch Series 6 44 mm viền nhôm dây silicone là một siêu phẩm đến từ nhà Táo, nhờ có thiết kế tinh xảo, độ hoàn thiện cao, màu đen sang trọng phù hợp với mọi lứa tuổi và giới tính, chiếc đồng hồ luôn thu hút rất nhiều người khi xuất hiện.',0.8,'Apple Watch S6 44mm viền nhôm dây silicone','watchOS',800,' 6 months','N/A','N/A','N/A',true,'dollar','N/A',5,9),
    (5,'N/A','N/A','black','Được làm từ chất liệu giả da cao cấp và vải canvas làm từ 100% cotton bóng sáng, thoáng khí, dễ dàng giặt sạch và bề mặt chống thấm tốt khỏi tia nước bắn hoặc khi đi mưa nhỏ, duy trì độ bền sử dụng.',0.9,'Balo Laptop 13.3 inch Rivacase 8524 Đen','N/A',200,'3 months','N/A','N/A','N/A',true,'dollar','N/A',4,1),
    (6,' 600 mAh','13MP','black','Tablet Lenovo mang đến cho người dùng mẫu máy tính bảng mới với tên gọi Yoga Tab 11 cùng nhiều ưu điểm vượt trội như bộ vi xử lý chuyên game của MediaTek, màn hình kích thước lớn, âm thanh nổi sống động và các chế độ tiện ích đa dạng khác mà không thua kém gì các tablet cao cấp khác.',0.6,'Lenovo Yoga Tab 11','Android',700,' 6 months','12GB','16GB','11"',true,'dollar','full HD',3,2),
    (7,' 600 mAh','12MP','black','Không những mang đến cho người dùng hiệu năng ấn tượng nhờ con chip Intel thế hệ 11 tân tiến, laptop Dell Gaming G15 5511 i5 11400H (70266676) còn sở hữu thiết kế thời thượng, lôi cuốn, hứa hẹn sẽ là người cộng sự lý tưởng cùng bạn chinh phục mọi chiến trường.',0.6,'Dell Gaming G15 5511 i5 11400H (70266676) ','window',950,'12 months','24GB','32GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,1),
    (8,'N/A','N/A','white','Màn hình Dell LCD P2422H 23.8 inch Full HD là phiên bản màn hình máy tính với viền mỏng và công nghệ hình ảnh chuyên sâu, phục vụ tốt các tác vụ thiết kế đồ họa hay dựng phim chuyên nghiệp.',1,'Dell P2422H 23.8 inch Full HD','N/A',700,' 6 months','N/A','N/A','23.8',true,'dollar','full HD',7,4),
    (9,'N/A','N/A','gray','Điện thoại Realme C35 thuộc phân khúc giá rẻ được nhà Realme cho ra mắt với thiết kế trẻ trung, dung lượng pin lớn cùng camera hỗ trợ nhiều tính năng. Đây sẽ là thiết bị liên lạc, giải trí và làm việc ổn định,… cho các nhu cầu sử dụng của bạn.',0.85,'Realme C35','Android',700,' 6 months','8GB','24GB','6.6"',true,'dollar','full HD',1,6),
    (10,'400 mAh','10MP','blue','Vivo Y15a - là sản phẩm thuộc phân khúc giá rẻ có hiệu suất ổn định trên con chip 8 nhân, sở hữu một thiết kế hiện đại giúp cho máy thực sự là một sự lựa chọn đáng quan tâm trước khi chọn mua cho mình một thiết bị sở hữu đầy đủ chức năng có giá thành hợp lý.',0.9,'Vivo Y15a','Android',850,' 12 months','16GB','24GB','6.51"',false,'dollar','full HD',1,8),
    (11,'N/A','N/A','green','aaa',0.85,'Asus VY249HE 23.8 inch Full HD','N/A',950,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',7,10),
    (12,'400 mAh','10MP','green','aaa',0.9,'Vivo Y15 series','Android',850,' 12 months','16GB','24GB','Full HD 6.7',false,'dollar','full HD',1,8),
    (13,' 333 mAh','6MP','gray','aaa',0.85,'Realme C35','Android',950,' 6 months','8GB','24GB','Full HD 6.8',true,'dollar','full HD',1,6),
    (14,' 600 mAh','12MP','blue','aaa',0.6,'Xiaomi Redmi Note 11S series','iOS',500,' 6 months','12GB','16GB','Full HD 6.9',true,'dollar','full HD',1,10),
    (15,'303.8 mAh','13MP','blue','aaa',0.75,'Samsung Galaxy A23','iOS',600,' 6 months','8GB','8GB','Full HD 6.10',false,'dollar','full HD',1,5),
    (16,'500 mAh','10MP','blue','aaa',1,'Realme C35','iOS',850,'3 months','16GB','12GB','Full HD 6.11',true,'dollar','full HD',1,2),
    (17,' 240mAh','13MP','gray','aaa',0.9,'iPhone 13 Pro Max','Android',500,' 6 months','16GB','16GB','Full HD 6.12',true,'dollar','full HD',1,2),
    (18,'400 mAh','6MP','green','aaa',0.75,'Vivo Y15 series','Android',500,' 12 months','16GB','16GB','Full HD 6.13',true,'dollar','full HD',1,7),
    (19,'500 mAh','10MP','yellow','aaa',0.6,'Xiaomi Redmi Note 11S series','iOS',850,' 12 months','12GB','8GB','Full HD 6.14',true,'dollar','full HD',1,1),
    (20,' 240mAh','6MP','pink','aaa',0.7,'Realme C35','Android',850,' 12 months','16GB','32GB','Full HD 6.15',true,'dollar','full HD',1,8),
    (21,'303.8 mAh','6MP','gray','aaa',0.6,'OPPO Find X5 Pro 5G','Android',900,' 12 months','12GB','8GB','Full HD 6.16',true,'dollar','full HD',1,7),
    (22,'400 mAh','8MP','pink','aaa',0.75,'Vivo Y15 series','Android',800,'3 months','12GB','8GB','Full HD 6.17',true,'dollar','full HD',1,1),
    (23,' 333 mAh','6MP','white','aaa',0.85,'MSI Prestige 14 A11SC i7 1195G7','linux',900,' 6 months','12GB','16GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,1),
    (24,'500 mAh','13MP','gray','aaa',0.75,'Acer Aspire 7 Gaming A715 75G 58U4 i5 10300H','chromeos',500,' 6 months','32GB','24GB','Full HD (1368x 768)',true,'dollar','full HD',2,6),
    (25,' 600 mAh','10MP','green','aaa',0.85,'Dell Gaming Alienware m15 R6 i7 11800H (70272633)','linux',800,'3 months','16GB','24GB','Full HD (1368x 768)',true,'dollar','full HD',2,7),
    (26,' 333 mAh','8MP','white','aaa',0.7,'Dell Gaming G15 5511 i5 11400H (70266676) ','unix',800,' 6 months','32GB','16GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,2),
    (27,' 240mAh','13MP','yellow','aaa',0.6,'HP Gaming VICTUS 16 d0202TX i5 11400H','unix',850,' 12 months','16GB','16GB','Full HD (1368x 768)',true,'dollar','full HD',2,4),
    (28,'500 mAh','8MP','blue','aaa',1,'Dell Gaming Alienware m15 R6 i7 11800H (70272633)','microsoft',950,' 6 months','8GB','24GB','Full HD (1368x 768)',true,'dollar','full HD',2,10),
    (29,' 600 mAh','6MP','gray','aaa',0.9,'Lenovo Gaming Legion 5 15ITH6 i7 11800H','chromeos',850,' 12 months','12GB','12GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,3),
    (30,'303.8 mAh','13MP','gray','aaa',0.75,'Dell Gaming Alienware m15 R6 i7 11800H (70272633)','linux',850,' 6 months','24GB','24GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,1),
    (31,' 240mAh','10MP','white','aaa',0.9,'Lenovo Gaming Legion 5 15ITH6 i7 11800H','microsoft',800,' 12 months','16GB','12GB','Full HD (1368x 768)',true,'dollar','full HD',2,8),
    (32,' 240mAh','13MP','gray','aaa',0.7,'MSI Prestige 14 A11SC i7 1195G7','chromeos',850,'3 months','32GB','32GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,4),
    (33,' 600 mAh','12MP','white','aaa',0.6,'Dell Gaming G15 5511 i5 11400H (70266676) ','linux',950,' 6 months','8GB','32GB','Full HD (1368x 768)',true,'dollar','full HD',2,1),
    (34,'500 mAh','8MP','blue','aaa',0.9,'HP Gaming VICTUS 16 d0202TX i5 11400H','chromeos',500,'3 months','8GB','24GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,9),
    (35,' 333 mAh','8MP','pink','aaa',0.75,'MSI Prestige 14 A11SC i7 1195G7','microsoft',500,' 6 months','8GB','32GB','Full HD (1368x 768)',true,'dollar','full HD',2,4),
    (36,'303.8 mAh','6MP','black','aaa',0.9,'Acer Aspire 7 Gaming A715 75G 58U4 i5 10300H','chromeos',600,' 6 months','32GB','32GB','Full HD (1920 x 1080)',true,'dollar','full HD',2,7),
    (37,' 240mAh','8MP','blue','aaa',0.85,'Xiaomi Pad 5 WiFi','iOS',900,' 6 months','12GB','12GB','11"',true,'dollar','full HD',3,8),
    (38,'500 mAh','12MP','white','aaa',0.6,'Samsung Galaxy Tab S8','Android',700,'3 months','16GB','24GB','11"',true,'dollar','full HD',3,6),
    (39,' 333 mAh','12MP','white','aaa',0.85,'Samsung Galaxy Tab S8','Android',600,' 6 months','8GB','16GB','11"',true,'dollar','full HD',3,2),
    (40,' 600 mAh','13MP','green','aaa',0.85,'Xiaomi Pad 5 WiFi','Android',800,' 6 months','16GB','32GB','11"',true,'dollar','full HD',3,10),
    (41,'400 mAh','13MP','black','aaa',0.85,'Lenovo Yoga Tab 11','iOS',850,' 12 months','8GB','24GB','11"',false,'dollar','full HD',3,7),
    (42,' 600 mAh','13MP','black','aaa',0.6,'Lenovo Yoga Tab 11','Android',700,' 6 months','12GB','16GB','11"',true,'dollar','full HD',3,2),
    (43,' 333 mAh','8MP','pink','aaa',0.8,'iPad Pro M1 12.9 inch 5G','Android',850,' 12 months','12GB','12GB','11"',false,'dollar','full HD',3,5),
    (44,' 600 mAh','10MP','white','aaa',0.7,'Xiaomi Pad 5 WiFi','iOS',500,' 12 months','16GB','16GB','11"',true,'dollar','full HD',3,10),
    (45,' 240mAh','12MP','pink','aaa',0.75,'Alcatel 3T8','Android',800,' 12 months','12GB','8GB','11"',false,'dollar','full HD',3,2),
    (46,' 600 mAh','12MP','yellow','aaa',0.7,'Samsung Galaxy Tab S8','Android',800,'3 months','8GB','16GB','11"',true,'dollar','full HD',3,9),
    (47,'500 mAh','8MP','green','aaa',0.75,'iPad Pro M1 12.9 inch 5G','iOS',950,' 6 months','16GB','12GB','11"',true,'dollar','full HD',3,8),
    (48,' 600 mAh','13MP','black','aaa',0.85,'Alcatel 3T8','Android',600,' 6 months','12GB','8GB','11"',true,'dollar','full HD',3,1),
    (49,' 333 mAh','8MP','green','aaa',1,'Lenovo Yoga Tab 11','iOS',850,' 6 months','8GB','8GB','11"',true,'dollar','full HD',3,1),
    (50,' 333 mAh','12MP','yellow','aaa',0.8,'OPPO Pad Air','iOS',800,' 12 months','12GB','16GB','11"',true,'dollar','full HD',3,4),
    (51,'N/A','N/A','gray','aaa',0.9,'Tai nghe Bluetooth AirPods 3 Apple MME73','N/A',850,'3 months','N/A','N/A','N/A',true,'dollar','full HD',4,7),
    (52,'N/A','N/A','gray','aaa',1,'Tai nghe Bluetooth AirPods 3 Apple MME73','N/A',900,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',4,5),
    (53,'N/A','N/A','yellow','aaa',0.8,'TV Box FPT Play Box S T590','N/A',600,'3 months','N/A','N/A','N/A',true,'dollar','full HD',4,1),
    (54,'N/A','N/A','white','aaa',0.8,'Tai nghe True Wireless Beats Powerbeats Pro','N/A',500,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',4,8),
    (55,'N/A','N/A','white','aaa',0.85,'Balo Laptop 13.3 inch Rivacase 8524 Đen','N/A',950,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,3),
    (56,'N/A','N/A','white','aaa',0.75,'Tai nghe True Wireless Beats Powerbeats Pro','N/A',600,'3 months','N/A','N/A','N/A',true,'dollar','full HD',4,1),
    (57,'N/A','N/A','black','aaa',0.85,'Loa thanh Samsung HW-','N/A',700,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,2),
    (58,'N/A','N/A','white','aaa',0.7,'Tai nghe Bluetooth AirPods 3 Apple MME73','N/A',500,' 12 months','N/A','N/A','N/A',false,'dollar','full HD',4,4),
    (59,'N/A','N/A','gray','aaa',0.85,'Loa thanh Samsung HW-','N/A',500,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,6),
    (60,'N/A','N/A','blue','aaa',0.6,'Loa thanh Samsung HW-','N/A',850,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,5),
    (61,'N/A','N/A','pink','aaa',1,'Tai nghe Bluetooth AirPods 3 Apple MME73','N/A',700,'3 months','N/A','N/A','N/A',true,'dollar','full HD',4,4),
    (62,'N/A','N/A','blue','aaa',0.8,'TV Box FPT Play Box S T590','N/A',850,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',4,8),
    (63,'N/A','N/A','gray','aaa',0.85,'Balo Laptop 13.3 inch Rivacase 8524 Đen','N/A',800,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',4,10),
    (64,'N/A','N/A','yellow','aaa',0.9,'Balo Laptop 13.3 inch Rivacase 8524 Đen','N/A',800,'3 months','N/A','N/A','N/A',true,'dollar','full HD',4,1),
    (65,'N/A','N/A','blue','aaa',0.75,'Tai nghe True Wireless Beats Powerbeats Pro','N/A',850,'3 months','N/A','N/A','N/A',false,'dollar','full HD',4,9),
    (66,'N/A','N/A','yellow','aaa',0.85,'TV Box FPT Play Box S T590','N/A',850,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',4,2),
    (67,'N/A','N/A','white','aaa',0.75,'Loa thanh Samsung HW-','N/A',600,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',4,3),
    (68,'N/A','N/A','yellow','aaa',0.8,'Tai nghe True Wireless Beats Powerbeats Pro','N/A',900,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,4),
    (69,'N/A','N/A','white','aaa',0.6,'Tai nghe True Wireless Beats Powerbeats Pro','N/A',850,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,8),
    (70,'N/A','N/A','black','aaa',0.85,'Tai nghe Bluetooth AirPods 3 Apple MME73','N/A',850,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',4,3),
    (71,'500 mAh','N/A','blue','aaa',0.9,'BeU B2 40mm dây silicone','N/A',600,' 6 months','N/A','N/A',' 1.57 inch',true,'dollar','full HD',5,9),
    (72,'500 mAh','N/A','gray','aaa',0.8,'Apple Watch S6 44mm viền nhôm dây silicone','N/A',900,' 6 months','N/A','N/A','2.23 inch',true,'dollar','full HD',5,9),
    (73,'500 mAh','N/A','yellow','aaa',0.85,'BeU B2 40mm dây silicone','N/A',950,'3 months','N/A','N/A',' 1.57 inch',true,'dollar','full HD',5,6),
    (74,'303.8 mAh','N/A','pink','aaa',0.75,'Apple Watch S6 44mm viền nhôm dây silicone','N/A',800,' 12 months','N/A','N/A','2.23 inch',true,'dollar','full HD',5,7),
    (75,' 333 mAh','N/A','pink','aaa',0.6,'BeFit BeU B3 44mm dây silicone','N/A',500,' 6 months','N/A','N/A','2.23 inch',true,'dollar','full HD',5,8),
    (76,'303.8 mAh','N/A','green','aaa',0.85,'Apple Watch S6 44mm viền nhôm dây silicone','N/A',700,'3 months','N/A','N/A','1.99 inch',true,'dollar','full HD',5,6),
    (77,' 600 mAh','N/A','green','aaa',0.7,'Samsung Galaxy Watch5 44mm dây silicone','N/A',800,' 6 months','N/A','N/A',' 1.57 inch',true,'dollar','full HD',5,9),
    (78,' 240mAh','N/A','white','aaa',0.6,'Apple Watch S6 44mm viền nhôm dây silicone','N/A',900,' 12 months','N/A','N/A','1.99 inch',true,'dollar','full HD',5,5),
    (79,'303.8 mAh','N/A','white','aaa',0.8,'BeFit BeU B3 44mm dây silicone','N/A',900,'3 months','N/A','N/A','1.99 inch',true,'dollar','full HD',5,1),
    (80,'500 mAh','N/A','blue','aaa',0.85,'Samsung Galaxy Watch5 44mm dây silicone','N/A',500,' 12 months','N/A','N/A','1.99 inch',true,'dollar','full HD',5,8),
    (81,'500 mAh','N/A','yellow','aaa',0.9,'NAKZEN 33.6 mm Nữ SS8425L-7','N/A',900,'3 months','N/A','N/A','1.99 inch',true,'dollar','full HD',6,5),
    (82,'500 mAh','N/A','blue','aaa',1,'NAKZEN 33.6 mm Nữ SS8425L-7','N/A',950,' 12 months','N/A','N/A','1.99 inch',false,'dollar','full HD',6,6),
    (83,' 240mAh','N/A','yellow','aaa',0.7,'NAKZEN 33.6 mm Nữ SS8425L-7','N/A',950,'3 months','N/A','N/A','2.23 inch',true,'dollar','full HD',6,4),
    (84,' 600 mAh','N/A','black','aaa',0.7,'ELIO 33 mm Nữ EL100-01','N/A',700,' 6 months','N/A','N/A','1.99 inch',true,'dollar','full HD',6,2),
    (85,' 600 mAh','N/A','pink','aaa',0.9,'FREDERIQUE CONSTANT Manufacture 42 mm Nam FC-760MC4H6','N/A',850,'3 months','N/A','N/A',' 2.01 inch',true,'dollar','full HD',6,10),
    (86,' 600 mAh','N/A','yellow','aaa',0.75,'G-SHOCK 46.5 mm Nam GST-B200TJ-1ADR','N/A',950,' 12 months','N/A','N/A',' 2.01 inch',true,'dollar','full HD',6,7),
    (87,'303.8 mAh','N/A','black','aaa',0.75,'CASIO PROTREK 50.8 mm Nam PRT-B50T-7DR','N/A',950,'3 months','N/A','N/A','2.23 inch',false,'dollar','full HD',6,10),
    (88,'400 mAh','N/A','white','aaa',0.7,'ELIO 33 mm Nữ EL100-01','N/A',900,'3 months','N/A','N/A',' 2.01 inch',true,'dollar','full HD',6,7),
    (89,'N/A','N/A','green','aaa',1,'Asus VY249HE 23.8 inch Full HD','N/A',700,'4 months','N/A','N/A','24.8',false,'dollar','full HD',7,5),
    (90,' 333 mAh','N/A','green','aaa',0.8,'CASIO PROTREK 50.8 mm Nam PRT-B50T-7DR','N/A',850,' 6 months','N/A','N/A',' 1.57 inch',true,'dollar','full HD',6,9),
    (91,'N/A','N/A','blue','aaa',0.9,'Máy in Laser Trắng Đen HP 107w WiFi (4ZB78A)','N/A',950,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',7,3),
    (92,'N/A','N/A','gray','aaa',0.6,'Máy In Phun Màu Canon PIXMA G1010','N/A',900,' 6 months','N/A','N/A','N/A',true,'dollar','full HD',7,8),
    (93,'N/A','N/A','pink','aaa',0.9,'Asus VY249HE 23.8 inch Full HD','N/A',700,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',7,9),
    (94,'N/A','N/A','yellow','aaa',0.75,'iMac 24 inch M1 2021 4.5K/7-core GPU','N/A',600,' 12 months','N/A','N/A','24',true,'dollar','full HD',7,3),
    (95,'N/A','N/A','green','aaa',0.85,'Asus VY249HE 23.8 inch Full HD','N/A',500,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',7,10),
    (96,'N/A','N/A','pink','aaa',0.6,'Máy In Phun Màu Canon PIXMA G1010','N/A',850,' 12 months','N/A','N/A','N/A',true,'dollar','full HD',7,6),
    (97,'N/A','N/A','green','aaa',0.9,'iMac 24 inch M1 2021 4.5K/7-core GPU','N/A',950,' 12 months','N/A','N/A','24',true,'dollar','full HD',7,6),
    (98,'N/A','N/A','gray','aaa',1,'Máy in Laser Trắng Đen HP 107w WiFi (4ZB78A)','N/A',800,'3 months','N/A','N/A','N/A',true,'dollar','full HD',7,9),
    (99,'N/A','N/A','white','aaa',0.6,'Dell P2422H 23.8 inch Full HD','N/A',500,' 12 months','N/A','N/A','23.8',true,'dollar','full HD',7,10),
    (100,'303.8 mAh','N/A','green','aaa',0.85,'Apple Watch S6 44mm viền nhôm dây silicone','N/A',900,'3 months','N/A','N/A','1.99 inch',true,'dollar','full HD',5,6);
/*=====*/
INSERT INTO product VALUES(101,'303.8 mAh','13MP','black','aaa',0.75,'Samsung Galaxy A23','iOS',600,' 6 months','8GB','8GB','Full HD 6.10',false,'dollar','full HD',1,5);
INSERT INTO product VALUES(102,'303.8 mAh','13MP','blue','aaa',0.75,'Samsung Galaxy A23','iOS',600,' 6 months','16GB','8GB','Full HD 6.10',false,'dollar','full HD',1,5);
INSERT INTO product VALUES(103,'303.8 mAh','13MP','red','aaa',0.75,'Samsung Galaxy A23','iOS',600,' 6 months','8GB','64GB','Full HD 6.10',false,'dollar','full HD',1,5);

INSERT INTO image (id,product_id,url) VALUES
	(1,1,'https://cdn.tgdd.vn/Products/Images/42/267871/Kit/xiaomi-redmi-note-11s-n.jpg'),
	(2,2,'https://cdn.tgdd.vn/Products/Images/5697/253750/Slider/vi-vn-asus-lcd-vy249he-238-fulhd-1.jpg'),
    (3,3,'//cdn.tgdd.vn/Products/Images/7264/278416/elio-el100-01-nu-2.jpg'),
    (4,4,'https://cdn.tgdd.vn/Products/Images/7077/234912/Slider/noibat-780x433.jpg'),
    (5,5,'https://cdn.tgdd.vn/Products/Images/7923/247325/balo-laptop-133-inch-rivacase-8524-den-1-org.jpg'),
    (6,6,'https://cdn.tgdd.vn/Products/Images/522/244565/Slider/lenovo-yoga-tab-11637877174507021460.jpg'),
    (7,7,'https://cdn.tgdd.vn/Products/Images/44/264354/Slider/dell-gaming-g15-5511-i5-70266676-fix-ab-01-1020x570-2.jpg'),
    (8,8,'https://cdn.tgdd.vn/Products/Images/5697/258331/Slider/vi-vn-dell-lcd-p2422h-238-inch-full-hd-1.jpg'),
    (9,9,'https://cdn.tgdd.vn/Products/Images/42/261888/realme-c35-1-1.jpg'),
    (10,10,'https://cdn.tgdd.vn/Products/Images/42/259972/vivo-y15a-x-1.jpg'),
    (11,11,'oBjhn8KHMyI.jpg'),
    (12,12,'aE1D2Kot9SS.jpg'),
    (13,13,'Vuc0GOGKoW3.jpg'),
    (14,14,'wqvRMTuJuxO.jpg'),
    (15,15,'ohlwurpuQpM.jpg'),
    (16,16,'VqyFx25ABKv.jpg'),
    (17,17,'hSLSk7U8zif.jpg'),
    (18,18,'GG5OTeYf3FO.jpg'),
    (19,19,'jUEdHg2NtvE.jpg'),
    (20,20,'29TkbHsZRzo.jpg'),
    (21,21,'0jrJjibmgRp.jpg'),
    (22,22,'Ss1OHzyGmyt.jpg'),
    (23,23,'CO55sCQxdyZ.jpg'),
    (24,24,'5eev77TvGOx.jpg'),
    (25,25,'MrktNA2lLMz.jpg'),
    (26,26,'GhdOnzYWtx1.jpg'),
    (27,27,'3wWtV11w1se.jpg'),
    (28,28,'PBOU8zQ42nM.jpg'),
    (29,29,'GX7StTeWuf9.jpg'),
    (30,30,'VyxXdoAtYVH.jpg'),
    (31,31,'lRcAT1jFy5O.jpg'),
    (32,32,'qq9vDIiSe79.jpg'),
    (33,33,'PqZglVl4IO1.jpg'),
    (34,34,'9vqzt9mxoqE.jpg'),
    (35,35,'HHHXsl2KG0J.jpg'),
    (36,36,'mBvkwPNe4w9.jpg'),
    (37,37,'zqNFNYiprTS.jpg'),
    (38,38,'LiSZNn9C7HA.jpg'),
    (39,39,'0JoEJMXjJwR.jpg'),
    (40,40,'HRaKmYdlbJz.jpg'),
    (41,41,'TzNSXBjf2z1.jpg'),
    (42,42,'z0EbJPWRHJg.jpg'),
    (43,43,'4bA8DBliVq0.jpg'),
    (44,44,'Azy01zWAo4c.jpg'),
    (45,45,'PcjGLPNPJBq.jpg'),
    (46,46,'x5vRY7i4TdL.jpg'),
    (47,47,'80PmSYg4Hem.jpg'),
    (48,48,'cLhZ7zVVFgz.jpg'),
    (49,49,'UB2EjbYbuk8.jpg'),
    (50,50,'Eet0i6ztO3L.jpg'),
    (51,51,'Ldkt9Asi8Xo.jpg'),
    (52,52,'IfNtNzFgptB.jpg'),
    (53,53,'dHDpGQYfWR5.jpg'),
    (54,54,'IzZezcYtMmk.jpg'),
    (55,55,'ZVNnztAosNb.jpg'),
    (56,56,'KAdqT3bJcBW.jpg'),
    (57,57,'MXYUt9mH6hY.jpg'),
    (58,58,'2rscdbpfrjr.jpg'),
    (59,59,'rpYAJIeRCJi.jpg'),
    (60,60,'CI0OfAABkR4.jpg'),
    (61,61,'vHv80aAe6Ux.jpg'),
    (62,62,'eps5szenoeO.jpg'),
    (63,63,'TojlO6oep8a.jpg'),
    (64,64,'x3ROLRDRiNO.jpg'),
    (65,65,'PnKfjSKh7mZ.jpg'),
    (66,66,'gyHYOMDzcoz.jpg'),
    (67,67,'E2zodoMjX6B.jpg'),
    (68,68,'FZ6bsWWTIAx.jpg'),
    (69,69,'XWcHxC1Ntuk.jpg'),
    (70,70,'ZiSq5ygVXPd.jpg'),
    (71,71,'ftrcxdrcIgy.jpg'),
    (72,72,'QecLV1JrJNQ.jpg'),
    (73,73,'f9XIBbixxmi.jpg'),
    (74,74,'41tZVPYgQmD.jpg'),
    (75,75,'lSxNtdoMqFQ.jpg'),
    (76,76,'OOsEobQ4UtL.jpg'),
    (77,77,'sklc5g3Tn6o.jpg'),
    (78,78,'bYFVyrFIk6c.jpg'),
    (79,79,'nnfrQk6QVRU.jpg'),
    (80,80,'ZjNmRhISWcT.jpg'),
    (81,81,'jxT9TnizMIO.jpg'),
    (82,82,'Q687NQTXXkW.jpg'),
    (83,83,'G8fHMah9SkA.jpg'),
    (84,84,'UDrYQQTrgFM.jpg'),
    (85,85,'LSRoUT289Es.jpg'),
    (86,86,'NrVdMbIRMzn.jpg'),
    (87,87,'Qm4Pz9DDqEQ.jpg'),
    (88,88,'3xM0hFOHTl5.jpg'),
    (89,89,'lzADwE2iO3W.jpg'),
    (90,90,'hCotFd255Yo.jpg'),
    (91,91,'6xhRV3CDEgC.jpg'),
    (92,92,'UAFOwN8LHzX.jpg'),
    (93,93,'gQKLyAuOXph.jpg'),
    (94,94,'62Nfft8gLy0.jpg'),
    (95,95,'eson1rp7uRy.jpg'),
    (96,96,'iQRGJECTzIW.jpg'),
    (97,97,'xEMARrPMloj.jpg'),
    (98,98,'qvbhKJDja5P.jpg'),
    (99,99,'HU6NYj4d18s.jpg'),
    (100,100,'H5jb0Z7rhqK.jpg');


/* roles */
INSERT INTO roles VALUES (1, 'ROLE_ADMIN');
INSERT INTO roles VALUES (2, 'ROLE_CUSTOMER');
INSERT INTO roles VALUES (3, 'ROLE_EDITOR');


/* account
INSERT INTO account(id, username, password)  VALUES (1, 'oldironking', 'oik21');
INSERT INTO account(id, username, password)  VALUES (2, 'fumeknight', 'fkn35');
INSERT INTO account(id, username, password)  VALUES (3, 'mytha', 'mth26');
INSERT INTO account(id, username, password)  VALUES (4, 'skeletonlord', 'sklt56');
INSERT INTO account(id, username, password)  VALUES (5, 'siralonne', 'sal78');
INSERT INTO account(id, username, password)  VALUES (6, 'elana','sin90');
INSERT INTO account(id, username, password)  VALUES (7, 'slumberingdr', 'sbdr67');
INSERT INTO account(id, username, password)  VALUES (8, 'ancientdr', 'acdr91');
INSERT INTO account(id, username, password)  VALUES (9, 'pursuer', 'psr32');
INSERT INTO account(id, username, password)  VALUES (10, 'drrider', 'dri39');
 */

/* account_roles
INSERT INTO accounts_roles VALUES (1, 1);
INSERT INTO accounts_roles VALUES (2, 1);
INSERT INTO accounts_roles VALUES (3, 2);
INSERT INTO accounts_roles VALUES (4, 2);
INSERT INTO accounts_roles VALUES (5, 2);
INSERT INTO accounts_roles VALUES (6, 2);
INSERT INTO accounts_roles VALUES (7, 2);
INSERT INTO accounts_roles VALUES (8, 3);
INSERT INTO accounts_roles VALUES (9, 3);
INSERT INTO accounts_roles VALUES (10, 3);
 */

/* customer */
INSERT INTO customer(customer_id, customer_name, address, phone_number)  VALUES (1, 'Lý Quốc Dũng', '98 Lý Thường Kiệt', '0875768797');
INSERT INTO customer(customer_id, customer_name, address, phone_number)  VALUES (2, 'Nguyễn Phạm Duy Khiêm', '41 Đập Lập', '0802020394');
INSERT INTO customer(customer_id, customer_name, address, phone_number)  VALUES (3, 'Lê Thị Thanh Nhi', '123 Nguyễn Thái Bình', '0889567213');
INSERT INTO customer(customer_id, customer_name, address, phone_number)  VALUES (4, 'Nguyễn Huỳnh Thanh Hải', '67 Cộng Hòa', '0823234561');
INSERT INTO customer(customer_id, customer_name, address, phone_number)  VALUES (5, 'Phạm Nguyễn Quang Lộc', '415 Trường Chinh', '0890902347');


/* store */
INSERT INTO store(store_id, store_name, city_name, address)  VALUES (1, 'Siêu thị Thế Giới Di Động', 'Ho Chi Minh City', '153B Phan Đăng Lưu');
INSERT INTO store(store_id, store_name, city_name, address)  VALUES (2, 'Thế Giới Di Động', 'Ho Chi Minh City', '1 Nguyễn Kiệm');
INSERT INTO store(store_id, store_name, city_name, address)  VALUES (3, 'Siêu thị Thế Giới Di Động (Trung Tâm Laptop)', 'Ho Chi Minh City', '359B Lê Văn Sỹ');
INSERT INTO store(store_id, store_name, city_name, address)  VALUES (4, 'Siêu thị điện thoại Thế Giới Di Động', 'Ho Chi Minh City', '191 Điện Biên Phủ');


/* product_store */
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (1, 1, 40);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (1, 2, 50);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (1, 12, 23);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (1, 16, 34);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (2, 1, 70);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (2, 2, 15);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (2, 3, 12);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (2, 11, 23);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (2, 12, 34);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (3, 1, 22);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (3, 15, 33);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (4, 1, 44);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (4, 8, 47);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (4, 24, 70);
INSERT INTO products_stores(store_id, product_id, in_stock) VALUES (4, 2, 15);




/* orders
INSERT INTO orders(order_id, customer_id, store_id, status, odertype, pay, created_date, ship_date, total) VALUES (1, 1, 1, True, True, True, '2022-08-10 6:10:10', '2022-08-16 10:10:10', 5000000);
INSERT INTO orders(order_id, customer_id, store_id, status, odertype, pay, created_date, ship_date, total) VALUES (2, 3, 1, True, True, True, '2022-08-16 14:29:36', '2022-08-20 14:29:36', 25000000);
INSERT INTO orders(order_id, customer_id, store_id, status, odertype, pay, created_date, ship_date, total) VALUES (3, 4, 2, True, True, True, '2022-08-13 10:10:10', '2022-08-17 11:12:12', 1600000);
INSERT INTO orders(order_id, customer_id, store_id, status, odertype, pay, created_date, ship_date, total) VALUES (4, 5, 5, True, True, True, '2022-08-15 2:1:3', '2022-08-19 3:3:3', 1600000);
INSERT INTO orders(order_id, customer_id, store_id, status, odertype, pay, created_date, ship_date, total) VALUES (4, 2, 3, True, True, True, '2022-08-13 5:6:7', '2022-08-18 8:10:00', 10000000); 
*/
/*order_detail
INSERT INTO order_detail(order_detail_id, order_id, product_id, totalprice, quantity) VALUES (1, 1, 1, 5000000, 1);
INSERT INTO order_detail(order_detail_id, order_id, product_id, totalprice, quantity) VALUES (2, 2, 2, 25000000, 1);
INSERT INTO order_detail(order_detail_id, order_id, product_id, totalprice, quantity) VALUES (3, 3, 3, 1600000, 1);
INSERT INTO order_detail(order_detail_id, order_id, product_id, totalprice, quantity) VALUES (4, 4, 6, 1600000, 1);
INSERT INTO order_detail(order_detail_id, order_id, product_id, totalprice, quantity) VALUES (5, 4, 7, 10000000, 1);
*/


/* promotion */
INSERT INTO promotion(promotion_id, detail, link, exp) VALUES (1, 'Cáp sạc Belkin giảm giá đến 20%, thương hiệu Mỹ bền bỉ, giảm giá hết ý, hốt ngay thôi', 'https://www.thegioididong.com/tin-tuc/cap-sac-belkin-giam-gia-den-20-thuong-hieu-my-1456018', '2022-08-31 0:0:0');
INSERT INTO promotion(promotion_id, detail, link, exp) VALUES (2, 'Đầu tuần sắm liền Xiaomi 11 Lite 5G NE, máy mạnh giá ngon đang giảm tận 500K', 'https://www.thegioididong.com/tin-tuc/dau-tuan-sam-lien-xiaomi-11-lite-5g-ne-may-manh-gia-ngon-1456241', '2022-08-31 0:0:0');
INSERT INTO promotion(promotion_id, detail, link, exp) VALUES (3, 'Săn sale nữa đêm, giảm thêm cực êm: Cơ hội nhận ngay coupon đến 10 triệu', 'https://www.thegioididong.com/tin-tuc/san-sale-nua-dem-giam-them-cuc-em-1456334', '2022-08-21 0:0:0');
INSERT INTO promotion(promotion_id, detail, link, exp) VALUES (4, 'Tablet màn hình rộng, cấu hình cao giảm giá ngon, học tập hay chiến game đều đỉnh', 'https://www.thegioididong.com/tin-tuc/tablet-man-hinh-rong-cau-hinh-cao-giam-gia-me-ly-1455903', '2022-08-17 0:0:0');
INSERT INTO promotion(promotion_id, detail, link, exp) VALUES (5, 'Muốn mua điện thoại Samsung chạy chip Snapdragon mà giá hời thì tìm ở đây!', 'https://www.thegioididong.com/tin-tuc/muon-mua-dien-thoai-samsung-chay-chip-snapdragon-1456243', '2022-08-31 0:0:0');
INSERT INTO promotion(promotion_id, detail, link, exp) VALUES (6, 'Thanh toán qua thẻ tín dụng OCB giảm 500K cho sản phẩm từ 5 triệu, thử ngay thôi!', 'https://www.thegioididong.com/tin-tuc/thanh-toan-qua-the-tin-dung-ocb-giam-500k-cho-sp-tu-5-trieu-1443667', '2023-02-15 0:0:0');

/*products promotions*/
INSERT INTO products_promotions(product_id,promotion_id) VALUES(1,1);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(1,2);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(1,3);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(1,5);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(2,1);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(3,1);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(4,1);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(2,6);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(2,5);
INSERT INTO products_promotions(product_id,promotion_id) VALUES(3,6);