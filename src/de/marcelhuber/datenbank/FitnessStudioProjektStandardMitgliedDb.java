/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.datenbank;

import java.sql.*;
import java.util.*;
import de.marcelhuber.fitnessstudiogui.*;
import java.util.logging.*;

public class FitnessStudioProjektStandardMitgliedDb {

    private Connection connection;

    // Statement-Objekt / Transport von Informationen ZUR Datenbank
    private Statement statement;

    // ResultSet-Objekt / Liefert Informationen VON der Datenbank
    private ResultSet resultSet;

    private String dummyNachname;
    private String dummyVorname;
    private String dummyPlz;
    private String dummyWohnort;
    private String dummyGeburtsdatum;
    private FitnessStudio fitnessstudio;

    public static void main(String[] args) {
        new FitnessStudioProjektStandardMitgliedDb().go();
    }

    private void go() {
        showConnectors();

        DatabaseConnection dbc = new DatabaseConnection();
        connect();
        statement();

        select();
        rowCount();
        resultSet();
        resultSet(1);
        resultSet(6);
//        resultSet(27);
//        System.out.println("XXXXXXXXXXXXX");
        delete(27);
//        System.out.println("XXXXXXXXXXXXX");

        resultSetMetaData();
        databaseMetaData();

        insert();
//        update();
//        delete();
//        preparedStatement();
        close();
    }

