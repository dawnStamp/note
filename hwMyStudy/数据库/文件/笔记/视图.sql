--������ͼ
create or replace  view aaa_bbb_view
as
select * from dept
with read only;

--ɾ����ͼ
drop view  aaa_bbb_view;

drop table ����;
drop sequence ������;





select t.*, rowid from aaa_bbb_view t;


select t.*, rowid from dept t;

--��������
create index aaa_index
on dept(id);

--��������
create index aaa_index
on dept(id,name);

--ɾ������
drop index aaa_index;




