package quiz.bank.quiz.regist.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import quiz.bank.quiz.common.vo.ResultVO;

@Getter @Setter
public class TestCategoryListResultVO extends ResultVO {

	private List<TestCategoryVO> test_category_list;
}
