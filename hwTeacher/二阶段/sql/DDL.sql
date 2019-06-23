--����
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

--����ʱ���Լ��
create table stu(
id varchar2(255) constraint aaaaa primary key,
name varchar2(255) constraint bbbbb unique,
age number default 10 constraint ccccc not null,
sex number(1) constraint ddddd check(sex<10),
tea_id varchar2(10) constraint eeeee references teacher(id)
)

--ɾ����
drop table stu;

--�޸ı�ṹ
--������
alter table stu add xxx number;

--ɾ����
alter table stu drop column xxx;

--�޸�������
alter table stu rename column sex to sexxx;

--�޸ı�����
alter table stu rename to stuuu;

--�޸�������
alter table stuuu modify name number;

--�����֮�����Լ��
--����Լ��
alter table student add constraint xxx primary key(id);

--���Լ��
alter table student add constraint cxcc check(name<20);

--
truncate table student;

