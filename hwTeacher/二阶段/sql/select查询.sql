select id,name,age,tea_id from student;

--where
select * from student where id=1;

--in
select * from student where id in(1,4);

--like
select * from student where age like '1%' or id = 1;

--between ..and ..
select * from student where tea_id between '1' and '5';

--or 
select * from student where id = 1 or age = 25;

--and
select * from student where id = 1 and age = 22 and tea_id = 1;

--distinct
select distinct * from student;
select distinct tea_id,age from student;
select tea_id from student;

-- 字符串连接
select * from student where name = '张'||'三';

--order by排序
select id,age from student order by age desc,id;

select * from student order by 1 desc;

--可以手动往表中添加数据
select t.*,rowid from student t;
