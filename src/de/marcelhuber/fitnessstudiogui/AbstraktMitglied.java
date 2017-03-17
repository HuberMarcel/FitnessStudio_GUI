/**
 *
 * @author Marcel
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huber, Marcel
 */
class AbstraktMitglied extends AbstraktPerson {

    // vielleicht wäre bei der MitgliedsNummer eine Lösung mit MAP besser 
    // und einfacher gewesen
    FitnessStudio fitnessStudio;
    /*
     Kleiner Kommentar, warum ich das FitnessStudio hier mitübergeben lasse:
     Für jedes Fitness-Studio will ich eine eindeutige Mitgliedsnummer
     generieren, die einfach nach oben gezählt wird, wenn ein neues Mitglied
     hinzukommt, aber auch ein ehemaliges Mitglied wird wieder mit einer neuen
     Nummer versehen. Mit dem Fitness-Studio-Objekt kann ich dies händeln, da
     diese Information dort gehändelt wird
     */

    public AbstraktMitglied() {
    }

    // dieser Konstruktorteil ist eventuell unnötig, da ich bei Standard-/Premium-
    // Mitgliedern sowieso ein Objekt aus FitnessStudio übergebe
    // Momentan dient er vielleicht der Übersichtlichkeit für den darauf
    // folgenden Konstruktor
    public AbstraktMitglied(String nachName, String vorName, String plz, String wohnort,
            GregorianCalendar tagDerGeburt) {
        super(nachName, vorName, plz, wohnort, tagDerGeburt);
        //this.standardMitgliedNummer = (long) (fitnessStudio.getLetzteMitgliedsNummer() + 1);
    }

    public AbstraktMitglied(String nachName, String vorName, String plz, String wohnort,
            GregorianCalendar tagDerGeburt, FitnessStudio fitnessStudio) {
        this(nachName, vorName, plz, wohnort, tagDerGeburt);
        this.fitnessStudio = fitnessStudio;
    }
    
}
