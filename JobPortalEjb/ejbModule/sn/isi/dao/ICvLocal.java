package sn.isi.dao;

import java.util.List; 

import javax.ejb.Local;

import sn.isi.entities.Cv;

@Local
public interface ICvLocal {

	public List<Cv> liste();
	public int add (Cv cv);
}
