package com.slk.projectrun.module.SLK_User.service;

import com.slk.projectrun.module.SLK_User.po.SlkUser;
import java.util.Map;

public interface SlkUserService {

    //添加或修改
	Map<String,Object> insertOrUpdate(SlkUser user);

	//根据主键删除
	Map<String,Object> deleteByFid(Integer fid);

	//查询所有记录
	Map<String,Object> selectAll();

}