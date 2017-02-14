/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel
 */
abstract class AbstraktMitarbeiter extends AbstraktPerson {

    private KontoDaten kontodaten; // Mitarbeiter sollen nicht
    // bar bezahlt werden, sondern bekommen ihr 
    // Gehalt überwiesen
    List<String> aufgabenbereiche = new ArrayList<>();
    // bspw. kann ein AbstraktMitarbeiter in der
    // Verwaltung & als Trainer etc. tätig sein

    AbstraktMitarbeiter() {
    }

    AbstraktMitarbeiter(String nachName, String vorName, String plz, String wohnort,
            int alter, String aufgabenbereich, KontoDaten kontodaten) {
        super(nachName, vorName, plz, wohnort, alter);
        aufgabenbereiche.add(aufgabenbereich);
        this.kontodaten = kontodaten;
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

    public KontoDaten kontoDaten() {
        return kontodaten;
    }
}
