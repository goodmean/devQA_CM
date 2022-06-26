package com.mysite.devQA_CM.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserCreateForm {
	@Size(min = 3, max = 25)
	@NotEmpty(message = "ID를 입력해 주세요.")
	private String username;

	@NotEmpty(message = "비밀번호를 입력해 주세요.")
	private String password1;

	@NotEmpty(message = "비밀번호 확인을 입력해 주세요")
	private String password2;

	@NotEmpty(message = "이메일을 입력해 주세요")
	@Email
	private String email;
}