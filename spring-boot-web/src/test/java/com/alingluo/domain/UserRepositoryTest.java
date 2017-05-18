package com.alingluo.domain;



import java.text.DateFormat;
import java.util.Date;




import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alingluo.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void test() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formatDate = dateFormat.format(date);
		
		userRepository.save(new User("猪小妹", "123", "asd@123.com","meimei",formatDate));
		userRepository.save(new User("猪小妹1", "123", "asd1@123.com","meimei1",formatDate));
		userRepository.save(new User("猪小妹2", "123", "asd12@123.com","meimei12",formatDate));
		Assert.assertEquals(3, userRepository.findAll().size());
		Assert.assertEquals("meimei1", userRepository.findByUserName("猪小妹1").getNickName());
		
	}

}
