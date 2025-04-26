/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateRLF2025Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = class_diagram_orm.RLF2025PersistentManager.instance().getSession().beginTransaction();
		try {
			class_diagram_orm.Utilisateur class_Diagram_ORMUtilisateur = class_diagram_orm.Utilisateur.createUtilisateur();
			// Initialize the properties of the persistent object here
			class_Diagram_ORMUtilisateur.save();
			class_diagram_orm.Contribution class_Diagram_ORMContribution = class_diagram_orm.Contribution.createContribution();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paiement, montant_contribution, contributeur, projet
			class_Diagram_ORMContribution.save();
			class_diagram_orm.Paiement class_Diagram_ORMPaiement = class_diagram_orm.Paiement.createPaiement();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : montant_paiement, contribution
			class_Diagram_ORMPaiement.save();
			class_diagram_orm.Projet class_Diagram_ORMProjet = class_diagram_orm.Projet.createProjet();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contributions, date_debut, montant_collecte, objectif_financier, porteur
			class_Diagram_ORMProjet.save();
			class_diagram_orm.Administrateur class_Diagram_ORMAdministrateur = class_diagram_orm.Administrateur.createAdministrateur();
			// Initialize the properties of the persistent object here
			class_Diagram_ORMAdministrateur.save();
			class_diagram_orm.Contributeur class_Diagram_ORMContributeur = class_diagram_orm.Contributeur.createContributeur();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contributions
			class_Diagram_ORMContributeur.save();
			class_diagram_orm.Porteur class_Diagram_ORMPorteur = class_diagram_orm.Porteur.createPorteur();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : projets
			class_Diagram_ORMPorteur.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateRLF2025Data createRLF2025Data = new CreateRLF2025Data();
			try {
				createRLF2025Data.createTestData();
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
