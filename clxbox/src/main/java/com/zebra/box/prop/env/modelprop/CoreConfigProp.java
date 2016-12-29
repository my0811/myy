package com.zebra.box.prop.env.modelprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 链接web service core 配置文件属性实体类
 * */
@Component
public class CoreConfigProp {
	//core 链接地址
	@Value("#{coreConfigProperties['core.path']}")
	private String corePath;
	//访问用户名 root用户
	@Value("#{coreConfigProperties['core.root']}")
	private String rootName;
	public String getCorePath() {
		return corePath;
	}
	public void setCorePath(String corePath) {
		this.corePath = corePath;
	}
	public String getRootName() {
		return rootName;
	}
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}

	
}
