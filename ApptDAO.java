package com.DAO;

import java.util.List;

import com.classes.Appointment;
import com.classes.Client;
import com.classes.Compte;
import com.classes.Livre;

public interface ApptDAO {
	//class:Appointment
	List<Appointment> lister();//read
	void create(Appointment p);
	void update(Appointment p);
	void delete(Appointment p);
	//class:Compte
	void create(Compte c);
	void update(Compte c);
	void delete(Compte c);
	
	//class:Client
	void create(Client c);
	void update(Client c);
	void delete(Client c);
	
	//class:Livre
	void create(Livre l);
	void update(Livre l);
	void delete(Livre l);
	
	
	
	

}
