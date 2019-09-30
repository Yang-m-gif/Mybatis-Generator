package com.slk.pms.module.PR_Facility_Type.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class AppFacilityContent {

    private Integer fid;

    /* 巡检内容名称 */
    private String name;

}