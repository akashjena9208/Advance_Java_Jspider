package com.jsp.hibernate.caching;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
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
