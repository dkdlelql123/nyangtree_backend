# 새 데이터베이스 생성
CREATE DATABASE nyangtree;

# nyangtree 사용하기
USE `nyangtree`;

# 회원테이블 생성
CREATE TABLE `member`(
	id INT(10) PRIMARY KEY AUTO_INCREMENT,
	userId VARCHAR(20) NOT NULL UNIQUE,
	userPw VARCHAR(50) NOT NULL,
	username VARCHAR(20),
	nickname VARCHAR(30) NOT NULL UNIQUE,
	phone VARCHAR(20),
	email VARCHAR(50) NOT NULL,
	authLevel SMALLINT(2) NOT NULL DEFAULT 2 COMMENT '2:일반회원, 7:관리자',
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	delStatus TINYINT(1) DEFAULT 0 COMMENT '0:탈퇴전, 1:탈퇴',
	delDate DATETIME
);

# 관리자 계정 생성
INSERT INTO `member`
SET userId = 'admin',
userPw = '1234',
username = '관리자',
nickname = 'manager',
email = 'dkdlelql123@naver.com',
authLevel = 7,
regDate = NOW(),
updateDate = NOW();

# 일반계정 생성
INSERT INTO `member`
SET userId = 'test',
userPw = '1234',
username = '홍길동',
nickname = '둘리아빠',
email = 'dkdlelql123@naver.com',
authLevel = 2,
regDate = NOW(),
updateDate = NOW();
