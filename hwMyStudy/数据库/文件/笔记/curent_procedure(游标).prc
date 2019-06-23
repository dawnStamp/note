CREATE OR REPLACE PROCEDURE curent_procedure


IS

v_name varchar2(255);
v_id varchar2(255);

cursor  cc_cursor is select  id,name from section;--定义游标


BEGIN
  
--loop循环


  open cc_cursor;    --打开游标
  
  LOOP
  fetch cc_cursor  into v_id,v_name;       --从游标中提取数据
  EXIT WHEN  cc_cursor % notfound;
 dbms_output.put_line(v_id ||  ',' ||v_name);
  END LOOP;

  close cc_cursor;       --关闭游标

------------------------------------------------------------------------------

--while循环


/*open cc_cursor;    --打开游标
 fetch cc_cursor  into v_id,v_name;       --从游标中提取数据  

 
  while  cc_cursor % found loop
    dbms_output.put_line(v_id ||  ',' ||v_name);
  
     fetch cc_cursor  into v_id,v_name;       --从游标中提取数据  

  END LOOP;


  close cc_cursor;       --关闭游标
*/
----------------------------------------------------------------------------------------

--for 循环（简化了打开、提取、关闭的流程）


/*FOR ABC in cc_cursor loop
   v_id := abc.id;
   v_name := abc.name;
   
  dbms_output.put_line(v_id ||  ',' ||v_name);

     END LOOP;  */
  
  
  
  
    /*   delete  from section where id ='1';
       --dbms_output.put_line(sql%ROWCOUNT);
       --delete from section;
       
       IF SQL%NOTFOUND THEN
           dbms_output.put_line(1111);
        ELSE
           dbms_output.put_line(2222);
         END IF;
       --commit;*/
          
END;
/
