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





















