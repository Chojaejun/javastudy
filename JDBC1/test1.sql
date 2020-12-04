create table test(
name VARCHAR2(3),
age NUMBER(3)
)

test ���̺� ���� ������ �Է��ϼ���.
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

test ���̺���
��� ���ڵ��� 
name �÷�����
��ȸ�Ͻÿ�.

SELECT name FROM test

test ���̺���
��� ���ڵ���
age �÷�����
��ȸ�Ͻÿ�.

SELECT age FROM test



SELECT name as �̸�, age as ���� FROM test

SELECT name �̸�, age ���� FROM test

SELECT name as �̸�, age ���� FROM test

SELECT DISTINCT name FROM test

SELECT * FROM test ORDER BY age ASC

SELECT * FROM test ORDER BY age DESC

test ���̺���
��� ���ڵ带
��� �÷��� ���Եǰ�
��ȸ�ϵ�
�̸��� �������� ������������
�����Ͻÿ�.

SELECT * FROM test ORDER BY name DESC

test ���̺���
��� ���ڵ带
��� �÷��� ���Եǰ� ��ȸ�ϵ�
�̸��� �������� ������������ �����Ͻÿ�.
���� �̸��� ������ ���̰� ���� ����� �켱�� �ǵ��� �����Ͻÿ�.

SELECT * FROM test ORDER BY name DESC, age DESC

SELECT * FROM test WHERE name = 'kim'

SELECT * FROM test WHERE name != 'kim'

INSERT INTO test (age) VALUES (55)

INSERT INTO test (name) VALUES ('pyo')

COMMIT

name�� NULL�� ���ڵ� ������ ��ȸ�Ͻÿ�.
��, �÷��� name��

SELECT name as �̸�, age ���� FROM test WHERE name IS NULL

name�� NULL�� �ƴ� ���ڵ� ������ ��ȸ�Ͻÿ�.
��, ���ڵ忡 ���� ������ AGE�� �����ǰ� �����ϰ�
���� AGE�� ������ name�� ������������ �����Ͻÿ�.

SELECT * FROM test WHERE name IS NOT NULL ORDER BY age ASC, name DESC

test ���̺���
age�� 55�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age = 55

SELECT * FROM test WHERE age != 55

test ���̺��� age��
null�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age IS NULL

test ���̺��� age��
null�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age IS NOT NULL

test ���̺� age��
30���� ū ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age > 30

test ���̺� age��
33���� ũ�ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age >= 33

test ���̺���
age�� 20�̰ų� 23�̰ų� 40�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age = 20 OR age = 23 OR age = 40 

test ���̺���
age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age in(20, 23, 40, 43, 61, 77)

test ���̺���
age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ尡 �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.

3�̰ų� 5�μ�....

SELECT * FROM test WHERE age NOT IN(20, 23, 40, 43, 61, 77)

name kim �̰� age�� 33�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE name = 'kim' and age = 33

test ���̺��� 
age�� 25���� ũ�� 47���� ���� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age > 25 and age < 47

test ���̺��� 
age�� 25���� ũ�ų� ���� 47���� �۰ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age >= 25 AND age <= 47

test ���̺��� 
age�� 25���� ũ�ų� ���� 47���� �۰ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.

BETWEEN A AND B

SELECT * FROM test WHERE age BETWEEN 25 AND 47

SELECT * FROM test WHERE name LIKE 'k__'

SELECT * FROM test WHERE name LIKE '_e___'

SELECT * FROM test WHERE name LIKE '_e_'

SELECT * FROM test WHERE name LIKE '%o'

SELECT * FROM test WHERE name LIKE '%��%'

SELECT * FROM test WHERE name LIKE '%l%'

table: ���ڵ�,, alter...

���̺�� ��� SELECT�� �ֱ�..

SELECT * FROM (SELECT * FROM test WHERE age > 20) WHERE name LIKE '%k%'

rownum�� 2 ~ 4 ��ȸ

SELECT * FROM
(SELECT rownum rnum, name, age FROM test) 
WHERE rnum BETWEEN 2 AND 4

�� SELECT���� ORDER BY (����) ������ ����,
������ SELECT���� �̿��Ͽ� ROWNUM �÷��� �־������.
SELECT�� �ȿ� SELECT���� ���� ���� '����Ŀ��'

rownum�� 2 ~ 4 ��ȸ�ϴµ�
age�� ��������

SELECT * FROM(
SELECT rownum rnum, name, age FROM 
(SELECT name, age FROM test ORDER BY age ASC)
) WHERE rnum BETWEEN 2 AND 4

DB�� �����͸� ������ ���¿���
�÷� �ϳ����� �̿��ؼ�
Ư�� ���ڵ� �ϳ����� ��ȸ�ϰ� �;�.
--> �⺻Ű = ��Ű = primary key(pk)

