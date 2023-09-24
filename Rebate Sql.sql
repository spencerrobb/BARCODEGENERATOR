use rebatesystem;

create table tbl_barcode4j_ean13(
	 barid varchar(30) not null
);

drop table tbl_barcode;
select * from tbl_barcode4j_ean13;
truncate table tbl_barcode4j_ean13;

-- 323456789121
-- 923456789123
-- 523456789122
-- 723456789177
-- 423456789198
-- 323456785109
-- 423456789100
-- 223456789164
-- 123456789100
-- 213456789464
alter table tbl_product modify column prod_price float(53);
truncate table tbl_barcode;
truncate table tbl_product;
drop table tbl_product;
drop table tbl_barcode;
show tables;
select * from tbl_barcode;
select * from tbl_product;

insert into tbl_product values (1,'323456789121',100,'treat mild to moderate pain','isobutylphenylpropionic acid','ibuprofen',5.25);
insert into tbl_product values (2,'923456789123',100,'used to relieve mild to moderate pain such as headache, backache','paracetamol','Biogesic',5.24);
insert into tbl_product values (3,'523456789122',100,'It is used for the relief of clogged nose, runny nose, postnasal drip, itchy and watery eyes, sneezing, headache, body aches and fever associated with the common cold and other minor respiratory tract infections','Phenylephrine HCI + Chlorphenamine Maleate + Paracetamol','Bioflu',6.23);
insert into tbl_product values (4,'723456789177',100,'This medicine is used for the relief of clogged nose, post nasal drip, headache,','Phenylephrine HCl, Chlorphenamine Maleate','Neozep',4.26);
insert into tbl_product values (5,'423456789198',100,'prevention and supplementation of people at risk of deficiency of vitamins B, C, calcium and magnesium','multivitamin product','Berocca',10.25);
insert into tbl_product values (6,'323456785109',100,'It is widely known as the active ingredient for prescription pain relievers.','homatropine','Hydrocodone',30.89);
insert into tbl_product values (7,'423456789100',100,'used to treat type 2 diabetes and even prevent it if someone is at a high risk of developing the disease by lowering blood sugar levels.','Glucophage XR','Metformin',76.2);
insert into tbl_product values (8,'223456789164',100,'to treat high blood pressure by blocking a substance in the body that causes the blood vessels to tighten','Losartan potassium','Losartan',80.13);
insert into tbl_product values (9,'123456789100',100,'prevents and treats breathing difficulties, wheezing, coughing, and other related conditions caused by lung diseases like asthma','Albuterol sulfate','Albuterol',35.36);
insert into tbl_product values (10,'213456789464',100,'used to treat allergies and symptoms such as sneezing and rashes','chlorpheniramine','Antihistamines',77.20);

insert into tbl_barcode values (323456789121, '13chars','ean13','barbecue');
insert into tbl_barcode values (923456789123, '13chars','ean13','barbecue');
insert into tbl_barcode values (523456789122, '13chars','ean13','barbecue');
insert into tbl_barcode values (723456789177, '13chars','ean13','barbecue');
insert into tbl_barcode values (423456789198, '13chars','ean13','barbecue');
insert into tbl_barcode values (323456785109, '13chars','ean13','barbecue');
insert into tbl_barcode values (423456789100, '13chars','ean13','barbecue');
insert into tbl_barcode values (223456789164, '13chars','ean13','barbecue');
insert into tbl_barcode values (123456789100, '13chars','ean13','barbecue');
insert into tbl_barcode values (213456789464, '13chars','ean13','barbecue');

select * from tbl_product tp join tbl_barcode tb on tp.bar_id = tb.id;
select count(id) from tbl_barcode;

-- select a product based on barcode id 
select bar_id, prod_name, prod_med_name, prod_item_count from tbl_product tbp join tbl_barcode tbb on  tbp.bar_id = tbb.id where tbb.id = '323456789121';
-- update item count of product
update tbl_product set prod_item_count = '100' where bar_id = '323456789121';