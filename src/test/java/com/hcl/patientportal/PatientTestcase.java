package com.hcl.patientportal;

import com.hcl.patientportal.entity.CalendarEntity;
import com.hcl.patientportal.repository.CalendarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest

public class PatientTestcase {

    @MockBean
    CalendarRepository calendarRepository;

    @Autowired
    com.hcl.patientportal.service.PatientPortalService patientPortalService;

    @Test
    public void testPatient() {

        List calLst = Arrays.asList(new CalendarEntity());
        when(calendarRepository.findByRegionAndSpeciality("chicago","cadio")).thenReturn((calLst));
        assertEquals(1, patientPortalService.findByRegionAndSpeciality("chicago","cadio").size());


    }


}
