/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

/**
 *
 * @author Marcel
 */
public class StandardMitglied extends AbstraktMitglied {

    private FitnessStudio fitnessStudio;
    private long mitgliedNummer;
    static double monatsBeitrag = 19.99;

    public StandardMitglied() {
        super();
    }

    public StandardMitglied(String nachName, String vorName, String plz, String wohnort,
            int alter, FitnessStudio fitnessStudio) {
        super(nachName, vorName, plz, wohnort, alter);
        this.monatsBeitrag = monatsBeitrag;
        this.fitnessStudio = fitnessStudio;
        this.mitgliedNummer = (long) (fitnessStudio.getLetzteMitgliedsNummer() + 1);
        //this.standardMitgliedNummer = (long) (fitnessStudio.getLetzteMitgliedsNummer() + 1);
    }

    public FitnessStudio getFitnessStudio() {
        return fitnessStudio;
    }

    public long getMitgliedNummer() {
        return this.mitgliedNummer;
    }

    @Override
    public String toString() {
        String standardmitgliedsDatenString = super.toString();
        standardmitgliedsDatenString = "\nFitnessStudio-Name:" 
                + fitnessStudio.getFitnessStudioName()+ "; Mitgliedsnummer: " 
                + mitgliedNummer + "|| "+standardmitgliedsDatenString;
        return standardmitgliedsDatenString;
    }
}
