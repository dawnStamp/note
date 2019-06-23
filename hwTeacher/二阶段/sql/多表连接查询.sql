select t.*,rowid from teacher t;

select * from student;

--等价连接
select * from student stu,teacher tea,emp e
where stu.tea_id = tea.id
and tea.id = e.id
and stu.name = '张三';

--外连接
--左连接
select * from student s,teacher t
where s.tea_id =t.id(+);

select * from student s 
left join teacher t on s.tea_id = t.id
where s.name='张三';

--右连接
select * from student s,teacher t
where s.tea_id(+)=t.id;

--内连接
select * from student s
inner join teacher t on s.tea_id = t.id;

--全连接
select s.*,t.name from student s
full outer join teacher t on s.tea_id = t.id;

select * from emp;

--查询员工的全部信息，并展示员工所属部门名称
create table dept(
id varchar2(255),
name varchar2(255)
)

select t.*,rowid from emp t;

select e.*,d.name from emp e left join dept d on e.dept_no = d.id;

--列出所有员工的姓名以及其直接上级的姓名
select e.id,e.name,p.leader_id,p.name from emp p
left join emp e on p.leader_id = e.id;

select t.*,rowid from dept t;

--列出入职日期比上级还要早的所有员工的编号、姓名、部门名称
select e.id,e.name,d.name from emp e,emp p,dept d--e 员工    p 领导
where e.leader_id = p.id
and e.starttime < p.starttime
and e.dept_no = d.id;


select * from emp e,emp p,dept d
where e.leader_id = p.id--确定员工之间的领导关系
and e.starttime < p.starttime
and e.dept_no = d.id;

select * from emp where leader_id <> '1';

is not null  判断不为空
<>           不等于

--结果集

select * from emp 
union all
select * from emp;

select t.*,rowid from dept t;
select t.*,rowid from emp t;

--复制整表
create table depp
as
select * from dept;

select * from depp;


select * from dept
minus
select * from depp;


--子查询
--展示工资相同的员工信息
select * from emp e where 2<= (select count(*) from emp where e.salary=salary);

--查询出工资大于平均工资的员工信息
select * from emp e,(select avg(salary) a from emp) s where e.salary>s.a;

--根据工资进行排名，工资相同的情况下，排名相同
select e.*,(select count(*) from emp p where e.salary < p.salary)+1 ss from emp e order by ss;

--入职时间相同的员工
select * from emp e where 2<= (select count(*) from emp where e.starttime=starttime);

--查询每个部门工资最高的前两名
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

--伪列
select t.*,rownum from emp t order by rownum desc;

select t.*,rownum from emp t where rownum>3;

--工资最高的前三名
select * from (select t.* from emp t order by salary desc) where rownum <4;

--分页查询
select * from (
       select d.*,rownum r from(
              select * from emp order by salary desc
       ) d
       where rownum <= 5
)where r>0;

select * from(select d.*,rownum r from(select * from emp order by salary desc) dwhere rownum <= 5)where r>0;
