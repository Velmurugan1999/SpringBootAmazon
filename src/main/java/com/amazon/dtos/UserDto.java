package com.amazon.dtos;

import com.amazon.models.Address;

public class UserDto {
	private int userid;
	private String uname;
	private String mobile;
	private String emailid;
	private Address  address;
	
	public UserDto() {
		
	}

	public UserDto(int userid, String uname, String mobile, String emailid, Address address) {
		super();
		this.userid = userid;
		this.uname = uname;
		this.mobile = mobile;
		this.emailid = emailid;
		this.address = address;
	}


	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
