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

public class PorteurCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression mots_passe;
	public final StringExpression biographie;
	public final CollectionExpression projets;
	
	public PorteurCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		prenom = new StringExpression("prenom", this);
		email = new StringExpression("email", this);
		mots_passe = new StringExpression("mots_passe", this);
		biographie = new StringExpression("biographie", this);
		projets = new CollectionExpression("ORM_Projets", this);
	}
	
	public PorteurCriteria(PersistentSession session) {
		this(session.createCriteria(Porteur.class));
	}
	
	public PorteurCriteria() throws PersistentException {
		this(class_diagram_orm.RLF2025PersistentManager.instance().getSession());
	}
	
	public class_diagram_orm.ProjetCriteria createProjetsCriteria() {
		return new class_diagram_orm.ProjetCriteria(createCriteria("ORM_Projets"));
	}
	
	public Porteur uniquePorteur() {
		return (Porteur) super.uniqueResult();
	}
	
	public Porteur[] listPorteur() {
		java.util.List list = super.list();
		return (Porteur[]) list.toArray(new Porteur[list.size()]);
	}
}

