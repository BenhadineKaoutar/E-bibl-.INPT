package com.Test;

import com.DAO.ClientDAO;
import com.DAO.LivreDAO;
import com.classes.*;

import junit.framework.TestCase;

public class LivreTest extends TestCase{
	public void testCreate() {
		
		LivreDAO d=new LivreDAO();
		ClientDAO dd=new ClientDAO();
		Client cc;
		Livre l=new Livre(cc=dd.getClient(1),"Cyrano de Bergerac","Edmond Rostand","papier");
		d.create(l);
		d.delete(14);
		
		TestCase.assertEquals("Echec test X","Kaoutar",l.c.FN);
	}
	public void testGetLivreId() {
		LivreDAO d=new LivreDAO();
		ClientDAO dd=new ClientDAO();
		Client cc;
		Livre l=new Livre(cc=dd.getClient(1),"Cyrano de Bergerac","Edmond Rostand","papier");
		int id=d.getLivreId(l.getTitre(),l.getAuteur(), l.getFormat(),dd.getClientId(cc.email));
		Livre l1=d.getLivre(id);
		
		TestCase.assertEquals("Echec test X","Edmond Rostand",l1.getAuteur());
	}
	public void testUpdate() {
		
		LivreDAO d=new LivreDAO();
		ClientDAO dd=new ClientDAO();
		Livre l=d.getLivre(13);
		l.setAuteur("Benhadine kaoutar");
		
		d.update(l,13);
		
		TestCase.assertEquals("Echec test X","Benhadine kaoutar",d.getLivre(d.getLivreId(l.getTitre(),l.getAuteur(), l.getFormat(),dd.getClientId(l.c.email))).getAuteur());
	}

}
