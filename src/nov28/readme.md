## Recap 

AWS 
Cloud 



Ec2 ? 

S3

docker ? 
ECS ? 
container? 

## Assignment 
find the all alternative services available on AWS, GCP and Azure 

AWS                 GCP                 Azure 

EC2 
S3 
ECS 
EKS 




RDS  - Relational Database Service /  
relational , rows and columns / SQL 



Dynamo DB --- No SQL 
MongoDB 


## Database ? 

store the information 
store your data

-- that stores the data in form of rows and columns 
## Name            Course              Address             Email                Name 
Elden               Java                Toronto         elden@gmail.coomn       Elden
Varun               Java                Mississauga         elden@gmail.coomn   Varun
Yaksh               Java                Toronto         yaksh@gmail.coomn       Yaksh
Robin              react               Brampton          elden@gmail.coomn     Robin


1. Structured 
2. Relationships 
3. Primary Key 
4. Foreign Key 
5. Normalization - reduce the redundancy of data 



MySQL ?   -   
SQL   - Language 

Mysql sever - Client 




Postgres
MS SQL 
Oracle 
SQlite 


Snowflake 
Google Big Query 




=========================================
SQL queries 



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




















