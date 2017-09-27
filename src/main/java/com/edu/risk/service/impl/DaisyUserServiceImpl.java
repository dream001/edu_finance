package com.edu.risk.service.impl;

import org.springframework.stereotype.Service;

import com.edu.risk.mapper.DaisyUserMapper;
import com.edu.risk.model.DaisyUserVO;
import com.edu.risk.service.BaseService;
import com.edu.risk.service.IDaisyUserService;

@Service
public class DaisyUserServiceImpl extends BaseService implements IDaisyUserService {

	@Override
	public DaisyUserVO findUserByCode(String sUserCode) {
		DaisyUserMapper mapper = getMapper(DaisyUserMapper.class);
		return mapper.selectUserByCode(sUserCode);
	}

}
