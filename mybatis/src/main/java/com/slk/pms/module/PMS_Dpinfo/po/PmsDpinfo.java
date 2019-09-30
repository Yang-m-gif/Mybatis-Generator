package com.slk.pms.module.PMS_Dpinfo.po;

import lombok.Data;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
public class PmsDpinfo {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 用户区域fid */
    private Integer slk_area_fid;

    /* 所属项目fid */
    private Integer slk_project_fid;

    /* 所属楼宇fid */
    private Integer pms_building_fid;

    /* 所属楼层fid */
    private Integer pms_floor_fid;

    /* 所属片区fid */
    private Integer pms_area_fid;

    /* 科室名称 */
    private String name;

    /* 二维码url */
    private String qrcode;

    /* 坐标范围 */
    private String coordinate;

    /* 描述 */
    private String depict;

    /* 操作人FID */
    private Integer modify_userFid;

    /* 操作人姓名 */
    private String modifyname;

    /* 操作时间 */
    private Date modifydate;

}