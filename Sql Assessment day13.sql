create table Worker(
worker_Id int primary key,
first_Name varchar(30),
last_Name varchar(30),
salary int,
joining_Date date,
department varchar(30)
);

create table Title(
worker_Ref_Id int,
worker_title varchar(30),
affected_from date,
foreign key(worker_Ref_Id) references Worker(worker_Id)
);

create table Bonus(
worker_Ref_Id int,
bonus_Amount int,
bonus_date date,
foreign key(worker_Ref_Id) references Worker(worker_Id) 
);

insert into Worker values(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetiks', 'Chauhan', 90000, '2011-04-14', 'Admin');

select * from Worker;

insert into Bonus values(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');

select * from Bonus;

insert into Title values(1, 'manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst.manager', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');

select * from title;


--Write a query to display the firstname, salary and title for all workers
select w.first_Name, w.salary, t.worker_title
from Worker w
Join Title t on w.worker_Id = t.worker_Ref_Id;


--Write a plpgsql function to display the count of worker(s) based on the nth highestsalary.
select get_worker_count_by_nth_highest_salary(1);

create function get_worker_count_by_nth_highest_salary(nth integer)
returns integer as $$
declare 
	NthSalary numeric;
	worker_count integer;
begin
	select distinct salary into NthSalary
	from Worker
	order by salary desc limit 1 offset nth-1;

	if NthSalary is null then
		return 0;
	end if;

	select count(*) into worker_count
	from Worker
	where salary = NthSalary;

	return worker_count;
end;
$$ language plpgsql





