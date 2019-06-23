
--plsql
 --  plsql(procedure language & Structured Query Language)结构化查询语言
                                        
                                     

 DECLARE
 --声明部分：变量、类型、游标..
                                      
   v_id varchar2(255)   :='123'    ;--变量
    v_name varchar2(255)  :='张三'    ;--变量 
    v_i number := 0;    
    c_pai  constant  number :=3.1415926;--常量
                                    
BEGIN
 --执行部分：执行sql语句、以及plsql语句，即程序的主要部分
   -- id:=id+pai;
                                   
    --IF条件分支语句
    /*   IF  id='123'  THEN
   dbms_output.put_line(id);--输出语句
 ELSIF  name='张三' THEN
   dbms_output.put_line(name);--输出语句
    END IF;
                                     
 --CASE语句：
       CASE
          WHEN id='123' THEN
     dbms_output.put_line(id);--输出语句
       WHEN name ='张三' THEN
      dbms_output.put_line(name);--输出语句
     END CASE;*/
                                    
                                    
--LOOP 循环
    /*  LOOP
         i := i+1;
        dbms_output.put_line(3333);--输出语句
        EXIT WHEN i=3;
        END LOOP;*/
                                   
--WHILE 循环       
        /*WHILE i<4 LOOP
          i := i+1;
          dbms_output.put_line(i);--输出语句
           END LOOP;      */                    
        
     
--FOR 循环
/*FOR  I IN reverse 0..10 LOOP
   dbms_output.put_line(I);--输出语句
  END LOOP;   */     
  
  --增删改查
 -- insert into section(id,name) values(v_id,v_name);
/*  select name into  v_name  from section where id='111';                      
   
  select t.*, rowid from section t;
  
  update section set  name='李四';
  delete  from section;*/
                                   
dbms_output.put_line (1111);--输出语句
EXCEPTION--异常部分：错误处理
   WHEN  no_data_found  THEN--处理未找到数据异常
       dbms_output.put_line (2222);--输出语句
    WHEN too_many_rows THEN--处理语句返回多行数据异常
      dbms_output.put_line (3333);--输出语句
  WHEN zero_divide THEN--处理除零异常
      dbms_output.put_line (4444);--输出语句
  WHEN value_error THEN--处理类型转换错误异常
      dbms_output.put_line (3333);--输出语句
  WHEN storage_error THEN--处理运行时内存溢出异常
      dbms_output.put_line (3333);--输出语句
           
END;      

