package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.Appointment;
import com.classes.Compte;

public class AppointmentDAO {
	//attrs
		Connection cxn=DaoFactory.getConnection();
		Statement st;
		ResultSet rs;
		int i;
		//meths:
		//////////////////////////////
		void create(Appointment p) {
			try {
				st=cxn.createStatement();
	    		String sql="INSERT INTO appt(idAppt,type) VALUES("+p.getIdP()+",'"+p.getType()+"')";
	    		st.executeUpdate(sql);
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		}
		////////////////////////////
		void delete(int id) {
			try {
				i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
				    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM appt WHERE idAppt =" + id);
				
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		////////////////////
		Appointment getAppt(int id) {
			/**
			 * meth permet la recuperation d'un Appointment à partir de son id
			 * @param id:un int identifie un Appointment
			 * @return le rendez-vous recherché si il existe sinon une instance creer par le const par defaut de la classe Compte
			 */
			Appointment a=new Appointment();
			try {
				PropDAO p=new PropDAO();
				rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM appt WHERE idAppt = " + id);
				 if(rs.first())
	                 a = new Appointment(p.getProp(rs.getInt("idAppt")),rs.getString("Type"));
	         
			    } catch (SQLException e) {
			            e.printStackTrace();
			    }
			   return a;
		}
		////////////////////////
		List<Appointment> listerA(){
			List<Appointment> L=new ArrayList<Appointment>();
			try {
				PropDAO p=new PropDAO();//car besoin d'une Proposition afin de creer une instance Appointment
				rs=cxn.createStatement().executeQuery("Select * from Appt");
				while(rs.next()) {
					L.add(new Appointment(p.getProp(rs.getInt("idAppt")),rs.getString("Type")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return L;
		}
}
