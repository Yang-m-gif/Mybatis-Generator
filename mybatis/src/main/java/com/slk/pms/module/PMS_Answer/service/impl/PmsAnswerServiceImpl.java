package com.slk.pms.module.PMS_Answer.service.impl;

import com.slk.pms.module.PMS_Answer.mapper.PmsAnswerMapper;
import com.slk.pms.module.PMS_Answer.service.PmsAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PmsAnswerServiceImpl implements PmsAnswerService {

	@Autowired
	private PmsAnswerMapper answerMapper;

}