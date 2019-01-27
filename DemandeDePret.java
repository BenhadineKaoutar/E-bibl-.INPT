package com.classes;

public class DemandeDePret {
	//attrs
	int idDem;
	static int d=0;
	Client c1,c2;//c1 qui dépose la demande et c'est à c2 de confirmer ou non
	Livre L;
	boolean CFM=false;//valeur false par defaut
	//const
	public DemandeDePret(Client c1,boolean CFM,Client c2,Livre L) {
		idDem=++d;
		this.c1=c2;
		this.c2=c1;
		this.L=L;
		this.CFM=CFM;
	}
	public DemandeDePret(Client c1,Client c2,boolean CFM,Livre L) {
		idDem=++d;
		this.c1=c1;
		this.c2=c2;
		this.L=L;
		this.CFM=CFM;
	}
	public DemandeDePret() {}
	//meth
	void setLivre(Livre l) {L=l;}
	void setClient(Client c2) {this.c2=c2;}//on change le client de destination non celui qui depose la demande (source)
	void Confirmation(boolean CFM) {this.CFM=CFM;}
	
}
