package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Job;

@Stateless
public class JobDao implements IJobLocal {
	
	@PersistenceContext(unitName="jobportalEJB")
	private EntityManager em;
	
	@Override
	public List<Job> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT j from Job j")
				 .getResultList();
	}

	@Override
	public int add(Job job) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			 //em.getTransaction().begin();
			 em.persist(job);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	

}
