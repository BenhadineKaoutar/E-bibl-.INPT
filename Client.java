package com.classes;

public class Client {
	//attrs
	//LN=LastName...
	String LN,FN,NN,email;
	int idClient;
	static int y=0;
	//const
	Client(String LN,String FN,String email){
		this.LN=LN;
		this.FN=FN;
		this.email=email;
		idClient=++y;
	}
	//meth 
	void setLN(String n){this.LN=n;}
	void setFN(String n) {this.FN=n;}
	void setNN(String n) {this.NN=n;}
	void setEmail(String e) {this.email=e;}
	
	String getLN() {return LN;}
	String getFN() {return FN;}
	String getNN() {return NN;}
	String getEmail() {return email;}

}
