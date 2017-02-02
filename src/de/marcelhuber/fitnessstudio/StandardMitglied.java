/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudio;

/**
 *
 * @author Huber, Marcel
 */
class StandardMitglied extends Person {

    private double zuZahlenderMonatsBeitrag;
    private long standardMitgliedsNummer;

    public StandardMitglied() {
    }

    public StandardMitglied(String nachName, String vorName, int plz, String wohnort,
            int alter, double zuZahlenderMonatsBeitrag, long mitgliedsNummer) {
        super(nachName, vorName, plz, wohnort, alter);
        this.zuZahlenderMonatsBeitrag = zuZahlenderMonatsBeitrag;
        this.standardMitgliedsNummer = mitgliedsNummer;
    }

    @Override
    public String toString() {
        return String.format("[Nachname = %s, Vorname = %s, Wohnort: %s, "
                + "Alter: %d]", this.getNachname(), this.getVorname(), this.getWohnort(),
                this.getPlz(), this.getAlter());
    }

}
