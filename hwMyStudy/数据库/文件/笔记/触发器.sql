--������
create or replace trigger abc before insert 
    on section
    for each row
    begin
      dbms_output.put_line (111);--������
    end;
    
  
delete from section;    
insert into section (id,name)  values(2,'����');
insert into section (id,name)  values(2,'����');
    

update section set id=1��name='����';

select t.*, rowid from section t;






--�洢����
CREATE OR REPLACE PROCEDURE first_procedure(

id IN varchar2��      --���
name OUT varchar2   --����
--����

)
IS
--������
BEGIN
--ִ�п�
      dbms_output.put_line(1111);--������
       --EXCEPTION
         --�쳣�����  
END;


select t.*, rowid from section t;




--ע��
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
