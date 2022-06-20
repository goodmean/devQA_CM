package com.mysite.devQA_CM;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
	@Id // 데이터베이스에 저장할 때 동일한 값으로 저장할 수 없다.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 데이터를 저장할 때 1씩 자동으로 증가한다.
	// strategy 옵션을 생략할 경우에 같은 어노테이션으로 지정된 모든컬럼들이 동일한 시퀀스로 번호를 생성한다
	private Integer id;

	@Column(length = 200) // 컬럼의 세부설정을 할수있다. length 는 컬럼의 길이 제한.
	private String subject;

	@Column(columnDefinition = "TEXT") // 컬럼의 속성을 정의. 글자 수를 제한 할 수 없는 경우.
	private String content;

	private LocalDateTime createDate;

	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // 질문을 삭제하면 그에 달린 답변들도 모두 삭제.
	private List<Answer> answerList;
}
