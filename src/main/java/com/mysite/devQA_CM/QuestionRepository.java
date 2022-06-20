package com.mysite.devQA_CM;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	Question findBySubject(String subject);
	// 리포지터리 객체의 메서드가 실행될때 JPA 가 해당 메서드명을 분석하여 쿼리를 만들고 실행한다.
	// findBy + 엔티티의 속성명(예:findBySubject)과 같은 리포지터리 메서드를 작성하면 해당 속성의 값으로 데이터를 조회할수 있다.
}
