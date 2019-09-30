package com.slk.pms.module.PR_Facility_Type.service;

import com.slk.pms.module.PR_Facility_Type.po.PrFacilityType;
import java.util.Map;

public interface PrFacilityTypeService {

    //添加或修改
	Map<String,Object> insertOrUpdateFacilityType(PrFacilityType facilityType);

	//根据主键删除
	Map<String,Object> deletePrFacilityTypeByKey(Integer fid);

	//查询所有记录
	Map<String,Object> selectPrFacilityTypeByPrimary(Integer userfid);

	//app 查询所有记录
	Map<String,Object> selectPrFacilityTypeByUserid(Integer userfid);

}