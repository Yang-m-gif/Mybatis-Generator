package com.slk.pms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.slk.pms.module.PR_Facility_Type.po.PrFacilityType;
import com.slk.pms.module.PR_Facility_Type.service.PrFacilityTypeService;
import java.util.Map;

@RestController
@RequestMapping("/FacilityType")
public class FacilityTypeController {

	@Autowired
	private PrFacilityTypeService facilityTypeService;

	/**
	 * @Description 新增或修改
	 * @param facilityType
	 * @return java.util.Map<java.lang.String,java.lang.Object>
	 * @author 杨明
	 * @Date
	 **/
	@RequestMapping("/setOreditFacilityType")
	public Map<String,Object> setOreditFacilityType(PrFacilityType facilityType){
        return facilityTypeService.insertOrUpdateFacilityType(facilityType);
    }

    /**
     * @Description 根据主键删除
     * @param fid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@RequestMapping("/delFacilityTypeByFid")
	public Map<String,Object> delFacilityTypeByFid(Integer fid){
        return facilityTypeService.deletePrFacilityTypeByKey(fid);
    }

    /**
     * @Description 查询所有
     * @param userId
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@RequestMapping("/getFacilityTypeAll")
	public Map<String,Object> getFacilityTypeAll(Integer userId){
        return facilityTypeService.selectPrFacilityTypeByPrimary(userId);
    }







    /**
     * @Description app 查询所有(已启用)
     * @param userId
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@RequestMapping("/getFacilityTypeByUserId")
	public Map<String,Object> getFacilityTypeByUserId(Integer userId){
        return facilityTypeService.selectPrFacilityTypeByUserid(userId);
    }

}