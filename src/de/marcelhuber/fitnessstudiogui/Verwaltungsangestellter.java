/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.*;

/**
 *
 * @author Marcel
 */
public class Verwaltungsangestellter extends AbstraktMitarbeiter {

    Verwaltungsangestellter() {
    }

    Verwaltungsangestellter(String nachName, String vorName, String plz,
            String wohnort, GregorianCalendar tagDerGeburt,
            KontoDaten kontodatenVerwaltungsangestellter) {
        super(nachName, vorName, plz, wohnort, tagDerGeburt, "Verwaltung",
                kontodatenVerwaltungsangestellter);
    }

    @Override
    public String toString() {
        String rueckgabeString;
        rueckgabeString = getNachname() + ", " + getVorname() + ", " + getWohnort()
                + ", " + getGeburtsdatum() + ", " + getAufgabenbereiche();
        return rueckgabeString;
    }
}
