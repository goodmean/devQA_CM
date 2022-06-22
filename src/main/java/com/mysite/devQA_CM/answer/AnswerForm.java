package com.mysite.devQA_CM.answer;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class AnswerForm {
	@NotEmpty(message = "내용을 입력해 주세요.")
	private String content;
}
