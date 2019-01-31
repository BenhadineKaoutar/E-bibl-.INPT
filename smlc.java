package com.DAO;

import com.classes.Client;
import com.classes.Compte;
import com.classes.DemandeDePret;
import com.classes.Livre;
import com.classes.PropAppointment;

public class smlc {

	public static void main(String[] args) {
	
			LivreDAO d=new LivreDAO();
			Livre l=new Livre(new Client("leila","alaoui","loLAlaoui","leila@gmail.com","fes"),"aa","bb","papier");
			l.setTitre("dododododood");
			System.out.print(l.Titre);
			d.update(l,17);
			
		
	}

}
