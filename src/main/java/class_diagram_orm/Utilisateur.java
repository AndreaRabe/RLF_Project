/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Purchased
 */
package class_diagram_orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
public class Utilisateur implements Serializable {
	public Utilisateur() {
	}
	
	public static Utilisateur loadUtilisateurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Utilisateur) session.load(class_diagram_orm.Utilisateur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Utilisateur) session.get(class_diagram_orm.Utilisateur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.load(class_diagram_orm.Utilisateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.get(class_diagram_orm.Utilisateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy, lockMode);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public static Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy, lockMode);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria) {
		Utilisateur[] utilisateurs = listUtilisateurByCriteria(utilisateurCriteria);
		if(utilisateurs == null || utilisateurs.length == 0) {
			return null;
		}
		return utilisateurs[0];
	}
	
	public static Utilisateur[] listUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria) {
		return utilisateurCriteria.listUtilisateur();
	}
	
	public static Utilisateur createUtilisateur() {
		return new class_diagram_orm.Utilisateur();
	}
	
	public boolean save() throws PersistentException {
		try {
			class_diagram_orm.RLF2025PersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			class_diagram_orm.RLF2025PersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			class_diagram_orm.RLF2025PersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			class_diagram_orm.RLF2025PersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private int ID;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String mots_passe;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setPrenom(String value) {
		this.prenom = value;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMots_passe(String value) {
		this.mots_passe = value;
	}
	
	public String getMots_passe() {
		return mots_passe;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
