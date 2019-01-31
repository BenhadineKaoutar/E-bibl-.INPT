package com.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.classes.Client;
import com.classes.Compte;

public class ClientDAO {
	//attrs
	Connection cxn=DaoFactory.getConnection();;
	PreparedStatement preparedStatement;
	Statement st;
	ResultSet rs;
	int i;
	//meths
	////////////////////////////
	public void create(Client c) {
		/**
		 * meth permet d'inserer un nouveau client dans la table Client à partir d'une instance @param c:Client
		 */
		try {
			st=cxn.createStatement();
    		String sql="INSERT INTO Client(idClient,email,LN,FN,NN,Ville) VALUES(null,'"+c.getEmail()+"','"+c.getLN()+"','"+c.getFN()+"','"+c.getNN()+"','"+c.getVille()+"')";
    		st.executeUpdate(sql);
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }}
	/////////////////////////////
	public void update(Client c){
		try {
			ClientDAO d=new ClientDAO();
			st=cxn.createStatement();
			int id=d.getClientId(c.getEmail());
			String sql="update client set LN='"+c.getLN()+"', NN='"+c.getNN()+"' ,FN='"+c.getFN()+"', email='"+c.getEmail()+"' ,Ville='"+c.getVille()+"' where idClient="+id+ ";";
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	};
	/////////////////////////////
	public void delete(int id){
		try {
			i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM Client WHERE idClient = " + id);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
	};
	/////////////////////////////////
	public Client getClient(int id) {
		/**
		 * @param id :un int represente l'identifiant d'une instance Client
		 * @return permet de recuperer le Client recherché si il existe sinon un client creer par le const Client() par defaut
		 */
		Client c=new Client();
		try {
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Client WHERE idClient = " + id);
			 if(rs.first())
                 c = new Client(rs.getString("LN"),rs.getString("FN"),rs.getString("NN"),rs.getString("email"),rs.getString("Ville"));
         
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return c;
			
		}
	////////////////////////////
	public int getClientId(String email) {
		/**
		 * @param login :le nom de connexion du Client
		 * @return permet de recuperer l-id du Client
		 */
		int d=0;
		try {
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Client WHERE email ='"+email+"' ");
			if(rs.first())d=rs.getInt("idClient");
		} catch (SQLException e) {e.printStackTrace();}
		return d;}
		
	/////////////////////////////
	public List<Client> listerCT(){
		/**
		 * @return la lister des clients existes dans la BD
		 */
		List<Client> L=new ArrayList<Client>();
		try {
			rs=cxn.createStatement().executeQuery("Select * from Client");
			while(rs.next()) {
				L.add(new Client(rs.getString("LN"),rs.getString("FN"),rs.getString("NN"),rs.getString("email"),rs.getString("Ville")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return L;
	};
}
