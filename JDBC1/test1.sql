create table test(
name VARCHAR2(3),
age NUMBER(3)
)

test 테이블에 다음 값들을 입력하세요.
kim 20
lee 40
park 50
cho 23

INSERT INTO test (name, age) values ('kim', 20);
INSERT INTO test (name, age) values ('lee', 40);
INSERT INTO test (name, age) values ('park', 50);
INSERT INTO test (name, age) values ('cho', 23);
INSERT INTO test VALUES ('kim', 33);

COMMIT

SELECT * FROM test

test 테이블의
모든 레코드의 
name 컬럼값을
조회하시오.

SELECT name FROM test

test 테이블의
모든 레코드의
age 컬럼값을
조회하시오.

SELECT age FROM test



SELECT name as 이름, age as 나이 FROM test

SELECT name 이름, age 나이 FROM test

SELECT name as 이름, age 나이 FROM test

SELECT DISTINCT name FROM test

SELECT * FROM test ORDER BY age ASC

SELECT * FROM test ORDER BY age DESC

test 테이블의
모든 레코드를
모든 컬럼이 포함되게
조회하되
이름을 기준으로 내림차순으로
정렬하시오.

SELECT * FROM test ORDER BY name DESC

test 테이블의
모든 레코드를
모든 컬럼이 포함되게 조회하되
이름을 기준으로 내림차순으로 정렬하시오.
만약 이름이 같으면 나이가 많은 사람이 우선이 되도록 정렬하시오.

SELECT * FROM test ORDER BY name DESC, age DESC

SELECT * FROM test WHERE name = 'kim'

SELECT * FROM test WHERE name != 'kim'

INSERT INTO test (age) VALUES (55)

INSERT INTO test (name) VALUES ('pyo')

COMMIT

name이 NULL인 레코드 정보를 조회하시오.
단, 컬럼은 name만

SELECT name as 이름, age 나이 FROM test WHERE name IS NULL

name이 NULL이 아닌 레코드 정보를 조회하시오.
단, 레코드에 대한 정렬은 AGE가 증가되게 정렬하고
만약 AGE가 같으면 name을 내림차순으로 정렬하시오.

SELECT * FROM test WHERE name IS NOT NULL ORDER BY age ASC, name DESC

test 테이블에서
age가 55인 레코드를 조회하시오.

SELECT * FROM test WHERE age = 55

SELECT * FROM test WHERE age != 55

test 테이블에서 age가
null인 레코드를 조회하시오.

SELECT * FROM test WHERE age IS NULL

test 테이블에서 age가
null이 아닌 레코드를 조회하시오.

SELECT * FROM test WHERE age IS NOT NULL

test 테이블에 age가
30보다 큰 레코드를 조회하시오.

SELECT * FROM test WHERE age > 30

test 테이블에 age가
33보다 크거나 같은 레코드를 조회하시오.

SELECT * FROM test WHERE age >= 33

test 테이블에서
age가 20이거나 23이거나 40인 레코드를 조회하시오.

SELECT * FROM test WHERE age = 20 OR age = 23 OR age = 40 

test 테이블에서
age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드를 조회하시오.

SELECT * FROM test WHERE age in(20, 23, 40, 43, 61, 77)

test 테이블에서
age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드가 아닌 레코드를 조회하시오.

3이거나 5인수....

SELECT * FROM test WHERE age NOT IN(20, 23, 40, 43, 61, 77)

name kim 이고 age가 33인 레코드를 조회하시오.

SELECT * FROM test WHERE name = 'kim' and age = 33

test 테이블에서 
age가 25보다 크고 47보다 작은 레코드를 조회하시오.

SELECT * FROM test WHERE age > 25 and age < 47

test 테이블에서 
age가 25보다 크거나 같고 47보다 작거나 같은 레코드를 조회하시오.

SELECT * FROM test WHERE age >= 25 AND age <= 47

test 테이블에서 
age가 25보다 크거나 같고 47보다 작거나 같은 레코드를 조회하시오.

BETWEEN A AND B

SELECT * FROM test WHERE age BETWEEN 25 AND 47

SELECT * FROM test WHERE name LIKE 'k__'

SELECT * FROM test WHERE name LIKE '_e___'

SELECT * FROM test WHERE name LIKE '_e_'

SELECT * FROM test WHERE name LIKE '%o'

SELECT * FROM test WHERE name LIKE '%초%'

SELECT * FROM test WHERE name LIKE '%l%'

table: 레코드,, alter...

테이블명 대신 SELECT문 넣기..

SELECT * FROM (SELECT * FROM test WHERE age > 20) WHERE name LIKE '%k%'

rownum이 2 ~ 4 조회

SELECT * FROM
(SELECT rownum rnum, name, age FROM test) 
WHERE rnum BETWEEN 2 AND 4

원 SELECT에서 ORDER BY (정렬) 조건이 들어가면,
별도의 SELECT문을 이용하여 ROWNUM 컬럼을 넣어줘야함.
SELECT문 안에 SELECT문이 들어가는 것은 '서브커리'

rownum이 2 ~ 4 조회하는데
age가 오름차순

