/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abcuniversity;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author PC
 */
public class DegreeDetails extends AbstractTableModel {

    private static final String[] COLOUMN_NAMES = {"Degree ID", "Degreet Name", "Duration"};
    private static ArrayList<DegreePrograms> list;

    DegreeDetails(ArrayList<DegreePrograms> stlist) {
        list = stlist;
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
                return list.get(rowIndex).getDegreeId();
            case 1:
                return list.get(rowIndex).getDegreeName();
            case 2:
                return list.get(rowIndex).getDuration();
            default:
                return "Error";
        }
    }
}
