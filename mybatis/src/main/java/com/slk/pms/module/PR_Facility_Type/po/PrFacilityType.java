package com.slk.pms.module.PR_Facility_Type.po;

import lombok.Data;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
public class PrFacilityType {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 所属项目/区域(与user里的区域相同) */
    private Integer slk_area_fid;

    /* 巡检类型名称 */
    private String name;

    /* 备注 */
    private String remark;

    /* 异常处理人（多选，根据角色及项目列出候选人） */
    private String handler_Ids;

    /* 异常维修人（多选，根据角色及项目列出候选人） */
    private String repair_Ids;

    /* 状态（0-启用 1-停用） */
    private Integer status;

    /* 所属科室fid */
    private Integer pms_dpinfo_fid;

    /* 操作人fid */
    private Integer modify_UserFid;

    /* 操作人姓名 */
    private String modifyName;

    /* 操作人角色 */
    private String modifyRole;

    /* 操作时间 */
    private Date modifyDate;

}