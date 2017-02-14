/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcel Huber
 */
public class FitnessStudio {

    private static int kettenMitgliedsZaehler = 0;
    // Wäre in dieser Form als Zähler für 
    // eine Studiokette geeignet, die in 
    // der Klasse FitnessStudio liegt
    private static int letzteMitgliedsNummer = 0;
        // mitgliedsAnzahlberechner und mitgliedsZaehler sollten immer identisch 
    // sein, da wir hier nur ein Fitness-Studio behandeln
    // momentane Implementierung von beiden rein zu Test- und Kontrollzwecken
    // mitgliedsAnzahlberechner    
    private int mitgliedsAnzahlberechner;
    
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
    // TODO: Einzige Mitgliederliste: Mitglied (abstrakte Klasse) --> Premium- 
    //       und Standardmitglied...
    private List<StandardMitglied> standardMitglieder;
    private List<Chef> chefs;  // TODO: abstrakte Klasse: Beschäftige... (Chef, Trainer,...) 
    private int mitgliedsZaehler = 0;
    // Zähler für die Anzahl der
    // Mitglieder eines einzelnen
    // Studio(-Objektes)

    /*
     private Chef[] chefFeld  = new Chef[2]; // das FitnessStudio soll 2 Chefs/Leiter haben 
     */
    /**
     * @param args the command line arguments
     */
    FitnessStudio() {
        this("", "", 0);
    }

    FitnessStudio(String name, String standort, int gruendungsjahr) {
        standardMitglieder = new ArrayList<>();
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

    int getMitgliedsZaehler() {
        return mitgliedsZaehler;
    }

    public int getLetzteMitgliedsNummer() {
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
        StandardMitglied anzulegendesStandardMitglied = new StandardMitglied();
        // hier stellen wir sicher, dass das neue Mitglied auch wirklich
        // die nächst-mögliche Mitgliedsnummer erhält;
        // doppelt eingefügte Mitglieder werden auch doppelt erfasst
        // sie sollen aber durch die MitgliedNummer unterscheidbar sein
        // Hinweis: clone (zum Kopieren eines Standard-Objektes) habe
        // ich nicht fehlerfrei implementiert bekommen

        anzulegendesStandardMitglied = new StandardMitglied(neuesStandardMitglied.getNachname(),
                neuesStandardMitglied.getVorname(), neuesStandardMitglied.getPlz(),
                neuesStandardMitglied.getWohnort(), neuesStandardMitglied.getAlter(),
                neuesStandardMitglied.getFitnessStudio());
        //standardMitglieder.add(anzulegendesStandardMitglied);
        standardMitglieder.add(anzulegendesStandardMitglied);
        ++mitgliedsZaehler;
        ++FitnessStudio.kettenMitgliedsZaehler;
        ++FitnessStudio.letzteMitgliedsNummer;
    }

    int removeStandardMitglied(int mitgliedsnummer) {
        int helpIndex = -1;
        if (FitnessStudio.kettenMitgliedsZaehler == 0) {
            System.out.print("OHNE Mitglieder kann man KEINES entfernen!!! ");
        } else if ((mitgliedsnummer >= 0) && (mitgliedsnummer <= FitnessStudio.letzteMitgliedsNummer)) {
            /* die folgende Suche kann man beschleunigen auf O(n log n)
             zum Test aber einfach mal straight forward 
             */
            for (StandardMitglied standardMitglied : standardMitglieder) {
                if (standardMitglied.getMitgliedNummer() == mitgliedsnummer) {
                    helpIndex = standardMitglieder.indexOf(standardMitglied);
                    /* Ausgabe der Stelle, wo das entsprechende Mitglied aus der
                     ArrayList zu entfernen ist */
                    /* Wichtige Beobachtung: Innerhalb der foreach-Schleife
                     soll/darf(?) man die ArrayList standardMitglieder nicht
                     verkleinern --- bzw. gibt es einen Befehl, um dann früher
                     diese zu verlassen?? Nachschlagen!
                     */
                }
            }
        }
        if (helpIndex != -1) {
            // s.o.: Erst Entfernen NACH dem gaanzen ArrayList-Durchlauf
            System.out.println("Zu entfernen ist das folgende Mitglied:");
            System.out.println(standardMitglieder.get(helpIndex));
            standardMitglieder.remove(standardMitglieder.get(helpIndex));
            --FitnessStudio.kettenMitgliedsZaehler;
            --mitgliedsZaehler;
        } else {
            System.out.println("Bitte kontrollieren Sie die Mitgliedsnummer:"
                    + " EINE SOLCHE MITGLIEDSNUMMER GIBT ES IN DIESEM STUDIO "
                    + "NICHT!!\n\n\n");
        }
        return helpIndex;
    }

    void addChef(Chef neuerChef) {
        chefs.add(neuerChef);
    }

    int getChefsZaehler() {
        return chefs.size();
    }

    // die folgende Methode zeigt die aktuell vorhandenen Mitglieder an
    void anzeigeStandardMitglieder() {
        System.out.println("Wir führen momentan folgende " + mitgliedsZaehler
                + " (Standard-)Mitglieder: ");
        System.out.println(standardMitglieder.toString());
        mitgliedsAnzahlberechner = standardMitglieder.size();
        System.out.println("Das sind " + mitgliedsAnzahlberechner
                + " Mitglieder.");
    }

    String getFitnessStudioName() {
        return name;
    }

    List getStandardMitglieder() {
        return standardMitglieder;
    }
}
