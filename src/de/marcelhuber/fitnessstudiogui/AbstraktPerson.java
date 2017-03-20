/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.*;

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
    private GregorianCalendar tagDerGeburt;
    private String geburtsdatum;
    private int alter;

    public AbstraktPerson() {
    }

    public AbstraktPerson(String nachName, String vorName, String plz,
            String wohnort, GregorianCalendar tagDerGeburt) {
        this.nachName = nachName;
        this.vorName = vorName;
        this.plz = plz;
        this.wohnort = wohnort;
        this.tagDerGeburt = tagDerGeburt;
        this.alter = calculateAlter();
    }

    public String getNachname() {
        return nachName; // alternativ: return this.name
    }

    public String getVorname() {
        return vorName; // alternativ: return this.name
    }

    public int getAlter() {
        alter = calculateAlter();
        return alter;
    }

    public String getPlz() {
        return plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public GregorianCalendar getTagDerGeburt() {
        return tagDerGeburt;
    }

    public String getTagDerGeburtToString() {
        String datum;
        datum = tagDerGeburt.get(tagDerGeburt.DAY_OF_MONTH) + "."
                + (tagDerGeburt.get(tagDerGeburt.MONTH) + 1) + "."
                + tagDerGeburt.get(tagDerGeburt.YEAR);
//        System.out.println(datum);
        return datum;
    }

    public String toString() {

//        return (getNachname() + ", " + getVorname() + ", " + getAlter() + ", "
//                + "" + getPlz() + ", " + getWohnort());
        return (nachName + ", " + vorName + ", " + getTagDerGeburtToString() + ", "
                + "" + plz + ", " + wohnort);
    }

    public String getGeburtsdatum() {
        return this.getTagDerGeburtToString();
    }

    private int calculateAlter() {
        int calculatedAlter;
        GregorianCalendar now = new GregorianCalendar();
        int dummyJahrDerGeburt = tagDerGeburt.get(tagDerGeburt.YEAR);
        calculatedAlter = now.get(Calendar.YEAR) - dummyJahrDerGeburt;
        int dummyTagDerGeburt = tagDerGeburt.get(tagDerGeburt.DAY_OF_MONTH);
        int dummyMonatDerGeburt = tagDerGeburt.get(tagDerGeburt.MONTH);
        
        if ((now.get(Calendar.MONTH) + 1 < dummyMonatDerGeburt)
                | ((now.get(Calendar.MONTH) + 1 == dummyMonatDerGeburt)
                & (now.get(Calendar.DAY_OF_MONTH) < dummyTagDerGeburt))) {
            calculatedAlter += -1;
        }
        return calculatedAlter;
    }
}
