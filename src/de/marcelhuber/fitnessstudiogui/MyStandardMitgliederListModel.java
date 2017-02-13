/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Marcel
 */
class MyStandardMitgliederListModel extends AbstractListModel<String> {

    private List<String> standardMitgliederListe = new ArrayList<>();

    public MyStandardMitgliederListModel() {
        FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness",
                "54294 Trier", (int) 2017);
        standardMitgliederListe
                = erstelleTestStandardMitgliederListe(huberFitness);
        entferneMitgliedMitMitgliedNummer(2, huberFitness);
        entferneMitgliedMitMitgliedNummer(7, huberFitness);
        entferneMitgliedMitMitgliedNummer(0, huberFitness);
        entferneMitgliedMitMitgliedNummer(4, huberFitness);
    }

    @Override
    public int getSize() {
        return standardMitgliederListe.size();
    }

    @Override
    public String getElementAt(int index) {
        return standardMitgliederListe.get(index);
    }

    public void setStudioPersonen(List<String> models) {
        this.standardMitgliederListe = models;
        fireContentsChanged(this, 0, getSize());
    }

    public void entferneMitgliedMitMitgliedNummer(int mitgliedNummer,
            FitnessStudio fitnessStudio) {
        int indexImStandardMitgliederArray
                = fitnessStudio.removeStandardMitglied(mitgliedNummer);
//        if ((0 <= indexImStandardMitgliederArray)
//                && (indexImStandardMitgliederArray < standardMitgliederListe.size())) {
//            standardMitgliederListe.remove(indexImStandardMitgliederArray);
//        } else {
//            System.out.println("Da kann was mit dem Index nicht stimmen: Ich "
//                    + "soll an der Stelle " + indexImStandardMitgliederArray + " "
//                    + "etwas entfernen?! Das Feld hat Länge "
//                    + standardMitgliederListe.size() + "!");
//        }

        try {
            standardMitgliederListe.remove(indexImStandardMitgliederArray);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex+"\nEs existiert kein Mitglied mit einer solchen "
                    + "Mitgliedsnummer, meine Rechereche liefert einen Index "
                    + "außerhalb der Feldindizes!");
        };

    }

    public List<String> erstelleTestStandardMitgliederListe(FitnessStudio fitnessStudio) {
        List<String> testStandardMitgliederListe = new ArrayList<>();

        StandardMitglied standardMitglied = new StandardMitglied("Huber",
                "K.", "54441", "Wellen", 83, fitnessStudio);
        fitnessStudio.addStandardMitglied(standardMitglied);
        standardMitglied = new StandardMitglied("Huber",
                "H.", "54441", "Wellen", 63, fitnessStudio);
        fitnessStudio.addStandardMitglied(standardMitglied);
        standardMitglied = new StandardMitglied("Huber",
                "G.", "54441", "Wellen", 62, fitnessStudio);
        fitnessStudio.addStandardMitglied(standardMitglied);
        standardMitglied = new StandardMitglied("Huber",
                "S.", "54926", "Trier", 38, fitnessStudio);
        fitnessStudio.addStandardMitglied(standardMitglied);
        standardMitglied = new StandardMitglied("Huber",
                "Marcel", "54924", "Trier", 36, fitnessStudio);
        fitnessStudio.addStandardMitglied(standardMitglied);
        standardMitglied = new StandardMitglied("Huber",
                "P.", "54924", "Trier", 24, fitnessStudio);
        fitnessStudio.addStandardMitglied(standardMitglied);

        List<StandardMitglied> huberFitnessStandardMitglieder
                = fitnessStudio.getStandardMitglieder();
        for (StandardMitglied standardMitglied1 : huberFitnessStandardMitglieder) {
            testStandardMitgliederListe.add(standardMitglied1.toString());
        }

        return testStandardMitgliederListe;
    }

}
