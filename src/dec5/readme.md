##    Recap 


Thursday : 
Database 

Relational Database 
mysql vs SQL 


=== 

create database pragra;

show databases ;

use Employee;

-- to fetch all the data from a given table
select * from EMPLOYEE;

-- to fetch specific columns
select EMPLOYEE_ID, EMPLOYEE_NAME from EMPLOYEE;


-- fetch data from titles table
select * from TITLES;

-- fetch all the employees from Canada
select EMPLOYEE_NAME from EMPLOYEE
where EMPLOYEE_ADDRESS = 'Canada';

-- fetch the employee id , name, gender who is from Japan

select EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEE_GENDER, EMPLOYEE_ADDRESS
from EMPLOYEE
where EMPLOYEE_ADDRESS = 'JAPAN';



-- fetch people from Japan and Name John
-- AND and OR


select *
from EMPLOYEE
where EMPLOYEE_NAME = 'John' AND EMPLOYEE_ADDRESS = 'Japan';

select *
from EMPLOYEE
where EMPLOYEE_NAME = 'John' OR EMPLOYEE_ADDRESS = 'Japan';

-- NOT

select *
from EMPLOYEE where NOT EMPLOYEE_ADDRESS = 'Japan';



select *
from EMPLOYEE;

-- Date Dec 5 2024


-- Create a table , name email password field


show databases ;

use pragra2024;

show tables ;


create table Person(
Name varchar(255),
email varchar(255),
password varchar(255)
) ;


insert into Person(Name, email , password)
value ('Gagan', 'gagan@gmail.com','67234512678');
insert into Person(Name, email , password)
value ('Regina', 'abc@gmail.com','67234512678');

select * from Person;




-- update
update Person
set id = '101'
where email = 'gagan@gmail.com';

-- add another column
ALTER table Person add id varchar(255);


-- Primary key
-- Unique, cannot contain a null value and
-- one table can only have 1 primary key
-- Unique

-- Product

show tables ;

create table Product (
id int PRIMARY KEY ,
name varchar(255),
price double,
description varchar(255),
sku varchar(255) UNIQUE
);

select *
from Product;



desc Product;

insert into Product (id, name, price, description, sku)
values (101, 'Laptop', 1200.122, 'Intel core inside', 'SKU12343' );


insert into Product (id, name, price, description, sku)
values (2201121, 'Laptop', 1200.122, 'Intel core inside','');



-- Check constraint

create table Candidate(
id int primary key auto_increment,
name varchar(255),
age int
CHECK ( AGE > 16 )
);

insert into Candidate( name, age)
values ('Mark',14);

select *
from Candidate;

desc Person;


# SELECT INFORMATION
# FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
# WHERE TABLE_NAME='Candidate';
#
# SELECT constraint_name, constraint_type, status
# FROM user_constraints
# WHERE table_name = 'Product';
#
#
# show tables ;
#
# SELECT * FROM all_constraints WHERE Table_Name = 'Candidate';


-- Functions


show tables ;

show databases ;
use Employee;

select *
from EMPLOYEE;


-- max
select EMPLOYEE_NAME , MAX(EMPLOYEE_SALARY) from EMPLOYEE;

-- min
select EMPLOYEE_NAME , MIN(EMPLOYEE_SALARY) from EMPLOYEE;

-- how many employees are from Canada
-- how many employees with salary greater than 50K

-- COUNT

select count(EMPLOYEE_SALARY) from EMPLOYEE
where EMPLOYEE_SALARY > 30000 AND EMPLOYEE_SALARY < 60000;

-- SUM
select SUM(EMPLOYEE_SALARY) from EMPLOYEE;

-- AVG




-- Interview questions
-- joins , count , sub query

--
select EMPLOYEE_NAME , MAX(EMPLOYEE_SALARY) from EMPLOYEE;
select *
from EMPLOYEE;


select EMPLOYEE_NAME, MAX(EMPLOYEE_SALARY) as second_max_salary
from EMPLOYEE
where EMPLOYEE_SALARY < (select MAX(EMPLOYEE_SALARY) from EMPLOYEE);


select distinct EMPLOYEE_SALARY
from EMPLOYEE
ORDER BY
EMPLOYEE_SALARY DESC
Limit 3;


-- JOINS
/*
Inner Join
Left Join
Right Join
Full Join



*/

-- Inner join

select *
from EMPLOYEE;


select *
from SALARY;






select e.EMPLOYEE_NAME , s.FROM_DATE

from EMPLOYEE e
INNER JOIN
SALARY s
ON
e.EMPLOYEE_ID = s.EMPLOYEE_ID;


-- LEFT JOIN
select e.EMPLOYEE_NAME , s.FROM_DATE

from EMPLOYEE e
LEFT JOIN
SALARY s
ON
e.EMPLOYEE_ID = s.EMPLOYEE_ID;

-- RIGHT JOIN
select e.EMPLOYEE_NAME , s.FROM_DATE

from EMPLOYEE e
RIGHT JOIN
SALARY s
ON
e.EMPLOYEE_ID = s.EMPLOYEE_ID;

select e.EMPLOYEE_NAME , s.FROM_DATE

from EMPLOYEE e
RIGHT JOIN
SALARY s
ON
e.EMPLOYEE_ID = s.EMPLOYEE_ID;































