package com.klef.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Student_table")
public class Student {

	  //properties
	  @Id //primary key=unique + notnull
	  @Column(name = "sid")
	  private long id;
	  @Column(name="sname",length=50,nullable = false)
	  private String name;
	  @Column(nullable = false)
	  private String sgender;
	  @Column(nullable = false)
	  private String dep;
	  @Column(name = "semail",length = 250,nullable = false,unique = true)
	  private String email;
	  @Column(name= "scontact",length = 15,nullable = false,unique = true)
	  private String contact;
	  
	  @Column(length=30,nullable = false)
	  private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	  
	  
	  
	  
	  
}