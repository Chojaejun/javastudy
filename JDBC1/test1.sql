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





















