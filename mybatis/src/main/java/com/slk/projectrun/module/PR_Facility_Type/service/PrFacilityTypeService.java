package com.slk.projectrun.module.PR_Facility_Type.service;

import com.slk.projectrun.module.PR_Facility_Type.po.PrFacilityType;
import java.util.Map;

public interface PrFacilityTypeService {

    //添加或修改
	Map<String,Object> insertOrUpdate(PrFacilityType facilityType);

	//根据主键删除
	Map<String,Object> deleteByFid(Integer fid);

	//查询所有记录
	Map<String,Object> selectAll();

}