--insert������
insert into student(id,name,age,tea_id) values('10','������'��18��'20');
insert into student values('10','������'��18��'20');

insert into student(id,name,age)
select id,name,age from teacher;

--update�޸����
update student set name='����ʦ',age=55 where id =1;
update student set tea_id='777';

--deleteɾ�����
delete from student where id = '2';


--�鿴
select * from student;
select * from teacher;

--�����ֶ��������������
select t.*, rowid from student t;
select t.*, rowid from teacher t;
