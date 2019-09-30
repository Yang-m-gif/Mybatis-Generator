package com.slk.pms.module.PR_Facility_Type.mapper;

import com.slk.pms.module.PR_Facility_Type.po.AppFacilityType;
import com.slk.pms.module.PR_Facility_Type.po.PrFacilityType;
import com.slk.pms.framework.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PrFacilityTypeMapper extends MyMapper<PrFacilityType> {

    /* 添加PrFacilityType信息 */
    public int insertPrFacilityTypeInfo(PrFacilityType type);

    /* 根据主键删除PrFacilityType信息 */
    public int deletePrFacilityTypeByKey(@Param("fid") Integer fid);

    /* 修改PrFacilityType信息 */
    public int updatePrFacilityTypeByKey(PrFacilityType type);

    /* 后台获取所有的或者条件获取PrFacilityType信息 */
    public List<PrFacilityType> selectPrFacilityTypeByPrimary(@Param("userfid") Integer userfid);

    /* app获取所有的或者条件获取PrFacilityType信息 */
    public List<AppFacilityType> selectPrFacilityTypeByUserid(@Param("userfid") Integer userfid);
}