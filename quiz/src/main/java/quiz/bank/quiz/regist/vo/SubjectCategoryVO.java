package quiz.bank.quiz.regist.vo;

import lombok.Getter;
import lombok.Setter;

public class SubjectCategoryVO {
	
	private Integer subject_category_seq;
	private Integer test_category_seq;
	private String subject_category;
	private String use_yn;
	private Integer pass_criteria;
	public Integer getSubject_category_seq() {
		return subject_category_seq;
	}
	public void setSubject_category_seq(Integer subject_category_seq) {
		this.subject_category_seq = subject_category_seq;
	}
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
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public Integer getPass_criteria() {
		return pass_criteria;
	}
	public void setPass_criteria(Integer pass_criteria) {
		this.pass_criteria = pass_criteria;
	}

}
