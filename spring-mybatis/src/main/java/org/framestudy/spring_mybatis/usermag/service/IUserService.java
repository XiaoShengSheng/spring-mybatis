package org.framestudy.spring_mybatis.usermag.service;

import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserService {
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	public int saveUserInfo(UserInfo user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUserInfo(UserInfo user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUserInfo(Long id);
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	public UserInfo getUserInfoById(Long id);
}
