┌──(student㉿kali)-[~]
└─$ su postgres
Password: 
su: Authentication failure

┌──(student㉿kali)-[~]
└─$ su postpres
su: user postpres does not exist or the user entry does not contain all the required fields

┌──(student㉿kali)-[~]
└─$ su postgres
Password: 
postgres@kali:/home/student$ psql
psql (14.4 (Debian 14.4-1+b1), server 13.4 (Debian 13.4-3))
Type "help" for help.

postgres=# create database sycyber09;
CREATE DATABASE
postgres=# \c sycyber09;
psql (14.4 (Debian 14.4-1+b1), server 13.4 (Debian 13.4-3))
You are now connected to database "sycyber09" as user "postgres".
sycyber09=# create table course(id int, primary key, cname varchar(30), instructur varchar(30)); 
ERROR:  syntax error at or near ","
LINE 1: create table course(id int, primary key, cname varchar(30), ...
                                               ^
sycyber09=# create table course(id int primary key, cname varchar(30), instructur varchar(30)); 
CREATE TABLE
sycyber09=# create table student(id int primary key, sname varchar(30));
CREATE TABLE
sycyber09=# select * from student;
 id | sname 
----+-------
(0 rows)

sycyber09=# select * from course;
 id | cname | instructur 
----+-------+------------
(0 rows)

sycyber09=# insert into course values(1,'Fycyber','Shilpa mam');
INSERT 0 1
sycyber09=# insert into course values(2,'Sycyber','Ninad Sir');
INSERT 0 1
sycyber09=# insert into student values(1,'Abhishek');
INSERT 0 1
sycyber09=# insert into student values(1,'Akash');
ERROR:  duplicate key value violates unique constraint "student_pkey"
DETAIL:  Key (id)=(1) already exists.
sycyber09=# insert into student values(2,'Akash');
INSERT 0 1
sycyber09=# select * from course
sycyber09-# ^C
sycyber09=# select * from course;
 id |  cname  | instructur 
----+---------+------------
  1 | Fycyber | Shilpa mam
  2 | Sycyber | Ninad Sir
(2 rows)

sycyber09=# select * from student;
 id |  sname   
----+----------
  1 | Abhishek
  2 | Akash
(2 rows)

sycyber09=# insert into student values(1,'Akash');
ERROR:  duplicate key value violates unique constraint "student_pkey"
DETAIL:  Key (id)=(1) already exists.
sycyber09=# 


