create or replace procedure reg_procedure(
i_id IN varchar2,
o_name OUT varchar2
)
is

begin
  
           IF i_id = 'java' THEN 
             o_name := '今天是个好日子';
             ELSE
               o_name := '处处好风光';
             END IF;
   --o_name := i_id;

end;
/
