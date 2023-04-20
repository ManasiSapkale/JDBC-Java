create database Sample;

use Sample;

create table mobile(mobileid int primary key, mobileName varchar(20), mobilePrice int);

desc mobile;

insert into mobile values(1, "Oneplus 11R", "39000");
insert into mobile values(2, "Oneplus 9RT", "42000");
insert into mobile values(3, "Oneplus 7T", "38000");

select * from mobile;