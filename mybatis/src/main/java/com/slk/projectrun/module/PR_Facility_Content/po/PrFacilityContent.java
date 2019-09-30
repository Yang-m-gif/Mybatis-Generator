package com.slk.projectrun.module.PR_Facility_Content.po;

import lombok.Data;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
public class PrFacilityContent {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 巡检类型表fid */
    private Integer facility_type_fid;

    /* 巡检内容名称 */
    private String name;

    /* 所属项目/区域（与user里的区域相同） */
    private Integer slk_area_fid;

    /* 备注 */
    private String remark;

    /* 操作人fid */
    private Integer modify_UserFid;

    /* 操作人姓名 */
    private String modifyName;

    /* 操作人角色 */
    private String modifyRole;

    /* 操作时间 */
    private Date modifyDate;

}