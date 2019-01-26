package com.classes;

public class Compte {
	//attrs
	static int x=0;
	int idCompte;
	String login,passwd;
	//const
	Compte(String login,String passwd){
		this.idCompte=++x;//x++ puis idCompte=x
		this.login=login;
		this.passwd=passwd;}
	Compte(){
		this.idCompte=++x;
		this.login="user";
		this.passwd="user";
	}
	//meths
	void setLogin(String x) {login=x;}
	void setPasswd(String x) {passwd=x;}
	
	String getPasswd() {return passwd;}
	String getLogin() {return login;}
	int getIdCompte() {return idCompte;}
	

}
