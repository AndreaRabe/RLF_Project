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

public class PorteurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression mots_passe;
	public final StringExpression biographie;
	public final CollectionExpression projets;
	
	public PorteurDetachedCriteria() {
		super(class_diagram_orm.Porteur.class, class_diagram_orm.PorteurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
		biographie = new StringExpression("biographie", this.getDetachedCriteria());
		projets = new CollectionExpression("ORM_Projets", this.getDetachedCriteria());
	}
	
	public PorteurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.PorteurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
		biographie = new StringExpression("biographie", this.getDetachedCriteria());
		projets = new CollectionExpression("ORM_Projets", this.getDetachedCriteria());
	}
	
	public class_diagram_orm.ProjetDetachedCriteria createProjetsCriteria() {
		return new class_diagram_orm.ProjetDetachedCriteria(createCriteria("ORM_Projets"));
	}
	
	public Porteur uniquePorteur(PersistentSession session) {
		return (Porteur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Porteur[] listPorteur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Porteur[]) list.toArray(new Porteur[list.size()]);
	}
}

