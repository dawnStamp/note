--创建索引
create index aaa_index
on emp(salary);

--联合索引
create index aaa_index
on emp(salary,id);

--删除索引
drop index aaa_index;
