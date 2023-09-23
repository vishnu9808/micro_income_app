package com.vis.boot.income.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vis.boot.income.pojo.Income;

@RestController
public class IncomeController {

	@RequestMapping("/helloIncome")
	public String heeloIncome() {
		return "helloIncome";
	}
	
	@GetMapping("/getIncomeByPersonId/{personId}")
	public ResponseEntity<Income> getIncomeByPersonId(@RequestHeader("Accept-Language") String language,
			@PathVariable("personId") Long personId) {
		Income income = new Income();
		income.setIncomeAmount(new Double(1200));
		income.setPersonId(1L);
		income.setIncomeId(1L);
		income.setIncomeType("EMPLOYMNET");
		
		return new ResponseEntity<>(income, org.springframework.http.HttpStatus.OK);
	}
	
}
