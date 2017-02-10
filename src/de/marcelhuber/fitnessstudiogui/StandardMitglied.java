/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huber, Marcel
 */
class StandardMitglied extends Person implements Cloneable {

    private double zuZahlenderMonatsBeitrag;
    private long standardMitgliedNummer;
    // vielleicht wäre bei der MitgliedsNummer eine Lösung mit MAP besser 
    // und einfacher gewesen
    FitnessStudio fitnessStudio;

    /*
    Kleiner Kommentar, warum ich das FitnessStudio hier mitübergeben lasse:
    Für jedes Fitness-Studio will ich eine eindeutige Mitgliedsnummer
    generieren, die einfach nach oben gezählt wird, wenn ein neues Mitglied
    hinzukommt, aber auch ein ehemaliges Mitglied wird wieder mit einer neuen
    Nummer versehen. Mit dem Fitness-Studio-Objekt kann ich dies händeln, da
    diese Information dort gehändelt wird
     */
    public StandardMitglied() {
    }

    public StandardMitglied(String nachName, String vorName, String plz, String wohnort,
            int alter, double zuZahlenderMonatsBeitrag) {
        super(nachName, vorName, plz, wohnort, alter);
        this.zuZahlenderMonatsBeitrag = zuZahlenderMonatsBeitrag;
        //this.standardMitgliedNummer = (long) (fitnessStudio.getLetzteMitgliedsNummer() + 1);
    }

    public StandardMitglied(String nachName, String vorName, String plz, String wohnort,
            int alter, double zuZahlenderMonatsBeitrag, FitnessStudio fitnessStudio) {
        super(nachName, vorName, plz, wohnort, alter);
        this.zuZahlenderMonatsBeitrag = zuZahlenderMonatsBeitrag;
        this.standardMitgliedNummer = (long) (fitnessStudio.getLetzteMitgliedsNummer() + 1);
        this.fitnessStudio = fitnessStudio;
    }

    @Override
    public String toString() {
        return String.format("[Nachname = %s, Vorname = %s, Wohnort: %s, "
                + "PLZ: %s Alter: %d, Mitgliedsnummer: %d]", this.getNachname(), this.getVorname(),
                this.getWohnort(), this.getPlz(), this.getAlter(), this.getMitgliedNummer());
    }

    public long getMitgliedNummer() {
        return standardMitgliedNummer;
    }

    public void setMitgliedNummer(long mitgliedNummer) {
        standardMitgliedNummer = mitgliedNummer;
    }

    public FitnessStudio getFitnessStudio() {
        return fitnessStudio;
    }

    public double getZuZahlenderMonatsBeitrag() {
        return zuZahlenderMonatsBeitrag;
    }

}
