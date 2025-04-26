package ormsamples;


import class_diagram_orm.RLF2025PersistentManager;
import org.orm.PersistentException;

public class TestConnection {
    public static void main(String[] args) {
        try {
            RLF2025PersistentManager.instance().getSession();
            System.out.println("✅ Connexion réussie à la base de données !");
        } catch (PersistentException e) {
            System.out.println("❌ Échec de connexion : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
