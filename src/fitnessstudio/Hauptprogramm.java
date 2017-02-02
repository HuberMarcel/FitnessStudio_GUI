/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessstudio;

import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Huber, Marcel Heute ist der 01.02.2017
 */
public class Hauptprogramm {

    public static void main(String[] args) {
        new Hauptprogramm().go();
    }

    void go() {
        goTestFallMitglieder();
        goTestFallTrainer();
        goTestFallChefs();
    }

    void goTestFallChefs() {
        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier",
                (int) 2017);
        huberFitness.anzeigeFitnessStudio();
        Chef huberMarcel;
        huberMarcel = new Chef("Huber", "Marcel", 54294, "Trier", 36);
        //huberFitness.addChef(huberMarcel);
        System.out.println("Wir haben zur Zeit " + huberFitness.getChefsZaehler()
                + " Chefs.");
        huberFitness.addChef(huberMarcel);
        System.out.println("Wir haben zur Zeit " + huberFitness.getChefsZaehler()
                + " Chefs.");
    }

    void goTestFallTrainer() {

        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier",
                (int) 2017);
        huberFitness.anzeigeFitnessStudio();
        Trainer marcelHuber = new Trainer("Huber", "Marcel", 54294, "TRIER", 36);
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

        long mitgliederAnzahl;
        long mitgliedsNummer = 0;
        StandardMitglied standardMitglied;
        standardMitglied = new StandardMitglied("Huber", "S.", 54926, "Trier",
                38, 19.98, mitgliedsNummer);

        // wir legen ein Fitness-Studio an
        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness", "54294 Trier",
                (int) 2017);
        huberFitness.anzeigeFitnessStudio();
        System.out.println("Zum Test nochmal das Gründungsjahr: "
                + huberFitness.getGruendungsjahr() + "\n");
        huberFitness.anzeigeStandardMitglieder();
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
            Pause1Sekunde();
        }
        huberFitness.addStandardMitglied(standardMitglied);
        huberFitness.anzeigeStandardMitglieder();
        mitgliederAnzahl = huberFitness.getMitgliedsZaehler();

        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nWir versuchen einmal, Mitglieder zu entfernen");
        Pause1Sekunde();
        huberFitness.removeStandardMitglied(standardMitglied);
        System.out.println("Die letzte Mitgliedsnummer ist: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt fügen wir ein Mitglied hinzu...");
        Pause1Sekunde();
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt fügen wir ein weiteres Mitglied hinzu...");
        Pause1Sekunde();
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt entfernen wir ein Mitglied...");
        Pause1Sekunde();
        huberFitness.removeStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt fügen wir ein weiteres Mitglied hinzu...");
        Pause1Sekunde();
        huberFitness.addStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt entfernen wir ein Mitglied...");
        Pause1Sekunde();
        huberFitness.removeStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt entfernen wir ein Mitglied...");
        Pause1Sekunde();
        huberFitness.removeStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
        Pause1Sekunde();
        System.out.println("\nJetzt entfernen wir ein Mitglied...");
        huberFitness.removeStandardMitglied(standardMitglied);
        System.out.println("Jetzt ist die letzte Mitgliedsnummer: "
                + huberFitness.getLetzteMitgliedsNummer() + ".");
        huberFitness.getAusgabeMitgliederAnzahl();
    }

    void Pause1Sekunde() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hauptprogramm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
