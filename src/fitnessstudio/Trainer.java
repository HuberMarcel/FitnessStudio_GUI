/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessstudio;

import java.util.*;

/**
 *
 * @author Huber, Marcel
 */
class Trainer extends Person {

    private ArrayList<String> spezialisierungsBereiche;
    /* TODOs: 
     - das aktuelle Monats-Brutto-Gehalt; 
     - die Zeit, wie lange der Trainer schon für uns arbeitet;
     - ein (zur Vereinfachung erstmal) wöchentlicher Arbeitsplan;
     - ...
     sollen auch noch in dem Trainer-Objekt festgehalten werden.
     */

    Trainer() {
    }

    Trainer(String nachName, String vorName, String wohnort, int alter) {
        super(nachName, vorName, wohnort, alter);
        this.spezialisierungsBereiche = new ArrayList<>();
    }

    Trainer(String nachName, String vorName, String wohnort, int alter, String neuerSpezialisierungsBereich) {
        this(nachName, vorName, wohnort, alter); /* zum Anlegen eines Trainers, der
         bislang noch keine Spezialisierung angegeben hat bzw. die noch nicht bekannt
         ist
         */

        this.addSpezialisierungsBereich(neuerSpezialisierungsBereich);
    }

    ArrayList<String> getSpezialisierungsBereiche() {
        return spezialisierungsBereiche;
    }

    void addSpezialisierungsBereich(String neuerSpezialisierungsBereich) {

        spezialisierungsBereiche.add(neuerSpezialisierungsBereich);
    }

    long getAnzahlDerSpezialGebiete() {
        return spezialisierungsBereiche.size();
    }

    @Override
    public String toString() {
        return String.format("Trainer[Nachname=%s, Vorname=%s, Wohnort: %s, "
                + "Alter: %d]"
                , this.getNachname(), this.getVorname(), this.getWohnort(), 
                this.getAlter());
    }

}
