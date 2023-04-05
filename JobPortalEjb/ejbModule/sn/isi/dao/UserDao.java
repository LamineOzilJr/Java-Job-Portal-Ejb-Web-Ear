package sn.isi.dao;

import java.util.ArrayList;
import java.util.List; 

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import sn.isi.entities.User;

@Stateless
public class UserDao implements IUserLocal {
	
	
	@PersistenceContext(unitName="jobportalEJB")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT u from User u")
				 .getResultList();
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			 //em.getTransaction().begin();
			 em.persist(user);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

//	@Override
//	public User getUser(String login, String password) {
//		List<User> users = new ArrayList();
//        User i = new User();
//        users = this.liste();
//        for (User ing : users) {
//            if(ing.getLogin().equals(login) && ing.getPassword().equals(password)) {
//                return ing;
//            }
//        }
//        return null;
//	}
//	

}
