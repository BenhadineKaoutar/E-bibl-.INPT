package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.classes.Compte;
import com.classes.PropAppointment;

public class PropDAO {
	//attrs
	Connection cxn=DaoFactory.getConnection();
	PreparedStatement preparedStatement;
	Statement st;
	ResultSet rs;
	int i;
	//meths
	///////////////
	void create(PropAppointment p) {
		try {
			st=cxn.createStatement();
    		String sql="INSERT INTO Propappt (idpropAppt,idDemande,date,conf1,conf2) VALUES("+p.getIdP()+","+p.getId()+",'"+p.getDate()+"',"+p.getConf1()+","+p.getConf2()+" )";
    		st.executeUpdate(sql);
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	};
	//non disponible pour cette class
	//void update(PropAppointment p){};
	////////////////////////////
	void delete(int id){
		try {
			i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM Propappt WHERE idPropAppt =" + id);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/////////////////////
	PropAppointment getProp(int id) {
		/**
		 * meth permet la recuperation d'une proposition de rendez-vous à partir de son id
		 * @param id:un int identifie une proposition
		 * @return la proposition recherchée si il existe sinon une instance creer par le const par defaut de la classe PropAppointment
		 */
		PropAppointment p=new PropAppointment();
		try {
			DemandDAO d=new DemandDAO();
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Propappt WHERE idpropAppt = " + id);
			 if(rs.first())
                 p = new PropAppointment(d.getDemande(rs.getInt("idDemande")),rs.getString("date"));
         
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return p;
		}
	}
	