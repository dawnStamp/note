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
--����ʱ���Լ��

create table stu(
id varchar2(255)    constraint   aaaaa   primary key,
name varchar2(255)   constraint bbbbb  unique ,
age number   default  10   constraint ccccc  not null  ,
sex number(1)    constraint ddddd   check(sex<10),
tea_id varchar2(10)    constraint eeeee   references teacher(id)
)

--ɾ����
drop table stu;

--������
alter table stu add nnnnn number;

--ɾ����
alter table stu  drop column nnnnn;

--�޸�������
alter table stu  rename column nnnnn to ooooo;

--�޸ı�����
alter table shuju  rename to stu;

--�޸�������
alter table stu modify  ooooo  date;     

--����֮�����Լ��

--����Լ��
alter   table stu add constraint liu primary  key(ooooo);      

--���Լ��
alter   table stu add constraint liu check(age<40); 

--�ǿ�Լ��
alter   table stu modify ooooo not null;   

--ΨһԼ��
alter table stu add unique(ooooo);

--���Լ��                                                                                                                                                                                                                                                         
alter table student add foreign key(tea_id) references teacher(id);


--��ձ�����
truncate  table  T_USER;
select  t.*,rowid from  T_USER  t;


--select  ��� ����ѯ��
select id,name,age,tea_id from student;--���ձ�������������

select * from student where;--ʹ��ͨ��� * ���ұ���������

select * from student where id=1;--ʹ�� where ���ҵ���������

select * from student where id in(1,2); --ʹ�� i n ��ѯ����ֵ����

select * from student where age like '1%';--ʹ�� like ģ����ѯ       --��һ������1���ܱ���ѯ��
select * from student where age like '%1';--ʹ�� like ģ����ѯ       --���һ������1���ܱ���ѯ��
select * from student where age like '%1%';--ʹ�� like ģ����ѯ    -- ֻҪ������1���ܱ���ѯ��    
        
select * from student where age between 18 and 20;  --ʹ��likeȡ��������ֵ֮������ݣ�������ʼֵ�ͽ���ֵ

select * from student where id>=1 and id<= 2;--�߼������  and
select * from student where id=1 or id= 2;--�߼������  or

select distinct * from student;--distinct ����ظ�
select distinct  name,age  from student;--distinct ����ظ�

select * from student where name='��'||'��';--˫ || ƴ���ַ���

--order by ����
select * from student order by age desc;

select * from student order by age ,id desc;

select * from student order by 1;
       
--�����ֶ��������������
select t.*, rowid from student t;
