package com.classes;

public class Appointment extends PropAppointment {//une fois une proposition de rendez vous est confirmée un Appt est cree automatiquement
	//attrs
	int idAppt;
	String Type;// rendez vous de pret ou de retour
	//const
	Appointment(){
		super();
		if(super.confirmation1==super.confirmation2==true) {
			idAppt=super.idPropAppt;
			c1=super.c1;
			c2=super.c2;
			L=super.L;
			Date=super.Date;
			}
	}
	//pas de setters
	Livre getLivre() {return L;}
	String getDate() {return Date;}
	Client[] getCientsConcernes() {Client[] T={c1,c2};return T;}

}
