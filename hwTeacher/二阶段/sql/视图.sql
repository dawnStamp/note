--������ͼ
create or replace view aaa_bbb
as
select e.id,e.name from emp e,emp p,dept d
where e.leader_id = p.id
and e.starttime < p.starttime
and e.dept_no = d.id;

--ɾ����ͼ
drop table ����;
drop view aaa_bbb;
drop sequence t_emp_id_seq;

--
create or replace noforce view ccc
as
select * from xxxxxx
with read only;




insert into ccc(id) values('1');























create table xxxxxx(
id varchar2(255)
)





select * from aaa_bbb_view;

select * from ccc;
