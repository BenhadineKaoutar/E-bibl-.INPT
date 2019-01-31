package com.Test;

import com.DAO.ClientDAO;
import com.DAO.CompteDAO;
import com.classes.Compte;
import com.classes.Client;

import junit.framework.TestCase;

public class CompteTest extends TestCase{
	public void testCreateEtGetCompteId() {
		
		CompteDAO d=new CompteDAO();
		ClientDAO dd=new ClientDAO();
		Client  cc;
		Compte c=new Compte(cc=dd.getClient(20),"login", "passwd");
		d.create(c);
		int id=d.getCompteId("login");
		;
		
		TestCase.assertEquals("Echec test X",20,id);
	}
	public void testUpdateEtGetCompte(){
		
		CompteDAO d=new CompteDAO();
		Compte c=d.getCompte(9);
		String pas=c.getPasswd();
		c.setPasswd("medpasswd");
		d.update(c);
		d.delete(16);
		
		TestCase.assertEquals("Echec test X","medpasswd",d.getComptePasswd(c.login));
	}

}
