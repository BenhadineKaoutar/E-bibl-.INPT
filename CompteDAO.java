package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.Client;
import com.classes.Compte;

public class CompteDAO {
	//attrs
	Connection cxn=DaoFactory.getConnection();
	Statement st;
	ResultSet rs;
	int i;
	//meths:
	//////////////////////////////
	public void create(Compte c) {
		try {
			st=cxn.createStatement();
			ClientDAO d=new ClientDAO();
			int id=d.getClientId(c.getEmail());
    		String sql="INSERT INTO Compte(login,passwd,idCompte) VALUES('"+c.getLogin()+"','"+c.getPasswd()+"',"+id+" )";
    		st.executeUpdate(sql);
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}
	
	////////////////////////////////
	public void update(Compte c){
		try {
			st=cxn.createStatement();
			CompteDAO d=new CompteDAO();
			int id=d.getCompteId(c.login);
			String sql="UPDATE compte set login='"+ c.getLogin()+"', passwd='"+c.getPasswd()+"'  where idCompte="+id+ ";";
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}}
	///////////////////////////////
	public void delete(int id){
		try {
			i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM Compte WHERE idCompte =" + id);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	///////////////////////////////

	public Compte getCompte(int id) {
		/**
		 * meth permet la recuperation d'un client à partir de son id
		 * @param id:un int identifie un client
		 * @return le client recherché si il existe sinon une instance creer par le const par defaut de la classe Compte
		 */
		Compte c=new Compte();
		try {
			ClientDAO d=new ClientDAO();
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Compte WHERE idCompte = " + id);
			 if(rs.first())
                 c = new Compte(d.getClient(rs.getInt("idCompte")),rs.getString("login"),rs.getString("passwd"));
         
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return c;
		
		
	}
	////////////////////////////
	public List<Compte> listerC(){
		/**
		 * meth permet la recuperation de la liste de clients 
		 * @return une listArray de Clients existes dans la BD
		 */
		List<Compte> L=new ArrayList<Compte>();
		try {
			ClientDAO d=new ClientDAO();//car besoin de chercher un client afin de creer une instance Compte
			rs=cxn.createStatement().executeQuery("Select * from Compte");
			while(rs.next()) {
				L.add(new Compte(d.getClient(rs.getInt("idCompte")),rs.getString("login"),rs.getString("passwd")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return L;
	}
	////////////////////////////
	
	public String getComptePasswd(String login) {
		String p="";
		try {
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Compte WHERE login ='"+login+"'");
            if(rs.first())p=rs.getString("passwd") ;
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return p;
	}
	//////////////////////////
	public int getCompteId(String login) {
		int p=0;
		try {
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Compte WHERE login ='"+login+"'");
            if(rs.first())p=rs.getInt("idCompte") ;
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return p;
	}
	
}
