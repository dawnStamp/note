
select lower(hhh) from student;
select upper(hhh) from student;


select t.*,nvl(tea_id,'aaaaa') from student t;

select substr('abcdefg',1,3) from student;

select t.*,rowid from student t;


select round(age,1) from student;

select mod(age,3) from student;


--日期函数
--months_between
select months_between(date1,date2) from student;

--add_months
select add_months(date1,2) from student;

--next_day
select next_day(date1,'星期五') from student;

--last_day
select last_day(date1) from student;

--round
select round(date1,'year') from student;

--trunc
select trunc(date1,'year') from student;

--转换函数
--to_char
select to_char(date1,'yyyy-mm-dd hh24:mi:ss') from student;

--to_number
select to_number('123132') from dual;

--to_date
insert into student(date1) values(to_char('22-12月-18'));




select t.*,rowid from student t;
