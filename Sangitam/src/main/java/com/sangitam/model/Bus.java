package com.sangitam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {
	@Id
	private int id;
	private String name;
	private String fromLocation;
	private String toLocation;
	private double ticket;
	private int busno;
	private int date;
	private String status;
	private int time;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public double getTicket() {
		return ticket;
	}

	public void setTicket(double ticket) {
		this.ticket = ticket;
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation
				+ ", ticket=" + ticket + ", busno=" + busno + ", date=" + date + ", status=" + status + ", time=" + time
				+ "]";
	}
	
	

}
