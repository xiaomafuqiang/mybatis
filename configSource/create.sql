drop database if exists mybatis;
create database mybatis;
use mybatis;
create  table tb1_employee
(
id int(11) primary key auto_increment,
email varchar(255),
last_name varchar(144),
gender varchar (11)
);
insert into tb1_employee (id, email, last_name, gender) values(null, 'mafuqiang@outlook.com', 'xiaoma', 'M');
