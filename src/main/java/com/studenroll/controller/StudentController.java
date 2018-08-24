package com.studenroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.studenroll.service.StudEnrollService;

@RestController
@Validated

public class StudentController {

	@Autowired
	private StudEnrollService studEnrollService;

	@GetMapping(value = "/cijo", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody DeferredResult<ResponseEntity<String>>
	getAdvertiserById() {
		System.out.println("In controller>>><<<");
		studEnrollService.getStudentList("1000");
		//StudentEnrollMapper studentEnrollMapper = new StudentMapper();
		//String advertiser =studentEnrollMapper.getStudentId("1000");
		//System.out.println(advertiser);
		
		return null;
	}
	
	
	

}
