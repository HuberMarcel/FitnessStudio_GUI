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

    Trainer(String nachName, String vorName, String plz, String wohnort,
            GregorianCalendar tagDerGeburt, KontoDaten kontodatenTrainer) {
        super(nachName, vorName, plz, wohnort, tagDerGeburt, "Trainer", kontodatenTrainer);
        this.spezialisierungsbereiche = new ArrayList<>();
    }

    Trainer(String nachName, String vorName, String plz, String wohnort,
            GregorianCalendar tagDerGeburt, String neuerAufgabenbereich,
            String neuerSpezialisierungsbereich, KontoDaten kontoDaten) {
        this(nachName, vorName, plz, wohnort, tagDerGeburt, kontoDaten);
        /* zum Anlegen eines Trainers, der schon eine Spezialisierungen angegeben 
         hat und zusätzliche Aufgabenbereiche bekommt
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

    boolean removeSpezialisierungsbereich(String alterSpezialisierungsbereich) {
        return spezialisierungsbereiche.remove(alterSpezialisierungsbereich);
    }

    void addNeuerAufgabenbereich(String neuerAufgabenbereich) {
        aufgabenbereiche.add(neuerAufgabenbereich);
    }

    boolean removeAufgabenbereich(String alterAufgabenbereich) {
        return aufgabenbereiche.remove(alterAufgabenbereich);
    }

    int getAnzahlDerSpezialGebiete() {
        return spezialisierungsbereiche.size();
    }

    @Override
    public String toString() {
        String personenInformationen;
        personenInformationen = super.toString();
        return (personenInformationen
                + "\nSpezialisierungsbereiche: " + spezialisierungsbereiche
                + "\nAufgabenbereiche: " + aufgabenbereiche);
    }

}
