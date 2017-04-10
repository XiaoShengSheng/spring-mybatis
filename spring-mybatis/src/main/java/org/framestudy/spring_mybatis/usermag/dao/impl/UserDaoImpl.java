package org.framestudy.spring_mybatis.usermag.dao.impl;

import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		return 0;
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserInfo getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
