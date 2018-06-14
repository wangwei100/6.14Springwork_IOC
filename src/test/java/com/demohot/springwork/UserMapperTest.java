package com.demohot.springwork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.demohot.springwork.mapper.UserMapper;
import com.demohot.springwork.po.User;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "classpath:beans.xml" })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testGet() {
		User user = userMapper.get(2);
		System.out.println(user.getUsername());
	}
}
