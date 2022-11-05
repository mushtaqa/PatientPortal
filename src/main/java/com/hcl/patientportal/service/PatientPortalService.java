package com.hcl.patientportal.service;

import java.util.List;

import com.hcl.patientportal.entity.CalendarEntity;
import com.hcl.patientportal.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientPortalService {

	@Autowired
	CalendarRepository calendarRepository;
	public List<CalendarEntity> findByRegion(String region) {
		return calendarRepository.findByRegion(region);
	}
	public List<CalendarEntity> findByRegionAndSpeciality(String region,String speciality) {
		return calendarRepository.findByRegionAndSpeciality(region,speciality);
	}
	
}
