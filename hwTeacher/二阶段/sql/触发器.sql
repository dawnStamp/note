create or replace trigger abc after insert or update or delete
on emp
for each row
begin
  dbms_output.put_line(111);
end;


insert into emp(id,name) values('2','����');

insert into emp(id,name)
select id,name from student;

select * from emp;

truncate table emp;
