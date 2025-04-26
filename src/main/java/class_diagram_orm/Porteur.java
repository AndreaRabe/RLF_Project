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
public class Porteur extends class_diagram_orm.Utilisateur implements Serializable {
	public Porteur() {
	}
	
	public static Porteur loadPorteurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPorteurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur getPorteurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getPorteurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPorteurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur getPorteurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getPorteurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Porteur) session.load(class_diagram_orm.Porteur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur getPorteurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Porteur) session.get(class_diagram_orm.Porteur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Porteur) session.load(class_diagram_orm.Porteur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur getPorteurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Porteur) session.get(class_diagram_orm.Porteur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPorteur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryPorteur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPorteur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryPorteur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur[] listPorteurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listPorteurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur[] listPorteurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listPorteurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPorteur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Porteur as Porteur");
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
	
	public static List queryPorteur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Porteur as Porteur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Porteur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur[] listPorteurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPorteur(session, condition, orderBy);
			return (Porteur[]) list.toArray(new Porteur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur[] listPorteurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPorteur(session, condition, orderBy, lockMode);
			return (Porteur[]) list.toArray(new Porteur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPorteurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPorteurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Porteur[] porteurs = listPorteurByQuery(session, condition, orderBy);
		if (porteurs != null && porteurs.length > 0)
			return porteurs[0];
		else
			return null;
	}
	
	public static Porteur loadPorteurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Porteur[] porteurs = listPorteurByQuery(session, condition, orderBy, lockMode);
		if (porteurs != null && porteurs.length > 0)
			return porteurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePorteurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iteratePorteurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePorteurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iteratePorteurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePorteurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Porteur as Porteur");
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
	
	public static java.util.Iterator iteratePorteurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Porteur as Porteur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Porteur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Porteur loadPorteurByCriteria(PorteurCriteria porteurCriteria) {
		Porteur[] porteurs = listPorteurByCriteria(porteurCriteria);
		if(porteurs == null || porteurs.length == 0) {
			return null;
		}
		return porteurs[0];
	}
	
	public static Porteur[] listPorteurByCriteria(PorteurCriteria porteurCriteria) {
		return porteurCriteria.listPorteur();
	}
	
	public static Porteur createPorteur() {
		return new class_diagram_orm.Porteur();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			class_diagram_orm.Projet[] lProjetss = projets.toArray();
			for(int i = 0; i < lProjetss.length; i++) {
				lProjetss[i].setPorteur(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			class_diagram_orm.Projet[] lProjetss = projets.toArray();
			for(int i = 0; i < lProjetss.length; i++) {
				lProjetss[i].setPorteur(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == class_diagram_orm.ORMConstants.KEY_PORTEUR_PROJETS) {
			return ORM_projets;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String biographie;
	
	private java.util.Set ORM_projets = new java.util.HashSet();
	
	public void setBiographie(String value) {
		this.biographie = value;
	}
	
	public String getBiographie() {
		return biographie;
	}
	
	private void setORM_Projets(java.util.Set value) {
		this.ORM_projets = value;
	}
	
	private java.util.Set getORM_Projets() {
		return ORM_projets;
	}
	
	public final class_diagram_orm.ProjetSetCollection projets = new class_diagram_orm.ProjetSetCollection(this, _ormAdapter, class_diagram_orm.ORMConstants.KEY_PORTEUR_PROJETS, class_diagram_orm.ORMConstants.KEY_PROJET_PORTEUR, class_diagram_orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
