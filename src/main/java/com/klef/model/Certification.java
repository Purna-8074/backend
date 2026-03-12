package com.klef.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Certification {
	
	@Id
    private int id;
	@Column(nullable = false)
    private String category;
	@Column(nullable = false)
    private String company;
	@Column(nullable = false)
    private String title;
	@Column(nullable = false)
    private String level;
	@Column(nullable = false,unique = true)
    private String examtype;
	@Column(nullable = false)
    private String certificateid;
	@Column(nullable = false)
    private String issueddate;
	@Column(nullable = false)
    private String expiarydate;
	@Column(nullable = false,unique = true)
    private String certificateurl;
	@Column(nullable = false,unique = true)
    private String status; //Submitted or accpeted or rejected
    
    //By Whom Student upload the certificate
	
	@ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getExamtype() {
		return examtype;
	}

	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}

	public String getCertificateid() {
		return certificateid;
	}

	public void setCertificateid(String certificateid) {
		this.certificateid = certificateid;
	}

	public String getIssueddate() {
		return issueddate;
	}

	public void setIssueddate(String issueddate) {
		this.issueddate = issueddate;
	}

	public String getExpiarydate() {
		return expiarydate;
	}

	public void setExpiarydate(String expiarydate) {
		this.expiarydate = expiarydate;
	}

	public String getCertificateurl() {
		return certificateurl;
	}

	public void setCertificateurl(String certificateurl) {
		this.certificateurl = certificateurl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", category=" + category + ", company=" + company + ", title=" + title
				+ ", level=" + level + ", examtype=" + examtype + ", certificateid=" + certificateid + ", issueddate="
				+ issueddate + ", expiarydate=" + expiarydate + ", certificateurl=" + certificateurl + ", status="
				+ status + ", student=" + student + "]";
	}
    
    
    
    
    
    
}
