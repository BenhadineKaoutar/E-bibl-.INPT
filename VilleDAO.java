package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.classes.Compte;
import com.classes.Ville;

public class VilleDAO {
	//attrs
	Connection cxn=DaoFactory.getConnection();
	Statement st;
	ResultSet rs;
	int i;
	/**
	 * la Classe VilleDAO permet de gerer lesOperations de creation et mise à jour sur la Table Ville aussi les mapping entre la table et la classe Ville
	 */
	public void create(Ville v) {
		/**
		 * permet la creation des objets dans la table Ville
		 * pour utiliser cette methode, il est conseillé d'instancifier la classe VilleDAO et par le biais de cet objet vous pouvez 
		 * appeler cette methode et bien d'autres update(Ville) et delete(int)
		 */
		try {
			st=cxn.createStatement();
    		String sql="INSERT INTO ville(idville,nom) VALUES("+v.getIdV()+",'"+v.getVille()+"')";
    		st.executeUpdate(sql);
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}
	//////////////////////
	public void update(Ville v){
		try {
			cxn=DaoFactory.getConnection();
			st=cxn.createStatement();
			String sql="update ville set nom='"+v.getVille()+" where idville="+v.getIdV()+ ";";
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//////////////////////
	public void delete(int id){
		try {
			i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM ville WHERE idville =" + id);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	////////////////////:
	public Ville getVille(String Ville) {
		
		Ville v=new Ville();
		try {
			VilleDAO d=new VilleDAO();
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Ville WHERE nom = " + Ville);
			 if(rs.first())
                 v = new Ville(rs.getString("nom"));
         
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return v;
		
		
	}
}
