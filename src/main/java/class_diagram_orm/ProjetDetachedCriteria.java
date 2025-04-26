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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProjetDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression porteurId;
	public final AssociationExpression porteur;
	public final StringExpression titre;
	public final StringExpression description;
	public final IntegerExpression objectif_financier;
	public final IntegerExpression montant_collecte;
	public final IntegerExpression date_debut;
	public final StringExpression date_fin;
	public final StringExpression visuels;
	public final StringExpression status_projet;
	public final CollectionExpression contributions;
	
	public ProjetDetachedCriteria() {
		super(class_diagram_orm.Projet.class, class_diagram_orm.ProjetCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		porteurId = new IntegerExpression("porteur.", this.getDetachedCriteria());
		porteur = new AssociationExpression("porteur", this.getDetachedCriteria());
		titre = new StringExpression("titre", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		objectif_financier = new IntegerExpression("objectif_financier", this.getDetachedCriteria());
		montant_collecte = new IntegerExpression("montant_collecte", this.getDetachedCriteria());
		date_debut = new IntegerExpression("date_debut", this.getDetachedCriteria());
		date_fin = new StringExpression("date_fin", this.getDetachedCriteria());
		visuels = new StringExpression("visuels", this.getDetachedCriteria());
		status_projet = new StringExpression("status_projet", this.getDetachedCriteria());
		contributions = new CollectionExpression("ORM_Contributions", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.ProjetCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		porteurId = new IntegerExpression("porteur.", this.getDetachedCriteria());
		porteur = new AssociationExpression("porteur", this.getDetachedCriteria());
		titre = new StringExpression("titre", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		objectif_financier = new IntegerExpression("objectif_financier", this.getDetachedCriteria());
		montant_collecte = new IntegerExpression("montant_collecte", this.getDetachedCriteria());
		date_debut = new IntegerExpression("date_debut", this.getDetachedCriteria());
		date_fin = new StringExpression("date_fin", this.getDetachedCriteria());
		visuels = new StringExpression("visuels", this.getDetachedCriteria());
		status_projet = new StringExpression("status_projet", this.getDetachedCriteria());
		contributions = new CollectionExpression("ORM_Contributions", this.getDetachedCriteria());
	}
	
	public PorteurDetachedCriteria createPorteurCriteria() {
		return new PorteurDetachedCriteria(createCriteria("porteur"));
	}
	
	public class_diagram_orm.ContributionDetachedCriteria createContributionsCriteria() {
		return new class_diagram_orm.ContributionDetachedCriteria(createCriteria("ORM_Contributions"));
	}
	
	public Projet uniqueProjet(PersistentSession session) {
		return (Projet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Projet[] listProjet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Projet[]) list.toArray(new Projet[list.size()]);
	}
}

