package com.mysite.devQA_CM.question;

import com.mysite.devQA_CM.answer.AnswerForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {

	private final QuestionService questionService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList); // Model 객체에 "questionList" 라는 이름으로 저장
		// Model 객체에 값을 담아두면 템플릿에서 그 값을 사용할 수 있다.
		return "question_list";
	}

	@RequestMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question", question);
		return "question_detail";
	}

	@GetMapping("/create")
	public String questionCreate(QuestionForm questionForm) {
		return "question_form";
	}
	
	@PostMapping("/create")
	public String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return "question_form";
		}

		this.questionService.create(questionForm.getSubject(), questionForm.getContent());
		return "redirect:/question/list"; // 질문 저장 후 질문목록으로 이동
	}
}