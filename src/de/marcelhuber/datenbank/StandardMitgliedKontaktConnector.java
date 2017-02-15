/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.datenbank;


import java.sql.*;
import java.util.*;

public class StandardMitgliedKontaktConnector {
    
    // Verbindungs-Objekt
    private Connection connection;
    
    // Statement-Objekt / Transport von Informationen ZUR datenbank
    // NUR vorübergehend - bis alle Anweisung via PreparedStatement ausgeführt werden
    private Statement statement;
    
    // PreparedStatements
    private PreparedStatement readStatement;    // TODO
    private PreparedStatement insertStatement;  // OK
    private PreparedStatement updateStatement;  // TODO
    private PreparedStatement deleteStatement;  // TODO

    public StandardMitgliedKontaktConnector(DatabaseConnection dbc) {
        this(dbc.getConnection());
    }
    
    public StandardMitgliedKontaktConnector(Connection connection) {
        try {
            this.connection = connection;
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    // Kommunikation zwiwschen Datenbank (Tabelle) und Anwendung
    /*
    
    - OK - Datenbank-Tabelle auslesen - alle Datensätze
    -    - (Datenbank-Tabelle auslesen - nur einen Datensatz nach uid)
    - OK - Datensatz hinzufügen
    - OK - Datensatz aktualisieren
    - OK - Datensatz löschen
    
    */
    
    public List<StandardMitgliedKontakt> readStandardMitgliedKontakte() {
        List<StandardMitgliedKontakt> standardMitgliedkontakte = new ArrayList<>();
        
        String sql = "SELECT * FROM fitnessstudioprojektstandardmitglied";
        
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                standardMitgliedkontakte.add(new StandardMitgliedKontakt(
                    resultSet.getInt("ID"),
                    resultSet.getString("Nachname"),
                    resultSet.getString("Vorname"),
                    resultSet.getString("Plz"),
                    resultSet.getString("Wohnort"),
                    resultSet.getInt("MitgliedsAlter")
                ));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
            
        return standardMitgliedkontakte;
    }
    
    public boolean insertStandardMitgliedKontakt(StandardMitgliedKontakt smk) {
        
        try {
            if (insertStatement == null) {
                String sql = "INSERT INTO fitnessstudioprojektstandardmitglied (nachname, vorname, plz, wohnort, "
                        + "alter) VALUE (?, ?, ?, ?, ?)";
                insertStatement = connection.prepareStatement(sql);
            }
            
            insertStatement.setString(1, smk.getNachname());
            insertStatement.setString(2, smk.getVorname());
            insertStatement.setString(3, smk.getPlz());
            insertStatement.setString(4, smk.getWohnort());
            insertStatement.setInt(5, smk.getAlter());
            
            return insertStatement.executeUpdate() == 1;
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean updateStandardMitgliedKontakt(StandardMitgliedKontakt smk) {
        String sql = "UPDATE fitnessstudioprojektstandardmitglied SET "
            + "nachname = '" + smk.getNachname()+ "', "
            + "vorname = '" + smk.getVorname()+ "', "
            + "plz = '" + smk.getPlz()+ "', "
            + "wohnort = '" + smk.getWohnort()+ "', "
            + "alter = '" + smk.getAlter()+ "' "
            + "WHERE uid = '" + smk.getUid()+ "'";
        
        return modify(sql);
    }
    
    public boolean deleteStandardMitgliedKontakt(StandardMitgliedKontakt smk) {
        String sql = "DELETE FROM fitnessstudioprojektstandardmitglied WHERE "
                + "uid = '" + smk.getUid()+ "'";
        
        return modify(sql);
    }
    
    private boolean modify(String sql) {
        try {
            return statement.executeUpdate(sql) == 1;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
}
