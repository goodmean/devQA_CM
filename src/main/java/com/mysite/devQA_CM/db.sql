# DB 재생성
DROP DATABASE IF EXISTS devQA_CM;
CREATE DATABASE devQA_CM;
USE devQA_CM;

# 질문 테이블 생성
CREATE TABLE question(
    id BIGINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `subject` VARCHAR(200) NOT NULL,
    content TEXT NOT NULL,
    create_date DATETIME NOT NULL
);

# 답변 테이블 생성
CREATE TABLE answer(
    id BIGINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content TEXT NOT NULL,
    create_date DATETIME NOT NULL,
    question_id BIGINT UNSIGNED NOT NULL
);

# 테스트용 질문 2개 생성
INSERT INTO question
SET create_date = NOW(),
`subject` = 'sbb가 무엇인가요?',
content = 'sbb에 대해서 알고 싶습니다.';

INSERT INTO question
SET create_date = NOW(),
`subject` = '스프링부트 모델 질문입니다.',
content = 'id는 자동으로 생성되나요?';

# 테스트용 답변 2개 생성
INSERT INTO answer
SET create_date = NOW(),
question_id = 2,
content = '네 자동으로 생성됩니다.';

INSERT INTO answer
SET create_date = NOW(),
question_id = 2,
content = '따로 생성할 필요가 없습니다.';

SELECT * FROM question;
SELECT * FROM answer;