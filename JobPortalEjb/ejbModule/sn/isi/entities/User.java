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
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String login;
	@Column(length = 100, nullable = false)
	private String password;
//	@OneToMany(fetch = FetchType.EAGER)
//	private List<Cv> cvs = new ArrayList<Cv>();
	
	public User() {
		super();
	}
	
	public User(int id, String login, String password, List<Cv> cvs) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		//this.cvs = cvs;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//	public List<Cv> getCvs() {
//		return cvs;
//	}
//
//	public void setCvs(List<Cv> cvs) {
//		this.cvs = cvs;
//	}
//	
	

}
