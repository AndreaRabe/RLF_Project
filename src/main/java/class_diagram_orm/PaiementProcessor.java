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
public class PaiementProcessor {
	private int ID;
	
	private int montant_paiement;
	
	private String date_paiement;
	
	private String methode_paiement;
	
	private String status_paiement;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
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
		return date_paiement == null ? "" : date_paiement;
	}
	
	public void setMethode_paiement(String value) {
		this.methode_paiement = value;
	}
	
	public String getMethode_paiement() {
		return methode_paiement == null ? "" : methode_paiement;
	}
	
	public void setStatus_paiement(String value) {
		this.status_paiement = value;
	}
	
	public String getStatus_paiement() {
		return status_paiement == null ? "" : status_paiement;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int contribution_contributionID;
	
	public void setContribution_contributionID(int value) {
		this.contribution_contributionID = value;
	}
	
	public int getContribution_contributionID() {
		return contribution_contributionID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.Paiement _paiement = class_diagram_orm.Paiement.loadPaiementByORMID(getID());
				if (_paiement!= null) {
					copyFromBean(_paiement);
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
				class_diagram_orm.Paiement _paiement = class_diagram_orm.Paiement.createPaiement();
				copyToBean(_paiement);
				if (_paiement.save()) {
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
				class_diagram_orm.Paiement _paiement= class_diagram_orm.Paiement.loadPaiementByORMID(getID());
				if (_paiement != null) {
					copyToBean(_paiement);
					if (_paiement.save()) {
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
				class_diagram_orm.Paiement _paiement = class_diagram_orm.Paiement.loadPaiementByORMID(getID());
				if (_paiement != null && _paiement.deleteAndDissociate()) {
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
	
	private void copyFromBean(class_diagram_orm.Paiement _paiement) {
		setMontant_paiement(_paiement.getMontant_paiement());
		setDate_paiement(_paiement.getDate_paiement());
		setMethode_paiement(_paiement.getMethode_paiement());
		setStatus_paiement(_paiement.getStatus_paiement());
		setID(_paiement.getORMID());
		
		{
			class_diagram_orm.Contribution _contribution = _paiement.getContribution();
			if (_contribution != null) {
				setContribution_contributionID(_contribution.getORMID());
			}
		}
		
	}
	
	private void copyToBean(class_diagram_orm.Paiement _paiement) {
		_paiement.setMontant_paiement(getMontant_paiement());
		_paiement.setDate_paiement(getDate_paiement());
		_paiement.setMethode_paiement(getMethode_paiement());
		_paiement.setStatus_paiement(getStatus_paiement());
		try  {
			class_diagram_orm.Contribution _contribution = class_diagram_orm.Contribution.loadContributionByORMID(getContribution_contributionID());
			_paiement.setContribution(_contribution);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

