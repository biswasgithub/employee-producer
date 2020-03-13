package com.javainuse.service;

import org.springframework.stereotype.Service;

import com.javainuse.dto.CardAccountInfo;
import com.javainuse.dto.EmployeeInfo;

@Service
public class ProducerServiceImpl implements ProducerService {

	public EmployeeInfo produceEmployeeDetails(CardAccountInfo cardAccountInfo, Long personId) {

		EmployeeInfo emp = new EmployeeInfo();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		emp.setCardNumber(cardAccountInfo.getCardnumber());
		emp.setAccountNumber(cardAccountInfo.getAccountNumber());
		emp.setPersonId(personId);
		return emp;
	}
}
