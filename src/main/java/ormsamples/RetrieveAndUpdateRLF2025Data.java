/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateRLF2025Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = class_diagram_orm.RLF2025PersistentManager.instance().getSession().beginTransaction();
		try {
			class_diagram_orm.Utilisateur class_Diagram_ORMUtilisateur = class_diagram_orm.Utilisateur.loadUtilisateurByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMUtilisateur.save();
			class_diagram_orm.Contribution class_Diagram_ORMContribution = class_diagram_orm.Contribution.loadContributionByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMContribution.save();
			class_diagram_orm.Paiement class_Diagram_ORMPaiement = class_diagram_orm.Paiement.loadPaiementByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMPaiement.save();
			class_diagram_orm.Projet class_Diagram_ORMProjet = class_diagram_orm.Projet.loadProjetByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMProjet.save();
			class_diagram_orm.Administrateur class_Diagram_ORMAdministrateur = class_diagram_orm.Administrateur.loadAdministrateurByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMAdministrateur.save();
			class_diagram_orm.Contributeur class_Diagram_ORMContributeur = class_diagram_orm.Contributeur.loadContributeurByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMContributeur.save();
			class_diagram_orm.Porteur class_Diagram_ORMPorteur = class_diagram_orm.Porteur.loadPorteurByQuery(null, null);
			// Update the properties of the persistent object
			class_Diagram_ORMPorteur.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilisateur by UtilisateurCriteria");
		class_diagram_orm.UtilisateurCriteria class_Diagram_ORMUtilisateurCriteria = new class_diagram_orm.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMUtilisateurCriteria.ID.eq();
		System.out.println(class_Diagram_ORMUtilisateurCriteria.uniqueUtilisateur());
		
		System.out.println("Retrieving Contribution by ContributionCriteria");
		class_diagram_orm.ContributionCriteria class_Diagram_ORMContributionCriteria = new class_diagram_orm.ContributionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMContributionCriteria.ID.eq();
		System.out.println(class_Diagram_ORMContributionCriteria.uniqueContribution());
		
		System.out.println("Retrieving Paiement by PaiementCriteria");
		class_diagram_orm.PaiementCriteria class_Diagram_ORMPaiementCriteria = new class_diagram_orm.PaiementCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMPaiementCriteria.ID.eq();
		System.out.println(class_Diagram_ORMPaiementCriteria.uniquePaiement());
		
		System.out.println("Retrieving Projet by ProjetCriteria");
		class_diagram_orm.ProjetCriteria class_Diagram_ORMProjetCriteria = new class_diagram_orm.ProjetCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMProjetCriteria.ID.eq();
		System.out.println(class_Diagram_ORMProjetCriteria.uniqueProjet());
		
		System.out.println("Retrieving Administrateur by AdministrateurCriteria");
		class_diagram_orm.AdministrateurCriteria class_Diagram_ORMAdministrateurCriteria = new class_diagram_orm.AdministrateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMAdministrateurCriteria.ID.eq();
		System.out.println(class_Diagram_ORMAdministrateurCriteria.uniqueAdministrateur());
		
		System.out.println("Retrieving Contributeur by ContributeurCriteria");
		class_diagram_orm.ContributeurCriteria class_Diagram_ORMContributeurCriteria = new class_diagram_orm.ContributeurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMContributeurCriteria.ID.eq();
		System.out.println(class_Diagram_ORMContributeurCriteria.uniqueContributeur());
		
		System.out.println("Retrieving Porteur by PorteurCriteria");
		class_diagram_orm.PorteurCriteria class_Diagram_ORMPorteurCriteria = new class_diagram_orm.PorteurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//class_Diagram_ORMPorteurCriteria.ID.eq();
		System.out.println(class_Diagram_ORMPorteurCriteria.uniquePorteur());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateRLF2025Data retrieveAndUpdateRLF2025Data = new RetrieveAndUpdateRLF2025Data();
			try {
				retrieveAndUpdateRLF2025Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateRLF2025Data.retrieveByCriteria();
			}
			finally {
				class_diagram_orm.RLF2025PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
