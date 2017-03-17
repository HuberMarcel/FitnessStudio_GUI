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
public class Chef extends AbstraktMitarbeiter {

    public Chef() {
    }

    public Chef(String nachName, String vorName, String plz, String wohnort,
            GregorianCalendar tagDerGeburt, IBankDaten bankdaten) {
        super(nachName, vorName, plz, wohnort,tagDerGeburt, "Chef", bankdaten);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\n" + this.getBankdaten().toString();
        return str;
    }
}
