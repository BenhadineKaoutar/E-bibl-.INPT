package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
	/**
	 * DAOFactory() permet d'etablir la connexion avec la BD
	 * elle a une Unique instance => Singleton
	 */
	//a une  unique instance: Singleton
	private static DaoFactory instance=new DaoFactory();
	//declarations des constantes de la classe
	public static final String url="jdbc:mysql://localhost/E-Bibl";
	public static final String login="root";
	public static final String passwd="fernandmysql";
	public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	//const
	/**
	 * const a un droit d'acces Private 
	 * il charge le Driver
	 */
	
	private DaoFactory() {//appeler que par les classes internes
		try {
			Class.forName(DRIVER_CLASS);//charger le Driver
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		}
	//meths

	private Connection createConnection() {//meth appele que par les classes nternes
		Connection cxn=null;
		try {
			cxn=DriverManager.getConnection(url, login, passwd);
		}catch(SQLException e) {e.printStackTrace();}
		return cxn;
	}
	/**
	 * methode Static permet l'etablissement de la connexion avec la BD
	 * @return La connexion
	 */
	public static Connection getConnection(){//etablir la connexion avec la BD
		return instance.createConnection();
		}
}
