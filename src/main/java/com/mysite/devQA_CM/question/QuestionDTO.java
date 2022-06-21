package com.mysite.devQA_CM.question;

import com.mysite.devQA_CM.answer.Answer;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class QuestionDTO {
	private Integer id;
	private String subject;
	private String content;
	private LocalDateTime createDate;
	private List<Answer> answerList;

	public QuestionDTO(Question question){
		this.id = question.getId();
		this.subject = question.getSubject();
		this.content = question.getContent();
		this.createDate = question.getCreateDate();
		this.answerList = question.getAnswerList();
	}
}
