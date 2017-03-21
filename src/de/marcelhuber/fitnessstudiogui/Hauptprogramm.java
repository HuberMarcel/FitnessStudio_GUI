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

    static int j;

    public static void main(String[] args) {
        int schalter = 2; // Nur Werte von 0 bis 7 sinnvoll
//        new Hauptprogramm().go(schalter);
        new de.marcelhuber.fitnessstudiogui.Hauptprogramm().go(schalter);
        /* Einfach mal, um einen Aufruf mit Paketnamen gesehen zu haben */
    }

    void go(int k) {
        System.out.println(j);
        switch (k) {
            case 1:
                goTestFallChefs();
                break;
            case 2:
                goTestFallMitarbeiter();
                break;
            case 3:
                goTestFallMitglieder();
                break;
            case 4:
                goTestFallChefs();
                goTestFallMitarbeiter();
                break;
            case 5:
                goTestFallChefs();
                goTestFallMitglieder();
                break;
            case 6:
                goTestFallMitarbeiter();
                goTestFallMitglieder();
            case 7:
                goTestFallChefs();
                goTestFallMitarbeiter();
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
        huberMarcel = new Chef("Huber", "Marcel", "54294", "Trier",
                new GregorianCalendar(1980, 12 - 1, 27),
                new KontoDaten("bic von huberMarcel", "iban von huberMarcel",
                        "name (Bank) von huberMarcel"));
        //huberFitness.addChef(huberMarcel);
        System.out.println("Wir haben zur Zeit " + huberFitness.getChefsZaehler()
                + " Chefs.");
        huberFitness.addChef(huberMarcel);
        System.out.println("Wir haben zur Zeit " + huberFitness.getChefsZaehler()
                + " Chefs:");
        System.out.println(huberMarcel.toString());
    }

    void goTestFallMitarbeiter() {
        System.out.println("!!! Testfall TRAINER !!!");
        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier",
                2017);
        huberFitness.anzeigeFitnessStudio();
        Trainer marcelHuber = new Trainer("Huber", "Marcel", "54294", "TRIER",
                new GregorianCalendar(1980, 12 - 1, 27), new KontoDaten(
                        "bic", "iban", "name (Bank)"));
        System.out.println(marcelHuber.getSpezialisierungsbereiche());
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
        marcelHuber.addSpezialisierungsbereich("Muskelaufbau");
        System.out.println(marcelHuber.getSpezialisierungsbereiche());
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
        String s = "Krafttraining";
        marcelHuber.addSpezialisierungsbereich(s);
        s = "Ausdauertraining";
        marcelHuber.addSpezialisierungsbereich(s);
        System.out.println(marcelHuber.getSpezialisierungsbereiche());
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
//        markiereZeileMitXen();
        System.out.println(marcelHuber);
        System.out.println("Wir entfernen das Gebiet Krafttraining!");
        s = "Krafttraining";
        if (marcelHuber.removeSpezialisierungsbereich(s)) {
            System.out.println("Das Entfernen des Spezialisierungsgebietes " + s
                    + " war erfolgreich");
        } else {
            System.out.println("\n\n!!!Prüfen Sie die "
                    + "Schreibweise des zu entfernenden Spezialisierungsgebiets: "
                    + "Ihre Eingabe war: " + s + " !!!\n\n");
        };
        System.out.println("Anzahl der Spezialgebiete "
                + marcelHuber.getAnzahlDerSpezialGebiete());
        System.out.println(marcelHuber);
        System.out.println("\n\nHinzufügen des Aufgabenbereichs \"Verwaltung\"!");
        marcelHuber.addNeuerAufgabenbereich("Verwaltung");
        System.out.println(marcelHuber);
        System.out.println("\n\nEntfernen des Aufgabenbereichs \"Trainer\"!");
        marcelHuber.removeAufgabenbereich("Trainer");
        System.out.println(marcelHuber);
        // Hinweis: Das ist so natürlich rein zu demonstrativen Zwecken. Ein
        // Trainer sollte immer auch seinen Aufgabenbereich innehalten bzw.
        // es würde vielleicht nur Sinn ergeben, den Aufgabenbereich "Trainer" 
        //eines Trainers zu löschen, wenn dieses Trainerobjekt gelöscht wird?!
        System.out.println("\n\n\n");
        System.out.println("Testfall VERWALTUNGSANGESTELLTER:");
        Verwaltungsangestellter huberS = new Verwaltungsangestellter("Huber",
                "S.", "54292", "Trier", new GregorianCalendar(1978, 9 - 1, 13),
                new KontoDaten("bic von Huber S.",
                        "iban von Huber S.", "name (Bank) von Huber S."));

        System.out.println(huberS);
        if (huberS.removeAufgabenbereich("Verwaltung")) {
            System.out.println("Das Entfernen des Bereichs \"Verwaltung "
                    + "\" ist von Erfolg gekrönt");
        } else {
            System.out.println("\"Verwaltung\" wurde NICHT aus dem "
                    + "Aufgabenbereich entfernt");
        };
        System.out.println(huberS);
        if (huberS.removeAufgabenbereich("Verwaltung")) {
            System.out.println("Das Entfernen des Bereichs \"Verwaltung "
                    + "\" ist von Erfolg gekrönt");
        } else {
            System.out.println("\"Verwaltung\" wurde NICHT aus dem Aufgabenbereich"
                    + "entfernt");
        };
        System.out.println(huberS);
//        System.out.println(huberS.getGeburtsdatum());
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
                new GregorianCalendar(1978, 9 - 1, 13),
                huberFitness);
        System.out.println(standardMitglied.toString());
        System.out.println("VORSICHT, das potentielle Mitglied wurde noch nicht "
                + "geaddet, damit ergibt sich die folgende \n"
                + "Ausgabe der tatsächlichen Mitglieder: ");
        huberFitness.anzeigeStandardMitglieder();
        pause(3);

        standardMitglied = new StandardMitglied("Huber", "P.", "54926", "Trier",
                new GregorianCalendar(1992, 9 - 1, 15), huberFitness);
        System.out.println(standardMitglied.toString());
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Dieses potentielle Mitglied wurde geaddet!");
        huberFitness.anzeigeStandardMitglieder();
        pause(3);

        standardMitglied = new StandardMitglied("Huber", "Marcel", "54926", "Trier",
                new GregorianCalendar(1980, 12 - 1, 27), huberFitness);
        System.out.println(standardMitglied.toString());
        huberFitness.addStandardMitglied(standardMitglied);
        huberFitness.anzeigeStandardMitglieder();
        pause(5);

        System.out.println("\nWir adden das letzte Mitglied nochmal!");
        huberFitness.addStandardMitglied(standardMitglied);
        huberFitness.anzeigeStandardMitglieder();
        pause(5);

        standardMitglied = new StandardMitglied("Huber", "H.", "54926", "Trier",
                new GregorianCalendar(1953, 11 - 1, 14), huberFitness);
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

    void markiereZeileMitXen() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                + "XXXXXXXXXXXXXXXX");
    }
}
