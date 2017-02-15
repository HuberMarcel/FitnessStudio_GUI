package de.marcelhuber.datenbank;

import java.util.*;

public class StandardMitgliedKontaktTester {

    public static void main(String[] args) {
        new StandardMitgliedKontaktTester().go();
    }

    private void go() {
        DatabaseConnection dbc = new DatabaseConnection();
        StandardMitgliedKontaktConnector smkc = new StandardMitgliedKontaktConnector(dbc);
        
        List<StandardMitgliedKontakt> smkontakte = smkc.readStandardMitgliedKontakte();
        for (StandardMitgliedKontakt smkontakt : smkontakte) {
            System.out.println(smkontakt + " " + smkontakt.getNachname());
        }
        
        dbc.close();
    }
    
}
