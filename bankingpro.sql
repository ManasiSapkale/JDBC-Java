create database bankingpro;

use bankingpro;

create table customer(cusid int primary key, cusname varchar(20),cuspin int, cusamount int);

desc customer;

select * from customer;