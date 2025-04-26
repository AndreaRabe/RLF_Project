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

public class PaiementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression contributionId;
	public final AssociationExpression contribution;
	public final IntegerExpression montant_paiement;
	public final StringExpression date_paiement;
	public final StringExpression methode_paiement;
	public final StringExpression status_paiement;
	
	public PaiementDetachedCriteria() {
		super(class_diagram_orm.Paiement.class, class_diagram_orm.PaiementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contributionId = new IntegerExpression("contribution.ID", this.getDetachedCriteria());
		contribution = new AssociationExpression("contribution", this.getDetachedCriteria());
		montant_paiement = new IntegerExpression("montant_paiement", this.getDetachedCriteria());
		date_paiement = new StringExpression("date_paiement", this.getDetachedCriteria());
		methode_paiement = new StringExpression("methode_paiement", this.getDetachedCriteria());
		status_paiement = new StringExpression("status_paiement", this.getDetachedCriteria());
	}
	
	public PaiementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.PaiementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contributionId = new IntegerExpression("contribution.ID", this.getDetachedCriteria());
		contribution = new AssociationExpression("contribution", this.getDetachedCriteria());
		montant_paiement = new IntegerExpression("montant_paiement", this.getDetachedCriteria());
		date_paiement = new StringExpression("date_paiement", this.getDetachedCriteria());
		methode_paiement = new StringExpression("methode_paiement", this.getDetachedCriteria());
		status_paiement = new StringExpression("status_paiement", this.getDetachedCriteria());
	}
	
	public ContributionDetachedCriteria createContributionCriteria() {
		return new ContributionDetachedCriteria(createCriteria("contribution"));
	}
	
	public Paiement uniquePaiement(PersistentSession session) {
		return (Paiement) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paiement[] listPaiement(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paiement[]) list.toArray(new Paiement[list.size()]);
	}
}

