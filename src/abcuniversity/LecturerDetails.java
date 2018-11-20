/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abcuniversity;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class LecturerDetails extends AbstractTableModel {

    private static final String[] COLOUMN_NAMES = {"Lecturer ID", "Name", "Faculty", "Age"};
    private static ArrayList<Lecturer> list;

    LecturerDetails(ArrayList<Lecturer> lecList) {
        list = lecList;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLOUMN_NAMES.length;
    }
    
    public String getColumnName(int columnIndex) {
        return COLOUMN_NAMES[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getLecturerID();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getAge();
            case 3:
                return list.get(rowIndex).getFaculty();
            default:
                return "Error";
        }
    }
}
