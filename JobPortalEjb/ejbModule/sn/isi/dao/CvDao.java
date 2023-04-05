package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Cv;

@Stateless
public class CvDao implements ICvLocal {
	
	
	
	@PersistenceContext(unitName="jobportalEJB")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cv> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT c from Cv c")
				 .getResultList();
	}

	@Override
	public int add(Cv cv) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			 //em.getTransaction().begin();
			 em.persist(cv);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
	

}
