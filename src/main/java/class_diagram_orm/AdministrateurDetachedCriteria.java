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

public class AdministrateurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression mots_passe;
	
	public AdministrateurDetachedCriteria() {
		super(class_diagram_orm.Administrateur.class, class_diagram_orm.AdministrateurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
	}
	
	public AdministrateurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.AdministrateurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
	}
	
	public Administrateur uniqueAdministrateur(PersistentSession session) {
		return (Administrateur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrateur[] listAdministrateur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrateur[]) list.toArray(new Administrateur[list.size()]);
	}
}

