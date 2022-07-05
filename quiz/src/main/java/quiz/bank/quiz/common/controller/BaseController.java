package quiz.bank.quiz.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {

	
	protected Logger log = LoggerFactory.getLogger(getClass());
	
	@SuppressWarnings("null")
	public void null_validation(Object object) {
		if(object == null) {
			log.info("This object is null");
		} else {
			log.info("This object is not null : {}",object.toString());	
		}
	}
	
	
	
	
	
	
}
