package com.te.lms.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.EmployeeRegDTO;
import com.te.lms.response.SuccessResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping(path = "employees")
@RestController
public class EmployeeController {

	@GetMapping(path = "")
	public ResponseEntity<SuccessResponse> getEmployee(@RequestBody EmployeeRegDTO regDTO) {
		return ResponseEntity.<SuccessResponse>ok(SuccessResponse.builder().message("api worked")
				.timestamp(LocalDateTime.now()).data(regDTO).status(HttpStatus.OK).build());
	}
}
