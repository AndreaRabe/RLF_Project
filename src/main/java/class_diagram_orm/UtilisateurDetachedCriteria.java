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

public class UtilisateurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression mots_passe;
	
	public UtilisateurDetachedCriteria() {
		super(class_diagram_orm.Utilisateur.class, class_diagram_orm.UtilisateurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
	}
	
	public UtilisateurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.UtilisateurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		mots_passe = new StringExpression("mots_passe", this.getDetachedCriteria());
	}
	
	public Utilisateur uniqueUtilisateur(PersistentSession session) {
		return (Utilisateur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilisateur[] listUtilisateur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
	}
}

