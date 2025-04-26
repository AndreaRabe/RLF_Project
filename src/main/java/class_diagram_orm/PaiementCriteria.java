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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PaiementCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression contributionId;
	public final AssociationExpression contribution;
	public final IntegerExpression montant_paiement;
	public final StringExpression date_paiement;
	public final StringExpression methode_paiement;
	public final StringExpression status_paiement;
	
	public PaiementCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		contributionId = new IntegerExpression("contribution.ID", this);
		contribution = new AssociationExpression("contribution", this);
		montant_paiement = new IntegerExpression("montant_paiement", this);
		date_paiement = new StringExpression("date_paiement", this);
		methode_paiement = new StringExpression("methode_paiement", this);
		status_paiement = new StringExpression("status_paiement", this);
	}
	
	public PaiementCriteria(PersistentSession session) {
		this(session.createCriteria(Paiement.class));
	}
	
	public PaiementCriteria() throws PersistentException {
		this(class_diagram_orm.RLF2025PersistentManager.instance().getSession());
	}
	
	public ContributionCriteria createContributionCriteria() {
		return new ContributionCriteria(createCriteria("contribution"));
	}
	
	public Paiement uniquePaiement() {
		return (Paiement) super.uniqueResult();
	}
	
	public Paiement[] listPaiement() {
		java.util.List list = super.list();
		return (Paiement[]) list.toArray(new Paiement[list.size()]);
	}
}