    private void showConnectors() {

        System.out.println("\nverfügbare Connectoren:");
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            System.out.println(drivers.nextElement().getClass().getName());
        }
    }

    private void connect() {
        String host = "localhost";
        String user = "root";
        String pass = "drow";
        String db = "test";

        String url = "jdbc:mysql://" + host + "/" + db;

        System.out.println("\nconnection:");
        System.out.println(url);

        try {
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("connected");
        System.out.println(connection);
    }

    private void statement() {
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\nstatement created");
    }

    private void select() {
        String sql = "SELECT * FROM fitnessstudioprojektstandardmitglied";
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\nquery executed");
    }

    private void select(int id) {
        String sql = "SELECT * FROM fitnessstudioprojektstandardmitglied WHERE ID='" + id + "'";
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\nquery executed");
    }

    private void rowCount() {

        int rowCount = 0;
        try {
            //        resultSet.getRowCount();  // leider nicht vorhanden

            // Ob das hier funktioniert, ist datenbankabhängig
            resultSet.last();
            rowCount = resultSet.getRow();
            resultSet.beforeFirst();

        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\n" + rowCount + " datensätze gelesen");
    }

    private void resultSet() {

        // ein ResultSet steht im Auslieferungszustand VOR dem ersten datensatz
        try {
            int cc = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= cc; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println("");
//                System.out.println(
//                    resultSet.getInt("uid") + " " +
//                    resultSet.getString("anrede") + " " +
//                    resultSet.getString("vorname") + " " +
//                    resultSet.getString("nachname") + " " +
//                    resultSet.getString("strasse") + " " +
//                    resultSet.getString("plz") + " " +
//                    resultSet.getString("stadt") + " " +
//                    resultSet.getString("telefon")
//                );
//                System.out.println(
//                    resultSet.getInt(1) + " " +
//                    resultSet.getString(2) + " " +
//                    resultSet.getString(3) + " " +
//                    resultSet.getString(4) + " " +
//                    resultSet.getString(5) + " " +
//                    resultSet.getString(6) + " " +
//                    resultSet.getString(7) + " " +
//                    resultSet.getString(8)
//                );
//                System.out.println(
//                    resultSet.getString(1) + " " +
//                    resultSet.getString(2) + " " +
//                    resultSet.getString(3) + " " +
//                    resultSet.getString(4) + " " +
//                    resultSet.getString(5) + " " +
//                    resultSet.getString(6) + " " +
//                    resultSet.getString(7) + " " +
//                    resultSet.getString(8)
//                );
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        } finally {
            try {
                resultSet.beforeFirst();
            } catch (SQLException ex) {
                Logger.getLogger(FitnessStudioProjektStandardMitgliedDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("\nresultSet printed\n");
    }

    private String resultSet(int id) {
        String sql = "SELECT * FROM fitnessstudioprojektstandardmitglied";
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
//        try {
//            //        connect();
//            resultSet.beforeFirst();
//        } catch (SQLException ex) {
//            Logger.getLogger(FitnessStudioProjektStandardMitgliedDb.class.getName()).log(Level.SEVERE, null, ex);
//        }
        String zeilenDaten = "no data found for ID=" + id;
        // ein ResultSet steht im Auslieferungszustand VOR dem ersten datensatz
        try {
            int cc = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                if (Integer.parseInt(resultSet.getString(1)) == id) {
                    zeilenDaten = "";
                    for (int j = 1; j <= cc; j++) {
//                        System.out.print(resultSet.getString(j) + " ");
                        zeilenDaten += resultSet.getString(j) + " ";
                    }
                }
//                System.out.println(
//                    resultSet.getInt("uid") + " " +
//                    resultSet.getString("anrede") + " " +
//                    resultSet.getString("vorname") + " " +
//                    resultSet.getString("nachname") + " " +
//                    resultSet.getString("strasse") + " " +
//                    resultSet.getString("plz") + " " +
//                    resultSet.getString("stadt") + " " +
//                    resultSet.getString("telefon")
//                );
//                System.out.println(
//                    resultSet.getInt(1) + " " +
//                    resultSet.getString(2) + " " +
//                    resultSet.getString(3) + " " +
//                    resultSet.getString(4) + " " +
//                    resultSet.getString(5) + " " +
//                    resultSet.getString(6) + " " +
//                    resultSet.getString(7) + " " +
//                    resultSet.getString(8)
//                );
//                System.out.println(
//                    resultSet.getString(1) + " " +
//                    resultSet.getString(2) + " " +
//                    resultSet.getString(3) + " " +
//                    resultSet.getString(4) + " " +
//                    resultSet.getString(5) + " " +
//                    resultSet.getString(6) + " " +
//                    resultSet.getString(7) + " " +
//                    resultSet.getString(8)
//                );
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            System.out.printf("data for ID=" + id + ": \n" + zeilenDaten);
            System.out.println("");
            try {
                resultSet.beforeFirst();
            } catch (SQLException ex) {
                Logger.getLogger(FitnessStudioProjektStandardMitgliedDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("\n\nthe choosed resultSet printed\n");
//        close();
        return zeilenDaten;
    }

    private void resultSetMetaData() {

        try {
            ResultSetMetaData rsm = resultSet.getMetaData();
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                System.out.println(i + ". CatalogName      " + rsm.getCatalogName(i));
                System.out.println(i + ". SchemaName       " + rsm.getSchemaName(i));
                System.out.println(i + ". TableName        " + rsm.getTableName(i));
                System.out.println(i + ". ColumnName       " + rsm.getColumnName(i));
                System.out.println(i + ". ColumnLabel      " + rsm.getColumnLabel(i));
                System.out.println(i + ". ColumnTypeName   " + rsm.getColumnTypeName(i));
                System.out.println(i + ". ColumnClassName  " + rsm.getColumnClassName(i));
                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\nresultSetMetaData printed");

    }

    public void insert(StandardMitglied neuesStdMitglied) {
        connect();
        statement();

        fitnessstudio = neuesStdMitglied.getFitnessStudio();

        String mysqlDatenbankTabelle = "fitnessstudioprojektstandardmitglied";
        String sql = "INSERT INTO fitnessstudioprojektstandardmitglied (Nachname, Vorname, "
                + "Plz, Wohnort, Geburtsdatum) "
                + "VALUES ('" + neuesStdMitglied.getNachname() + "', "
                + "'" + neuesStdMitglied.getVorname() + "', "
                + "'" + neuesStdMitglied.getPlz() + "', "
                + "'" + neuesStdMitglied.getWohnort() + "', "
                + "'" + neuesStdMitglied.getGeburtsdatum() + "')";

        System.out.println("So sieht mein sql-Befehl aus: \n" + sql);
        try {
            System.out.println("\n" + statement.executeUpdate(sql) + " Sätze "
                    + "in's Fitness-Studio " + fitnessstudio.getName()
                    + " eingefügt");
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        } finally {
            close();
        }

        System.out.println("\ndatensatz eingefügt");
    }

    private void insert() {
//        String eingabe = "\'); DROP TABLE kontakt; #";
        connect();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        String eingabe = "DummyHuber";

        String sql = "INSERT INTO fitnessstudioprojektstandardmitglied (Nachname, Vorname, "
                + "Plz, Wohnort, Geburtsdatum) "
                + "VALUES ('" + eingabe + "', 'DummyMarcel', 'Dummy54294', 'DummyTrier', "
                + "'27.12.1980')";
        try {
            System.out.println("\n" + statement.executeUpdate(sql) + " Sätze eingefügt");
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\ndatensatz eingefügt");
        close();
    }

    private void update() {
        String sql = "UPDATE fitnessstudioprojektstandardmitglied SET strasse = 'Hauptstrasse 42', plz = '12345' WHERE uid = '58'";

        try {
            System.out.println("\n" + statement.executeUpdate(sql) + " Sätze verändert");
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\ndatensatz updated");
    }

    public boolean delete(int id) { // connect() und close() mit einfügen
        connect();
        statement();

        String sql = "DELETE FROM fitnessstudioprojektstandardmitglied WHERE id = '" + id + "'";
        String idDaten = resultSet(id);
//        select(id);
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        boolean bool = false;

        try {
            int i = statement.executeUpdate(sql);
            System.out.println("\n" + i + " Sätze gelöscht");
            System.out.println("\nUnd zwar die folgenden der nächsten Zeile: "
                    + idDaten);
            if (i == 1) {
                bool = true;
                System.out.println("bool");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            close();
        }
        return bool;

    }

    private void delete() { // connect() und close() mit einfügen
//
//        String sql = "DELETE FROM fitnessstudioprojektstandardmitglied WHERE id = '" + id + "'";
//
//        try {
//            System.out.println("\n" + statement.executeUpdate(sql) + " Sätze gelöscht");
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            return;
//        }
//
//        System.out.println("\ndatensatz deleted");

        // zu Testzwecken kann diese Methode verwendet werden, wobei man die id
        // von Hand einzustellen hat. Da SQL bei 1 mit dem Zählen beginnt, hat
        // die Voreinstellung id = 0 keine Auswirkung
        int id = 0;
        this.delete(id);
    }

    private void databaseMetaData() {
        try {
            DatabaseMetaData dbmd = connection.getMetaData();
            System.out.println("DatabaseProductName    " + dbmd.getDatabaseProductName());
            System.out.println("DatabaseProductVersion " + dbmd.getDatabaseProductVersion());
            System.out.println("DriverName             " + dbmd.getDriverName());
            System.out.println("DriverVersion          " + dbmd.getDriverVersion());
            System.out.println("SQLKeywords            " + dbmd.getSQLKeywords());
            System.out.println("SystemFunctions        " + dbmd.getSystemFunctions());
            System.out.println("NumericFunctions       " + dbmd.getNumericFunctions());
            System.out.println("StringFunctions        " + dbmd.getStringFunctions());
            System.out.println("TimeDateFunctions      " + dbmd.getTimeDateFunctions());
            System.out.println("URL                    " + dbmd.getURL());
            System.out.println("UserName               " + dbmd.getUserName());

        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\ndatabasemetadata printed");
    }

    private void preparedStatement() {
        String sql = "SELECT * FROM fitnessstudioprojektstandardmitglied WHERE uid = ?";

        try {
            PreparedStatement prep = connection.prepareStatement(sql);
            prep.setInt(1, 42);
            resultSet = prep.executeQuery();
            resultSet();

            prep.setInt(1, 38);
            resultSet = prep.executeQuery();
            resultSet();
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }
    }

    private void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return;
        }

        System.out.println("\nclosed");
    }
}
