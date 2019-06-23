--plsql语言
DECLARE
--声明部分：变量、类型、游标..

v_id varchar2(255) := '123';--变量
v_name varchar2(255):='abc';--变量
c_pai constant number:=3.141592654;--常量
v_i number:=0;

BEGIN
--执行部分：执行sql语句、以及plsql语句，即程序的主要部分

    --id:= id || name;
    /*IF id='123' THEN
				dbms_output.put_line(111);
		ELSIF id='111' THEN
				dbms_output.put_line(222);
		ELSE
				dbms_output.put_line(333);
		END IF;
  
    --输出语句
    
    CASE
				WHEN 1=1 THEN
					dbms_output.put_line(111111);
				WHEN 2=2 THEN
					dbms_output.put_line(222222);
				ELSE 
					dbms_output.put_line(333333);
		END CASE;
    
    LOOP
       i := i+1;
     
       dbms_output.put_line(i);
    EXIT WHEN i=1;
    END LOOP;
    
    WHILE i<4 LOOP
      dbms_output.put_line(i);
      i:=i+1;
		END LOOP;
    
    FOR i IN reverse 5..8 LOOP
			 dbms_output.put_line(i);
		END LOOP;
    
    */
    
   -- select name into v_name from emp; 
    
    --v_i:=1/0;
    --dbms_output.put_line(v_i); 
    
    v_i:=v_name;
    
EXCEPTION
--异常部分：错误处理
    WHEN no_data_found THEN
      dbms_output.put_line(1111);
    WHEN too_many_rows THEN
      dbms_output.put_line(2222);
    WHEN zero_divide THEN
      dbms_output.put_line(3333);
    WHEN value_error THEN
      dbms_output.put_line(4444);  
     
END;
