account
id
balance

CREATE TABLE account(
id VARCHAR2(3) PRIMARY KEY,
balance NUMBER
)

kim:0
lee:10000

INSERT INTO account (id,balance) VALUES ('kim',0)
INSERT INTO account (id,balance) VALUES ('lee',10000)
COMMIT

SELECT * FROM account

kim�� lee���� 10000���� ������
lee�� ������.
----> kim�� balance�� 10000
lee�� balance 0
---->
kim�� lee���� 10000���� �����ϴ�.
kim�� ���ڵ忡�� balance���� 0
-----------------------------���꿡�� ������ ������...........
lee�� ���ڵ忡�� balance���� 10000

===>lee��  balance 0 ����

