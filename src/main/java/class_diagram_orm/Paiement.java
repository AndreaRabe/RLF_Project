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
public class Paiement implements Serializable {
	public Paiement() {
	}
	
	public static Paiement loadPaiementByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPaiementByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getPaiementByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPaiementByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getPaiementByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Paiement) session.load(class_diagram_orm.Paiement.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Paiement) session.get(class_diagram_orm.Paiement.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paiement) session.load(class_diagram_orm.Paiement.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paiement) session.get(class_diagram_orm.Paiement.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryPaiement(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryPaiement(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listPaiementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listPaiementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Paiement as Paiement");
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
	
	public static List queryPaiement(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Paiement as Paiement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paiement", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaiement(session, condition, orderBy);
			return (Paiement[]) list.toArray(new Paiement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaiement(session, condition, orderBy, lockMode);
			return (Paiement[]) list.toArray(new Paiement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPaiementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadPaiementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paiement[] paiements = listPaiementByQuery(session, condition, orderBy);
		if (paiements != null && paiements.length > 0)
			return paiements[0];
		else
			return null;
	}
	
	public static Paiement loadPaiementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paiement[] paiements = listPaiementByQuery(session, condition, orderBy, lockMode);
		if (paiements != null && paiements.length > 0)
			return paiements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaiementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iteratePaiementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaiementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iteratePaiementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaiementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Paiement as Paiement");
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
	
	public static java.util.Iterator iteratePaiementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Paiement as Paiement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paiement", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByCriteria(PaiementCriteria paiementCriteria) {
		Paiement[] paiements = listPaiementByCriteria(paiementCriteria);
		if(paiements == null || paiements.length == 0) {
			return null;
		}
		return paiements[0];
	}
	
	public static Paiement[] listPaiementByCriteria(PaiementCriteria paiementCriteria) {
		return paiementCriteria.listPaiement();
	}
	
	public static Paiement createPaiement() {
		return new class_diagram_orm.Paiement();
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
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getContribution() != null) {
				getContribution().setPaiement(null);
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
			if(getContribution() != null) {
				getContribution().setPaiement(null);
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
	
	private int ID;
	
	private class_diagram_orm.Contribution contribution;
	
	private int montant_paiement;
	
	private String date_paiement;
	
	private String methode_paiement;
	
	private String status_paiement;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setMontant_paiement(int value) {
		this.montant_paiement = value;
	}
	
	public int getMontant_paiement() {
		return montant_paiement;
	}
	
	public void setDate_paiement(String value) {
		this.date_paiement = value;
	}
	
	public String getDate_paiement() {
		return date_paiement;
	}
	
	public void setMethode_paiement(String value) {
		this.methode_paiement = value;
	}
	
	public String getMethode_paiement() {
		return methode_paiement;
	}
	
	public void setStatus_paiement(String value) {
		this.status_paiement = value;
	}
	
	public String getStatus_paiement() {
		return status_paiement;
	}
	
	public void setContribution(class_diagram_orm.Contribution value) {
		if (this.contribution != value) {
			class_diagram_orm.Contribution lcontribution = this.contribution;
			this.contribution = value;
			if (value != null) {
				contribution.setPaiement(this);
			}
			if (lcontribution != null && lcontribution.getPaiement() == this) {
				lcontribution.setPaiement(null);
			}
		}
	}
	
	public class_diagram_orm.Contribution getContribution() {
		return contribution;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
