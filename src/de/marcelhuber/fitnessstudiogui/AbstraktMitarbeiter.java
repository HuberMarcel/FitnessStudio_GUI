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
abstract class AbstraktMitarbeiter extends AbstraktPerson {

            //--> InterfaceTyp nutzen
    private IBankDaten bankdaten; // Mitarbeiter sollen nicht
    // bar bezahlt werden, sondern bekommen ihr 
    // Gehalt überwiesen
    List<String> aufgabenbereiche = new ArrayList<>();
    // bspw. kann ein AbstraktMitarbeiter in der
    // Verwaltung & als Trainer etc. tätig sein

    AbstraktMitarbeiter() {
    }

    AbstraktMitarbeiter(String nachName, String vorName, String plz, String wohnort,
            GregorianCalendar tagDerGeburt, String aufgabenbereich, IBankDaten bankdaten) {
        super(nachName, vorName, plz, wohnort, tagDerGeburt);
        aufgabenbereiche.add(aufgabenbereich);
        this.bankdaten = bankdaten;
    }

    void addAufgabenbereich(String aufgabenbereich) {
        this.aufgabenbereiche.add(aufgabenbereich);
    }

    boolean removeAufgabenbereich(String aufgabenbereich) {
        return this.aufgabenbereiche.remove(aufgabenbereich);
    }

    public List<String> getAufgabenbereiche() {
        return aufgabenbereiche;
    }

    public IBankDaten getBankdaten() {
        return bankdaten;
    }
}
