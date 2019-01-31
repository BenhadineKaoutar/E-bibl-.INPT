package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.Compte;
import com.classes.DemandeDePret;

public class DemandDAO {
	///attrs
	Connection cxn=DaoFactory.getConnection();
	PreparedStatement preparedStatement;
	Statement st;
	ResultSet rs;
	int i;
	//meths
	////////////////////////////
	public void create(DemandeDePret d) {
		try {
			st=cxn.createStatement();
			CompteDAO c=new CompteDAO();
			LivreDAO l=new LivreDAO();
    		String sql="INSERT INTO demandedepret(idDemande,idClientdepot,idclientconfir,idLivre,CFM) VALUES(null,"+c.getCompteId(d.c1.email)+","+c.getCompteId(d.c2.email)+","+l.getLivreId(d.L.Titre, d.L.Auteur, d.L.format,c.getCompteId(d.c2.email))+","+d.getCFM()+" )";
    		st.executeUpdate(sql);
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}
	///////////////////
	public void update(DemandeDePret d){
		try {
			cxn=DaoFactory.getConnection();
			st=cxn.createStatement();
			String sql="update Demandedepret set idClientdepot="+d.getCompte1().getId()+" idclientconfir="+d.getCompte2().getId()+" idLivre="+d.getLivre().getId()+" CFM='"+d.getCFM()+"' where idDemmande="+d.getId()+ ";";
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	/////////////////////
	public void delete(int id){
		try {
			i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM Demandedepret WHERE idDemmande = " + id);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/////////////////
	public DemandeDePret getDemande(int id) {
		/**
		 * meth permet la recuperation d'une demande de pret à partir de son id
		 * @param id:un int identifie une demande
		 * @return la demande recherchée si elle existant sinon une instance creer par le const par defaut de la classe Compte
		 */
		DemandeDePret d=new DemandeDePret();//on va retourner une demande de pret
		try {
			CompteDAO c1=new CompteDAO();
			CompteDAO c2=new CompteDAO();
			LivreDAO l=new LivreDAO();
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM DemandeDePret WHERE idDemmande = " + id);
			 if(rs.first())
                 d= new DemandeDePret(c1.getCompte(rs.getInt("idClientDepot")),c2.getCompte(rs.getInt("idClientconfir")),rs.getBoolean("CFM"),l.getLivre(rs.getInt("idLivre")));
         
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return d;
	}
	//////
	List<DemandeDePret> listerD(){
		/**
		 * meth permet la recuperation de la liste de demande de pret
		 * @return une listArray des demandes existantes dans la BD
		 */
		List<DemandeDePret> L=new ArrayList<DemandeDePret>();
		try {
			CompteDAO c1=new CompteDAO();
			CompteDAO c2=new CompteDAO();
			LivreDAO l=new LivreDAO();
			rs=cxn.createStatement().executeQuery("Select * from Demandedepret");
			while(rs.next()) {
				L.add(new DemandeDePret(c1.getCompte(rs.getInt("idClientDepot")),c2.getCompte(rs.getInt("idClientconfir")),rs.getBoolean("CFM"),l.getLivre(rs.getInt("idLivre"))));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return L;
	};
}
