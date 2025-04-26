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
public class Administrateur extends class_diagram_orm.Utilisateur implements Serializable {
	public Administrateur() {
	}
	
	public static Administrateur loadAdministrateurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadAdministrateurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur getAdministrateurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getAdministrateurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadAdministrateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur getAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getAdministrateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Administrateur) session.load(class_diagram_orm.Administrateur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur getAdministrateurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Administrateur) session.get(class_diagram_orm.Administrateur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrateur) session.load(class_diagram_orm.Administrateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur getAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrateur) session.get(class_diagram_orm.Administrateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrateur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryAdministrateur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryAdministrateur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur[] listAdministrateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listAdministrateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur[] listAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listAdministrateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrateur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Administrateur as Administrateur");
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
	
	public static List queryAdministrateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Administrateur as Administrateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrateur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur[] listAdministrateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrateur(session, condition, orderBy);
			return (Administrateur[]) list.toArray(new Administrateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur[] listAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrateur(session, condition, orderBy, lockMode);
			return (Administrateur[]) list.toArray(new Administrateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadAdministrateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadAdministrateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrateur[] administrateurs = listAdministrateurByQuery(session, condition, orderBy);
		if (administrateurs != null && administrateurs.length > 0)
			return administrateurs[0];
		else
			return null;
	}
	
	public static Administrateur loadAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrateur[] administrateurs = listAdministrateurByQuery(session, condition, orderBy, lockMode);
		if (administrateurs != null && administrateurs.length > 0)
			return administrateurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iterateAdministrateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iterateAdministrateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Administrateur as Administrateur");
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
	
	public static java.util.Iterator iterateAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Administrateur as Administrateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrateur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrateur loadAdministrateurByCriteria(AdministrateurCriteria administrateurCriteria) {
		Administrateur[] administrateurs = listAdministrateurByCriteria(administrateurCriteria);
		if(administrateurs == null || administrateurs.length == 0) {
			return null;
		}
		return administrateurs[0];
	}
	
	public static Administrateur[] listAdministrateurByCriteria(AdministrateurCriteria administrateurCriteria) {
		return administrateurCriteria.listAdministrateur();
	}
	
	public static Administrateur createAdministrateur() {
		return new class_diagram_orm.Administrateur();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
