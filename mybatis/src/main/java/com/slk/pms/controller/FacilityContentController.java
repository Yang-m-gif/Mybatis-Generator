package com.slk.pms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.slk.pms.module.PR_Facility_Content.po.PrFacilityContent;
import com.slk.pms.module.PR_Facility_Content.service.PrFacilityContentService;
import java.util.Map;

@RestController
@RequestMapping("/FacilityContent")
public class FacilityContentController {

	@Autowired
	private PrFacilityContentService facilityContentService;

	/**
	 * @Description 新增或修改
	 * @param facilityContent
	 * @return java.util.Map<java.lang.String,java.lang.Object>
	 * @author 杨明
	 * @Date
	 **/
	@RequestMapping("/insertOrUpdate")
	public Map<String,Object> insertOrUpdate(PrFacilityContent facilityContent){
        return facilityContentService.insertOrUpdate(facilityContent);
    }

    /**
     * @Description 根据主键删除
     * @param fid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@RequestMapping("/deleteByFid")
	public Map<String,Object> deleteByFid(Integer fid){
        return facilityContentService.deleteByFid(fid);
    }

    /**
     * @Description 查询所有
     * @param userfid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@RequestMapping("/selectAll")
	public Map<String,Object> selectAll(Integer userfid){
        return facilityContentService.selectAll(userfid);
    }

}