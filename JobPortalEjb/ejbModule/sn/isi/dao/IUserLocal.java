package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.User;

@Local
public interface IUserLocal {
	
	public List<User> liste();
	public int add (User user);
	//public User getUser(String login, String password);
}
