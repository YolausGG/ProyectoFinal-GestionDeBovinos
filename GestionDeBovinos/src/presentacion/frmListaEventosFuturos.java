/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EventoFuturo;
import clases.ExportarExcel;
import dominio.dControladora;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmListaEventosFuturos extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaEventosFuturos() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE EVENTOS FUTUROS");

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);

        if (txtCaravanaHembra.getText().isEmpty()) {
            this.listarEventosFuturos();
        } else {
            this.listarEventosFuturosPorHembra();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaHembra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        cboTipoEvento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiarHembra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventosDeSanidad = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCaravanaHembra.setEditable(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caravana Hembra");

        btnBuscarCaravana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarCaravana.setText("Buscar Caravana");
        btnBuscarCaravana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCaravana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMouseClicked(evt);
            }
        });

        cboTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tacto", "Secado", "Inseminacion", "Parto" }));
        cboTipoEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoEventoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Evento");

        btnLimpiarHembra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar16px.png"))); // NOI18N
        btnLimpiarHembra.setText("Limpiar");
        btnLimpiarHembra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarHembraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCaravana)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLimpiarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel2.setText("Imprimir Lista");

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
        jLabel3.setText("Exportar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(54, 67, 114));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableEventosDeSanidad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableEventosDeSanidad.setBackground(new java.awt.Color(204, 255, 255));
            jTableEventosDeSanidad.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableEventosDeSanidad.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableEventosDeSanidadMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableEventosDeSanidad);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
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

    public void listarEventosFuturos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturos();

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        for (EventoFuturo eF : listaEventosFuturo) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaEF = formato.format(eF.getFechaPrevista());

            model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});

        }

        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosFuturosPorHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        for (EventoFuturo eF : listaEventosFuturo) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaEF = formato.format(eF.getFechaPrevista());

            model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});

        }

        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosFuturosPorTipoEvento() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturos();

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosFuturos();
                break;
            case "Tacto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Tacto")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;
            case "Secado":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Secado")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;
            case "Inseminacion":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Inseminacion")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;

            case "Parto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Parto")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;

            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosFuturosPorTipoEventoPorHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosFuturos();
                break;
            case "Tacto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Tacto")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;
            case "Secado":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Secado")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;
            case "Inseminacion":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Inseminacion")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;

            case "Parto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Parto")) {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        String fechaEF = formato.format(eF.getFechaPrevista());
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), fechaEF});
                    }
                }
                break;

            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked

        frmBuscarHembra form = new frmBuscarHembra();
        form.frm = "frmListaEventosFuturos";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMouseClicked

    private void jTableEventosDeSanidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosDeSanidadMouseClicked

        columna = jTableEventosDeSanidad.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEventosDeSanidad.getRowHeight();
        if (columna <= jTableEventosDeSanidad.getColumnCount() && columna >= 0 && row <= jTableEventosDeSanidad.getRowCount() && row >= 0) {

            if (evt.getClickCount() == 2) {

                int fila = jTableEventosDeSanidad.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableEventosDeSanidad.getValueAt(fila, 2).toString();
                    frmBovino.sexo = "Hembra";

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jTableEventosDeSanidadMouseClicked


    private void cboTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoEventoActionPerformed

        if (cboTipoEvento.getSelectedIndex() != 0) {

            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosFuturosPorTipoEventoPorHembra();
            } else {
                listarEventosFuturosPorTipoEvento();
            }

        } else {

            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosFuturosPorHembra();
            } else {
                listarEventosFuturos();
            }
        }
    }//GEN-LAST:event_cboTipoEventoActionPerformed

    private void btnLimpiarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarHembraMouseClicked

        txtCaravanaHembra.setText(null);
        if (cboTipoEvento.getSelectedIndex() != 0) {
            listarEventosFuturosPorTipoEvento();
        } else {
            listarEventosFuturos();
        }
    }//GEN-LAST:event_btnLimpiarHembraMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableEventosDeSanidad.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked

        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTableEventosDeSanidad);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarHembra;
    public static javax.swing.JComboBox<Object> cboTipoEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEventosDeSanidad;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
