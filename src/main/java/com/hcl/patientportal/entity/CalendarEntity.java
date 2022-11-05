package com.hcl.patientportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="CALENDAR")
public class CalendarEntity implements Serializable{

	private static final long serialVersionUID = -4576523049380740997L;
	
	@Id
	@GeneratedValue
	private Integer id;
	private String region;
	private Integer doctor_id;
	private String doctor_name;
	private String speciality;
	private String starttime;
	private String endtime;
	private String available;
	private String date;

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CalendarEntity that = (CalendarEntity) o;
		return Objects.equals(id, that.id) && Objects.equals(region, that.region) && Objects.equals(doctor_id, that.doctor_id) && Objects.equals(doctor_name, that.doctor_name) && Objects.equals(starttime, that.starttime) && Objects.equals(speciality, that.speciality) && Objects.equals(endtime, that.endtime) && Objects.equals(available, that.available) && Objects.equals(date, that.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, region, doctor_id, doctor_name, starttime, speciality, endtime, available, date);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getRegion() {
		return region;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Integer doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

}
