package com.alingluo.web;


import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alingluo.Application;
import com.alingluo.util.AlingLuoProperties;

/**
 * 
 * @name: PropertiesTest
 * @Description:测试配置文件
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class PropertiesTest {
	
	@Autowired
	private AlingLuoProperties properties;
	
	/**
	 * 
	 * @Title: getValue
	 * @Description:测试获得配置文件的值
	 */
	
	@Test
	public void getValue(){
		try {
			//进行编码格式转换
			Assert.assertEquals("阿灵罗",new String(properties.getTitle().getBytes("ISO-8859-1"),"UTF-8"));
			Assert.assertEquals("不再逃避", new String(properties.getDescription().getBytes("ISO-8859-1"),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
