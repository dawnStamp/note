CREATE OR REPLACE PROCEDURE curent_procedure


IS

v_name varchar2(255);
v_id varchar2(255);

cursor  cc_cursor is select  id,name from section;--�����α�


BEGIN
  
--loopѭ��


  open cc_cursor;    --���α�
  
  LOOP
  fetch cc_cursor  into v_id,v_name;       --���α�����ȡ����
  EXIT WHEN  cc_cursor % notfound;
 dbms_output.put_line(v_id ||  ',' ||v_name);
  END LOOP;

  close cc_cursor;       --�ر��α�

------------------------------------------------------------------------------

--whileѭ��


/*open cc_cursor;    --���α�
 fetch cc_cursor  into v_id,v_name;       --���α�����ȡ����  

 
  while  cc_cursor % found loop
    dbms_output.put_line(v_id ||  ',' ||v_name);
  
     fetch cc_cursor  into v_id,v_name;       --���α�����ȡ����  

  END LOOP;


  close cc_cursor;       --�ر��α�
*/
----------------------------------------------------------------------------------------

--for ѭ�������˴򿪡���ȡ���رյ����̣�


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
