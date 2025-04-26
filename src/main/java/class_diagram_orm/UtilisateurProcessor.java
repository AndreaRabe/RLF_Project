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
public class UtilisateurProcessor {
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
				class_diagram_orm.Utilisateur _utilisateur = class_diagram_orm.Utilisateur.loadUtilisateurByORMID(getID());
				if (_utilisateur!= null) {
					copyFromBean(_utilisateur);
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
				class_diagram_orm.Utilisateur _utilisateur = class_diagram_orm.Utilisateur.createUtilisateur();
				copyToBean(_utilisateur);
				if (_utilisateur.save()) {
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
				class_diagram_orm.Utilisateur _utilisateur= class_diagram_orm.Utilisateur.loadUtilisateurByORMID(getID());
				if (_utilisateur != null) {
					copyToBean(_utilisateur);
					if (_utilisateur.save()) {
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
				class_diagram_orm.Utilisateur _utilisateur = class_diagram_orm.Utilisateur.loadUtilisateurByORMID(getID());
				if (_utilisateur != null && _utilisateur.delete()) {
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
	
	private void copyFromBean(class_diagram_orm.Utilisateur _utilisateur) {
		setNom(_utilisateur.getNom());
		setPrenom(_utilisateur.getPrenom());
		setEmail(_utilisateur.getEmail());
		setMots_passe(_utilisateur.getMots_passe());
		setID(_utilisateur.getORMID());
	}
	
	private void copyToBean(class_diagram_orm.Utilisateur _utilisateur) {
		_utilisateur.setNom(getNom());
		_utilisateur.setPrenom(getPrenom());
		_utilisateur.setEmail(getEmail());
		_utilisateur.setMots_passe(getMots_passe());
	}
	
}

