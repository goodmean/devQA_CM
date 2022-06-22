package com.mysite.devQA_CM.question;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class QuestionForm {

	@NotEmpty(message = "제목을 입력해 주세요.")
	@Size(max = 200) // 최대 길이를 200byte 로 제한
	private String subject;

	@NotEmpty(message = "내용을 입력해 주세요.")
	private String content;
}
