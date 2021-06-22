package com.miempresa.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="cellphone")
	private String cellphone;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="birth_day")
	private Date birth_day;
	
	@Column(name="state")
	private String state;

	public Student() {
		super();
	}

	

	public Student(int id, String name, String address, String email, String telephone, String cellphone, String gender,
			Date birth_day, String state) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
		this.cellphone = cellphone;
		this.gender = gender;
		this.birth_day = birth_day;
		this.state = state;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
}
