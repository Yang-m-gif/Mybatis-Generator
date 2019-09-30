package com.slk.pms.module.PR_Facility_Content.service.impl;

import com.slk.pms.module.PR_Facility_Content.mapper.PrFacilityContentMapper;
import com.slk.pms.module.PR_Facility_Content.po.PrFacilityContentExtend;
import com.slk.pms.module.PR_Facility_Content.service.PrFacilityContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slk.pms.module.PR_Facility_Content.po.PrFacilityContent;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
@Transactional
public class PrFacilityContentServiceImpl implements PrFacilityContentService {

	@Autowired
	private PrFacilityContentMapper facilityContentMapper;

    /**
     * @Description 新增或修改
     * @param facilityContent
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
    @Override
	public Map<String,Object> insertOrUpdate(PrFacilityContent facilityContent) {
        Map<String, Object> map = new HashMap<>();
        Boolean flag;
        if(facilityContent.getFid()!=null){
            flag = facilityContentMapper.updateByPrimaryKeySelective(facilityContent)==1;
            map.put("flag",flag);
            map.put("message",flag?"修改成功":"修改失败");
        }else {
            flag = facilityContentMapper.insertSelective(facilityContent)==1;
            map.put("flag",flag);
            map.put("message",flag?"添加成功":"添加失败");
        }
        return map;
    }

    /**
     * @Description 根据主键删除
     * @param fid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@Override
    public Map<String,Object> deleteByFid(Integer fid) {
        Map<String, Object> map = new HashMap<>();
        Boolean flag = facilityContentMapper.deleteFacilityContentByfid(fid)==1;
        map.put("flag",flag);
        map.put("message",flag?"删除成功":"删除失败");
        return map;
    }

    /**
     * @Description 查询所有
     * @param userfid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author 杨明
     * @Date
     **/
	@Override
    public Map<String,Object> selectAll(Integer userfid) {
        Map<String, Object> map = new HashMap<>();
        map.put("flag",false);
        map.put("message","未查询到数据");
        List<PrFacilityContentExtend> list = facilityContentMapper.selectFacilityContentAll(userfid);
        if(list.size()>0){
            map.put("flag",true);
            map.put("message","查询成功");
        }
        map.put("list",list);
        return map;
    }

}