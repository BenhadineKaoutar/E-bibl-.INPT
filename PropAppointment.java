package com.classes;

public class PropAppointment {
	//attrs
	int idPropAppt;
	static int p=0;
	Client c1;
	Client c2;
	Livre L;
	String Date;//necessite un traitement
	boolean confirmation1,confirmation2;
	
	//const1
	PropAppointment(Client c1,Client c2,Livre L,String Date){
		idPropAppt=++p;
		this.c1=c1;
		this.c2=c2;
		this.L=L;
		this.Date=Date;
		confirmation1=false;
		confirmation2=false;
		}
	//const2:exploiter dans la sous-classe Appointment
	PropAppointment(String Date,Client c1,Client c2,Livre L){
		idPropAppt=++p;
		this.c1=c1;
		this.c2=c2;
		this.L=L;
		this.Date=Date;
		}
	//const3
	PropAppointment(){}
	//meth
	void setDate(String d) {Date=d;}
	void setLivre(Livre l) {L=l;}
	
	void Confirmation(Client c) {
		if(c.equals(c1))confirmation1=true;
		else {if(c.equals(c2))confirmation2=true;}
		//sinon le client n'est pas concerné par le rendez vous 
	}
	

}
