package com.tut;

import javax.persistence.*;

@Entity				// we can change name of table e.g @Entity (name="Student_details")/ tabe
public class Student {
	
	@Id
	private int sId;
	private String name;
	private String city;
	
	private Certification certificate;

	public Student() {

	}

	public Student(int sId, String name, String city) {
		super();
		this.sId = sId;
		this.name = name;
		this.city = city;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certification getCertificate() {
		return certificate;
	}

	public void setCertificate(Certification certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", city=" + city + "]";
	}
}
