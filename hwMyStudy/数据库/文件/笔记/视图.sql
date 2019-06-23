--创建视图
create or replace  view aaa_bbb_view
as
select * from dept
with read only;

--删除视图
drop view  aaa_bbb_view;

drop table 表名;
drop sequence 序列名;





select t.*, rowid from aaa_bbb_view t;


select t.*, rowid from dept t;

--创建索引
create index aaa_index
on dept(id);

--联合索引
create index aaa_index
on dept(id,name);

--删除索引
drop index aaa_index;




