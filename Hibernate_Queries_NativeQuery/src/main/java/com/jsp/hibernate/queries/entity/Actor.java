package com.jsp.hibernate.queries.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

	@Id
	private int actorId;
	private String actorName;
	private String actorNationality;
	private int actorAge;

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorNationality() {
		return actorNationality;
	}

	public void setActorNationality(String actorNationality) {
		this.actorNationality = actorNationality;
	}

	

	public int getActorAge() {
		return actorAge;
	}

	public void setActorAge(int actorAge) {
		this.actorAge = actorAge;
	}
	
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorNationality=" + actorNationality
				+ ", actorAge=" + actorAge + "]";
	}
	

}
