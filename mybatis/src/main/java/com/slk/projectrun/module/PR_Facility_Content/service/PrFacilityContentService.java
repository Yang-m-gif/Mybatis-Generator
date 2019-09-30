package com.slk.projectrun.module.PR_Facility_Content.service;

import com.slk.projectrun.module.PR_Facility_Content.po.PrFacilityContent;
import java.util.Map;

public interface PrFacilityContentService {

    //添加或修改
	Map<String,Object> insertOrUpdate(PrFacilityContent facilityContent);

	//根据主键删除
	Map<String,Object> deleteByFid(Integer fid);

	//查询所有记录
	Map<String,Object> selectAll();

}