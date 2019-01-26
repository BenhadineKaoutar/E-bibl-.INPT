package com.classes;

public class Livre {
	//attrs
	int idLivre;
	static int w=0;
	String Titre,Auteur,format;//format=(electronic||papier)
	//const
	Livre(String Titre,String Auteur,String format){
		this.Titre=Titre;
		this.Auteur=Auteur;
		this.format=format;
		idLivre=++w;
	}
	

}
