package quiz.bank.quiz.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {

	
	/*
	 <li><a th:href="@{/regist/category}">카테고리등록</a></li>
	<li><a th:href="@{/regist/quiz}">문제등록</a></li>
	<li><a th:href="@{/quiz/list}">문제리스트</a></li>
	<li><a th:href="@{/quiz/solve}">문제풀기</a></li>
	 * */
	
	
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String main() {
		
		return "main";
	}
	@RequestMapping(value="/regist/category" , method=RequestMethod.GET)
	public String registCategory() {
		return "registCategory";
	}
	@RequestMapping(value="/regist/quiz" , method=RequestMethod.GET)
	public String registQuiz() {
		return "registQuiz";
	}
	@RequestMapping(value="/quiz/list" , method=RequestMethod.GET)
	public String quizList() {
		return "quizList";
	}
	@RequestMapping(value="/quiz/solve" , method=RequestMethod.GET)
	public String quizSolve() {
		return "quizSolve";
	}

}
