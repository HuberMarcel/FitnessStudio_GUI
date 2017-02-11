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

/**
 *
 * @author Huber, Marcel
 */
public class JFrameFitnessStudioVerwaltung extends javax.swing.JFrame {

    private MyStandardMitgliederListModel msmlm;

    /**
     * Creates new form JFrameFitnessStudioVerwaltung
     */
    public JFrameFitnessStudioVerwaltung() {
        msmlm = new MyStandardMitgliederListModel();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelHauptprogramm = new javax.swing.JLabel();
        jButtonStartHauptprogramm = new javax.swing.JButton();
        textMethodenNummer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMitglieder = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHauptprogramm.setText("Hauptprogramm");

        jButtonStartHauptprogramm.setText("Start");
        jButtonStartHauptprogramm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartHauptprogrammActionPerformed(evt);
            }
        });

        textMethodenNummer.setColumns(3);
        textMethodenNummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMethodenNummerActionPerformed(evt);
            }
        });

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
                .addContainerGap(307, Short.MAX_VALUE))
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
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("KonsolenausgabeDemoStart", jPanel1);

        jListMitglieder.setModel(msmlm);
        jScrollPane1.setViewportView(jListMitglieder);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dialogfenster", jPanel2);

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

    private void textMethodenNummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMethodenNummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMethodenNummerActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFitnessStudioVerwaltung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButtonStartHauptprogramm;
    private javax.swing.JLabel jLabelHauptprogramm;
    private javax.swing.JList jListMitglieder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField textMethodenNummer;
    // End of variables declaration//GEN-END:variables

    class MyStandardMitgliederListModel extends AbstractListModel<String> {

        private List<String> standardMitglieder;

        public MyStandardMitgliederListModel() {
            standardMitglieder = new ArrayList<>();
            FitnessStudio huberFitness = new FitnessStudio("Huber-Fitness",
                    "54294 Trier", (int) 2017);

            StandardMitglied standardMitglied = new StandardMitglied("Huber",
                    "K.", "54441", "Wellen", 83, huberFitness);
            huberFitness.addStandardMitglied(standardMitglied);
            standardMitglied = new StandardMitglied("Huber",
                    "H.", "54441", "Wellen", 63, huberFitness);
            huberFitness.addStandardMitglied(standardMitglied);
            standardMitglied = new StandardMitglied("Huber",
                    "G.", "54441", "Wellen", 62, huberFitness);
            huberFitness.addStandardMitglied(standardMitglied);
            standardMitglied = new StandardMitglied("Huber",
                    "S.", "54926", "Trier", 38, huberFitness);
            huberFitness.addStandardMitglied(standardMitglied);
            standardMitglied = new StandardMitglied("Huber",
                    "Marcel", "54924", "Trier", 36, huberFitness);
            huberFitness.addStandardMitglied(standardMitglied);
            standardMitglied = new StandardMitglied("Huber",
                    "P.", "54924", "Trier", 24, huberFitness);
            huberFitness.addStandardMitglied(standardMitglied);

            List<StandardMitglied> huberFitnessStandardMitglieder
                    = huberFitness.getStandardMitglieder();
            for (StandardMitglied standardMitglied1 : huberFitnessStandardMitglieder) {
                standardMitglieder.add(standardMitglied1.toString());
            }

            entferneMitgliedMitMitgliedNummer(2, huberFitness);
            entferneMitgliedMitMitgliedNummer(7, huberFitness);
            entferneMitgliedMitMitgliedNummer(0, huberFitness);
            entferneMitgliedMitMitgliedNummer(4, huberFitness);
        }

        @Override
        public int getSize() {
            return standardMitglieder.size();
        }

        @Override
        public String getElementAt(int index) {
            return standardMitglieder.get(index);
        }

        public void setStudioPersonen(List<String> models) {
            this.standardMitglieder = models;
            fireContentsChanged(this, 0, getSize());
        }

        public void entferneMitgliedMitMitgliedNummer(int mitgliedNummer,
                FitnessStudio fitnessStudio) {
            int indexImStandardMitgliederArray
                    = fitnessStudio.removeStandardMitglied(mitgliedNummer);
            if ((0 <= indexImStandardMitgliederArray)
                    && (indexImStandardMitgliederArray < standardMitglieder.size())) {
                standardMitglieder.remove(indexImStandardMitgliederArray);
            } else {
                System.out.println("Da kann was mit dem Index nicht stimmen: Ich "
                        + "soll an der Stelle " + indexImStandardMitgliederArray + " "
                        + "etwas entfernen?! Das Feld hat Länge "
                        + standardMitglieder.size() + "!");
            }
        }
    }
}
