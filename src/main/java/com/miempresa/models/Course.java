package com.miempresa.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="price")
	private double price;
	
	@Column(name="start_date")
	private Date start_date;
	
	@Column(name="end_date")
	private Date end_date;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="sessions")
	private int sessions;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="signed_up")
	private int signed_up;
	
	@Column(name="state")
	private boolean state;

	public Course() {
		super();
	}

	public Course(int id, double price, Date start_date, Date end_date, int duration, int sessions, int capacity,
			int signed_up, boolean state) {
		super();
		this.id = id;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.duration = duration;
		this.sessions = sessions;
		this.capacity = capacity;
		this.signed_up = signed_up;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getSessions() {
		return sessions;
	}

	public void setSessions(int sessions) {
		this.sessions = sessions;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSigned_up() {
		return signed_up;
	}

	public void setSigned_up(int signed_up) {
		this.signed_up = signed_up;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
	
}
