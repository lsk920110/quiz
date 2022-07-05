package quiz.bank.quiz.regist.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quiz.bank.quiz.common.service.BaseService;
import quiz.bank.quiz.common.vo.ResultVO;
import quiz.bank.quiz.regist.mapper.RegistCategoryMapper;
import quiz.bank.quiz.regist.vo.RegistSubjectCategoryParamVO;
import quiz.bank.quiz.regist.vo.RegistTestCategoryParamVO;
import quiz.bank.quiz.regist.vo.SelectCategoryParamVO;
import quiz.bank.quiz.regist.vo.SubjectCategoryListResultVO;
import quiz.bank.quiz.regist.vo.SubjectCategoryVO;
import quiz.bank.quiz.regist.vo.TestCategoryListResultVO;
import quiz.bank.quiz.regist.vo.TestCategoryResultVO;
import quiz.bank.quiz.regist.vo.TestCategoryVO;

@Service
public class RegistCategoryServiceImpl extends BaseService  {

	@Autowired
	private RegistCategoryMapper registCategoryMapper;
	
	
	public ResultVO registTestCategory(RegistTestCategoryParamVO param) throws Exception {
		log.info("서비스 도착");
		ResultVO rv = new ResultVO();
		int overlap = registCategoryMapper.selectTestCategoryOverLapChk(param);
		if(overlap > 0 ) {
			rv.setCode("1111");
			rv.setMessage("해당 카테고리는 중복입니다.");
			return rv;
		}
		
		registCategoryMapper.registTestCategory(param);
		rv.setCode("9999");
		rv.setMessage("성공");
		return rv;
	}

	
	public ResultVO registSubjectCategory(RegistSubjectCategoryParamVO param) throws Exception {
		ResultVO rv = new ResultVO();
		int overlap = registCategoryMapper.selectSubjectCategoryOverLapChk(param);
		if(overlap > 0) {
			rv.setCode("1111");
			rv.setMessage("해당 카테고리는 중복입니다.");
			return rv;
		}
		
		registCategoryMapper.registSubjectCategory(param);
		rv.setCode("9999");
		rv.setMessage("성공"); 
		
		return rv;
	}


	public ResultVO selectTestCategoryList(TestCategoryVO param) throws Exception {
		
		List<TestCategoryVO> list = registCategoryMapper.selectTestCategoryList(param);
		TestCategoryListResultVO rv = new TestCategoryListResultVO();
		rv.setTest_category_list(list);
		rv.setCode("9999");
		rv.setMessage("성공");
		return rv;
		
	}


	public ResultVO selectSubjectCategoryList(SelectCategoryParamVO param) throws Exception {
		List<SubjectCategoryVO> list = registCategoryMapper.selectSubjectCategoryList(param);			
		SubjectCategoryListResultVO rv = new SubjectCategoryListResultVO();
		rv.setSubjectCategoryList(list);
		rv.setCode("9999");
		rv.setMessage("성공");
		return rv;
		}



}
