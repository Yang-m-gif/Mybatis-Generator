package com.slk.projectrun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.slk.projectrun.module.SLK_User.po.SlkUser;
import com.slk.projectrun.module.SLK_User.service.SlkUserService;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private SlkUserService userService;

	/**
	 * @Description 新增或修改
	 * @param
	 * @return java.util.Map<java.lang.String,java.lang.Object>
	 * @author
	 * @Date
	 **/
	@RequestMapping("/insertOrUpdate")
	public Map<String,Object> insertOrUpdate(SlkUser user){
        return userService.insertOrUpdate(user);
    }

    /**
     * @Description 根据主键删除
     * @param fid
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
	@RequestMapping("/deleteByFid")
	public Map<String,Object> deleteByFid(Integer fid){
        return userService.deleteByFid(fid);
    }

    /**
     * @Description 查询所有
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author
     * @Date
     **/
	@RequestMapping("/selectAll")
	public Map<String,Object> selectAll(){
        return userService.selectAll();
    }

}