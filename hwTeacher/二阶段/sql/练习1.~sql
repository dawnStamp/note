create table emp(--员工表
id varchar2(255) primary key,--主键id
name varchar2(255),--姓名
salary number(10,2),--工资
dept_no number,--部门编号
address varchar2(255)--地址
)

select t.*,rowid from emp t;

--练习1：查询部门编号为5的员工，每月的工资总和以及平均工资。
select sum(salary),avg(salary) from emp where dept_no = 5;

--练习2：查询在南昌工作的员工人数，最高工资以及最低工资。
select MAX(salary),MIN(salary) from emp where address = '南昌';

--练习3：统计每个部门的员工个数
select dept_no,count(*) from emp group by dept_no;

--练习4：列出至少有2个员工的所有部门
select dept_no,count(*) from emp group by dept_no having count(*)>1;

--练习5：查询员工表中一共有几种岗位类型
alter table emp add job varchar2(255);
update emp set job = '前台妹纸' where id in('2','6');
select distinct job from emp;

--练习6：列出在每个部门工作的员工数量、平均工资和平均工作年限
alter table emp add starttime date;
update emp set starttime = '12-3月-17' where id in('3','6');

select dept_no,count(*),avg(salary),trunc(avg(months_between(sysdate,starttime))/12,1) from emp group by dept_no;

--练习7：列出各个部门的经理的最低薪金（一个部门多个经理的情况）
select dept_no,min(salary) from emp where job = '业务经理' group by dept_no;
