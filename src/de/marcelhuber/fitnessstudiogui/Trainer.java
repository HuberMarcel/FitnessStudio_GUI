/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.*;

/**
 *
 * @author Huber, Marcel
 */
class Trainer extends AbstraktMitarbeiter {

    private ArrayList<String> spezialisierungsbereiche;

    /* TODOs: 
     - das aktuelle Monats-Brutto-Gehalt; 
     - die Zeit, wie lange der Trainer schon für uns arbeitet;
     - ein (zur Vereinfachung erstmal) wöchentlicher Arbeitsplan;
     - ...
     sollen auch noch in dem Trainer-Objekt festgehalten werden.
     */

    Trainer() {
    }

    Trainer(String nachName, String vorName, String plz, String wohnort, int alter) {
        super(nachName, vorName, plz, wohnort, alter, "Trainer");
        this.spezialisierungsbereiche = new ArrayList<>();
    }

    Trainer(String nachName, String vorName, String plz, String wohnort, int alter,
            String neuerAufgabenbereich, String neuerSpezialisierungsbereich) {
        this(nachName, vorName, plz, wohnort, alter);
        /* zum Anlegen eines Trainers, der
         bislang noch keine Spezialisierung angegeben hat bzw. die noch nicht bekannt
         ist
         */
        this.addNeuerAufgabenbereich(neuerAufgabenbereich);
        this.addSpezialisierungsbereich(neuerSpezialisierungsbereich);
    }

    ArrayList<String> getSpezialisierungsbereiche() {
        return spezialisierungsbereiche;
    }

    void addSpezialisierungsbereich(String neuerSpezialisierungsbereich) {
        spezialisierungsbereiche.add(neuerSpezialisierungsbereich);
    }
    
    boolean removeSpezialisierungsbereich(String alterSpezialisierungsbereich){
        return spezialisierungsbereiche.remove(alterSpezialisierungsbereich);
    }
    
    void addNeuerAufgabenbereich(String neuerAufgabenbereich){
      aufgabenbereiche.add(neuerAufgabenbereich);
    }
    
    boolean removeAufgabenbereich(String alterAufgabenbereich){
        return aufgabenbereiche.remove(alterAufgabenbereich);
    }
    
    int getAnzahlDerSpezialGebiete() {
        return spezialisierungsbereiche.size();
    }

    @Override
    public String toString() {
        String personenInformationen;
        personenInformationen = String.format("Trainer[Nachname = %s, Vorname = %s, "
                + "PLZ:%s, Wohnort: %s, Alter: %d", this.getNachname(), this.getVorname(),
                this.getPlz(), this.getWohnort(), this.getAlter());
        return personenInformationen + spezialisierungsbereiche + aufgabenbereiche;
    }

}
