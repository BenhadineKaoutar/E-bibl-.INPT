package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.Compte;
import com.classes.Livre;

public class LivreDAO {
	//attrs
	Connection cxn=DaoFactory.getConnection();
	PreparedStatement preparedStatement;
	Statement st;
	public ResultSet rs;
	int i;
	//meth
	//////////////////////
	public void create(Livre l) {
		/*try {
			cxn=DaoFactory.getConnection();
			preparedStatement=cxn.prepareStatement("Insert into Livre(idLivre,titre,auteur,format)Values(?,?,?,?);");
			preparedStatement.setInt(1,l.getId());//pour remplir l'argument de la requete
			preparedStatement.setString(2,l.getTitre());
			preparedStatement.setString(3,l.getAuteur());
			preparedStatement.setString(4,l.getFormat());
			
			preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			}*/
		try {
			ClientDAO d=new ClientDAO();
			st=cxn.createStatement();
    		String sql="INSERT INTO Livre(Titre,Auteur,format,idClient) VALUES('"+l.getTitre()+"','"+l.getAuteur()+"','"+l.getFormat()+"',"+d.getClientId(l.getClient().email)+" )";
    		st.executeUpdate(sql);
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
		}
	/////////////////////
	public void update(Livre l,int id){
		try {
			cxn=DaoFactory.getConnection();
			st=cxn.createStatement();
			LivreDAO d=new LivreDAO();
			ClientDAO dd=new ClientDAO();
			//int id=dd.getClientId(l.c.getEmail());
			
			String sql="update Livre set titre='"+l.getTitre()+"', auteur='"+l.getAuteur()+"' ,format='"+l.getFormat()+"' where idLivre="+id+ ";";//besoin car le titre et le client sont pas encore inseres ds la table
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}}
	////////////////
	/*ClientDAO d=new ClientDAO();
			st=cxn.createStatement();
			int id=d.getClientId(c.getEmail());
			String sql="update client set LN='"+c.getLN()+"', NN='"+c.getNN()+"' ,FN='"+c.getFN()+"', email='"+c.getEmail()+"' ,Ville='"+c.getVille()+"' where idClient="+id+ ";";
			st.executeUpdate(sql);
	*/
	public void delete(int id){
		try {
			i=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			    	ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM Livre WHERE idLivre =" + id);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//////////////////////
	public Livre getLivre(int id) {
		/**
		 * meth permet la recuperation d'un livre à partir de son id
		 * @param id:un int identifie un livre
		 * @return le livre recherché si il existe sinon une instance creer par le const par defaut de la classe Compte
		 */
		Livre l=new Livre();
		try {
			ClientDAO c=new ClientDAO();
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM livre WHERE idLivre = " + id);
			if(rs.first())
                 l= new Livre(c.getClient(rs.getInt("idClient")),rs.getString("Titre"),rs.getString("Auteur"),rs.getString("format"));
        
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return l;
	}
	//////////////////////
	public List<Livre> listerL(){
		/**
		 * meth permet la recuperation de la liste de livres disponible dans la Base de Donnees
		 * @return une listArray de Livres 
		 */
		List<Livre> L=new ArrayList<Livre>();
		try {
			ClientDAO c=new ClientDAO();//besoin de chercher le client proprietaire du livre pour instancifier la classe Livre
			rs=cxn.createStatement().executeQuery("Select * from Livre");
			while(rs.next()) {
				L.add(new Livre(c.getClient(rs.getInt("idClient")),rs.getString("Titre"),rs.getString("Auteur"),rs.getString("format")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return L;
	}
	public int getLivreId(String t,String a,String f,int id) {
		/**
		 * @param login :les caracteristique d(un livre
		 * @return permet de recuperer l-id du Livre recherche sinon 0
		 */
		int d=0;
		try {
			rs=cxn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM livre WHERE titre ='"+t+"'and auteur='"+a+"' and format='"+f+"' and idClient="+id);
			if(rs.first())d=rs.getInt("idLivre");
		} catch (SQLException e) {e.printStackTrace();}
		return d;}
	
	}

