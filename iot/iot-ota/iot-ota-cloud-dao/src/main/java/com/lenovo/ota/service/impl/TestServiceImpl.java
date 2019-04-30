package com.lenovo.ota.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lenovo.ota.dao.Test2Mapper;
import com.lenovo.ota.dao.TestMapper;
import com.lenovo.ota.entites.Test;
import com.lenovo.ota.entites.Test2;
import com.lenovo.ota.service.TestService;

@Transactional
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private Test2Mapper test2Mapper;

	@Override
	public Test findOne() {
		return testMapper.selectByPrimaryKey(1);
	}

	@Override
	public Test2 findOneTest2() {
		return test2Mapper.selectByPrimaryKey(1);
	}

}
