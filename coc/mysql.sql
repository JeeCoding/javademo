create table mytbl2 (id int,name varchar(200), age int ,dept int);
insert into mytbl2 values (1,'zhang3',33,101);
insert into mytbl2 values (2,'li4',34,101);
insert into mytbl2 values (3,'wang5',34,102);
insert into mytbl2 values (4,'zhao6',34,102);
insert into mytbl2 values (5,'tian7',36,102);

-- group by使用原则，select后面只能放函数和group by后相关的字段
SELECT name, dept, max(age) from mytbl2 group by dept;

select * from mytbl2 m inner join (
select dept, max(age) maxage from mytbl2 group by dept
) ab on ab.dept = m.dept and m.age=ab.maxage;

show variables like 'sql_mode';

show variables like '%profiling%';
set profiling =1;

select * from mytbl2 where id =2;

show profiles ;

show profile cpu ,block io for query 2;

show engines ;

-- sql join
create table `t_dept`(
    `id` int(11) not null auto_increment,
    `deptName` varchar(30) default null,
    `address` varchar(40) default null,
    primary key (`id`)
) engine=innodb auto_increment=1 default charset=utf8;

create table `t_emp`(
    `id` int(11) not null auto_increment,
    `name` varchar(20) default null,
    `age` int(3) default null,
    `deptId` int(11) default null,
    `empno` int not null,
    primary key (`id`),
    key 'idx_dept_id' ('deptId')
)engine=innodb auto_increment=1 default charset = utf8;


insert into t_dept(deptname, address) values ('华山','华山');
insert into t_dept(deptname, address) values ('丐帮','洛阳');
insert into t_dept(deptname, address) values ('峨眉','峨眉山');
insert into t_dept(deptname, address) values ('武当','武当山');
insert into t_dept(deptname, address) values ('明教','光明顶');
insert into t_dept(deptname, address) values ('少林','少林寺');

insert into t_emp(name, age, deptId, empno) VALUES ('风清扬','90','1','100001');
insert into t_emp(name, age, deptId, empno) VALUES ('岳不群','50','1','100002');
insert into t_emp(name, age, deptId, empno) VALUES ('令狐冲','24','1','100003');

insert into t_emp(name, age, deptId, empno) VALUES ('洪七公','70','2','100004');
insert into t_emp(name, age, deptId, empno) VALUES ('乔峰','35','2','100005');

insert into t_emp(name, age, deptId, empno) VALUES ('灭绝师太','70','3','100006');
insert into t_emp(name, age, deptId, empno) VALUES ('周芷若','20','3','100007');

insert into t_emp(name, age, deptId, empno) VALUES ('张三丰','100','4','100008');

insert into t_emp(name, age, deptId, empno) VALUES ('张无忌','25','5','100009');

insert into t_emp(name, age, deptId, empno) VALUES ('韦小宝','18',null,'100010');

select * from  t_dept;
select * from t_emp;

-- 所有门派的人员信息（a、b两表共有）
select * from t_emp a inner join t_dept b on a.deptId=b.id;
-- 列出所有用户，并显示其机构信息（a的全集）
select * from t_emp a left join t_dept b on a.deptId=b.id;
-- 列出所有门派（b的全集）
select * from t_dept;
-- 所有不入门派的人员（a的独有）
select * from t_emp where deptId is null;
select * from t_emp a left join t_dept b on a.deptId=b.id where b.id is null;
-- 所有没人入的门派（b的独有）
select * from t_dept b left join t_emp a on a.deptId=b.id where a.id is null;
-- 列出所有人员和机构的对照关系(ab全有).union all和union的区别，union all不去重效率高
select a.*,b.* from t_emp a left join t_dept b on a.deptId=b.id
union all
select a.*,b.* from t_dept b left join t_emp a on a.deptId=b.id where a.id is null;
-- 列出所有没入门派的人员和没人入的门派(a的独有+b的独有)
select a.*,b.* from t_emp a left join t_dept b on a.deptId=b.id where b.id is null
union all
select a.*,b.* from t_dept b left join t_emp a on a.deptId=b.id where a.id is null;

