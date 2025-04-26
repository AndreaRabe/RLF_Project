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
public class ProjetProcessor {
	private int ID;
	
	private String titre;
	
	private String description;
	
	private int objectif_financier;
	
	private int montant_collecte;
	
	private int date_debut;
	
	private String date_fin;
	
	private String visuels;
	
	private String status_projet;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setTitre(String value) {
		this.titre = value;
	}
	
	public String getTitre() {
		return titre == null ? "" : titre;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description == null ? "" : description;
	}
	
	public void setObjectif_financier(int value) {
		this.objectif_financier = value;
	}
	
	public int getObjectif_financier() {
		return objectif_financier;
	}
	
	public void setMontant_collecte(int value) {
		this.montant_collecte = value;
	}
	
	public int getMontant_collecte() {
		return montant_collecte;
	}
	
	public void setDate_debut(int value) {
		this.date_debut = value;
	}
	
	public int getDate_debut() {
		return date_debut;
	}
	
	public void setDate_fin(String value) {
		this.date_fin = value;
	}
	
	public String getDate_fin() {
		return date_fin == null ? "" : date_fin;
	}
	
	public void setVisuels(String value) {
		this.visuels = value;
	}
	
	public String getVisuels() {
		return visuels == null ? "" : visuels;
	}
	
	public void setStatus_projet(String value) {
		this.status_projet = value;
	}
	
	public String getStatus_projet() {
		return status_projet == null ? "" : status_projet;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int porteur_porteurID;
	
	public void setPorteur_porteurID(int value) {
		this.porteur_porteurID = value;
	}
	
	public int getPorteur_porteurID() {
		return porteur_porteurID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.Projet _projet = class_diagram_orm.Projet.loadProjetByORMID(getID());
				if (_projet!= null) {
					copyFromBean(_projet);
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
				class_diagram_orm.Projet _projet = class_diagram_orm.Projet.createProjet();
				copyToBean(_projet);
				if (_projet.save()) {
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
				class_diagram_orm.Projet _projet= class_diagram_orm.Projet.loadProjetByORMID(getID());
				if (_projet != null) {
					copyToBean(_projet);
					if (_projet.save()) {
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
				class_diagram_orm.Projet _projet = class_diagram_orm.Projet.loadProjetByORMID(getID());
				if (_projet != null && _projet.deleteAndDissociate()) {
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
	
	private void copyFromBean(class_diagram_orm.Projet _projet) {
		setTitre(_projet.getTitre());
		setDescription(_projet.getDescription());
		setObjectif_financier(_projet.getObjectif_financier());
		setMontant_collecte(_projet.getMontant_collecte());
		setDate_debut(_projet.getDate_debut());
		setDate_fin(_projet.getDate_fin());
		setVisuels(_projet.getVisuels());
		setStatus_projet(_projet.getStatus_projet());
		setID(_projet.getORMID());
		
		{
			class_diagram_orm.Porteur _porteur = _projet.getPorteur();
			if (_porteur != null) {
				setPorteur_porteurID(_porteur.getORMID());
			}
		}
		
	}
	
	private void copyToBean(class_diagram_orm.Projet _projet) {
		_projet.setTitre(getTitre());
		_projet.setDescription(getDescription());
		_projet.setObjectif_financier(getObjectif_financier());
		_projet.setMontant_collecte(getMontant_collecte());
		_projet.setDate_debut(getDate_debut());
		_projet.setDate_fin(getDate_fin());
		_projet.setVisuels(getVisuels());
		_projet.setStatus_projet(getStatus_projet());
		try  {
			class_diagram_orm.Porteur _porteur = class_diagram_orm.Porteur.loadPorteurByORMID(getPorteur_porteurID());
			_projet.setPorteur(_porteur);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

