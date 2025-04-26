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

public class ContributionCriteria extends AbstractORMCriteria {
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
	
	public ContributionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		projetId = new IntegerExpression("projet.ID", this);
		projet = new AssociationExpression("projet", this);
		contributeurId = new IntegerExpression("contributeur.", this);
		contributeur = new AssociationExpression("contributeur", this);
		montant_contribution = new IntegerExpression("montant_contribution", this);
		date_contribution = new StringExpression("date_contribution", this);
		type_contribution = new StringExpression("type_contribution", this);
		paiementId = new IntegerExpression("paiement.ID", this);
		paiement = new AssociationExpression("paiement", this);
	}
	
	public ContributionCriteria(PersistentSession session) {
		this(session.createCriteria(Contribution.class));
	}
	
	public ContributionCriteria() throws PersistentException {
		this(class_diagram_orm.RLF2025PersistentManager.instance().getSession());
	}
	
	public ProjetCriteria createProjetCriteria() {
		return new ProjetCriteria(createCriteria("projet"));
	}
	
	public ContributeurCriteria createContributeurCriteria() {
		return new ContributeurCriteria(createCriteria("contributeur"));
	}
	
	public PaiementCriteria createPaiementCriteria() {
		return new PaiementCriteria(createCriteria("paiement"));
	}
	
	public Contribution uniqueContribution() {
		return (Contribution) super.uniqueResult();
	}
	
	public Contribution[] listContribution() {
		java.util.List list = super.list();
		return (Contribution[]) list.toArray(new Contribution[list.size()]);
	}
}