-- 增减掌门人字段
alter table `t_dept` add CEO int(11);
update t_dept set CEO=2 where id=1;
update t_dept set CEO=4 where id=2;
update t_dept set CEO=6 where id=3;
update t_dept set CEO=8 where id=4;
update t_dept set CEO=9 where id=5;
-- 求各个门派对应的掌门人名称
select * from t_emp a inner join t_dept b on a.id = b.CEO;
select * from t_dept a inner join t_emp b on a.CEO = b.id;
-- 求所有掌门人的平均年龄
select avg(a.age) from t_emp a inner join t_dept b on a.id = b.CEO;
-- 求所有人物对应的掌门人名称
select c.name, ab.name ceoname from t_emp c left join (
select a.name,b.id from t_emp a inner join t_dept b on a.id = b.CEO
) ab on c.deptId = ab.id;



-- 索引
show index from t_emp;
select * from t_emp;
-- drop index idx_name on t_emp;

-- 单一索引
create index idx_name on t_emp(name);
-- 唯一索引
create unique index idx_empno on t_emp(empno);
-- 复合索引
create index idx_age_deptid_name on t_emp(age,deptId,name);

explain select c.name, ab.name ceoname from t_emp c left join (
    select a.name,b.id from t_emp a inner join t_dept b on a.id = b.CEO
) ab on c.deptId = ab.id;


SHOW VARIABLES LIKE '%lower_case_table_names%';
SELECT @@lower_case_table_names FROM DUAL;


