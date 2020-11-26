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

kim이 lee한테 10000원만 빌려줘
lee가 빌려줌.
----> kim의 balance는 10000
lee의 balance 0
---->
kim이 lee한테 10000원을 갚습니다.
kim의 레코드에서 balance값이 0
-----------------------------전산에서 전원이 나갔어...........
lee의 레코드에서 balance값이 10000

===>lee의  balance 0 복구

