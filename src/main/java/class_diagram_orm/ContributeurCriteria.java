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

public class ContributeurCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression mots_passe;
	public final CollectionExpression contributions;
	
	public ContributeurCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		prenom = new StringExpression("prenom", this);
		email = new StringExpression("email", this);
		mots_passe = new StringExpression("mots_passe", this);
		contributions = new CollectionExpression("ORM_Contributions", this);
	}
	
	public ContributeurCriteria(PersistentSession session) {
		this(session.createCriteria(Contributeur.class));
	}
	
	public ContributeurCriteria() throws PersistentException {
		this(class_diagram_orm.RLF2025PersistentManager.instance().getSession());
	}
	
	public class_diagram_orm.ContributionCriteria createContributionsCriteria() {
		return new class_diagram_orm.ContributionCriteria(createCriteria("ORM_Contributions"));
	}
	
	public Contributeur uniqueContributeur() {
		return (Contributeur) super.uniqueResult();
	}
	
	public Contributeur[] listContributeur() {
		java.util.List list = super.list();
		return (Contributeur[]) list.toArray(new Contributeur[list.size()]);
	}
}

