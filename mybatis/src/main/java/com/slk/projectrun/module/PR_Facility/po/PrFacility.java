package com.slk.projectrun.module.PR_Facility.po;

import lombok.Data;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
public class PrFacility {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 巡检类型表fid */
    private Integer facility_type_fid;

    /* 巡检类型名称 */
    private String type_name;

    /* 巡检内容表fid */
    private Integer facility_content_fid;

    /* 巡检内容名称 */
    private String content_name;

    /* 所属区域（与user里的区域相同） */
    private Integer slk_area_fid;

    /* 异常位置 */
    private String position;

    /* 备注 */
    private String remark;

    /* 照片url */
    private String imgUrl;

    /* 类型（0-正常 1-异常待处理 2-异常已处理） */
    private Integer type;

    /* 处理状态（0-处理未完成 1-处理已完成） */
    private Integer status;

    /* 巡检人 */
    private Integer patrol_id;

    /* 异常维修人 */
    private Integer repair_id;

    /* 异常处理时间 */
    private Date handle_date;

    /* 异常处理结果 */
    private String handle_result;

    /* 异常处理人 */
    private Integer handler_id;

    /* 巡检时间 */
    private Date patrol_date;

    /* 操作人fid */
    private Integer modify_UserFid;

    /* 操作人姓名 */
    private String modifyName;

    /* 操作人角色 */
    private String modifyRole;

    /* 操作时间 */
    private Date modifyDate;

}