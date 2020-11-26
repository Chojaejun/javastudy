member10이라는 테이블
반드시 point컬럼을 생성하시오
mid,point
oder 테이블 만듦.
oid,menu,mid
주문하면, 해당 회원에게 10 포인트를 줌.
-----------------
주문 테이블에 레코드가 추가되면,
회원 테이블의 특정 레코드의 point컬럼 값이 변한다.

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