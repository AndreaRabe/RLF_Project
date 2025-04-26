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

public class ContributeurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression mots_passe;
	public final CollectionExpression contributions;
	
	public ContributeurDetachedCriteria() {
		super(class_diagram_orm.Contributeur.class, class_diagram_orm.ContributeurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
		contributions = new CollectionExpression("ORM_Contributions", this.getDetachedCriteria());
	}
	
	public ContributeurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.ContributeurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
		contributions = new CollectionExpression("ORM_Contributions", this.getDetachedCriteria());
	}
	
	public class_diagram_orm.ContributionDetachedCriteria createContributionsCriteria() {
		return new class_diagram_orm.ContributionDetachedCriteria(createCriteria("ORM_Contributions"));
	}
	
	public Contributeur uniqueContributeur(PersistentSession session) {
		return (Contributeur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contributeur[] listContributeur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contributeur[]) list.toArray(new Contributeur[list.size()]);
	}
}

