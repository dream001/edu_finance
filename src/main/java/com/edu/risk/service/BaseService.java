package com.edu.risk.service;

import com.edu.risk.util.mybatis.SqlSessionUtil;

/**
 * 
 * 基础服务
 * @author jiwenlong
 *
 */
public abstract class BaseService{
	 /**
	 * 获取mapper
	 * @param clazz
	 * @return
	 */
	protected  <T> T getMapper(Class<T> clazz){
		 return SqlSessionUtil.getMapper(clazz);
	 }
}
