member10�̶�� ���̺�
�ݵ�� point�÷��� �����Ͻÿ�
mid,point
oder ���̺� ����.
oid,menu,mid
�ֹ��ϸ�, �ش� ȸ������ 10 ����Ʈ�� ��.
-----------------
�ֹ� ���̺� ���ڵ尡 �߰��Ǹ�,
ȸ�� ���̺��� Ư�� ���ڵ��� point�÷� ���� ���Ѵ�.

CREATE TABLE member11(
mid varchar2(6) PRIMARY KEY,
point number
)


INSERT INTO member11 (mid,point) VALUES ('kim',0)

CREATE TABLE order1(
oid varchar2(3) PRIMARY KEY,
menu varchar2(3),
mid varchar2(6)
)



SELECT * FROM member11