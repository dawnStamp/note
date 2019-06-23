--等价连接
select * from student stu,teacher tea,lianxi l,section sec 
where  stu.tea_id = tea.id
and tea.id = l.id
and tea.id = sec.id
and stu.name = '张三';

--外连接：
--左连接(以左边的表为主)
select * from student s,teacher t
where s.tea_id > t.id(+);


select * from student s 
 left join teacher t on s.tea_id = t.id 
 left join section sec on t.id = sec.id
where s.name ='张三';

--右连接(以右边的表为主，但会把左边的表全部显示出来)
select * from student s,teacher t
where s.tea_id(+) = t.id;


select * from student s
right  join teacher t on s.tea_id = t.id
right join section sec on t.id = sec.id;


--内连接：
select * from student s
inner join  teacher t on s.tea_id=t.id;


--全连接
select * from student s
full outer  join  teacher t on s.tea_id=t.id;


--查询员工的全部信息，并展示员工所属部门名称
create table dept(
id varchar2(255),
name varchar2(255)
)

select t.*,rowid from dept t;

select s.*,d.name from section s left join dept d  on s.dept_id = d.id; 


--列出所有员工的姓名以及直接上级的姓名
select s.name,e.name from section s
left  join  section e  on s.id = e.leader_no;

--列出入职日期比上级还要早的所有员工的编号、姓名、部门名称
select s.id,s.name,d.name from section s,section p, dept d--s  员工     p  领导
where s.leader_no =p.id  --确定员工之间的领导关系
and s.time < p.time
and s.dept_id = d.id; 


--集合运算符    去除重复并排序
select * from dept
union
select * from depp;

--合并
select * from dept
union all
select * from depp;

--minus  第一个表和第二个表比较，去除重复，输出第一个表独有的
select * from depp
minus
select * from dept;

--intersect  第一个表和第二个表比较，找到重复，输出重复
select * from depp
intersect
select * from dept;

--复制整表
create table depp
as
select * from dept;










--子查询
--展示工资相同的员工信息
select * from section  s where 2<= (select count(*)  from section where  s.salary=salary);

--查询出工资大于平均工资的员工信息
select * from section s,(select AVG(salary) a from section)  e  where s.salary>=e.a ;

--根据工资进行排名，工资相同的情况下，排名相同
select s.*,(select count (*) from section where salary > s.salary)+1  ss from section s order by ss;
select s.*,(select count (*) from section p where s.salary < p.salary)+1 ss from section s order by ss;




--入职时间相同的员工
select * from section  s where 2<= (select count(*)  from section where  s.time=time);


--查询每个部门工资最高的前两名
select * from section  s where  (select count(*)  from section e where e.salary>s.salary and e.dept_id=s.dept_id) < 2;


select t.*,rowid from student t;
select t.*,rowid from teacher t;
select t.*,rowid from section t;
select t.*,rowid from dept t;
select t.*,rowid from depp t;






--伪列
select t.*,rownum from section t order by rownum desc;

select t.*,rownum from section t  where rownum <9;



--查询工资最高的前三名
select * from (select t.*  from section t order by  salary desc)  where rownum<4;



--分页查询
--第一种
select * from (
         select d.*, rownum  r  from(
                      select * from section
         ) d
         where rownum <= 8
)where r>6;




--第二种
select * from ( select d.*, rownum r from(select *from section) d where rownum <=8) where r>6;


select * from 





--序列 sequence
create sequence t_section_id_seq start with 1 increment by 1;

insert into section(id,name,salary) values(t_section_id_seq.nextval,'张三'，8000);
 
truncate table section;

select t.*, rowid from section t;
