package com.slk.pms.module.PMS_Qrcodeinfo.po;

import lombok.Data;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
public class PmsQrcodeinfo {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 用户区域fid */
    private Integer slk_area_fid;

    /* 所属项目fid */
    private Integer slk_project_fid;

    /* 二维码标识 */
    private String qrcode;

    /* 1-一维码 2-二维码 */
    private String type;

    /* 访问方法(根据标识返查出应访问的方法) */
    private String method;

    /* 描述 */
    private String describes;

    /* 操作人fid */
    private Integer modify_userFid;

    /* 操作人姓名 */
    private String modifyname;

    /* 操作时间 */
    private Date modifydate;

}