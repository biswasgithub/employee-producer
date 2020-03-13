package com.javainuse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.dto.CardAccountInfo;
import com.javainuse.dto.EmployeeInfo;
import com.javainuse.service.ProducerService;

@RestController
@RequestMapping(value="v1/producer")
public class ProducerController {
	
	@Autowired
	ProducerService producerService;

	@PostMapping(value = "/employeedetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeInfo> produceEmployeeDetails(@RequestBody CardAccountInfo cardAccountInfo, @RequestHeader Long personId) {

		EmployeeInfo employeeDetails=producerService.produceEmployeeDetails(cardAccountInfo,personId);
		if(!employeeDetails.getAccountNumber().matches("[0-9]")) {
			return new ResponseEntity<EmployeeInfo>(employeeDetails,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<EmployeeInfo>(employeeDetails, HttpStatus.OK);
	}

}