CREATE TABLE member2(
id VARCHAR2(6),
name VARCHAR2(6),
age NUMBER(3)
)

ALTER TABLE member2 ADD CONSTRAINT pk_member2_id PRIMARY KEY(id)

�⺻Ű�� �����ϸ�,
�⺻Ű�� ���� �ߺ��� ������� �ʴ´�.
unique constraint

INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m002', 'kim', 30)
INSERT INTO member2 VALUES ('m003', 'kim', 30)
INSERT INTO member2 VALUES ('m004', 'kim', 30)
INSERT INTO member2 VALUES ('m005', 'kim', 30)
INSERT INTO member2 VALUES ('m006', 'kim', 30)
INSERT INTO member2 VALUES ('m007', 'kim', 30)

�⺻Ű�� �����ϸ�
�⺻Ű�� ���� NOT NULL ���������� �߰��ȴ�.
INSERT INTO member2 (id, name, age) VALUES ('m008', 'lee', 44)


SELECT * FROM member2 WHERE id = 'm003'

member ���̺��� mid �÷��� ��Ű(=�⺻Ű=pk=primary key)�� �����Ͻÿ�.
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

ó�� ����� ����� �˰� ������,
�ΰ��� ����� �� ������

========================================

�ܷ�Ű = foreign key = fk
����� �����ϴ� ������ ���� �߿����� ���ÿ�.
1. ����
2. ������
3. �����
4. ��ġ�

���� ����..X
1~4 �߿����� �����϶�� �ߴµ�, ���ڸ� �����ϴٴ�..
�̷� �� ���� ����.


CREATE TABLE depart(
edep VARCHAR2(9)
)

�ܷ�Ű(=foreign key=fk)�� �Ƿ���, �ݵ�� �ٸ� ���̺��� �⺻Ű(=��Ű=primary key= pk)�̾�� �Ѵ�.
ALTER TABLE depart ADD CONSTRAINT pk_depart_edep PRIMARY KEY(edep)

INSERT INTO depart VALUES ('�λ��')
INSERT INTO depart VALUES ('ȫ����')
INSERT INTO depart VALUES ('������')
INSERT INTO depart VALUES ('������')
COMMIT

CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6),
edep VARCHAR2(9)
)

eid�� pk�� �����Ͻÿ�.
ALTER TABLE employee ADD CONSTRAINT pk_employee_eid PRIMARY KEY(eid)

ALTER TABLE employee ADD CONSTRAINT fk_employee_edep FOREIGN KEY(edep) REFERENCES depart(edep)

//edep������ �λ��/ȫ����/������/������/�� �� �� ����.
INSERT INTO employee (eid, ename, edep) VALUES ('e001', 'kim', '�λ��')
INSERT INTO employee (eid, ename, edep) VALUES ('e002', 'lee', 'ȫ����')
INSERT INTO employee (eid, ename, edep) VALUES ('e003', 'park', '������')
INSERT INTO employee (eid, ename, edep) VALUES ('e004', 'choi', '������')
�ؿ��� �Է��� �� ��. �θ����̺��� �����Ϳ� '�񼭽�'�� ����. �������Ἲ �������ǿ� ���� ��.
INSERT INTO employee (eid, ename, edep) VALUES ('e005', 'jung', '�񼭽�')

�ܷ�Ű�� NULL ���� �� �� ����.
INSERT INTO employee (eid, ename) VALUES ('e006', 'kim')

COMMIT

SELECT * FROM employee

CREATE TABLE depart2(
edep2 VARCHAR2(9)
)

ALTER TABLE depart2 ADD CONSTRAINT pk_depart2_edep PRIMARY KEY(edep2)

INSERT INTO depart2 VALUES ('�λ��')
INSERT INTO depart2 VALUES ('ȫ����')
INSERT INTO depart2 VALUES ('������')
INSERT INTO depart2 VALUES ('������')

CREATE TABLE employee2(
eid2 VARCHAR2(6),
ename2 VARCHAR2(6),
edep VARCHAR2(9)
)

ALTER TABLE employee2 ADD CONSTRAINT pk_employee2_eid2 PRIMARY KEY(eid2)
ALTER TABLE employee2 ADD CONSTRAINT fk_employee2_edep FOREIGN KEY(edep) REFERENCES depart2(edep2)

INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e001', 'kim', '�λ��')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e002', 'lee', 'ȫ����')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e003', 'park', '������')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e004', 'choi', '������')
INSERT INTO employee2 (eid2, ename2, edep) VALUES ('e005', 'jung', '�񼭽�')

DELETE FROM employee2 WHERE eid2 = 'e005'
DELETE FROM employee2 WHERE eid2 = 'e001'

SELECT * FROM employee2

SELECT * FROM member


































