/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DropRLF2025DatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(class_diagram_orm.RLF2025PersistentManager.instance());
				class_diagram_orm.RLF2025PersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
