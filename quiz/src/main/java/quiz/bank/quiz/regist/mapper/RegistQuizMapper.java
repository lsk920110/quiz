package quiz.bank.quiz.regist.mapper;

import org.springframework.stereotype.Repository;

import quiz.bank.quiz.regist.vo.QuizVO;

@Repository
public interface RegistQuizMapper {

	void registQuiz(QuizVO quizVO);

}
