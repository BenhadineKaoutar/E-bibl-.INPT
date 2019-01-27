package com.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.classes.Appointment;

public class ApptDAOImpl implements ApptDAO {
	DaoConnection daoConnection;
	public ApptDAOImpl(DaoConnection daoConnection) {
		this.daoConnection=daoConnection;
	}

	@Override
	public void Add(Appointment p) {
		Connection cxn=null;
		PreparedStatement preparedStatement=null;
		try {
			cxn=daoConnection.getConnection();
			preparedStatement=cxn.prepareStatement("Insert into nomTable(nomAtt,..)Values(?,?,?);");
			preparedStatement.setString(1,Appointment.getNom());
			preparedStatement.setString(2,Appointment.getNom());
			preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Appointment> lister() {
		List<Appointment> appts=new ArrayList<Appointment>();
		Connection cxn=null;
		Statement statement=null;
		ResultSet resultat=null;
		
		try {
			cxn=daoConnection.getConnection();
			statement=cxn.createStatement();
			resultat=statement.executeQuery("select * from nom table");
			while(resultat.next()) {
				String nom=resultat.getString("nom");
				String prenom=resultat.getString("preno,");
				
				Appointment appt=new Appointment();
				appt.setNom(nom);
				appt.setPrenom(prenom);
				
			}
		}
		
	}
	

}
