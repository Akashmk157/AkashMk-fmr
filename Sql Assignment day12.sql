create table customers(
customer_id varchar(10) primary key,
customer_name varchar(20),
address varchar(20),
phone_no bigint,
email_id varchar(20)
);

insert into customers(customer_id, customer_name, address, phone_no, email_id)
values('cust1001', 'thomas', 'kochi', 9856325486, 'thomas@gmail.com'),
('cust1002', 'charles', 'allepy', 9856367486, 'charles@gmail.com'),
('cust1003', 'sudhakhar', 'kochi', 9856323453, 'sudhakhar@gmail.com'),
('cust1004', 'jagadish', 'ernakulam', 9856348976, 'ernakulam@gmail.com');

insert into Hotel_details(hotel_id,hotel_name,hotel_type,hotel_rating)
values(1, 'udai', 'veg', 6),
(2, 'honey', 'nonVeg', 5),
(3, 'kfc', 'veg', 6),
(4, 'hutCafe', 'nonveg', 7);

insert into orders values
(1, 'cust1001', 1, '112', '2020-05-10', 600),
(2, 'cust1002', 2, '113', '2020-07-11', 750);
select * from orders;
insert into orders values
(3, 'cust1001', 1, '112', '2020-05-10', 600),
(4, 'cust1002', 2, '113', '2020-07-11', 750),
(5, 'cust1001', 1, '112', '2020-05-10', 600),
(6, 'cust1002', 2, '113', '2020-07-11', 750);


create table delivery_partners(
partner_id varchar(10) primary key,
partner_name varchar(20),
phone_no bigint,
rating int
);
insert into delivery_partners values('112', 'dhl', 888999, 4);
insert into delivery_partners values('113', 'blue', 999222, 5);


select * from delivery_partners;


create table hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20),
hotel_type varchar(20),
rating int
);

create table orders(
order_id varchar(10) primary key,
customer_id varchar(10),
hotel_id varchar(10),
partner_id varchar(10),
order_date date,
order_amount int,
foreign key(customer_id) references customers(customer_id),
foreign key(hotel_id) references hotel_details(hotel_id),
foreign key(partner_id) references delivery_partners(partner_id)
);


--Delivery Partner details based on rating
select partner_id, partner_name, phone_no from delivery_partners where rating between 3 and 5
order by partner_id;

--Hunger eats - update table
select * from customers;
update customers set phone_no = 9876543210 where customer_id = 'cust1004';

--Customers having gmail id
select customer_id, customer_name, address, phone_no
from customers
where email_id like '%@gmail.com'
order by customer_id;

--Hunger eats - change datatype
alter table customers alter customer_id type int using customer_id::integer;

--Hunger eats - Change the field name
alter table hotel_details rename column rating to hotel_rating;
select * from hotel_details;

--Hotel_info
select concat(hotel_name, ' is a ', hotel_type, ' hotel') AS hotel_info
from Hotel_details
order by hotel_info desc;

--Hotels that took order more than five times
select h.hotel_id, h.hotel_name, count(*) as noOFOrders
from Hotel_details h
join Orders o on h.hotel_id = o.hotel_id
group by h.hotel_id, h.hotel_name
having count(*) > 5
order by  h.hotel_id asc;

-- Hotels not taken orders in a specific month
select distinct h.hotel_id, h.hotel_name, h.hotel_type
from Hotel_details h
left join Orders o on h.hotel_id = o.hotel_id and TO_CHAR(o.order_date, 'YYYY-MM') = '2020-05'
where o.order_id is null
order by h.hotel_id asc;

--Order details
select o.order_id, c.customer_name, h.hotel_name, o.order_amount
from Orders o
join Customers c on o.customer_id = c.customer_id
join Hotel_details h on o.hotel_id = h.hotel_id
order by o.order_id asc;


--Pizza Store - Update PIZZA

create table pizza(
pizza_id varchar(10) primary key,
customer_id varchar(10),
partner_id varchar(10),
pizza_name varchar(20),
pizza_type varchar(20),
amount int,
foreign key(customer_id) references customers(customer_id),
foreign key(partner_id) references delivery_partners(partner_id)
);

insert into pizza values(1, 'cust1001', '112', 'chicken pizza', 'extralarge', 200);
insert into pizza values(2, 'cust1002', '113', 'veg pizza', 'large', 400);

update pizza
set amount = amount * 0.97
where pizza_type = 'extralarge';

select * from pizza;

