/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.fitnessstudiogui;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcel
 */
class MyTableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return 15;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName;
        switch (columnIndex) {
            case 0:
                columnName = "Mitgliedsnummer";
                break;
            case 1:
                columnName = "Nachname";
                break;
            case 2:
                columnName = "Vorname";
                break;
            default:
                throw new IllegalArgumentException("Nichtexistente Spalte "
                        + "trägt keinen Namen!");
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return int.class;
            case 1:
            case 2:
                return String.class;
            default:
                throw new IllegalArgumentException("Nichtexistente Spalte "
                        + "kann keinen Typ haben!");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "Z" + rowIndex + "/S" + columnIndex;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        System.out.println("Zelle: Z" + rowIndex + "/S" + columnIndex + ": " + aValue);
    }

//        @Override
//        public void addTableModelListener(TableModelListener l) {
//        }
//
//        @Override
//        public void removeTableModelListener(TableModelListener l) {
//        }
}
