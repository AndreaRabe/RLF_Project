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
public class Contribution implements Serializable {
	public Contribution() {
	}
	
	public static Contribution loadContributionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadContributionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution getContributionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getContributionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadContributionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution getContributionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return getContributionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Contribution) session.load(class_diagram_orm.Contribution.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution getContributionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Contribution) session.get(class_diagram_orm.Contribution.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contribution) session.load(class_diagram_orm.Contribution.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution getContributionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contribution) session.get(class_diagram_orm.Contribution.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContribution(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryContribution(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContribution(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return queryContribution(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution[] listContributionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listContributionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution[] listContributionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return listContributionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContribution(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Contribution as Contribution");
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
	
	public static List queryContribution(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Contribution as Contribution");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contribution", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution[] listContributionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContribution(session, condition, orderBy);
			return (Contribution[]) list.toArray(new Contribution[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution[] listContributionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContribution(session, condition, orderBy, lockMode);
			return (Contribution[]) list.toArray(new Contribution[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadContributionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return loadContributionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Contribution[] contributions = listContributionByQuery(session, condition, orderBy);
		if (contributions != null && contributions.length > 0)
			return contributions[0];
		else
			return null;
	}
	
	public static Contribution loadContributionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Contribution[] contributions = listContributionByQuery(session, condition, orderBy, lockMode);
		if (contributions != null && contributions.length > 0)
			return contributions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContributionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iterateContributionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContributionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
			return iterateContributionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContributionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Contribution as Contribution");
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
	
	public static java.util.Iterator iterateContributionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Contribution as Contribution");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contribution", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contribution loadContributionByCriteria(ContributionCriteria contributionCriteria) {
		Contribution[] contributions = listContributionByCriteria(contributionCriteria);
		if(contributions == null || contributions.length == 0) {
			return null;
		}
		return contributions[0];
	}
	
	public static Contribution[] listContributionByCriteria(ContributionCriteria contributionCriteria) {
		return contributionCriteria.listContribution();
	}
	
	public static Contribution createContribution() {
		return new class_diagram_orm.Contribution();
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
			if(getProjet() != null) {
				getProjet().contributions.remove(this);
			}
			
			if(getContributeur() != null) {
				getContributeur().contributions.remove(this);
			}
			
			if(getPaiement() != null) {
				getPaiement().setContribution(null);
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
			if(getProjet() != null) {
				getProjet().contributions.remove(this);
			}
			
			if(getContributeur() != null) {
				getContributeur().contributions.remove(this);
			}
			
			if(getPaiement() != null) {
				getPaiement().setContribution(null);
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == class_diagram_orm.ORMConstants.KEY_CONTRIBUTION_CONTRIBUTEUR) {
			this.contributeur = (class_diagram_orm.Contributeur) owner;
		}
		
		else if (key == class_diagram_orm.ORMConstants.KEY_CONTRIBUTION_PROJET) {
			this.projet = (class_diagram_orm.Projet) owner;
		}
		
		else if (key == class_diagram_orm.ORMConstants.KEY_CONTRIBUTION_PAIEMENT) {
			this.paiement = (class_diagram_orm.Paiement) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private class_diagram_orm.Projet projet;
	
	private class_diagram_orm.Contributeur contributeur;
	
	private int montant_contribution;
	
	private String date_contribution;
	
	private String type_contribution;
	
	private class_diagram_orm.Paiement paiement;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setMontant_contribution(int value) {
		this.montant_contribution = value;
	}
	
	public int getMontant_contribution() {
		return montant_contribution;
	}
	
	public void setDate_contribution(String value) {
		this.date_contribution = value;
	}
	
	public String getDate_contribution() {
		return date_contribution;
	}
	
	public void setType_contribution(String value) {
		this.type_contribution = value;
	}
	
	public String getType_contribution() {
		return type_contribution;
	}
	
	public void setContributeur(class_diagram_orm.Contributeur value) {
		if (contributeur != null) {
			contributeur.contributions.remove(this);
		}
		if (value != null) {
			value.contributions.add(this);
		}
	}
	
	public class_diagram_orm.Contributeur getContributeur() {
		return contributeur;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Contributeur(class_diagram_orm.Contributeur value) {
		this.contributeur = value;
	}
	
	private class_diagram_orm.Contributeur getORM_Contributeur() {
		return contributeur;
	}
	
	public void setProjet(class_diagram_orm.Projet value) {
		if (projet != null) {
			projet.contributions.remove(this);
		}
		if (value != null) {
			value.contributions.add(this);
		}
	}
	
	public class_diagram_orm.Projet getProjet() {
		return projet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Projet(class_diagram_orm.Projet value) {
		this.projet = value;
	}
	
	private class_diagram_orm.Projet getORM_Projet() {
		return projet;
	}
	
	public void setPaiement(class_diagram_orm.Paiement value) {
		if (this.paiement != value) {
			class_diagram_orm.Paiement lpaiement = this.paiement;
			this.paiement = value;
			if (value != null) {
				paiement.setContribution(this);
			}
			if (lpaiement != null && lpaiement.getContribution() == this) {
				lpaiement.setContribution(null);
			}
		}
	}
	
	public class_diagram_orm.Paiement getPaiement() {
		return paiement;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
