--用户表
CREATE TABLE t_user(
  id NUMBER(11),
  username VARCHAR2(40) CONSTRAINT t_user_name_nn NOT NULL,
  password VARCHAR2(20) CONSTRAINT t_user_password_nn NOT NULL,
  sex NUMBER(1) DEFAULT 0,
  id_number VARCHAR2(18),
  tel VARCHAR2(11),
  addr VARCHAR2(100),
  type NUMBER(1) DEFAULT 0,
  CONSTRAINT t_user_id_pk PRIMARY KEY(id),
  CONSTRAINT t_user_username_uk UNIQUE(username),
  CONSTRAINT t_user_sex_ck CHECK(sex=0 OR sex=1),
  CONSTRAINT t_user_id_number_uk UNIQUE(id_number)
);

--品牌表
CREATE TABLE t_brand(
  id NUMBER(11),
  name VARCHAR2(50),
  CONSTRAINT t_brand_id_pk PRIMARY KEY(id),
  CONSTRAINT t_brand_name_uk UNIQUE(name)
);

--类型表
CREATE TABLE t_category(
  id NUMBER(11),
  name VARCHAR2(50),
  CONSTRAINT t_category_id_pk PRIMARY KEY(id),
  CONSTRAINT t_category_name_uk UNIQUE(name)
);

--汽车表
--model:汽车型号，t_comments:介绍
CREATE TABLE t_car(
  id NUMBER(11),
  car_number VARCHAR2(10),
  brand_id NUMBER(9),
  model VARCHAR2(40),
  color VARCHAR2(20),
  category_id NUMBER(9),
  t_comments VARCHAR2(100),
  price NUMBER(11,2),
  rent NUMBER(9,2),
  status NUMBER(1) DEFAULT 0,
  useable NUMBER(1) DEFAULT 0,
  CONSTRAINT t_car_id_pk PRIMARY KEY(id),
  CONSTRAINT t_car_number_uk UNIQUE(car_number),
  CONSTRAINT t_car_brand_id_fk FOREIGN KEY(brand_id) REFERENCES t_brand(id),
  CONSTRAINT t_car_category_id_fk FOREIGN KEY(category_id) REFERENCES t_category(id),
  CONSTRAINT t_car_status_ck CHECK(status=0 OR status=1)
);

--租赁表
CREATE TABLE t_record(
  id NUMBER(11),
  user_id NUMBER(11),
  car_id NUMBER(11),
  start_date DATE,
  return_date DATE,
  payment NUMBER(9,2),
  CONSTRAINT t_record_id_pk PRIMARY KEY(id),
  CONSTRAINT t_record_user_id_fk FOREIGN KEY(user_id) REFERENCES t_user(id),
  CONSTRAINT t_record_car_id_fk FOREIGN KEY(car_id) REFERENCES t_car(id)
);

--添加测试数据
INSERT INTO t_user VALUES(1,'xiaoming','111111',0,'15647641312345','1515445554','江苏',0);
INSERT INTO t_user VALUES(2,'tom','111111',0,'15647641312346','1515445555','日本',0);
INSERT INTO t_user VALUES(3,'lucy','111111',0,'15647641312347','1515445556','上海',0);
INSERT INTO t_user VALUES(4,'sam','111111',0,'15647641312348','1515445557','北京',0);
INSERT INTO t_user VALUES(5,'leo','111111',0,'15647641312349','1515445558','深圳',0);
INSERT INTO t_user VALUES(6,'marry','111111',0,'15647641312340','1515445559','南京',1);
INSERT INTO t_user (id,username,password,type) VALUES(7,'admin','admin',1);

INSERT INTO t_brand VALUES(1,'标致');
INSERT INTO t_brand VALUES(2,'大众');
INSERT INTO t_brand VALUES(3,'奥迪');
INSERT INTO t_brand VALUES(4,'奔驰');
INSERT INTO t_brand VALUES(5,'宝马');

INSERT INTO t_category VALUES(1,'紧凑型');
INSERT INTO t_category VALUES(2,'舒适型');
INSERT INTO t_category VALUES(3,'SUV');
INSERT INTO t_category VALUES(4,'精英型');

INSERT INTO t_car (id,car_number,brand_id,model,color,category_id,t_comments,price,rent,status,useable)
VALUES(1,'沪A11C32',2,'郎逸','红色',2,'自动1.6L',140000,72,0,0);
INSERT INTO t_car 
VALUES(2,'沪B6888',2,'途观','黑色',3,'自动1.8T',220000,200,0,0);
INSERT INTO t_car 
VALUES(3,'沪A1686',3,'A4L','红色',4,'自动2.0T',400000,359,0,0);
INSERT INTO t_car 
VALUES(4,'沪D11C32',1,'308','黑色',1,'手动1.6L',130000,56,0,0);
INSERT INTO t_car 
VALUES(5,'沪E11C99',1,'308S','蓝色',2,'自动1.2T',160000,70,0,0);
INSERT INTO t_car 
VALUES(6,'沪F11C21',2,'高尔夫','红色',1,'自动1.4T',200000,69,0,0);
INSERT INTO t_car 
VALUES(7,'沪F1324',5,'320Li','白色',4,'自动2.0T',380000,500,0,0);
INSERT INTO t_car 
VALUES(8,'沪F6666',4,'B200','黑色',4,'自动1.6T',320000,300,0,0);

INSERT INTO t_record 
VALUES(1,2,2,to_date('2017-01-24','yyyy-mm-dd'),to_date('2017-01-26','yyyy-mm-dd'),400);
INSERT INTO t_record 
VALUES(2,3,4,to_date('2017-02-20','yyyy-mm-dd'),to_date('2017-02-28','yyyy-mm-dd'),448);
INSERT INTO t_record 
VALUES(3,4,5,to_date('2017-03-01','yyyy-mm-dd'),to_date('2017-03-03','yyyy-mm-dd'),210);
INSERT INTO t_record 
VALUES(4,1,1,to_date('2017-03-02','yyyy-mm-dd'),to_date('2017-03-06','yyyy-mm-dd'),288);

COMMIT;

CREATE SEQUENCE t_user_id_seq START WITH 8 INCREMENT BY 1;
CREATE SEQUENCE t_brand_id_seq START WITH 6 INCREMENT BY 1;
CREATE SEQUENCE t_category_id_seq START WITH 5 INCREMENT BY 1;
CREATE SEQUENCE t_car_id_seq START WITH 9 INCREMENT BY 1;
CREATE SEQUENCE t_record_id_seq START WITH 5 INCREMENT BY 1;









select t.*,rowid from t_user t;
select t.*,rowid from t_car t;
select t.*,rowid from t_category t;
select t.*,rowid from t_record t;
select t.*,rowid from t_brand t;
