/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListRLF2025Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utilisateur...");
		class_diagram_orm.Utilisateur[] class_Diagram_ORMUtilisateurs = class_diagram_orm.Utilisateur.listUtilisateurByQuery(null, null);
		int length = Math.min(class_Diagram_ORMUtilisateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMUtilisateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Contribution...");
		class_diagram_orm.Contribution[] class_Diagram_ORMContributions = class_diagram_orm.Contribution.listContributionByQuery(null, null);
		length = Math.min(class_Diagram_ORMContributions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMContributions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paiement...");
		class_diagram_orm.Paiement[] class_Diagram_ORMPaiements = class_diagram_orm.Paiement.listPaiementByQuery(null, null);
		length = Math.min(class_Diagram_ORMPaiements.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMPaiements[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Projet...");
		class_diagram_orm.Projet[] class_Diagram_ORMProjets = class_diagram_orm.Projet.listProjetByQuery(null, null);
		length = Math.min(class_Diagram_ORMProjets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMProjets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrateur...");
		class_diagram_orm.Administrateur[] class_Diagram_ORMAdministrateurs = class_diagram_orm.Administrateur.listAdministrateurByQuery(null, null);
		length = Math.min(class_Diagram_ORMAdministrateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMAdministrateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Contributeur...");
		class_diagram_orm.Contributeur[] class_Diagram_ORMContributeurs = class_diagram_orm.Contributeur.listContributeurByQuery(null, null);
		length = Math.min(class_Diagram_ORMContributeurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMContributeurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Porteur...");
		class_diagram_orm.Porteur[] class_Diagram_ORMPorteurs = class_diagram_orm.Porteur.listPorteurByQuery(null, null);
		length = Math.min(class_Diagram_ORMPorteurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_Diagram_ORMPorteurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilisateur by Criteria...");
		class_diagram_orm.UtilisateurCriteria class_Diagram_ORMUtilisateurCriteria = new class_diagram_orm.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMUtilisateurCriteria.ID.eq();
		class_Diagram_ORMUtilisateurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Utilisateur[] class_Diagram_ORMUtilisateurs = class_Diagram_ORMUtilisateurCriteria.listUtilisateur();
		int length =class_Diagram_ORMUtilisateurs== null ? 0 : Math.min(class_Diagram_ORMUtilisateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMUtilisateurs[i]);
		}
		System.out.println(length + " Utilisateur record(s) retrieved."); 
		
		System.out.println("Listing Contribution by Criteria...");
		class_diagram_orm.ContributionCriteria class_Diagram_ORMContributionCriteria = new class_diagram_orm.ContributionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMContributionCriteria.ID.eq();
		class_Diagram_ORMContributionCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Contribution[] class_Diagram_ORMContributions = class_Diagram_ORMContributionCriteria.listContribution();
		length =class_Diagram_ORMContributions== null ? 0 : Math.min(class_Diagram_ORMContributions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMContributions[i]);
		}
		System.out.println(length + " Contribution record(s) retrieved."); 
		
		System.out.println("Listing Paiement by Criteria...");
		class_diagram_orm.PaiementCriteria class_Diagram_ORMPaiementCriteria = new class_diagram_orm.PaiementCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMPaiementCriteria.ID.eq();
		class_Diagram_ORMPaiementCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Paiement[] class_Diagram_ORMPaiements = class_Diagram_ORMPaiementCriteria.listPaiement();
		length =class_Diagram_ORMPaiements== null ? 0 : Math.min(class_Diagram_ORMPaiements.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMPaiements[i]);
		}
		System.out.println(length + " Paiement record(s) retrieved."); 
		
		System.out.println("Listing Projet by Criteria...");
		class_diagram_orm.ProjetCriteria class_Diagram_ORMProjetCriteria = new class_diagram_orm.ProjetCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMProjetCriteria.ID.eq();
		class_Diagram_ORMProjetCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Projet[] class_Diagram_ORMProjets = class_Diagram_ORMProjetCriteria.listProjet();
		length =class_Diagram_ORMProjets== null ? 0 : Math.min(class_Diagram_ORMProjets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMProjets[i]);
		}
		System.out.println(length + " Projet record(s) retrieved."); 
		
		System.out.println("Listing Administrateur by Criteria...");
		class_diagram_orm.AdministrateurCriteria class_Diagram_ORMAdministrateurCriteria = new class_diagram_orm.AdministrateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMAdministrateurCriteria.ID.eq();
		class_Diagram_ORMAdministrateurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Administrateur[] class_Diagram_ORMAdministrateurs = class_Diagram_ORMAdministrateurCriteria.listAdministrateur();
		length =class_Diagram_ORMAdministrateurs== null ? 0 : Math.min(class_Diagram_ORMAdministrateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMAdministrateurs[i]);
		}
		System.out.println(length + " Administrateur record(s) retrieved."); 
		
		System.out.println("Listing Contributeur by Criteria...");
		class_diagram_orm.ContributeurCriteria class_Diagram_ORMContributeurCriteria = new class_diagram_orm.ContributeurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMContributeurCriteria.ID.eq();
		class_Diagram_ORMContributeurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Contributeur[] class_Diagram_ORMContributeurs = class_Diagram_ORMContributeurCriteria.listContributeur();
		length =class_Diagram_ORMContributeurs== null ? 0 : Math.min(class_Diagram_ORMContributeurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMContributeurs[i]);
		}
		System.out.println(length + " Contributeur record(s) retrieved."); 
		
		System.out.println("Listing Porteur by Criteria...");
		class_diagram_orm.PorteurCriteria class_Diagram_ORMPorteurCriteria = new class_diagram_orm.PorteurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//class_Diagram_ORMPorteurCriteria.ID.eq();
		class_Diagram_ORMPorteurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Porteur[] class_Diagram_ORMPorteurs = class_Diagram_ORMPorteurCriteria.listPorteur();
		length =class_Diagram_ORMPorteurs== null ? 0 : Math.min(class_Diagram_ORMPorteurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_Diagram_ORMPorteurs[i]);
		}
		System.out.println(length + " Porteur record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListRLF2025Data listRLF2025Data = new ListRLF2025Data();
			try {
				listRLF2025Data.listTestData();
				//listRLF2025Data.listByCriteria();
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
