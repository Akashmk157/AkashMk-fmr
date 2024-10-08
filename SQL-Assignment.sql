--created table and added default country, custID to primary key
create table tblCustomers(
CustomerID int primary key,
CompanyName varchar(50),
Address varchar(50),
city varchar(50),
Country varchar(50) default 'canada'
);
insert into tblCustomers values(11, 'Hp', 'Nt cross', 'chennai');
select * from tblCustomers;


--created table and added company name to unique, shipperid to primary key
create table tblShippers(
ShipperID int primary key,
CompanyName varchar(40) unique
);
insert into tblShippers values(10, 'sony');
insert into tblShippers values(20, 'sony');


--created table and added primary key to ProductID
create table tblProducts(
ProductID int primary key,
ProductName varchar(50),
QuantityPerUnit int,
UnitPrice int
);
insert into tblProducts values(221, 'Zoomx', 200, 20000);
select * from tblProducts;

--created table and added check for date, foreign key to CustomerID
create table tblOrders(
OrderId int primary key,
CustomerId int,
ShipName varchar(50),
OrderDate date,
ShippedDate date
);
alter table  tblOrders add constraint chk_ShippedDate check (ShippedDate > OrderDate);
alter table tblOrders add constraint fCustomerID foreign key(CustomerId) references tblCustomers(CustomerID);

insert into tblOrders values(333, 11, 'titan', '2024-04-03', '2024-03-03');  -- check violation
select * from tblorders;

--created table and added check condition for quantity , foreign keys to orderid, productid
create table tblOrderDetails(
OrderId int,
ProductID int,
UnitPrize int,
Quantity int
);

alter table  tblOrderDetails add constraint chk_Quantity check (Quantity>10);

alter table tblOrderDetails add constraint forderID foreign key(OrderID) references tblOrders(OrderID);
alter table tblOrderDetails add constraint fProductId foreign key(ProductID) references tblProducts(ProductID);
insert into tblOrderDetails values(333, 221, 20000, 9); -- check quanity violation
select * from tblOrderDetails;
