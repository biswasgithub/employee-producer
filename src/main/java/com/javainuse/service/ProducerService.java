package com.javainuse.service;

import com.javainuse.dto.CardAccountInfo;
import com.javainuse.dto.EmployeeInfo;

public interface ProducerService{

	public EmployeeInfo produceEmployeeDetails(CardAccountInfo cardAccountInfo, Long personId);
}
