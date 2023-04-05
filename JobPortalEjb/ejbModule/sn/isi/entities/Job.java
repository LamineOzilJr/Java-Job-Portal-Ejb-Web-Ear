package sn.isi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String title;
	@Column(length = 100, nullable = false)
	private String category;
	@Column(length = 100, nullable = false)
	private String status;
	@Column(length = 100, nullable = false)
	private String address;
	@Column(length = 100, nullable = false)
	private String pdate;
	
	
	public Job() {
		super();
	}


	public Job(int id,String title, String category, String status, String address, String pdate) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.status = status;
		this.address = address;
		this.pdate = pdate;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPdate() {
		return pdate;
	}


	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	
	

}
