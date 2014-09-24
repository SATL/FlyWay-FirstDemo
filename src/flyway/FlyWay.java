/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyway;

import org.flywaydb.core.Flyway;

/**
 *
 * @author eslem
 */
public class FlyWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:mysql://localhost:3306/pruebaflyway", "root", null);

        // Start the migration
        flyway.migrate();
    }
    
}
