package quiz.bank.quiz.regist.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SubjectCategoryVO {
	
	private Integer subject_category_seq;
	private Integer test_category_seq;
	private String subject_category;
	private String use_yn;
	private Integer pass_criteria;

}
