select t.*,rowid from teacher t;

select * from student;

--�ȼ�����
select * from student stu,teacher tea,emp e
where stu.tea_id = tea.id
and tea.id = e.id
and stu.name = '����';

--������
--������
select * from student s,teacher t
where s.tea_id =t.id(+);

select * from student s 
left join teacher t on s.tea_id = t.id
where s.name='����';

--������
select * from student s,teacher t
where s.tea_id(+)=t.id;

--������
select * from student s
inner join teacher t on s.tea_id = t.id;

--ȫ����
select s.*,t.name from student s
full outer join teacher t on s.tea_id = t.id;

select * from emp;

--��ѯԱ����ȫ����Ϣ����չʾԱ��������������
create table dept(
id varchar2(255),
name varchar2(255)
)

select t.*,rowid from emp t;

select e.*,d.name from emp e left join dept d on e.dept_no = d.id;

--�г�����Ա���������Լ���ֱ���ϼ�������
select e.id,e.name,p.leader_id,p.name from emp p
left join emp e on p.leader_id = e.id;

select t.*,rowid from dept t;

--�г���ְ���ڱ��ϼ���Ҫ�������Ա���ı�š���������������
select e.id,e.name,d.name from emp e,emp p,dept d--e Ա��    p �쵼
where e.leader_id = p.id
and e.starttime < p.starttime
and e.dept_no = d.id;


select * from emp e,emp p,dept d
where e.leader_id = p.id--ȷ��Ա��֮����쵼��ϵ
and e.starttime < p.starttime
and e.dept_no = d.id;

select * from emp where leader_id <> '1';

is not null  �жϲ�Ϊ��
<>           ������

--�����

select * from emp 
union all
select * from emp;

select t.*,rowid from dept t;
select t.*,rowid from emp t;

--��������
create table depp
as
select * from dept;

select * from depp;


select * from dept
minus
select * from depp;


--�Ӳ�ѯ
--չʾ������ͬ��Ա����Ϣ
select * from emp e where 2<= (select count(*) from emp where e.salary=salary);

--��ѯ�����ʴ���ƽ�����ʵ�Ա����Ϣ
select * from emp e,(select avg(salary) a from emp) s where e.salary>s.a;

--���ݹ��ʽ���������������ͬ������£�������ͬ
select e.*,(select count(*) from emp p where e.salary < p.salary)+1 ss from emp e order by ss;

--��ְʱ����ͬ��Ա��
select * from emp e where 2<= (select count(*) from emp where e.starttime=starttime);

--��ѯÿ�����Ź�����ߵ�ǰ����
select 
    * 
from 
    emp e 
where 
(
select 
  count(*) 
from 
  emp p 
where 
  p.salary>e.salary 
  and p.dept_no=e.dept_no
) < 2;

--α��
select t.*,rownum from emp t order by rownum desc;

select t.*,rownum from emp t where rownum>3;

--������ߵ�ǰ����
select * from (select t.* from emp t order by salary desc) where rownum <4;

--��ҳ��ѯ
select * from (
       select d.*,rownum r from(
              select * from emp order by salary desc
       ) d
       where rownum <= 5
)where r>0;

select * from(select d.*,rownum r from(select * from emp order by salary desc) dwhere rownum <= 5)where r>0;
