package com.twg.spring.mydiary.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="entries")
public class Entry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")//bcz data base accepts this format.so changing format
	private Date entrydate;
	
	private String Description;
	
	private int userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
