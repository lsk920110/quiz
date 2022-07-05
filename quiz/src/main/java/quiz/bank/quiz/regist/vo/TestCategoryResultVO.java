package quiz.bank.quiz.regist.vo;

import lombok.Data;
import quiz.bank.quiz.common.vo.ResultVO;


@Data
public class TestCategoryResultVO extends ResultVO{

	private Integer test_category_seq;
	private String test_category;
	private String use_yn;
	private Integer pass_criteria;
	
}
