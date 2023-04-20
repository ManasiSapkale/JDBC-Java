create database studentMs;

show databases;

use studentMs;

create table studentMs(sno int primary key,sname varchar(50),sclass varchar(20),smarks int);

desc studentMs;

insert into studentMs values(1,"manu","IT","82.04");
insert into studentMs values(2,"vish","Micro","76.01");
insert into studentMs values(3,"ajay","Cs","70.09");

select * from studentMS;