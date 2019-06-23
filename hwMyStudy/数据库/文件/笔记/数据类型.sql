select sysdate from dual;
select user from dual;


select  t.*,rowid from tea  t;

insert  into  tea(kkk,iii) values(sysdate,sysdate);

create table teacher(
id   varchar2(10),
name  varchar2(255),
age  number,
salary  number(6,2)
)

create table student(
id varchar2(10),
name varchar2(255),
age number,
tea_id varchar2(10)
)

select  t.*,rowid from teacher  t;
select  t.*,rowid from student  t;

-------------------------------------------------------------------------
--建表时添加约束

create table stu(
id varchar2(255)    constraint   aaaaa   primary key,
name varchar2(255)   constraint bbbbb  unique ,
age number   default  10   constraint ccccc  not null  ,
sex number(1)    constraint ddddd   check(sex<10),
tea_id varchar2(10)    constraint eeeee   references teacher(id)
)

--删除表
drop table stu;

--新增列
alter table stu add nnnnn number;

--删除列
alter table stu  drop column nnnnn;

--修改列名称
alter table stu  rename column nnnnn to ooooo;

--修改表名称
alter table shuju  rename to stu;

--修改列类型
alter table stu modify  ooooo  date;     

--建表之后添加约束

--主键约束
alter   table stu add constraint liu primary  key(ooooo);      

--检查约束
alter   table stu add constraint liu check(age<40); 

--非空约束
alter   table stu modify ooooo not null;   

--唯一约束
alter table stu add unique(ooooo);

--外键约束                                                                                                                                                                                                                                                         
alter table student add foreign key(tea_id) references teacher(id);


--清空表数据
truncate  table  T_USER;
select  t.*,rowid from  T_USER  t;


--select  语句 （查询）
select id,name,age,tea_id from student;--按照表中列名来查找

select * from student where;--使用通配符 * 查找表中所有列

select * from student where id=1;--使用 where 查找单个列数据

select * from student where id in(1,2); --使用 i n 查询单个值数据

select * from student where age like '1%';--使用 like 模糊查询       --第一个数是1就能被查询到
select * from student where age like '%1';--使用 like 模糊查询       --最后一个数是1就能被查询到
select * from student where age like '%1%';--使用 like 模糊查询    -- 只要出现了1就能被查询到    
        
select * from student where age between 18 and 20;  --使用like取符合两个值之间的数据，包含起始值和结束值

select * from student where id>=1 and id<= 2;--逻辑运算符  and
select * from student where id=1 or id= 2;--逻辑运算符  or

select distinct * from student;--distinct 清除重复
select distinct  name,age  from student;--distinct 清除重复

select * from student where name='张'||'三';--双 || 拼接字符串

--order by 排序
select * from student order by age desc;

select * from student order by age ,id desc;

select * from student order by 1;
       
--可以手动往表中添加数据
select t.*, rowid from student t;
