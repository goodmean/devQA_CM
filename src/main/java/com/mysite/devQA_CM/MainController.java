package com.mysite.devQA_CM;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/sbb") // 요청된 URL 과의 매핑을 담당
	@ResponseBody // URL 요청에 대한 응담으로 문자열을 리턴
	public String index() {
		return "index";
	}

	@RequestMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
