package quiz.bank.quiz.regist.vo;

import lombok.Data;


public class SelectCategoryParamVO {
	
	private Integer test_category_seq;
	private String subject_category;
	public Integer getTest_category_seq() {
		return test_category_seq;
	}
	public void setTest_category_seq(Integer test_category_seq) {
		this.test_category_seq = test_category_seq;
	}
	public String getSubject_category() {
		return subject_category;
	}
	public void setSubject_category(String subject_category) {
		this.subject_category = subject_category;
	}
	
	
	
}
