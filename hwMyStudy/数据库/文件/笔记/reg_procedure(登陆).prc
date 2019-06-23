--注册
create or replace procedure reg_procedure(
i_name IN varchar2,
i_salary IN  number,
o_res  OUT varchar2
)
is
v_name varchar2(255);
v_salary number(10,2);
v_username varchar2(255);

begin
          
         v_name:=i_name;
         v_salary:=i_salary;
         
         select name into v_username from section where name=v_name;
         o_res:='账号名已存在';
         
EXCEPTION
           WHEN no_data_found THEN
                  insert into section(id,name,salary) values(aa.nextval,v_name,v_salary);
                   commit;
                   o_res:='注册成功';


end;
/