-- 创建数据表，大量数据的表
CREATE TABLE `dept` (
                        `id` INT(11) NOT NULL AUTO_INCREMENT,
                        `deptName` VARCHAR(30) DEFAULT NULL,
                        `address` VARCHAR(40) DEFAULT NULL,
                        ceo INT NULL ,
                        PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `emp` (
                       `id` INT(11) NOT NULL AUTO_INCREMENT,
                       `empno` INT NOT NULL ,
                       `name` VARCHAR(20) DEFAULT NULL,
                       `age` INT(3) DEFAULT NULL,
                       `deptId` INT(11) DEFAULT NULL,
                       PRIMARY KEY (`id`)
    #CONSTRAINT `fk_dept_id` FOREIGN KEY (`deptId`) REFERENCES `t_dept` (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 开启mysql二进制日志，可以做主从复制。如不开启不能自定义mysql函数
show variables like 'log_bin_trust_function_creators';
set global log_bin_trust_function_creators=1;

-- 随机产生字符串，DELIMITER $$:以$为开始结束符,代替;
DELIMITER $$
CREATE FUNCTION rand_string(n INT) RETURNS VARCHAR(255)
BEGIN
    DECLARE chars_str VARCHAR(100) DEFAULT 'abcdefghijklmnopqrstuvwxyzABCDEFJHIJKLMNOPQRSTUVWXYZ';
    DECLARE return_str VARCHAR(255) DEFAULT '';
    DECLARE i INT DEFAULT 0;
    WHILE i < n DO
            SET return_str =CONCAT(return_str,SUBSTRING(chars_str,FLOOR(1+RAND()*52),1));
            SET i = i + 1;
        END WHILE;
    RETURN return_str;
END $$

-- 随机产生部门编号
DELIMITER $$
CREATE FUNCTION  rand_num (from_num INT ,to_num INT) RETURNS INT(11)
BEGIN
    DECLARE i INT DEFAULT 0;
    SET i = FLOOR(from_num +RAND()*(to_num -from_num+1))   ;
    RETURN i;
END$$

-- 假如要删除
-- drop function rand_num;

-- 创建往emp表中插入数据的存储过程
DELIMITER $$
CREATE PROCEDURE  insert_emp(  START INT ,  max_num INT )
BEGIN
    DECLARE i INT DEFAULT 0;
#set autocommit =0 把autocommit设置成0
    SET autocommit = 0;
    REPEAT
        SET i = i + 1;
        INSERT INTO emp (empno, NAME ,age ,deptid ) VALUES ((START+i) ,rand_string(6)   , rand_num(30,50),rand_num(1,10000));
    UNTIL i = max_num
        END REPEAT;
    COMMIT;
END$$
-- 创建往dept表中插入数据的存储过程
DELIMITER $$
CREATE PROCEDURE `insert_dept`(  max_num INT )
BEGIN
    DECLARE i INT DEFAULT 0;
    SET autocommit = 0;
    REPEAT
        SET i = i + 1;
        INSERT INTO dept ( deptname,address,ceo ) VALUES (rand_string(8),rand_string(10),rand_num(1,500000));
    UNTIL i = max_num
        END REPEAT;
    COMMIT;
END$$

-- 执行存储过程，往dept表添加1万条数据
DELIMITER ;
CALL insert_dept(10000);
-- 执行存储过程，往emp表添加50万条数据
CALL insert_emp(100000,500000);

select count(*) from emp;
select count(*) from dept;

SELECT index_name  FROM information_schema.STATISTICS WHERE table_name='t_emp' AND table_schema='mydb'
AND index_name <>'PRIMARY' AND seq_in_index = 1;

-- 批量删除某个表上的所有索引
DELIMITER $$
CREATE  PROCEDURE `proc_drop_index`(dbname VARCHAR(200),tablename VARCHAR(200))
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE ct INT DEFAULT 0;
    DECLARE _index VARCHAR(200) DEFAULT '';
    DECLARE _cur CURSOR FOR  SELECT   index_name   FROM information_schema.STATISTICS   WHERE table_schema=dbname AND table_name=tablename AND seq_in_index=1 AND    index_name <>'PRIMARY'  ;
    DECLARE  CONTINUE HANDLER FOR NOT FOUND set done=2 ;
    OPEN _cur;
    FETCH   _cur INTO _index;
    WHILE  _index<>'' DO
            SET @str = CONCAT("drop index ",_index," on ",tablename );
            PREPARE sql_str FROM @str ;
            EXECUTE  sql_str;
            DEALLOCATE PREPARE sql_str;
            SET _index='';
            FETCH   _cur INTO _index;
        END WHILE;
    CLOSE _cur;
END$$
CALL proc_drop_index("mydb","t_emp");


CALL proc_drop_index("mydb","emp");
CALL proc_drop_index("mydb","dept");
-- 单表索引优化
explain select sql_no_cache * from emp where emp.age=30;
create index idx_age on emp(age);
explain select sql_no_cache * from emp where emp.age=30 and emp.deptId=4;
create index idx_age_depid on emp(age,deptId);
-- 1.全值匹配我最爱
explain select sql_no_cache * from emp where emp.age=30 and emp.deptId=4 and emp.name='abcd';
create index idx_age_depid_name on emp(age,deptId,name);

-- 2.最佳左前缀法则，如果索引了多列，要遵守最左前缀法则。指的是查询从索引的最左前列开始并且不跳过索引中的列。(带头大哥不能死，中间兄弟不能少)
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.age=30   AND emp.name = 'abcd';
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.deptid=1   AND emp.name = 'abcd';

-- 3.在索引列上做任何操作（计算、函数、(自动or手动)类型转换），都会导致索引失效而转向全表扫描
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.name LIKE 'abc%';
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE LEFT(emp.name,3) = 'abc';
create index idx_name on emp(name);

-- 4.存储引擎不能使用索引中范围条件右边的列。范围索引创建时应放在最后面
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.age=30 AND emp.deptId>20 AND emp.name = 'abc';
create index idx_age_deptid_name on emp(age,deptId,name); -- 部分索引有用
create index idx_age_name_deptid on emp(age,name,deptId); -- 全部索引有用

-- 5.mysql 在使用不等于(!= 或者<>)的时候无法使用索引会导致全表扫描
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.name <> 'abc';
CREATE INDEX idx_name ON emp(NAME);

-- 6.is not null 也无法使用索引,但是is null是可以使用索引的
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE age IS NULL;
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE age IS NOT NULL;
create index idx_age  on emp(age);

-- 7.like以通配符开头('%abc...')mysql索引失效会变成全表扫描的操作
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.name LIKE '%abc%';
create index idx_name on emp(name);

-- 8.字符串不加单引号索引失效，因为myslq会自动类型转化，即3的问题
EXPLAIN SELECT SQL_NO_CACHE * FROM emp WHERE emp.name = 123;
create index idx_name on emp(name);


-- 关联查询优化
CREATE TABLE IF NOT EXISTS `class` (
    `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    `card` INT(10) UNSIGNED NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `book` (
    `bookid` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    `card` INT(10) UNSIGNED NOT NULL,
    PRIMARY KEY (`bookid`)
);

INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO class(card) VALUES(FLOOR(1 + (RAND() * 20)));

INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));
INSERT INTO book(card) VALUES(FLOOR(1 + (RAND() * 20)));

explain select SQL_NO_CACHE * from emp order by age,deptid;
explain select SQL_NO_CACHE * from emp order by age,deptid limit 10;

-- 开启慢查询日志
SHOW VARIABLES LIKE '%slow_query_log%';
set global slow_query_log=1;
-- 设置慢查询日志时间
SHOW VARIABLES LIKE 'long_query_time%';
set long_query_time=1;

show processlist ;