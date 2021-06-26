drop table if exists product_stock;

create table product_stock(
	id int auto_increment primary key,
	product_name varchar(250),
	product_price long(50),
	product_availability varchar(250),
	product_discountoffer int(50)

);

insert into product_stock(id, product_name, product_price, product_availability, product_discountoffer) values (1001,'bat',5000,'yes',20);
insert into product_stock(id, product_name, product_price, product_availability, product_discountoffer) values (1002,'tv',39000,'yes',12);
insert into product_stock(id, product_name, product_price, product_availability, product_discountoffer) values (1003,'system',89000,'yes',18);