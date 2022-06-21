package com.mysite.devQA_CM.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

	private final QuestionService questionService;

	@RequestMapping("/question/list")
	public String list(Model model) {
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList); // Model 객체에 "questionList" 라는 이름으로 저장
		// Model 객체에 값을 담아두면 템플릿에서 그 값을 사용할 수 있다.
		return "question_list";
	}
}
