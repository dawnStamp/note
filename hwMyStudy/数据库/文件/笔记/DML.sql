--insert添加语句
insert into student(id,name,age,tea_id) values('10','哈哈哈'，18，'20');
insert into student values('10','哈哈哈'，18，'20');

insert into student(id,name,age)
select id,name,age from teacher;

--update修改语句
update student set name='张老师',age=55 where id =1;
update student set tea_id='777';

--delete删除语句
delete from student where id = '2';


--查看
select * from student;
select * from teacher;

--可以手动往表中添加数据
select t.*, rowid from student t;
select t.*, rowid from teacher t;
