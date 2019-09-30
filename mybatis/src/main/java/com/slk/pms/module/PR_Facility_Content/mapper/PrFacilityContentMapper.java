package com.slk.pms.module.PR_Facility_Content.mapper;

import com.slk.pms.module.PR_Facility_Content.po.PrFacilityContent;
import com.slk.pms.framework.util.MyMapper;
import com.slk.pms.module.PR_Facility_Content.po.PrFacilityContentExtend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PrFacilityContentMapper extends MyMapper<PrFacilityContent> {

    // 添加PrFacilityContent信息
    public int insertPrFacilityContentInfo(PrFacilityContent content);

    // 根据主键删除信息
    public int deleteFacilityContentByfid(@Param("fid") Integer fid);

    // 修改PrFacilityContent信息
    public int updatePrFacilityContentByKey(PrFacilityContent content);

    // 获取所有的或者条件获取PrFacilityContent信息
    public List<PrFacilityContentExtend> selectFacilityContentAll(@Param("userfid") Integer userfid);

}