package com.hibernate.project.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int panid;
	private String pannum;
	private String panaddress;
	public int getPanid() {
		return panid;
	}
	public void setPanid(int panid) {
		this.panid = panid;
	}
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public String getPanaddress() {
		return panaddress;
	}
	public void setPanaddress(String panaddress) {
		this.panaddress = panaddress;
	}
	
}
