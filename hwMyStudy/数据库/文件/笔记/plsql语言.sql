
--plsql
 --  plsql(procedure language & Structured Query Language)�ṹ����ѯ����
                                        
                                     

 DECLARE
 --�������֣����������͡��α�..
                                      
   v_id varchar2(255)   :='123'    ;--����
    v_name varchar2(255)  :='����'    ;--���� 
    v_i number := 0;    
    c_pai  constant  number :=3.1415926;--����
                                    
BEGIN
 --ִ�в��֣�ִ��sql��䡢�Լ�plsql��䣬���������Ҫ����
   -- id:=id+pai;
                                   
    --IF������֧���
    /*   IF  id='123'  THEN
   dbms_output.put_line(id);--������
 ELSIF  name='����' THEN
   dbms_output.put_line(name);--������
    END IF;
                                     
 --CASE��䣺
       CASE
          WHEN id='123' THEN
     dbms_output.put_line(id);--������
       WHEN name ='����' THEN
      dbms_output.put_line(name);--������
     END CASE;*/
                                    
                                    
--LOOP ѭ��
    /*  LOOP
         i := i+1;
        dbms_output.put_line(3333);--������
        EXIT WHEN i=3;
        END LOOP;*/
                                   
--WHILE ѭ��       
        /*WHILE i<4 LOOP
          i := i+1;
          dbms_output.put_line(i);--������
           END LOOP;      */                    
        
     
--FOR ѭ��
/*FOR  I IN reverse 0..10 LOOP
   dbms_output.put_line(I);--������
  END LOOP;   */     
  
  --��ɾ�Ĳ�
 -- insert into section(id,name) values(v_id,v_name);
/*  select name into  v_name  from section where id='111';                      
   
  select t.*, rowid from section t;
  
  update section set  name='����';
  delete  from section;*/
                                   
dbms_output.put_line (1111);--������
EXCEPTION--�쳣���֣�������
   WHEN  no_data_found  THEN--����δ�ҵ������쳣
       dbms_output.put_line (2222);--������
    WHEN too_many_rows THEN--������䷵�ض��������쳣
      dbms_output.put_line (3333);--������
  WHEN zero_divide THEN--��������쳣
      dbms_output.put_line (4444);--������
  WHEN value_error THEN--��������ת�������쳣
      dbms_output.put_line (3333);--������
  WHEN storage_error THEN--��������ʱ�ڴ�����쳣
      dbms_output.put_line (3333);--������
           
END;      

