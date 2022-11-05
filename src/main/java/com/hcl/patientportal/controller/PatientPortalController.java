package com.hcl.patientportal.controller;

import java.util.List;

import com.hcl.patientportal.entity.CalendarEntity;
import com.hcl.patientportal.service.PatientPortalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientPortalController {
	
	@Autowired
	PatientPortalService patientPortalService;
	
	@Autowired
	ModelMapper modelMapper;
	

	@RequestMapping(value="doctors/{region}", method=RequestMethod.GET)
	public ResponseEntity<List<CalendarEntity>> findAvaiableDcotorByDate(@PathVariable String region) {
		List<CalendarEntity> apointsAvaiable = patientPortalService.findByRegion(region);
		return new ResponseEntity(apointsAvaiable, HttpStatus.OK);

	}

	@RequestMapping(value="doctors/{region}/{speciality}", method=RequestMethod.GET)
	public ResponseEntity<List<CalendarEntity>> findAvaiableDcotorByRegionSpeciality(@PathVariable String region,@PathVariable String speciality) {
		List<CalendarEntity> apointsAvaiable = patientPortalService.findByRegionAndSpeciality(region,speciality);
		return new ResponseEntity(apointsAvaiable, HttpStatus.OK);

	}
	





}
