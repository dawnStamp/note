--�ַ�����
select lower(name) from student;--ȫ��ת����Сд
select upper(name) from student;--ȫ��ת���ɴ�д
select initcap(name) from student;--����ĸ��д��������ĸСд
select concat(name,'ttt') from student;--�ַ���������
select substr(name,1,2) from student;--�ַ����Ľ�ȡ
select length(name) from student;--�ַ����ĳ���
select nvl(name,'iii') from student;--��ֵ�û�

--��ֵ����
select round(age,-2) from student;--��ȡ����������
select trunc(age,-2) from student;--��ȡ����������������

select mod(10,3) from student;--ȡ��


--���ں���
select months_between(month,day) from student;--��������֮�������
select add_months(month,2) from student;               --��ָ����������������
select  next_day(month,'������') from student;         --ָ�����ڵ���һ��������
select last_day(month) from student;                           --ָ�����ڵ����һ��
select round(month,'year') from student;                      --��ָ�����ڽ����������룬��16�����·ݽ�1,��7������ݽ�һ
select trunc(month,'month') from student;                  --��ָ�����ڽ��н�ȡ

--ת������
select to_char(sysdate,'yyyy-MM-dd hh:mi:ss') from student;                  --������ת�����ַ���
select to_number('666') from dual;                  --����ֵ�ַ���ת������ֵ
insert into student(month) values(to_char('22-12��-2018'));             --�������ַ���ת�����ַ���




--�麯��
select AVG(age) from student;--���е�ƽ��ֵ

select COUNT(age) from student;--ͳ������

select MAX(age) from student;--���е����ֵ

select MIN(age) from student;--���е���Сֵ

select SUM(age) from student;--���е��ܺ�

--group by
select sum(age) from student  group by  tea_id  order  by sum(age);--��������

select name,age,id from student group by name,id,age ;

select tea_id,sum(age) from student group by age,tea_id ;



select  t.*, rowid from student t; 
 
