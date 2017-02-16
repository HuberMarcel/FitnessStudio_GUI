package de.marcelhuber.fitnessstudiogui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.table.*;
import de.marcelhuber.datenbank.*;

/**
 *
 * @author Huber, Marcel
 */
public class JFrameFitnessStudioVerwaltung extends javax.swing.JFrame {

    private Map<Integer, List<String>> standardMitgliederMap;
    private MyStandardMitgliederListModel msmlm;
    private MyTableModel mtm;
    FitnessStudio fitnessstudio = new FitnessStudio("Huber-Fitness",
            "54294 Trier", 2017);
    private String dummyNachname;
    private String dummyVorname;
    private String dummyPlz;
    private String dummyWohnort;
    private int dummyAlter;
    private boolean mitgliedErzeugbar;

    /**
     * Creates new form JFrameFitnessStudioVerwaltung
     */
    public JFrameFitnessStudioVerwaltung() {
        msmlm = new MyStandardMitgliederListModel();
        mtm = new MyTableModel();
        initComponents();
        System.out.println(mtm.getColumnClass(2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelHauptprogramm = new javax.swing.JLabel();
        jButtonStartHauptprogramm = new javax.swing.JButton();
        textMethodenNummer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMitglieder = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMitglieder = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabelMitgliedsdatenUeberschrift = new javax.swing.JLabel();
        jLabelNachName = new javax.swing.JLabel();
        jLabelVorname = new javax.swing.JLabel();
        jLabelPlz = new javax.swing.JLabel();
        jLabelWohnort = new javax.swing.JLabel();
        jLabelMitgliedsnummer = new javax.swing.JLabel();
        jTextNachname = new javax.swing.JTextField();
        jTextVorname = new javax.swing.JTextField();
        jTextPlz = new javax.swing.JTextField();
        jTextWohnort = new javax.swing.JTextField();
        jLabelErrechneteMitgliedsnummer = new javax.swing.JLabel();
        jButtonMitgliedVorbereiten = new javax.swing.JButton();
        jLabelAlter = new javax.swing.JLabel();
        jTextAlter = new javax.swing.JTextField();
        jTextErrechneteMitgliedsnummer = new javax.swing.JTextField();
        jButtonMitgliedsdatenSpeichern = new javax.swing.JButton();
        jTextNachnameVorschau = new javax.swing.JTextField();
        jTextVornameVorschau = new javax.swing.JTextField();
        jTextPlzVorschau = new javax.swing.JTextField();
        jTextWohnortVorschau = new javax.swing.JTextField();
        jTextAlterVorschau = new javax.swing.JTextField();
        jLabelMitgliedsdatenUeberschrift1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHauptprogramm.setText("Hauptprogramm");

        jButtonStartHauptprogramm.setText("Start");
        jButtonStartHauptprogramm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartHauptprogrammActionPerformed(evt);
            }
        });

