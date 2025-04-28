/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * <p>
 * This is an automatic generated file. It will be regenerated every time
 * you generate persistence class.
 * <p>
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

public class ProjetCriteria extends AbstractORMCriteria {
    public final IntegerExpression ID;
    public final IntegerExpression porteurId;
    public final AssociationExpression porteur;
    public final StringExpression titre;
    public final StringExpression description;
    public final IntegerExpression objectif_financier;
    public final IntegerExpression montant_collecte;
    public final StringExpression date_debut;
    public final StringExpression date_fin;
    public final StringExpression visuels;
    public final StringExpression status_projet;
    public final CollectionExpression contributions;

    public ProjetCriteria(Criteria criteria) {
        super(criteria);
        ID = new IntegerExpression("ID", this);
        porteurId = new IntegerExpression("porteur.", this);
        porteur = new AssociationExpression("porteur", this);
        titre = new StringExpression("titre", this);
        description = new StringExpression("description", this);
        objectif_financier = new IntegerExpression("objectif_financier", this);
        montant_collecte = new IntegerExpression("montant_collecte", this);
        date_debut = new StringExpression("date_debut", this);
        date_fin = new StringExpression("date_fin", this);
        visuels = new StringExpression("visuels", this);
        status_projet = new StringExpression("status_projet", this);
        contributions = new CollectionExpression("ORM_Contributions", this);
    }

    public ProjetCriteria(PersistentSession session) {
        this(session.createCriteria(Projet.class));
    }

    public ProjetCriteria() throws PersistentException {
        this(class_diagram_orm.RLF2025PersistentManager.instance().getSession());
    }

    public PorteurCriteria createPorteurCriteria() {
        return new PorteurCriteria(createCriteria("porteur"));
    }

    public class_diagram_orm.ContributionCriteria createContributionsCriteria() {
        return new class_diagram_orm.ContributionCriteria(createCriteria("ORM_Contributions"));
    }

    public Projet uniqueProjet() {
        return (Projet) super.uniqueResult();
    }

    public Projet[] listProjet() {
        java.util.List list = super.list();
        return (Projet[]) list.toArray(new Projet[list.size()]);
    }
}

