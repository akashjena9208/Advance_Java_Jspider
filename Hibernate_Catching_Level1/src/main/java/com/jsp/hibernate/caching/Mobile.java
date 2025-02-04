package com.jsp.hibernate.caching;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String mobileModel;
	private String  mobilBrand;
	
	
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public String getMobilBrand() {
		return mobilBrand;
	}
	public void setMobilBrand(String mobilBrand) {
		this.mobilBrand = mobilBrand;
	}
	
	
	
	

}
