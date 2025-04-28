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

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import java.io.Serializable;
import java.util.List;

public class Projet implements Serializable {
    private int ID;
    private class_diagram_orm.Porteur porteur;
    private String titre;
    private String description;
    private int objectif_financier;
    private int montant_collecte;
    private String date_debut;
    private String date_fin;
    private String visuels;
    private String status_projet;
    private java.util.Set ORM_contributions = new java.util.HashSet();
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };
    public final class_diagram_orm.ContributionSetCollection contributions = new class_diagram_orm.ContributionSetCollection(this, _ormAdapter, class_diagram_orm.ORMConstants.KEY_PROJET_CONTRIBUTIONS, class_diagram_orm.ORMConstants.KEY_CONTRIBUTION_PROJET, class_diagram_orm.ORMConstants.KEY_MUL_ONE_TO_MANY);

    public Projet() {
    }

    public static Projet loadProjetByORMID(int ID) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return loadProjetByORMID(session, ID);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet getProjetByORMID(int ID) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return getProjetByORMID(session, ID);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return loadProjetByORMID(session, ID, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet getProjetByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return getProjetByORMID(session, ID, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByORMID(PersistentSession session, int ID) throws PersistentException {
        try {
            return (Projet) session.load(class_diagram_orm.Projet.class, new Integer(ID));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet getProjetByORMID(PersistentSession session, int ID) throws PersistentException {
        try {
            return (Projet) session.get(class_diagram_orm.Projet.class, new Integer(ID));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Projet) session.load(class_diagram_orm.Projet.class, new Integer(ID), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet getProjetByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            return (Projet) session.get(class_diagram_orm.Projet.class, new Integer(ID), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProjet(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return queryProjet(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProjet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return queryProjet(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet[] listProjetByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return listProjetByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet[] listProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return listProjetByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProjet(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From class_diagram_orm.Projet as Projet");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryProjet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From class_diagram_orm.Projet as Projet");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Projet", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryProjet(session, condition, orderBy);
            return (Projet[]) list.toArray(new Projet[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            List list = queryProjet(session, condition, orderBy, lockMode);
            return (Projet[]) list.toArray(new Projet[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return loadProjetByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return loadProjetByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Projet[] projets = listProjetByQuery(session, condition, orderBy);
        if (projets != null && projets.length > 0)
            return projets[0];
        else
            return null;
    }

    public static Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        Projet[] projets = listProjetByQuery(session, condition, orderBy, lockMode);
        if (projets != null && projets.length > 0)
            return projets[0];
        else
            return null;
    }

    public static java.util.Iterator iterateProjetByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return iterateProjetByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = class_diagram_orm.RLF2025PersistentManager.instance().getSession();
            return iterateProjetByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From class_diagram_orm.Projet as Projet");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From class_diagram_orm.Projet as Projet");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Projet", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Projet loadProjetByCriteria(ProjetCriteria projetCriteria) {
        Projet[] projets = listProjetByCriteria(projetCriteria);
        if (projets == null || projets.length == 0) {
            return null;
        }
        return projets[0];
    }

    public static Projet[] listProjetByCriteria(ProjetCriteria projetCriteria) {
        return projetCriteria.listProjet();
    }

    public static Projet createProjet() {
        return new class_diagram_orm.Projet();
    }

    public boolean save() throws PersistentException {
        try {
            class_diagram_orm.RLF2025PersistentManager.instance().saveObject(this);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public boolean delete() throws PersistentException {
        try {
            class_diagram_orm.RLF2025PersistentManager.instance().deleteObject(this);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public boolean refresh() throws PersistentException {
        try {
            class_diagram_orm.RLF2025PersistentManager.instance().getSession().refresh(this);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public boolean evict() throws PersistentException {
        try {
            class_diagram_orm.RLF2025PersistentManager.instance().getSession().evict(this);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public boolean deleteAndDissociate() throws PersistentException {
        try {
            if (getPorteur() != null) {
                getPorteur().projets.remove(this);
            }

            class_diagram_orm.Contribution[] lContributionss = contributions.toArray();
            for (int i = 0; i < lContributionss.length; i++) {
                lContributionss[i].setProjet(null);
            }
            return delete();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public boolean deleteAndDissociate(org.orm.PersistentSession session) throws PersistentException {
        try {
            if (getPorteur() != null) {
                getPorteur().projets.remove(this);
            }

            class_diagram_orm.Contribution[] lContributionss = contributions.toArray();
            for (int i = 0; i < lContributionss.length; i++) {
                lContributionss[i].setProjet(null);
            }
            try {
                session.delete(this);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    private java.util.Set this_getSet(int key) {
        if (key == class_diagram_orm.ORMConstants.KEY_PROJET_CONTRIBUTIONS) {
            return ORM_contributions;
        }

        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == class_diagram_orm.ORMConstants.KEY_PROJET_PORTEUR) {
            this.porteur = (class_diagram_orm.Porteur) owner;
        }
    }

    public int getID() {
        return ID;
    }

    private void setID(int value) {
        this.ID = value;
    }

    public int getORMID() {
        return getID();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String value) {
        this.titre = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public int getObjectif_financier() {
        return objectif_financier;
    }

    public void setObjectif_financier(int value) {
        this.objectif_financier = value;
    }

    public int getMontant_collecte() {
        return montant_collecte;
    }

    public void setMontant_collecte(int value) {
        this.montant_collecte = value;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String value) {
        this.date_debut = value;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String value) {
        this.date_fin = value;
    }

    public String getVisuels() {
        return visuels;
    }

    public void setVisuels(String value) {
        this.visuels = value;
    }

    public String getStatus_projet() {
        return status_projet;
    }

    public void setStatus_projet(String value) {
        this.status_projet = value;
    }

    public class_diagram_orm.Porteur getPorteur() {
        return porteur;
    }

    public void setPorteur(class_diagram_orm.Porteur value) {
        if (porteur != null) {
            porteur.projets.remove(this);
        }
        if (value != null) {
            value.projets.add(this);
        }
    }

    private class_diagram_orm.Porteur getORM_Porteur() {
        return porteur;
    }

    /**
     * This method is for internal use only.
     */
    private void setORM_Porteur(class_diagram_orm.Porteur value) {
        this.porteur = value;
    }

    private java.util.Set getORM_Contributions() {
        return ORM_contributions;
    }

    private void setORM_Contributions(java.util.Set value) {
        this.ORM_contributions = value;
    }

    public String toString() {
        return String.valueOf(getID());
    }

}