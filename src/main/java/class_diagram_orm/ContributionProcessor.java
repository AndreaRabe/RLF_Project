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

import org.orm.PersistentException;
public class ContributionProcessor {
	private int ID;
	
	private int montant_contribution;
	
	private String date_contribution;
	
	private String type_contribution;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
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
		return date_contribution == null ? "" : date_contribution;
	}
	
	public void setType_contribution(String value) {
		this.type_contribution = value;
	}
	
	public String getType_contribution() {
		return type_contribution == null ? "" : type_contribution;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int contributeur_contributeurID;
	
	public void setContributeur_contributeurID(int value) {
		this.contributeur_contributeurID = value;
	}
	
	public int getContributeur_contributeurID() {
		return contributeur_contributeurID;
	}
	
	private int projet_projetID;
	
	public void setProjet_projetID(int value) {
		this.projet_projetID = value;
	}
	
	public int getProjet_projetID() {
		return projet_projetID;
	}
	
	private int paiement_paiementID;
	
	public void setPaiement_paiementID(int value) {
		this.paiement_paiementID = value;
	}
	
	public int getPaiement_paiementID() {
		return paiement_paiementID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.Contribution _contribution = class_diagram_orm.Contribution.loadContributionByORMID(getID());
				if (_contribution!= null) {
					copyFromBean(_contribution);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				class_diagram_orm.Contribution _contribution = class_diagram_orm.Contribution.createContribution();
				copyToBean(_contribution);
				if (_contribution.save()) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				class_diagram_orm.Contribution _contribution= class_diagram_orm.Contribution.loadContributionByORMID(getID());
				if (_contribution != null) {
					copyToBean(_contribution);
					if (_contribution.save()) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				class_diagram_orm.Contribution _contribution = class_diagram_orm.Contribution.loadContributionByORMID(getID());
				if (_contribution != null && _contribution.deleteAndDissociate()) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(class_diagram_orm.Contribution _contribution) {
		setMontant_contribution(_contribution.getMontant_contribution());
		setDate_contribution(_contribution.getDate_contribution());
		setType_contribution(_contribution.getType_contribution());
		setID(_contribution.getORMID());
		
		{
			class_diagram_orm.Contributeur _contributeur = _contribution.getContributeur();
			if (_contributeur != null) {
				setContributeur_contributeurID(_contributeur.getORMID());
			}
		}
		
		
		{
			class_diagram_orm.Projet _projet = _contribution.getProjet();
			if (_projet != null) {
				setProjet_projetID(_projet.getORMID());
			}
		}
		
		
		{
			class_diagram_orm.Paiement _paiement = _contribution.getPaiement();
			if (_paiement != null) {
				setPaiement_paiementID(_paiement.getORMID());
			}
		}
		
	}
	
	private void copyToBean(class_diagram_orm.Contribution _contribution) {
		_contribution.setMontant_contribution(getMontant_contribution());
		_contribution.setDate_contribution(getDate_contribution());
		_contribution.setType_contribution(getType_contribution());
		try  {
			class_diagram_orm.Contributeur _contributeur = class_diagram_orm.Contributeur.loadContributeurByORMID(getContributeur_contributeurID());
			_contribution.setContributeur(_contributeur);
		}
		catch (PersistentException e) {
		}
		
		try  {
			class_diagram_orm.Projet _projet = class_diagram_orm.Projet.loadProjetByORMID(getProjet_projetID());
			_contribution.setProjet(_projet);
		}
		catch (PersistentException e) {
		}
		
		try  {
			class_diagram_orm.Paiement _paiement = class_diagram_orm.Paiement.loadPaiementByORMID(getPaiement_paiementID());
			_contribution.setPaiement(_paiement);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

