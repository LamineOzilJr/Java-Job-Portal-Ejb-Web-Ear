package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.Job;

@Local
public interface IJobLocal {
	
	public List<Job> liste();
	public int add (Job job);

}
