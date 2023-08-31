package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="employee_leave")
public class Leave {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveid;
	private int employee_id;
	private String startdate;
	private String enddate;
	private String reason;
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave(int leaveid, int employee_id, String startdate, String enddate, String reason) {
		super();
		this.leaveid = leaveid;
		this.employee_id = employee_id;
		this.startdate = startdate;
		this.enddate = enddate;
		this.reason = reason;
	}
	public int getLeaveid() {
		return leaveid;
	}
	public void setLeaveid(int leaveid) {
		this.leaveid = leaveid;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
	
	
