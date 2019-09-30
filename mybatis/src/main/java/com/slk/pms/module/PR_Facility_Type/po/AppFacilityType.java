package com.slk.pms.module.PR_Facility_Type.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
public class AppFacilityType {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fid;

    /* 巡检类型名称 */
    private String name;

    /* 巡检内容 */
    private List<AppFacilityContent> facilityContentApp;
}