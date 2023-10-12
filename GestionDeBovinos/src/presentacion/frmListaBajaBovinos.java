/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BajaLogicaBovino;
import clases.BotonesTabla;
import clases.Bovino;
import clases.ExportarExcel;
import dominio.dControladora;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmListaBajaBovinos extends javax.swing.JInternalFrame {

    JButton alta = new JButton("AltaLogica");

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaBajaBovinos() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE BOVINOS DADOS DE BAJA");

        alta.setName("btnAlta");

        this.listarBajasLogicas();

    }

    public void listarBajasLogicas() {

        jTableBajasLogicas.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBajasLogicas.setRowSorter(elQueOrdena);

        ArrayList<BajaLogicaBovino> lista = dControladora.listarBajasLogicaBovinos();

        model.addColumn("ID Baja Lógica");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("Motivo");
        model.addColumn("Alta Lógica");

        for (BajaLogicaBovino b : lista) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaBaja = formato.format(b.getFechaBaja());

            if (b.getMotivo().equals("Muerte")) {
                model.addRow(new Object[]{b.getIdBajaBovino(), b.getBovino().getCaravanaBovino(), fechaBaja, b.getMotivo(), ""});
            } else if (dControladora.buscarBovinoBajaLogicaCaravana(b.getBovino().getCaravanaBovino()) != null) {
                model.addRow(new Object[]{b.getIdBajaBovino(), b.getBovino().getCaravanaBovino(), fechaBaja, b.getMotivo(), alta});
            } else {
                model.addRow(new Object[]{b.getIdBajaBovino(), b.getBovino().getCaravanaBovino(), fechaBaja, b.getMotivo(), ""});
            }
        }

        jTableBajasLogicas.getTableHeader().setReorderingAllowed(false);
        jTableBajasLogicas.setModel(model);
        jTableBajasLogicas.setRowHeight(25);
    }

    public void listarBajasLogicasLIKE() {

        jTableBajasLogicas.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBajasLogicas.setRowSorter(elQueOrdena);

        ArrayList<BajaLogicaBovino> listaBajasFinal = new ArrayList<>();

        ArrayList<Bovino> listaBovinos = dControladora.buscarBovinoCaravanaLIKETodos(txtCaravanaHembra.getText());

        ArrayList<BajaLogicaBovino> lista = dControladora.listarBajasLogicaBovinos();

        for (BajaLogicaBovino bajaLogica : lista) {

            for (Bovino bovino : listaBovinos) {
                if (bajaLogica.getBovino().getIdBovino() == bovino.getIdBovino()) {
                    listaBajasFinal.add(bajaLogica);
                    listaBovinos.remove(bovino);
                    break;
                }

            }
        }

        model.addColumn("ID Baja Lógica");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("Motivo");
        model.addColumn("Alta Lógica");

        for (BajaLogicaBovino b : listaBajasFinal) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaBaja = formato.format(b.getFechaBaja());

            if (b.getMotivo().equals("Muerte")) {
                model.addRow(new Object[]{b.getIdBajaBovino(), b.getBovino().getCaravanaBovino(), fechaBaja, b.getMotivo(), ""});
            } else if (dControladora.buscarBovinoBajaLogicaCaravana(b.getBovino().getCaravanaBovino()) != null) {
                model.addRow(new Object[]{b.getIdBajaBovino(), b.getBovino().getCaravanaBovino(), fechaBaja, b.getMotivo(), alta});
            } else {
                model.addRow(new Object[]{b.getIdBajaBovino(), b.getBovino().getCaravanaBovino(), fechaBaja, b.getMotivo(), ""});
            }
        }

        jTableBajasLogicas.getTableHeader().setReorderingAllowed(false);
        jTableBajasLogicas.setModel(model);
        jTableBajasLogicas.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaHembra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBajasLogicas = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caravana Bovino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        jTableBajasLogicas = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableBajasLogicas.setBackground(new java.awt.Color(204, 255, 255));
            jTableBajasLogicas.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableBajasLogicas.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableBajasLogicasMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableBajasLogicas);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
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


    private void jTableBajasLogicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBajasLogicasMouseClicked

        columna = jTableBajasLogicas.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableBajasLogicas.getRowHeight();
        if (columna <= jTableBajasLogicas.getColumnCount() && columna >= 0 && row <= jTableBajasLogicas.getRowCount() && row >= 0) {
            Object objeto = jTableBajasLogicas.getValueAt(row, columna);
            if (evt.getClickCount() == 2) {

                int fila = jTableBajasLogicas.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableBajasLogicas.getValueAt(fila, 1).toString();
                    frmBovino.sexo = jTableBajasLogicas.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }

            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnAlta")) {

                    int fila = jTableBajasLogicas.getSelectedRow();

                    if (fila != -1) {

                        String caravana = jTableBajasLogicas.getValueAt(fila, 1).toString();

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "Desea dar Nuevamente el Bovino de Alta?", "Alta del Bovino", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                            if (dControladora.altaLogicaBovino(bovino.getIdBovino())) {

                                this.listarBajasLogicas();
                                JOptionPane.showMessageDialog(null, "Se dió de Alta el Bovino Nuevamnete");

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo dar de Alta el Bovino");
                            }

                        }

                    } else {

                    }
                }

            }
    }//GEN-LAST:event_jTableBajasLogicasMouseClicked
    }

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableBajasLogicas.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTableBajasLogicas);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased

        this.listarBajasLogicasLIKE();
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased


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
    private javax.swing.JTable jTableBajasLogicas;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
