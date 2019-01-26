package com.classes;

public class Ville {
	//attrs
	int idVille;
	String NomVille;
	static int z=0;
	//const
	Ville(String NomVille){
		idVille=++z;
		this.NomVille=NomVille;
	}
	//meth
	void setNomVille(String v) {NomVille=v;}

}
