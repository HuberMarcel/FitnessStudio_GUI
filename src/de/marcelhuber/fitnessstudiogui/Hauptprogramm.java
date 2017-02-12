/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Huber, Marcel Heute ist der 01.02.2017
 */
public class Hauptprogramm {

    public static void main(String[] args) {
        int schalter = 1; // Nur Werte von 0 bis 7 sinnvoll
        new Hauptprogramm().go(schalter);
    }

    void go(int k) {
        switch (k) {
            case 1:
                goTestFallChefs();
                break;
            case 2:
                goTestFallTrainer();
                break;
            case 3:
                goTestFallMitglieder();
                break;
            case 4:
                goTestFallChefs();
                goTestFallTrainer();
                break;
            case 5:
                goTestFallChefs();
                goTestFallMitglieder();
                break;
            case 6:
                goTestFallTrainer();
                goTestFallMitglieder();
            case 7:
                goTestFallChefs();
                goTestFallTrainer();
                goTestFallMitglieder();
                break;
            default:
                System.out.println("Keine gültige Zahl!");
                break;
        }
    }

    void goTestFallChefs() {
        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier", 2017);
        huberFitness.anzeigeFitnessStudio();
        Chef huberMarcel;
        huberMarcel = new Chef("Huber", "Marcel", "54294", "Trier", 36);
        //huberFitness.addChef(huberMarcel);
        System.out.println("Wir haben zur Zeit " + huberFitness.getChefsZaehler()
                + " Chefs.");
        huberFitness.addChef(huberMarcel);
        System.out.println("Wir haben zur Zeit " + huberFitness.getChefsZaehler()
                + " Chefs:");
        System.out.println(huberMarcel.toString());
    }

    void goTestFallTrainer() {

        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier",
                2017);
        huberFitness.anzeigeFitnessStudio();
        Trainer marcelHuber = new Trainer("Huber", "Marcel", "54294", "TRIER", 36);
        System.out.println(marcelHuber.getSpezialisierungsBereiche());
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
        marcelHuber.addSpezialisierungsBereich("Muskelaufbau");
        System.out.println(marcelHuber.getSpezialisierungsBereiche());
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
        String s = "Krafttraining";
        marcelHuber.addSpezialisierungsBereich(s);
        System.out.println(marcelHuber.getSpezialisierungsBereiche());
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
        System.out.println(marcelHuber);

    }

    void goTestFallMitglieder() {
        int mitgliederAnzahl;
        StandardMitglied standardMitglied;

        // wir legen ein Fitness-Studio an
        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier",
                (int) 2017);
        huberFitness.anzeigeFitnessStudio();
        System.out.println("Zum Test nochmal das Gründungsjahr: "
                + huberFitness.getGruendungsjahr() + "\n");

        standardMitglied = new StandardMitglied("Huber", "S.", "54926", "Trier",
                38, huberFitness);
        System.out.println(standardMitglied.toString());
        System.out.println("VORSICHT, das potentielle Mitglied wurde noch nicht "
                + "geaddet, damit ergibt sich die folgende \n"
                + "Ausgabe der tatsächlichen Mitglieder: ");
        huberFitness.anzeigeStandardMitglieder();
        pause(3);

        standardMitglied = new StandardMitglied("Huber", "P.", "54926", "Trier",
                24, huberFitness);
        System.out.println(standardMitglied.toString());
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Dieses potentielle Mitglied wurde geaddet!");
        huberFitness.anzeigeStandardMitglieder();
        pause(3);

        standardMitglied = new StandardMitglied("Huber", "Marcel", "54926", "Trier",
                36, huberFitness);
        System.out.println(standardMitglied.toString());
        huberFitness.addStandardMitglied(standardMitglied);
        huberFitness.anzeigeStandardMitglieder();
        pause(5);

        System.out.println("\nWir adden das letzte Mitglied nochmal!");
        huberFitness.addStandardMitglied(standardMitglied);
        huberFitness.anzeigeStandardMitglieder();
        pause(5);

        standardMitglied = new StandardMitglied("Huber", "H.", "54926", "Trier",
                63, huberFitness);
        System.out.println(standardMitglied.toString());
        huberFitness.addStandardMitglied(standardMitglied);
        huberFitness.anzeigeStandardMitglieder();
        mitgliederAnzahl = huberFitness.getMitgliedsZaehler();

        huberFitness.getAusgabeMitgliederAnzahl();
        pause(3);
        System.out.println("\nWir versuchen einmal, Mitglieder zu entfernen");
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. 0:");

        System.out.println("Vor dem Entfernen sehen wir folgende Mitglieder:");
        huberFitness.anzeigeStandardMitglieder();

        huberFitness.removeStandardMitglied(0);
        System.out.println("Nach dem Entfernen sehen wir folgende Mitgliederliste:");
        huberFitness.anzeigeStandardMitglieder();
        pause(5);
        System.out.println("\nJetzt fügen wir ein Mitglied hinzu...");
        pause(3);
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("\nJetzt fügen wir ein weiteres Mitglied hinzu...");
        pause(1);
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. -1:");
        pause(1);
        huberFitness.removeStandardMitglied(-1);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("\nJetzt fügen wir ein weiteres Mitglied hinzu...");
        pause(1);
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. 3:");
        pause(1);
        huberFitness.removeStandardMitglied(3);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. 6:");
        pause(1);
        huberFitness.removeStandardMitglied(6);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. 12:");
        huberFitness.removeStandardMitglied(12);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. 1:");
        huberFitness.removeStandardMitglied(1);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
        pause(1);
        System.out.println("AUSTRITT von Mitglied mit Mitglieds-Nr. 1:");
        huberFitness.removeStandardMitglied(1);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        huberFitness.anzeigeStandardMitglieder();
    }

    void pause(long j) {
        try {
            Thread.sleep(j * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hauptprogramm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
