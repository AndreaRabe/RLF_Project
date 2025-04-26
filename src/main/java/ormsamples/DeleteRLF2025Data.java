/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteRLF2025Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = class_diagram_orm.RLF2025PersistentManager.instance().getSession().beginTransaction();
		try {
			class_diagram_orm.Utilisateur class_Diagram_ORMUtilisateur = class_diagram_orm.Utilisateur.loadUtilisateurByQuery(null, null);
			class_Diagram_ORMUtilisateur.delete();
			class_diagram_orm.Contribution class_Diagram_ORMContribution = class_diagram_orm.Contribution.loadContributionByQuery(null, null);
			class_Diagram_ORMContribution.delete();
			class_diagram_orm.Paiement class_Diagram_ORMPaiement = class_diagram_orm.Paiement.loadPaiementByQuery(null, null);
			class_Diagram_ORMPaiement.delete();
			class_diagram_orm.Projet class_Diagram_ORMProjet = class_diagram_orm.Projet.loadProjetByQuery(null, null);
			class_Diagram_ORMProjet.delete();
			class_diagram_orm.Administrateur class_Diagram_ORMAdministrateur = class_diagram_orm.Administrateur.loadAdministrateurByQuery(null, null);
			class_Diagram_ORMAdministrateur.delete();
			class_diagram_orm.Contributeur class_Diagram_ORMContributeur = class_diagram_orm.Contributeur.loadContributeurByQuery(null, null);
			class_Diagram_ORMContributeur.delete();
			class_diagram_orm.Porteur class_Diagram_ORMPorteur = class_diagram_orm.Porteur.loadPorteurByQuery(null, null);
			class_Diagram_ORMPorteur.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteRLF2025Data deleteRLF2025Data = new DeleteRLF2025Data();
			try {
				deleteRLF2025Data.deleteTestData();
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
