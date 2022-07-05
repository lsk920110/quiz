package quiz.bank.quiz.regist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import quiz.bank.quiz.common.controller.BaseController;
import quiz.bank.quiz.common.vo.ResultVO;
import quiz.bank.quiz.regist.service.RegistCategoryServiceImpl;
import quiz.bank.quiz.regist.vo.RegistSubjectCategoryParamVO;
import quiz.bank.quiz.regist.vo.RegistTestCategoryParamVO;
import quiz.bank.quiz.regist.vo.SelectCategoryParamVO;
import quiz.bank.quiz.regist.vo.TestCategoryVO;

@Controller
@ResponseBody
public class RegistCategoryController extends BaseController{

	@Autowired
	private RegistCategoryServiceImpl registCategoryService;
	
	
	@RequestMapping(value="regist/category/registTestCategory" , method = RequestMethod.POST)
	public ResultVO reigstTestCategory(@RequestBody RegistTestCategoryParamVO param) throws Exception{
		log.info("컨트롤러 도착! {}",param.getTest_category());
		
		null_validation(param.getTest_category());
		
		ResultVO rv = registCategoryService.registTestCategory(param);
		
		return rv;
	}
	
	@RequestMapping(value="regist/category/registSubjectCategory" , method = RequestMethod.POST)
	public ResultVO resigtSubjectCategory(@RequestBody RegistSubjectCategoryParamVO param) throws Exception {
		null_validation(param.getTest_category_seq());
		null_validation(param.getSubject_category());
		
		
		ResultVO rv = registCategoryService.registSubjectCategory(param);
		
		
		return rv;
	}
	
	
	@RequestMapping(value="regist/category/selectTestCategoryList" , method = RequestMethod.POST)
	public ResultVO selectTestCategoryList(@RequestBody TestCategoryVO param) throws Exception {
		ResultVO rv = new ResultVO();
		rv = registCategoryService.selectTestCategoryList(param);		
		return rv;
	}
	
	@RequestMapping(value="regist/category/selectSubjectCategoryList" , method = RequestMethod.POST)
	public ResultVO selectSubjectCategoryList(@RequestBody SelectCategoryParamVO param) throws Exception {
		null_validation(param.getTest_category_seq());
		ResultVO rv = new ResultVO();
		rv = registCategoryService.selectSubjectCategoryList(param);
		return rv;
	}

	
}
