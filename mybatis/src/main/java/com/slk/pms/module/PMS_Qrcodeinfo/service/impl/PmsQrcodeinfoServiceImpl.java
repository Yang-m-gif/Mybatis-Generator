package com.slk.pms.module.PMS_Qrcodeinfo.service.impl;

import com.slk.pms.module.PMS_Qrcodeinfo.mapper.PmsQrcodeinfoMapper;
import com.slk.pms.module.PMS_Qrcodeinfo.service.PmsQrcodeinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PmsQrcodeinfoServiceImpl implements PmsQrcodeinfoService {

	@Autowired
	private PmsQrcodeinfoMapper qrcodeinfoMapper;

}