CREATE OR REPLACE PROCEDURE first_procedure(
--����
id IN varchar2(255);--���
name OUT varchar2(255);--����

)
IS
--�����

BEGIN
  --ִ�п�
  dbms_output.put_line(1111);
  
  --EXCEPTION
    --�쳣�����  
END;



insert into emp(id,name) values('3','��㰡�Ӱ�');
select t.*,rowid from emp t;
create or replace procedure reg_procedure(


)
is

begin
  
      dbms_output.put_line(11);
end;




create sequence aa start with 1 increment by 1;


truncate table emp;


create or replace procedure curent_procedure(


)
is

begin
  
      dbms_output.put_line(11);
end;


select t.*,rowid from emp t;

select id,name from emp
