create or replace procedure reg_procedure(
i_id IN varchar2,
o_name OUT varchar2
)
is

begin
  
           IF i_id = 'java' THEN 
             o_name := '�����Ǹ�������';
             ELSE
               o_name := '�����÷��';
             END IF;
   --o_name := i_id;

end;
/
