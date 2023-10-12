/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorCeldaTabla extends DefaultTableCellRenderer {

    private int columna;

    public ColorCeldaTabla(int pNumero) {
        this.columna = pNumero;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel resultado = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        LocalDate fechaDelDia = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Date pFechaDia = Date.from(fechaDelDia.atStartOfDay(defaultZoneId).toInstant());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(pFechaDia);
        calendar.add(Calendar.DAY_OF_YEAR, 14);
        Date fechaDif3 = calendar.getTime();

        Calendar calendarDos = Calendar.getInstance();
        calendarDos.setTime(pFechaDia);
        calendarDos.add(Calendar.DAY_OF_YEAR, 3);
        Date fechaDif2 = calendarDos.getTime();

        Date fecha = (Date) table.getValueAt(row, columna);

        if (fecha.getTime() <= fechaDif2.getTime()) {

            this.setBackground(Color.red);
            this.setForeground(Color.white);

        } else if (fecha.getTime() <= fechaDif3.getTime()) {
            this.setBackground(Color.yellow);
            this.setForeground(Color.black);
        } else {
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }
        return this;
    }

}
