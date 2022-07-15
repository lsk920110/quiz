package quiz.bank.quiz.regist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quiz.bank.quiz.common.service.BaseService;
import quiz.bank.quiz.common.vo.ResultVO;
import quiz.bank.quiz.regist.mapper.RegistQuizMapper;
import quiz.bank.quiz.regist.vo.QuizVO;

@Service
public class RegistQuizService extends BaseService{
		
	@Autowired private RegistQuizMapper registQuizMapper;

	public ResultVO registQuiz(QuizVO[] params) {
		
		for (QuizVO quizVO : params) {
			registQuizMapper.registQuiz(quizVO);
		}
		
		ResultVO resultVO = new ResultVO();
		resultVO.setCode("0000");
		resultVO.setMessage("");
		
		
		return resultVO;
	}
	
	


}
