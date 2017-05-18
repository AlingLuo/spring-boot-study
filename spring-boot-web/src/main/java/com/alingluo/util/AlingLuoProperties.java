package com.alingluo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @name: AlingLuoProperties
 * @Description:获得配置文件内容
 * @author Administrator
 */
@Component
public class AlingLuoProperties {

	@Value("${com.alingluo.title}")
	private String title;
	
	@Value("${com.alingluo.decription}")
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
