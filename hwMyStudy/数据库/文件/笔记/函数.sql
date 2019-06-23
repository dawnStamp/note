--字符函数
select lower(name) from student;--全部转换成小写
select upper(name) from student;--全部转换成大写
select initcap(name) from student;--首字母大写，其他字母小写
select concat(name,'ttt') from student;--字符串的连接
select substr(name,1,2) from student;--字符串的截取
select length(name) from student;--字符串的长度
select nvl(name,'iii') from student;--空值置换

--数值函数
select round(age,-2) from student;--截取，四舍五入
select trunc(age,-2) from student;--截取，不进行四舍五入

select mod(10,3) from student;--取余


--日期函数
select months_between(month,day) from student;--两个日期之间的月数
select add_months(month,2) from student;               --在指定日期上增加月数
select  next_day(month,'星期五') from student;         --指定日期的下一天是哪天
select last_day(month) from student;                           --指定日期的最后一天
select round(month,'year') from student;                      --对指定日期进行四舍五入，逢16日往月份进1,逢7月往年份进一
select trunc(month,'month') from student;                  --对指定日期进行截取

--转换函数
select to_char(sysdate,'yyyy-MM-dd hh:mi:ss') from student;                  --将日期转换成字符串
select to_number('666') from dual;                  --将数值字符串转换成数值
insert into student(month) values(to_char('22-12月-2018'));             --将日期字符串转换成字符串




--组函数
select AVG(age) from student;--求列的平均值

select COUNT(age) from student;--统计行数

select MAX(age) from student;--求列的最大值

select MIN(age) from student;--求列的最小值

select SUM(age) from student;--求列的总和

--group by
select sum(age) from student  group by  tea_id  order  by sum(age);--分组排序

select name,age,id from student group by name,id,age ;

select tea_id,sum(age) from student group by age,tea_id ;



select  t.*, rowid from student t; 
 
