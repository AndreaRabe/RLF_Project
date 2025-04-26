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
public class AdministrateurProcessor {
	private int ID;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String mots_passe;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom == null ? "" : nom;
	}
	
	public void setPrenom(String value) {
		this.prenom = value;
	}
	
	public String getPrenom() {
		return prenom == null ? "" : prenom;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setMots_passe(String value) {
		this.mots_passe = value;
	}
	
	public String getMots_passe() {
		return mots_passe == null ? "" : mots_passe;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.Administrateur _administrateur = class_diagram_orm.Administrateur.loadAdministrateurByORMID(getID());
				if (_administrateur!= null) {
					copyFromBean(_administrateur);
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
				class_diagram_orm.Administrateur _administrateur = class_diagram_orm.Administrateur.createAdministrateur();
				copyToBean(_administrateur);
				if (_administrateur.save()) {
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
				class_diagram_orm.Administrateur _administrateur= class_diagram_orm.Administrateur.loadAdministrateurByORMID(getID());
				if (_administrateur != null) {
					copyToBean(_administrateur);
					if (_administrateur.save()) {
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
				class_diagram_orm.Administrateur _administrateur = class_diagram_orm.Administrateur.loadAdministrateurByORMID(getID());
				if (_administrateur != null && _administrateur.delete()) {
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
	
	private void copyFromBean(class_diagram_orm.Administrateur _administrateur) {
		setNom(_administrateur.getNom());
		setPrenom(_administrateur.getPrenom());
		setEmail(_administrateur.getEmail());
		setMots_passe(_administrateur.getMots_passe());
		setID(_administrateur.getORMID());
	}
	
	private void copyToBean(class_diagram_orm.Administrateur _administrateur) {
		_administrateur.setNom(getNom());
		_administrateur.setPrenom(getPrenom());
		_administrateur.setEmail(getEmail());
		_administrateur.setMots_passe(getMots_passe());
	}
	
}

