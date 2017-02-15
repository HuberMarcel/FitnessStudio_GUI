/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.datenbank;

// Datensatz-Klasse
// DTO - data transfer object
// entity class
public class StandardMitgliedKontakt {

    private int uid;
    private String nachname;
    private String vorname;
    private String plz;
    private String wohnort;
    private int alter;

    // Konstruktor ohne uid - wird aus der Anwedung/vom Benutzer verwendet
    public StandardMitgliedKontakt(String nachname, String vorname, String plz,
            String wohnort, int alter) {
        this(0, nachname, vorname, plz, wohnort, alter);
    }

    // Konstruktor mit uid: wird aus der Datenbank verwendet
    public StandardMitgliedKontakt(int uid, String nachname, String vorname, String plz,
            String wohnort, int alter) {
        this.uid = uid;
        this.nachname = nachname;
        this.vorname = vorname;
        this.plz = plz;
        this.wohnort = wohnort;
        this.alter = alter;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return " " + nachname + " " + vorname;
    }

}
