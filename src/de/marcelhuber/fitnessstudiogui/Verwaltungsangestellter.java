/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.ArrayList;

/**
 *
 * @author Marcel
 */
public class Verwaltungsangestellter extends AbstraktMitarbeiter {

    Verwaltungsangestellter() {
    }

    Verwaltungsangestellter(String nachName, String vorName, String plz, String wohnort, int alter) {
        super(nachName, vorName, plz, wohnort, alter, "Verwaltung");
    }

    @Override
    public String toString() {
        String rueckgabeString;
        rueckgabeString = getNachname() + ", " + getVorname() + ", " + getWohnort()
                + ", " + getAlter() + ", " + getAufgabenbereiche();
        return rueckgabeString;
    }
}
