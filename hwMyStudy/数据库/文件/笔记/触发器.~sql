--触发器
create or replace trigger abc before insert 
    on section
    for each row
    begin
      dbms_output.put_line (111);--输出语句
    end;
    
  
delete from section;    
insert into section (id,name)  values(2,'王五');
insert into section (id,name)  values(2,'王五');
    

update section set id=1，name='张三';

select t.*, rowid from section t;






--存储过程
CREATE OR REPLACE PROCEDURE first_procedure(

id IN varchar2，      --入参
name OUT varchar2   --出参
--参数

)
IS
--声明块
BEGIN
--执行块
      dbms_output.put_line(1111);--输出语句
       --EXCEPTION
         --异常处理块  
END;


select t.*, rowid from section t;




--注册
create or replace procedure reg_procedure(
)
is

begin

 dbms_output.put_line(11);
end;


create sequence aa start with 1 increment by 1;




-------------------------------------------------------------------------------------------

CREATE OR REPLACE PROCEDURE curent_procedure


IS

BEGIN

END;

select t.*, rowid from section t;

select t.*, rowid from emp t;
