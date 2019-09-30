package com.slk.projectrun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.slk.projectrun.module.PR_Facility.po.PrFacility;
import com.slk.projectrun.module.PR_Facility.service.PrFacilityService;
import java.util.Map;

@RestController
@RequestMapping("/Facility")
public class FacilityController {

	@Autowired
	private PrFacilityService facilityService;

	/**
	 * @Description 新增或修改
	 * @param
	 * @return java.util.Map<java.lang.String,java.lang.Object>
	 * @author
	 * @Date
	 **/
	@RequestMapping("/insertOrUpdate")
	public Map<String,Object> insertOrUpdate(PrFacility facility){
        return facilityService.insertOrUpdate(facility);
    }

    /**
     * @Description 根据主键删除
     * @param fid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
	@RequestMapping("/deleteByFid")
	public Map<String,Object> deleteByFid(Integer fid){
        return facilityService.deleteByFid(fid);
    }

    /**
     * @Description 查询所有
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
	@RequestMapping("/selectAll")
	public Map<String,Object> selectAll(){
        return facilityService.selectAll();
    }

}