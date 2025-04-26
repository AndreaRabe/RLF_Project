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

public class ContributionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression projetId;
	public final AssociationExpression projet;
	public final IntegerExpression contributeurId;
	public final AssociationExpression contributeur;
	public final IntegerExpression montant_contribution;
	public final StringExpression date_contribution;
	public final StringExpression type_contribution;
	public final IntegerExpression paiementId;
	public final AssociationExpression paiement;
	
	public ContributionDetachedCriteria() {
		super(class_diagram_orm.Contribution.class, class_diagram_orm.ContributionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		projetId = new IntegerExpression("projet.ID", this.getDetachedCriteria());
		projet = new AssociationExpression("projet", this.getDetachedCriteria());
		contributeurId = new IntegerExpression("contributeur.", this.getDetachedCriteria());
		contributeur = new AssociationExpression("contributeur", this.getDetachedCriteria());
		montant_contribution = new IntegerExpression("montant_contribution", this.getDetachedCriteria());
		date_contribution = new StringExpression("date_contribution", this.getDetachedCriteria());
		type_contribution = new StringExpression("type_contribution", this.getDetachedCriteria());
		paiementId = new IntegerExpression("paiement.ID", this.getDetachedCriteria());
		paiement = new AssociationExpression("paiement", this.getDetachedCriteria());
	}
	
	public ContributionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.ContributionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		projetId = new IntegerExpression("projet.ID", this.getDetachedCriteria());
		projet = new AssociationExpression("projet", this.getDetachedCriteria());
		contributeurId = new IntegerExpression("contributeur.", this.getDetachedCriteria());
		contributeur = new AssociationExpression("contributeur", this.getDetachedCriteria());
		montant_contribution = new IntegerExpression("montant_contribution", this.getDetachedCriteria());
		date_contribution = new StringExpression("date_contribution", this.getDetachedCriteria());
		type_contribution = new StringExpression("type_contribution", this.getDetachedCriteria());
		paiementId = new IntegerExpression("paiement.ID", this.getDetachedCriteria());
		paiement = new AssociationExpression("paiement", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria createProjetCriteria() {
		return new ProjetDetachedCriteria(createCriteria("projet"));
	}
	
	public ContributeurDetachedCriteria createContributeurCriteria() {
		return new ContributeurDetachedCriteria(createCriteria("contributeur"));
	}
	
	public PaiementDetachedCriteria createPaiementCriteria() {
		return new PaiementDetachedCriteria(createCriteria("paiement"));
	}
	
	public Contribution uniqueContribution(PersistentSession session) {
		return (Contribution) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contribution[] listContribution(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contribution[]) list.toArray(new Contribution[list.size()]);
	}
}

