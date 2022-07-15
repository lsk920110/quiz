package quiz.bank.quiz.regist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import quiz.bank.quiz.common.controller.BaseController;
import quiz.bank.quiz.common.vo.ResultVO;
import quiz.bank.quiz.regist.service.RegistQuizService;
import quiz.bank.quiz.regist.vo.QuizVO;

@Controller
@ResponseBody
public class RegistQuizController extends BaseController {

	
	@Autowired
	private RegistQuizService registQuizService;
	
	@RequestMapping(value="regist/quiz/regist" , method=RequestMethod.POST)
	@ResponseBody
	public ResultVO registQuiz(@RequestBody QuizVO[] params) throws Exception{
		log.info("도착!");
		for (QuizVO quizVO : params) {
			log.info("index : {}",quizVO.getQuiz_index());
			log.info("subject_category_seq {}",quizVO.getSubject_category_seq());
			log.info("content : {}",quizVO.getQuiz_content());
			log.info("explation : {}",quizVO.getQuiz_explation());
			log.info("option1 : {}",quizVO.getQuiz_option1());
			log.info("option2 : {}",quizVO.getQuiz_option2());
			log.info("option3 : {}",quizVO.getQuiz_option3());
			log.info("option4 : {}",quizVO.getQuiz_option4());
			log.info("answer : {}",quizVO.getQuiz_answer());
		}
		
		return registQuizService.registQuiz(params);
	}
	
}
