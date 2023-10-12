/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.ExportarExcel;
import clases.Macho;
import clases.Pedigree;
import dominio.dControladora;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmListaBovinos extends javax.swing.JInternalFrame {

    public static String caravana = "";
    public static String sexo = "";
    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaBovinos() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE BOVINOS ");

        this.listarBovinos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaBovino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBovinos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCaravanaBovino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaBovinoKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caravana Bovino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(508, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora16px.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Exportar");

        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Excel16px.png"))); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Imprimir Lista");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(54, 67, 114));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableBovinos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableBovinos.setBackground(new java.awt.Color(204, 255, 255));
            jTableBovinos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jTableBovinos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableBovinosMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableBovinos);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void listarBovinos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinos.setRowSorter(elQueOrdena);

        ArrayList<Bovino> listaBovinos = dControladora.listarBovinos();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");
        model.addColumn("Número Pedigree");
        model.addColumn("Tipo");

        for (Bovino b : listaBovinos) {

            String tipo = b.getClass().getSimpleName().toString().equals("Macho") ? "Macho" : "Hembra";

            String numPedigre = "";

            Pedigree pedigree = dControladora.buscarPedigreeIdBovino(b.getIdBovino());
            if (pedigree != null) {
                numPedigre = pedigree.getNumeroPedigree();
            }

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = formato.format(b.getFechaNacimiento());

            if (tipo.equals("Macho")) {
                Macho macho = (Macho) b;
                model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimiento, b.getRaza().getTipo(), tipo, numPedigre, macho.getTipo()});
            } else {
                model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimiento, b.getRaza().getTipo(), tipo, numPedigre, ""});
            }
        }

        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setModel(model);
        jTableBovinos.setRowHeight(25);
    }

    public void listarBovinosCaravanaLIKE(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinos.setRowSorter(elQueOrdena);

        ArrayList<Bovino> listaBovinosFinal = new ArrayList<>();

        ArrayList<Bovino> listaBovinoTodos = dControladora.listarBovinos();

        ArrayList<Bovino> listaBovinos = dControladora.buscarBovinoCaravanaLIKE(pCaravana);

        for (Bovino listaBovino : listaBovinos) {

            for (Bovino listaBovinoTodo : listaBovinoTodos) {
                if (listaBovino.getCaravanaBovino().equals(listaBovinoTodo.getCaravanaBovino())) {
                    listaBovinosFinal.add(listaBovinoTodo);
                    listaBovinoTodos.remove(listaBovinoTodo);
                    break;
                }
            }
        }

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");
        model.addColumn("Número Pedigree");
        model.addColumn("Tipo");

        for (Bovino b : listaBovinosFinal) {

            String tipo = b.getClass().getSimpleName().toString().equals("Macho") ? "Macho" : "Hembra";

            String numPedigre = "";

            Pedigree pedigree = dControladora.buscarPedigreeIdBovino(b.getIdBovino());
            if (pedigree != null) {
                numPedigre = pedigree.getNumeroPedigree();
            }

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = formato.format(b.getFechaNacimiento());

            if (tipo.equals("Macho")) {
                Macho macho = (Macho) b;
                model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimiento, b.getRaza().getTipo(), tipo, numPedigre, macho.getTipo()});
            } else {
                model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimiento, b.getRaza().getTipo(), tipo, numPedigre, ""});
            }
        }

        jTableBovinos.getTableHeader().setReorderingAllowed(false);
        jTableBovinos.setModel(model);
        jTableBovinos.setRowHeight(25);
    }


    private void jTableBovinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBovinosMouseClicked

        columna = jTableBovinos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableBovinos.getRowHeight();
        if (columna <= jTableBovinos.getColumnCount() && columna >= 0 && row <= jTableBovinos.getRowCount() && row >= 0) {

            if (evt.getClickCount() == 2) {

                int fila = jTableBovinos.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableBovinos.getValueAt(fila, 0).toString();
                    frmBovino.sexo = jTableBovinos.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jTableBovinosMouseClicked


    private void txtCaravanaBovinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaBovinoKeyReleased

        this.listarBovinosCaravanaLIKE(txtCaravanaBovino.getText());
    }//GEN-LAST:event_txtCaravanaBovinoKeyReleased

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableBovinos.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTableBovinos);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableBovinos;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
