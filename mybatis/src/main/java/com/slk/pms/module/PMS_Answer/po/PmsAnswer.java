package com.slk.pms.module.PMS_Answer.po;

import lombok.Data;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
public class PmsAnswer {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 问题fid */
    private Integer question_fid;

    /* 内容 */
    private String content;

    /* 患者病区fid */
    private Integer ward_fid;

    /* 患者姓名 */
    private String customer_name;

    /* 患者住院号 */
    private String hospitalid;

    /* 操作人FID */
    private Integer modify_userFid;

    /* 操作人姓名 */
    private String modifyname;

    /* 操作人角色 */
    private String modifyrole;

    /* 操作时间 */
    private Date modifydate;

}