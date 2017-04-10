package org.framestudy.spring_mybatis.test.usermag;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserService {
	
	@Resource
	private IUserService userInfoServiceImpl;
	
	@Test
	public void testSaveUserInfo(){
		UserInfo user = new UserInfo(null, "小妹", "123456", 18);
		userInfoServiceImpl.saveUserInfo(user);
		
		
		
	}
}
