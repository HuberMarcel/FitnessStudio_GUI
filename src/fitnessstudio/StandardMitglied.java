/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessstudio;

/**
 *
 * @author Huber, Marcel
 */
class StandardMitglied extends Person {

    private double zuZahlenderMonatsBeitrag;
    private long standardMitgliedsNummer;

    public StandardMitglied() {
    }

    public StandardMitglied(String nachName, String vorName, String wohnort, int alter,
            double zuZahlenderMonatsBeitrag, long mitgliedsNummer) {
        super(nachName, vorName, wohnort, alter);
        this.zuZahlenderMonatsBeitrag = zuZahlenderMonatsBeitrag;
        this.standardMitgliedsNummer = mitgliedsNummer;
    }

}
