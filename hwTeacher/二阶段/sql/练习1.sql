create table emp(--Ա����
id varchar2(255) primary key,--����id
name varchar2(255),--����
salary number(10,2),--����
dept_no number,--���ű��
address varchar2(255)--��ַ
)

select t.*,rowid from emp t;

--��ϰ1����ѯ���ű��Ϊ5��Ա����ÿ�µĹ����ܺ��Լ�ƽ�����ʡ�
select sum(salary),avg(salary) from emp where dept_no = 5;

--��ϰ2����ѯ���ϲ�������Ա����������߹����Լ���͹��ʡ�
select MAX(salary),MIN(salary) from emp where address = '�ϲ�';

--��ϰ3��ͳ��ÿ�����ŵ�Ա������
select dept_no,count(*) from emp group by dept_no;

--��ϰ4���г�������2��Ա�������в���
select dept_no,count(*) from emp group by dept_no having count(*)>1;

--��ϰ5����ѯԱ������һ���м��ָ�λ����
alter table emp add job varchar2(255);
update emp set job = 'ǰ̨��ֽ' where id in('2','6');
select distinct job from emp;

--��ϰ6���г���ÿ�����Ź�����Ա��������ƽ�����ʺ�ƽ����������
alter table emp add starttime date;
update emp set starttime = '12-3��-17' where id in('3','6');

select dept_no,count(*),avg(salary),trunc(avg(months_between(sysdate,starttime))/12,1) from emp group by dept_no;

--��ϰ7���г��������ŵľ�������н��һ�����Ŷ������������
select dept_no,min(salary) from emp where job = 'ҵ����' group by dept_no;
