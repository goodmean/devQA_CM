package com.mysite.devQA_CM.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SiteUser { // 스프링 시큐리티에 User 클래스가 있어 오용 오류 발생 가능성

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true) // 중복 금지
	private String username;

	private String password;

	@Column(unique = true)
	private String email;
}
