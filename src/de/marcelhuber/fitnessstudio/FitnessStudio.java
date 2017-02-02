/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudio;

import java.util.*;

/**
 *
 * @author Marcel Huber
 */
public class FitnessStudio {

    // mitgliedsAnzahlberechner und mitgliedsZaehler sollten immer identisch 
    // sein - Implementierung von beiden rein zu Test- und Kontrollzwecken
    private static long mitgliedsAnzahlberechner;
    private static long mitgliedsZaehler = 0;
    private static long letzteMitgliedsNummer = (long) 0;
    /* 
     Unterschied zwischen MitgliedsNummer und MitgliedsZaehler der
     FitnessStudio-Klasse: Die mitgliedsNummer wird mit jedem neuen
     Mitglied erhoeht und ändert sich nicht, wenn Mitglieder das
     Abo beenden - der Mitgliedszaehler hingegen sinkt auch, wenn
     Mitglieder austreten
     */
    private String name;       // Objekte werden im Konstruktor erzeugt
    private String standort;
    private int gruendungsjahr;
    private List<StandardMitglied> standardMitglied; 
    private List<Chef> chefs;

    /*
     private Chef[] chefFeld  = new Chef[2]; // das FitnessStudio soll 2 Chefs/Leiter haben 
     */
    /**
     * @param args the command line arguments
     */
    FitnessStudio() {
        name = "";
        standort = "";
        gruendungsjahr = 0;
        standardMitglied = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    FitnessStudio(String name, String standort,
            int gruendungsjahr) {
        standardMitglied = new ArrayList<>();
        chefs = new ArrayList<>();
        this.name = name;
        this.standort = standort;
        this.gruendungsjahr = gruendungsjahr;
    }

    void anzeigeFitnessStudio() {
        System.out.println("Unser Fitness-Studio " + name + " am "
                + "Standort " + standort + " wurde im Jahr "
                + gruendungsjahr + " gegründet!");

    }

    void getAusgabeMitgliederAnzahl() {
        if (mitgliedsZaehler == 0) {
            if (letzteMitgliedsNummer == 0) {
                System.out.print("Momentan führen wir leider noch keine Mitglied");
            } else {
                System.out.print("Leider verloren wir alle unsere Mitglied");
            }
        } else {
            System.out.print("Wir führen " + mitgliedsZaehler + " Mitglied");
        }
        if (mitgliedsZaehler != 1) {
            System.out.println("er!");
        } else {
            System.out.println("!");
        }
    }

    long getMitgliedsZaehler() {
        return mitgliedsZaehler;
    }

    long getLetzteMitgliedsNummer() {
        return letzteMitgliedsNummer;
    }

    String getName() {
        return name;
    }

    String getStandort() {
        return standort;
    }

    int getGruendungsjahr() {
        return gruendungsjahr;
    }

    void addStandardMitglied(StandardMitglied neuesStandardMitglied) {
        ++FitnessStudio.mitgliedsZaehler;
        ++FitnessStudio.letzteMitgliedsNummer;
        // unfertig: Wie füge ich ein neues Mitglied hier ein???
        //this.standardMitglied.add
        standardMitglied.add(neuesStandardMitglied);
    }

    void removeStandardMitglied(StandardMitglied altesStandardMitglied) {
        if (FitnessStudio.mitgliedsZaehler > 0) {
            --FitnessStudio.mitgliedsZaehler;
        } else {
            System.out.print("OHNE Mitglieder kann man KEINES entfernen!!! ");
        }
        // unfertig: Wie füge ich ein neues Mitglied hier ein???
        //this.standardMitglied.add
        standardMitglied.remove(altesStandardMitglied);
        mitgliedsAnzahlberechner = standardMitglied.size();
    }

    void addChef(Chef neuerChef) {
        chefs.add(neuerChef);
    }

    long getChefsZaehler() {
        return chefs.size();
    }

    // die folgende Methode zeigt die aktuell vorhandenen Mitglieder an
    void anzeigeStandardMitglieder() {
        System.out.println("Wir führen momentan folgende " + mitgliedsZaehler
                + " (Standard-)Mitglieder: ");
        System.out.println(standardMitglied.toString());
        mitgliedsAnzahlberechner = standardMitglied.size();
        System.out.println("Das sind " + mitgliedsAnzahlberechner
                + " Mitglieder.");
    }

}