SELECT * FROM(
SELECT rownum rnum, name, age FROM 
(SELECT name, age FROM test ORDER BY age ASC)
) WHERE rnum BETWEEN 2 AND 4

DB에 데이터를 저장한 상태에서
컬럼 하나만을 이용해서
특정 레코드 하나만을 조회하고 싶어.
--> 기본키 = 주키 = primary key(pk)

CREATE TABLE member2(
id VARCHAR2(6),
name VARCHAR2(6),
age NUMBER(3)
)

ALTER TABLE member2 ADD CONSTRAINT pk_member2_id PRIMARY KEY(id)

기본키를 설정하면,
기본키에 대한 중복을 허용하지 않는다.
unique constraint

INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m002', 'kim', 30)
INSERT INTO member2 VALUES ('m003', 'kim', 30)
INSERT INTO member2 VALUES ('m004', 'kim', 30)
INSERT INTO member2 VALUES ('m005', 'kim', 30)
INSERT INTO member2 VALUES ('m006', 'kim', 30)
INSERT INTO member2 VALUES ('m007', 'kim', 30)

기본키를 설정하면
기본키에 대해 NOT NULL 제약조건이 추가된다.
INSERT INTO member2 (id, name, age) VALUES ('m008', 'lee', 44)


SELECT * FROM member2 WHERE id = 'm003'

member 테이블의 mid 컬럼을 주키(=기본키=pk=primary key)로 설정하시오.
ALTER TABLE member ADD CONSTRAINT pk_member_mid PRIMARY KEY(mid)

CREATE TABLE test2(
id VARCHAR2(6) PRIMARY KEY,
age NUMBER(3)
)


CREATE TABLE test3(
id VARCHAR2(6),
age NUMBER(3),
CONSTRAINT pk_test3_id PRIMARY KEY(id)
)

처음 배웠던 방법만 알고 있으면,
두가지 방법도 할 수있음

========================================

외래키 = foreign key = fk
당신이 좋아하는 음식을 다음 중에서만 고르시오.
1. 갈비
2. 떡볶이
3. 된장찌개
4. 김치찌개

나는 피자..X
1~4 중에서만 선택하라고 했는데, 피자를 선택하다니..
이런 일 없게 하자.


CREATE TABLE depart(
edep VARCHAR2(9)
)

외래키(=foreign key=fk)가 되려면, 반드시 다른 테이블의 기본키(=주키=primary key= pk)이어야 한다.
ALTER TABLE depart ADD CONSTRAINT pk_depart_edep PRIMARY KEY(edep)

INSERT INTO depart VALUES ('인사부')
INSERT INTO depart VALUES ('홍보부')
INSERT INTO depart VALUES ('연구실')
INSERT INTO depart VALUES ('영업부')
COMMIT

CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6),
edep VARCHAR2(9)
)

eid를 pk로 설정하시오.
ALTER TABLE employee ADD CONSTRAINT pk_employee_eid PRIMARY KEY(eid)

ALTER TABLE employee ADD CONSTRAINT fk_employee_edep FOREIGN KEY(edep) REFERENCES depart(edep)

//edep에서는 인사부/홍보부/연구실/영업부/만 들어갈 수 있음.
INSERT INTO employee (eid, ename, edep) VALUES ('e001', 'kim', '인사부')
INSERT INTO employee (eid, ename, edep) VALUES ('e002', 'lee', '홍보부')
INSERT INTO employee (eid, ename, edep) VALUES ('e003', 'park', '연구실')
INSERT INTO employee (eid, ename, edep) VALUES ('e004', 'choi', '영업부')
밑에는 입력이 안 됨. 부모테이블의 데이터에 '비서실'이 없음. 참조무결성 제약조건에 위반 됨.
INSERT INTO employee (eid, ename, edep) VALUES ('e005', 'jung', '비서실')

외래키는 NULL 값이 들어갈 수 있음.
INSERT INTO employee (eid, ename) VALUES ('e006', 'kim')

COMMIT

SELECT * FROM employee

CREATE TABLE depart2(
edep2 VARCHAR2(9)
)

ALTER TABLE depart2 ADD CONSTRAINT pk_depart2_edep PRIMARY KEY(edep2)

INSERT INTO depart2 VALUES ('인사부')
INSERT INTO depart2 VALUES ('홍보부')
INSERT INTO depart2 VALUES ('연구실')
INSERT INTO depart2 VALUES ('영업부')

CREATE TABLE employee2(
eid2 VARCHAR2(6),
ename2 VARCHAR2(6),
edep VARCHAR2(9)
)

ALTER TABLE employee2 ADD CONSTRAINT pk_employee2_eid2 PRIMARY KEY(eid2)
ALTER TABLE employee2 ADD CONSTRAINT fk_employee2_edep FOREIGN KEY(edep) REFERENCES depart2(edep2)

INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e001', 'kim', '인사부')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e002', 'lee', '홍보부')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e003', 'park', '연구실')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e004', 'choi', '영업부')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e005', 'jung', '비서실')

DELETE FROM employee2 WHERE eid2 = 'e005'
DELETE FROM employee2 WHERE eid2 = 'e001'

SELECT * FROM employee2

SELECT * FROM member


































