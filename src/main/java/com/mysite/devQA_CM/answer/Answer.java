package com.mysite.devQA_CM.answer;

import com.mysite.devQA_CM.question.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "TEXT")
	private String content;

	private LocalDateTime createDate;

	@ManyToOne // 답변은 하나의 질문에 여러개가 달릴 수 있는 구조
	private Question question;

}
