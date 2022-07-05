package quiz.bank.quiz.regist.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import quiz.bank.quiz.regist.vo.RegistSubjectCategoryParamVO;
import quiz.bank.quiz.regist.vo.RegistTestCategoryParamVO;
import quiz.bank.quiz.regist.vo.SelectCategoryParamVO;
import quiz.bank.quiz.regist.vo.SubjectCategoryVO;
import quiz.bank.quiz.regist.vo.TestCategoryVO;


@Repository
public interface RegistCategoryMapper {

	void registTestCategory(RegistTestCategoryParamVO param) throws Exception;

	List<TestCategoryVO> selectTestCategoryList(TestCategoryVO param) throws Exception;

	List<SubjectCategoryVO> selectSubjectCategoryList(SelectCategoryParamVO param) throws Exception;

	int selectTestCategoryOverLapChk(RegistTestCategoryParamVO param) throws Exception;

	void registSubjectCategory(RegistSubjectCategoryParamVO param);

	int selectSubjectCategoryOverLapChk(RegistSubjectCategoryParamVO param);


}
