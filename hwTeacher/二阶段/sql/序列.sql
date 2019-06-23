create sequence t_emp_id_seq start with 1 increment by 1;


insert into emp(id,name,salary) values(t_emp_id_seq.nextval,'уехЩ',8000);

select * from emp;

delete from emp;
