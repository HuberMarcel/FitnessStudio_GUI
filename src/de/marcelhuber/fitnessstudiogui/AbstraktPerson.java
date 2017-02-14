/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

/**
 *
 * @author Huber, Marcel
 */
//abstract 
abstract class AbstraktPerson {

    private String nachName;
    private String vorName;
    private String plz;       // bekanntes Kürzel für Postleitzahl
    private String wohnort;
    private int alter;

    public AbstraktPerson() {
    }

    public AbstraktPerson(String nachName, String vorName, String plz,
            String wohnort, int alter) {
        this.nachName = nachName;
        this.vorName = vorName;
        this.plz = plz;
        this.wohnort = wohnort;
        this.alter = alter;
    }

    public String getNachname() {
        return nachName; // alternativ: return this.name
    }

    public String getVorname() {
        return vorName; // alternativ: return this.name
    }

    public int getAlter() {
        return alter;
    }

    public String getPlz() {
        return plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public String toString() {

//        return (getNachname() + ", " + getVorname() + ", " + getAlter() + ", "
//                + "" + getPlz() + ", " + getWohnort());
        return (nachName + ", " + vorName + ", " + alter + ", "
                + "" + plz + ", " + wohnort);
    }
}
