package com.edu.risk.service;

import com.edu.risk.model.DaisyUserVO;

/**
 * 
 * 用户(租户)服务
 * @author jiwenlong
 *
 */
public interface IDaisyUserService {
	/**
	 * 根据用户编码查询用户
	 * @param sUserCode
	 * @return
	 */
	DaisyUserVO findUserByCode(String sUserCode);
}
