create table lianxi(
id varchar2(255),
name varchar2(255),
salary number(10,2),
dept_no number,
address varchar2(255)
)


alter table lianxi add ganwei varchar2(255);


select COUNT(*),dept_no from lianxi group by dept_no;

select COUNT(*),dept_no from lianxi group by dept_no having count(*)>1;

select distinct ganwei from lianxi;

select  t.*, rowid from lianxi t; 
