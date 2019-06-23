--建表
create table teacher(
id varchar2(10),
name varchar2(255),
age number,
salary number(6,2)
)

create table student(
id varchar2(10),
name varchar2(255),
age number,
tea_id varchar2(10)
)
---------------------------------------------------------------------
select * from student;

--建表时添加约束
create table stu(
id varchar2(255) constraint aaaaa primary key,
name varchar2(255) constraint bbbbb unique,
age number default 10 constraint ccccc not null,
sex number(1) constraint ddddd check(sex<10),
tea_id varchar2(10) constraint eeeee references teacher(id)
)

--删除表
drop table stu;

--修改表结构
--新增列
alter table stu add xxx number;

--删除列
alter table stu drop column xxx;

--修改列名称
alter table stu rename column sex to sexxx;

--修改表名称
alter table stu rename to stuuu;

--修改列类型
alter table stuuu modify name number;

--建完表之后添加约束
--主键约束
alter table student add constraint xxx primary key(id);

--检查约束
alter table student add constraint cxcc check(name<20);

--
truncate table student;

