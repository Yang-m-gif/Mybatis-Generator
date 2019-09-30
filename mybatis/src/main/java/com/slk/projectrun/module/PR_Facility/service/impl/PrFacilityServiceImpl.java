package com.slk.projectrun.module.PR_Facility.service.impl;

import com.slk.projectrun.module.PR_Facility.mapper.PrFacilityMapper;
import com.slk.projectrun.module.PR_Facility.service.PrFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slk.projectrun.module.PR_Facility.po.PrFacility;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
@Transactional
public class PrFacilityServiceImpl implements PrFacilityService {

	@Autowired
	private PrFacilityMapper facilityMapper;

    /**
     * @Description 新增或修改
     * @param facility
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
    @Override
	public Map<String,Object> insertOrUpdate(PrFacility facility) {
        Map<String, Object> map = new HashMap<>();
        Boolean flag;
        if(facility.getFid()!=null){
            flag = facilityMapper.updateByPrimaryKeySelective(facility)==1;
            map.put("flag",flag);
            map.put("message",flag?"修改成功":"修改失败");
        }else {
            flag = facilityMapper.insertSelective(facility)==1;
            map.put("flag",flag);
            map.put("message",flag?"添加成功":"添加失败");
        }
        return map;
    }

    /**
     * @Description 根据主键删除
     * @param fid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
	@Override
    public Map<String,Object> deleteByFid(Integer fid) {
        Map<String, Object> map = new HashMap<>();
        Boolean flag = facilityMapper.deleteByPrimaryKey(fid)==1;
        map.put("flag",flag);
        map.put("message",flag?"删除成功":"删除失败");
        return map;
    }

    /**
     * @Description 查询所有
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
	@Override
    public Map<String,Object> selectAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("flag",false);
        map.put("message","未查询到数据");
        List<PrFacility> list = facilityMapper.selectAll();
        if(list.size()>0){
            map.put("flag",true);
            map.put("message","查询成功");
        }
        map.put("list",list);
        return map;
    }

}