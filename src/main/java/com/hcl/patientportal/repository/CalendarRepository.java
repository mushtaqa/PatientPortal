package com.hcl.patientportal.repository;

import java.util.List;

import com.hcl.patientportal.entity.CalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CalendarRepository extends  JpaRepository<CalendarEntity, String>{


	
	/*@Query(
			value = "with q1 as (\n" +
					"SELECT rownum, TRANSACTION_RECORD.* FROM TRANSACTION_RECORD),\n" +
					"q2 as (SELECT payer,  SUM(points) total_points ,min(rownum) minid FROM q1 GROUP BY payer)\n" +
					"SELECT payer, total_points as points FROM q2\n" +
					"Order by minid",
			nativeQuery = true)*/
	List<CalendarEntity> findByRegion(String region);
	List<CalendarEntity> findByRegionAndSpeciality(String region,String speciality);
}
