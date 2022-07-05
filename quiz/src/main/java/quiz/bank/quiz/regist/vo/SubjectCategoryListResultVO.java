package quiz.bank.quiz.regist.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import quiz.bank.quiz.common.vo.ResultVO;

//@Getter @Setter
public class SubjectCategoryListResultVO extends ResultVO {
	private List<SubjectCategoryVO> subjectCategoryList;

	
	public List<SubjectCategoryVO> getSubjectCategoryList() {
		return subjectCategoryList;
	}

	public void setSubjectCategoryList(List<SubjectCategoryVO> subjectCategoryList) {
		this.subjectCategoryList = subjectCategoryList;
	}
	
	
	
}
