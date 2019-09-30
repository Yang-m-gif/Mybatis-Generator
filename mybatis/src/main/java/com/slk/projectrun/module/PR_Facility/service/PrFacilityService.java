package com.slk.projectrun.module.PR_Facility.service;

import com.slk.projectrun.module.PR_Facility.po.PrFacility;
import java.util.Map;

public interface PrFacilityService {

    //添加或修改
	Map<String,Object> insertOrUpdate(PrFacility facility);

	//根据主键删除
	Map<String,Object> deleteByFid(Integer fid);

	//查询所有记录
	Map<String,Object> selectAll();

}