package com.Test;

import com.DAO.ClientDAO;
import com.classes.Client;

import junit.framework.TestCase;

public class ClientTest extends TestCase{
	public void testCreationGetClient(){
		// variables locales pour réaliser les tests + initialization
		ClientDAO d=new ClientDAO();
		Client c=new Client("chamlal", "hajar",null, "hajar@gmail.com", "Fes");
		c.setNN("coco");//un sous-test sur setNN(String)
		d.create(c);//creation d'un vecteur ds la table client à partir d'une instance de la classe Client
		int id=d.getClientId("hajar@gmail.com");//test de la meth getClientId(int)qui appartient à la classe ClientDAO
		Client cc=d.getClient(id);
		
		TestCase.assertEquals("Echec test X","hajar" ,cc.getFN());
		
	}
	public void testUpdate() {
		ClientDAO d=new ClientDAO();
		Client c=d.getClient(20);
		c.setFN("fernand");
		c.setLN("Jonas");
		d.update(c);
		
		TestCase.assertEquals("Echec test X","fernand",c.FN);
	}

}
