package sn.isi.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cv implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String firstname;
	@Column(length = 100, nullable = false)
	private String lastname;
	@Column(length = 100, nullable = false)
	private int age;
	@Column(length = 100, nullable = false)
	private String address;
	@Column(length = 100, nullable = false)
	private String email;
//	@Column(length = 100, nullable = false)
//	private String password;
	@Column(length = 100, nullable = false)
	private String phone;
	@Column(length = 100, nullable = false)
	private String speciality;
	@Column(length = 100, nullable = false)
	private String level;
	@Column(length = 100, nullable = false)
	private String experience;
//	@ManyToOne //reactive jpa validator if there is problems
//	private User users = new User();
	
//	@ManyToOne
//	@JoinColumn(name="user_id")
//	private User owner;
	//@Column(length = 100, nullable = false)
	//private String role;
	
//	@OneToMany(mappedBy ="user")
//	private List<Job> job = new ArrayList<Job>();
	
	public Cv() {
		super();
	}


	public Cv(int id,String firstname, String lastname, int age, String address, String email, String phone,
			String speciality, String level, String experience) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.email = email;
		//this.password = password;
		this.phone = phone;
		this.speciality = speciality;
		this.level = level;
		this.experience = experience;
		
		//this.role = role;
	
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
