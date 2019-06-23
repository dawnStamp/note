CREATE OR REPLACE PROCEDURE first_procedure(
--参数
id IN varchar2(255);--入参
name OUT varchar2(255);--出参

)
IS
--定义块

BEGIN
  --执行块
  dbms_output.put_line(1111);
  
  --EXCEPTION
    --异常处理块  
END;



insert into emp(id,name) values('3','姐姐啊接啊');
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
