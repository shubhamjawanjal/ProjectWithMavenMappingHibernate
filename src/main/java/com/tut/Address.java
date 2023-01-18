package com.tut;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="student_address")
public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="address_id") 
	private int addressId;
	
	@Column(length =50, name="Street")
	private String street;
	
	@Column(length =100, name="City")
	private String city;
	
	@Column(name =" is_open")
	private boolean isopen;
	
	@Transient			// no column will create for this column name
	private  double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob			// large object
	private byte[] image;
	public Address() {
		super();
	}
	public Address(int addressId, String street, String city, boolean isopen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