        textMethodenNummer.setColumns(3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHauptprogramm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonStartHauptprogramm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMethodenNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonStartHauptprogramm)
                        .addComponent(textMethodenNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelHauptprogramm))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Demo auf Konsole", jPanel1);

        jListMitglieder.setModel(msmlm);
        jScrollPane1.setViewportView(jListMitglieder);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mitglieder: Listenausgabe", jPanel2);

        jTableMitglieder.setModel(mtm);
        jScrollPane2.setViewportView(jTableMitglieder);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mitglieder: Tabelle", jPanel3);

        jLabelMitgliedsdatenUeberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMitgliedsdatenUeberschrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMitgliedsdatenUeberschrift.setText("Vorschau");
        jLabelMitgliedsdatenUeberschrift.setPreferredSize(new java.awt.Dimension(69, 18));

        jLabelNachName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNachName.setText("Nachname");

        jLabelVorname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVorname.setText("Vorname");

        jLabelPlz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPlz.setText("Postleitzahl");

        jLabelWohnort.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelWohnort.setText("Wohnort");

        jLabelMitgliedsnummer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMitgliedsnummer.setText("Mitgliedsnummer");

        jTextNachname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextNachnameFocusGained(evt);
            }
        });

        jTextVorname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextVornameFocusGained(evt);
            }
        });

        jTextPlz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextPlzFocusGained(evt);
            }
        });

        jTextWohnort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextWohnortFocusGained(evt);
            }
        });

        jLabelErrechneteMitgliedsnummer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButtonMitgliedVorbereiten.setText("Mitglied vorbereiten");
        jButtonMitgliedVorbereiten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonMitgliedVorbereiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMitgliedVorbereitenActionPerformed(evt);
            }
        });

        jLabelAlter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAlter.setText("Alter");

        jTextAlter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAlterFocusGained(evt);
            }
        });

        jTextErrechneteMitgliedsnummer.setEditable(false);
        jTextErrechneteMitgliedsnummer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonMitgliedsdatenSpeichern.setText("Mitgliedsdaten speichern");
        jButtonMitgliedsdatenSpeichern.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonMitgliedsdatenSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMitgliedsdatenSpeichernActionPerformed(evt);
            }
        });

        jTextNachnameVorschau.setEditable(false);

        jTextVornameVorschau.setEditable(false);

        jTextPlzVorschau.setEditable(false);

        jTextWohnortVorschau.setEditable(false);

        jTextAlterVorschau.setEditable(false);

        jLabelMitgliedsdatenUeberschrift1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMitgliedsdatenUeberschrift1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMitgliedsdatenUeberschrift1.setText("Mitgliedsdateneingabe");
        jLabelMitgliedsdatenUeberschrift1.setPreferredSize(new java.awt.Dimension(69, 18));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonMitgliedVorbereiten))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelMitgliedsdatenUeberschrift1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelNachName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelVorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPlz, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(jLabelWohnort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelAlter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelMitgliedsnummer, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextAlter, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(jTextWohnort)
                                        .addComponent(jTextPlz)
                                        .addComponent(jTextVorname)
                                        .addComponent(jTextNachname))
                                    .addComponent(jLabelErrechneteMitgliedsnummer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextErrechneteMitgliedsnummer)
                            .addComponent(jLabelMitgliedsdatenUeberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMitgliedsdatenSpeichern, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNachnameVorschau)
                            .addComponent(jTextVornameVorschau)
                            .addComponent(jTextPlzVorschau)
                            .addComponent(jTextWohnortVorschau)
                            .addComponent(jTextAlterVorschau))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMitgliedsdatenUeberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMitgliedsdatenUeberschrift1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNachName)
                    .addComponent(jTextNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNachnameVorschau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVorname)
                    .addComponent(jTextVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVornameVorschau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlz)
                    .addComponent(jTextPlz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPlzVorschau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWohnort)
                    .addComponent(jTextWohnort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextWohnortVorschau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlter)
                    .addComponent(jTextAlterVorschau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextErrechneteMitgliedsnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelErrechneteMitgliedsnummer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMitgliedsnummer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addComponent(jButtonMitgliedVorbereiten)
                .addGap(18, 18, 18)
                .addComponent(jButtonMitgliedsdatenSpeichern, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mitglied erstellen", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartHauptprogrammActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartHauptprogrammActionPerformed
        // TODO 
        final long start = System.currentTimeMillis();
        Timer timer = new Timer(500, null);
        timer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Das Programm läuft seit "
                        + (System.currentTimeMillis() - start) + " Millisekunden.");
            }
        });

        try {
            new Hauptprogramm().go((int) Integer.parseInt(textMethodenNummer.getText()));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonStartHauptprogrammActionPerformed

    private void jButtonMitgliedVorbereitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMitgliedVorbereitenActionPerformed
        mitgliedErzeugbar = true;
        dummyNachname = jTextNachname.getText();
        clearAllMitgliedTabVisibleTextVorschauFields();

        dummyWohnort = jTextWohnort.getText(); // --> eigene Methode schreiben
        if ((dummyWohnort.isEmpty())
                || (dummyWohnort.indexOf(" ") == 0)) {
            System.out.println("Bitte einen Wohnort eingeben!");
            jTextWohnort.requestFocus();
            dummyWohnort = jTextWohnort.getText();
            mitgliedErzeugbar = false;
        }

        dummyPlz = jTextPlz.getText();
        if ((dummyPlz.isEmpty())
                || (dummyPlz.indexOf(" ") == 0)) {
            System.out.println("Bitte eine Postleitzahl eingeben!");
            jTextPlz.requestFocus();
            dummyPlz = jTextPlz.getText();
            mitgliedErzeugbar = false;
        }

        dummyVorname = jTextVorname.getText();
        if ((dummyVorname.isEmpty())
                || (dummyVorname.indexOf(" ") == 0)) {
            System.out.println("Bitte einen Vornamen eingeben!");
            jTextVorname.requestFocus();
            dummyVorname = jTextVorname.getText();
            mitgliedErzeugbar = false;
        }

        if ((dummyNachname.isEmpty())
                || (dummyNachname.indexOf(" ") == 0)) {
            System.out.println("Bitte einen Nachnamen eingeben!");
            jTextNachname.requestFocus();
            dummyNachname = jTextNachname.getText();
            mitgliedErzeugbar = false;
        }

        if (mitgliedErzeugbar) {
            try {
                dummyAlter = (int) Integer.parseInt(jTextAlter.getText());
                if (dummyAlter >= 0) {
                    StandardMitglied stdmgld = new StandardMitglied(dummyNachname,
                            dummyVorname, dummyPlz, dummyWohnort, dummyAlter,
                            fitnessstudio);
                    // Vorsicht: Hier nur Ausgabe, wie die Daten eines potentiellen 
                    // neuen Standardmitglieds aussehen
                    jLabelErrechneteMitgliedsnummer.setText("" + stdmgld.getMitgliedNummer());
                    jTextErrechneteMitgliedsnummer.setText("" + stdmgld.getMitgliedNummer());
                } else {
                    mitgliedErzeugbar = false;
                    jTextAlter.requestFocus();
                }
            } catch (NumberFormatException ex) {
                System.out.println("Fehler beim Konvertieren des Alters, Ihre "
                        + "merkwürdige Eingabe war: " + jTextAlter.getText() + " !");
                System.out.println("\n!!! Korrigieren Sie bitte Ihre Eingabe!!!\n");
                if (jTextAlter.getText().isEmpty()) {
                    jTextAlter.setText("" + dummyAlter);
                }
                jTextAlter.requestFocus();
                mitgliedErzeugbar = false;
            }
        }
        clearAllMitgliedTabVisibleTextVorschauFields();
    }//GEN-LAST:event_jButtonMitgliedVorbereitenActionPerformed

    private void jButtonMitgliedsdatenSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMitgliedsdatenSpeichernActionPerformed
        if (mitgliedErzeugbar) {
            StandardMitglied neuesStandardMitglied = new StandardMitglied(dummyNachname,
                    dummyVorname, dummyPlz, dummyWohnort, dummyAlter, fitnessstudio);
            fitnessstudio.addStandardMitglied(neuesStandardMitglied);
            FitnessStudioProjektStandardMitgliedDb test = new FitnessStudioProjektStandardMitgliedDb();
            test.insert(neuesStandardMitglied);
            fitnessstudio.anzeigeStandardMitglieder();
            clearAllMitgliedTabVisibleTextFields();
            clearAllMitgliedTabVisibleTextVorschauFields();
        } else {
            System.out.println("Vervollständigen Sie Ihre Angaben und prüfen "
                    + "Sie ggf., ob der Eintrag im Feld \"Alter\" sinnvoll ist!");
            System.out.println("Tipp: Drücken Sie den \"Mitglied vorbereiten\""
                    + "-Button!");
        }
    }//GEN-LAST:event_jButtonMitgliedsdatenSpeichernActionPerformed

    private void jTextAlterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAlterFocusGained
        jTextAlter.selectAll();
    }//GEN-LAST:event_jTextAlterFocusGained

    private void jTextNachnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNachnameFocusGained
        jTextNachname.selectAll();
    }//GEN-LAST:event_jTextNachnameFocusGained

    private void jTextVornameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVornameFocusGained
        jTextVorname.selectAll();
    }//GEN-LAST:event_jTextVornameFocusGained

    private void jTextPlzFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPlzFocusGained
        jTextPlz.selectAll();
    }//GEN-LAST:event_jTextPlzFocusGained

    private void jTextWohnortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextWohnortFocusGained
        jTextWohnort.selectAll();
    }//GEN-LAST:event_jTextWohnortFocusGained

    void clearAllMitgliedTabVisibleTextFields() {
        jTextNachname.setText("");
        jTextVorname.setText("");
        jTextPlz.setText("");
        jTextWohnort.setText("");
        jTextAlter.setText("");
        jTextErrechneteMitgliedsnummer.setText("");
        jLabelErrechneteMitgliedsnummer.setText("");
    }

    void clearAllMitgliedTabVisibleTextVorschauFields() {
        jTextNachnameVorschau.setText(jTextNachname.getText());
        jTextVornameVorschau.setText(jTextVorname.getText());
        jTextPlzVorschau.setText(jTextPlz.getText());
        jTextWohnortVorschau.setText(jTextWohnort.getText());
        jTextAlterVorschau.setText(jTextAlter.getText());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameFitnessStudioVerwaltung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMitgliedVorbereiten;
    private javax.swing.JButton jButtonMitgliedsdatenSpeichern;
    private javax.swing.JButton jButtonStartHauptprogramm;
    private javax.swing.JLabel jLabelAlter;
    private javax.swing.JLabel jLabelErrechneteMitgliedsnummer;
    private javax.swing.JLabel jLabelHauptprogramm;
    private javax.swing.JLabel jLabelMitgliedsdatenUeberschrift;
    private javax.swing.JLabel jLabelMitgliedsdatenUeberschrift1;
    private javax.swing.JLabel jLabelMitgliedsnummer;
    private javax.swing.JLabel jLabelNachName;
    private javax.swing.JLabel jLabelPlz;
    private javax.swing.JLabel jLabelVorname;
    private javax.swing.JLabel jLabelWohnort;
    private javax.swing.JList<String> jListMitglieder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMitglieder;
    private javax.swing.JTextField jTextAlter;
    private javax.swing.JTextField jTextAlterVorschau;
    private javax.swing.JTextField jTextErrechneteMitgliedsnummer;
    private javax.swing.JTextField jTextNachname;
    private javax.swing.JTextField jTextNachnameVorschau;
    private javax.swing.JTextField jTextPlz;
    private javax.swing.JTextField jTextPlzVorschau;
    private javax.swing.JTextField jTextVorname;
    private javax.swing.JTextField jTextVornameVorschau;
    private javax.swing.JTextField jTextWohnort;
    private javax.swing.JTextField jTextWohnortVorschau;
    private javax.swing.JTextField textMethodenNummer;
    // End of variables declaration//GEN-END:variables

}
