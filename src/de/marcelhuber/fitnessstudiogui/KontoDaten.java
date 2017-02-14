/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

/**
 *
 * @author viona25
 */
public class KontoDaten implements IBankDaten {

    private String bic;
    private String iban;
    private String name;

    public KontoDaten(String bic, String iban, String name) {
        this.bic = bic;
        this.iban = iban;
        this.name = name;
    }

    @Override
    public String bic() {
        return bic;
    }

    @Override
    public String iban() {
        return iban;
    }

    @Override
    public String nameDerBank() {
        return name;
    }

    public void setBic(String neueBic) {
        bic = neueBic;
    }

    public void setIban(String neueIban) {
        bic = neueIban;
    }

    public void setName(String neuerName) {
        name = neuerName;
    }

    @Override
    public String toString() {
        return ("Name der Bank: " + name + "\nBic: " + bic + "; Iban: " + iban);
    }
}
