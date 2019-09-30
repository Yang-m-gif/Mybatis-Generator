package com.slk.pms.module.PMS_Dpinfo.service;

import com.slk.pms.module.PMS_Dpinfo.po.PmsDpinfo;
import java.util.Map;

public interface PmsDpinfoService {

    //添加或修改
	Map<String,Object> insertOrUpdate(PmsDpinfo dpinfo);

	//根据主键删除
	Map<String,Object> deleteByFid(Integer fid);

	//查询所有记录
	Map<String,Object> selectAll();

}