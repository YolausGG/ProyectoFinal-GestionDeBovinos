/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Enfermedad;
import clases.ExportarExcel;
import clases.Padece;
import dominio.dControladora;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import persistencia.pEnfermedad;

public class frmListaContagiosActivos extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaContagiosActivos() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE CONTAGIOS ");

        this.llenarComboEnfermedad();

        txtCaravanaBovino.setText(frmBuscarBovino.caravana);

        this.chkActivo.setSelected(true);

        if (txtCaravanaBovino.getText().isEmpty()) {
            this.listarContagiosActivos();
        } else {
            this.listarContagiosActivosPorBovino();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaBovino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        cboEnfermedad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContagios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCaravanaBovino.setEditable(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caravana Bovino");

        btnBuscarCaravana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarCaravana.setText("Buscar Caravana");
        btnBuscarCaravana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCaravana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMouseClicked(evt);
            }
        });

        cboEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cboEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEnfermedadActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enfermedad:");

        chkActivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkActivo.setForeground(new java.awt.Color(255, 255, 255));
        chkActivo.setText("Activo");
        chkActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivoActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar16px.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCaravana)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(54, 67, 114));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableContagios = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableContagios.setBackground(new java.awt.Color(204, 255, 255));
            jTableContagios.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableContagios.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableContagiosMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableContagios);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
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

    public void listarContagios() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        ArrayList<Padece> listaContagios = dControladora.listarContagios();

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosActivos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        ArrayList<Padece> listaContagios = dControladora.listarContagiosActivos();

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }
        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosActivosPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosActivosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        Enfermedad enfermedad = (Enfermedad) cboEnfermedad.getSelectedItem();

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorEnfermedad(enfermedad.getIdEnfermedad());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosActivosPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        Enfermedad enfermedad = (Enfermedad) cboEnfermedad.getSelectedItem();

        ArrayList<Padece> listaContagios = dControladora.listarContagiosActivosPorEnfermedad(enfermedad.getIdEnfermedad());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosPorBovinoPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        Enfermedad enfermedad = (Enfermedad) cboEnfermedad.getSelectedItem();

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovinoPorEnfermedad(enfermedad.getIdEnfermedad(), bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }
        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    public void listarContagiosActivosPorBovinoPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());
        Enfermedad enfermedad = (Enfermedad) cboEnfermedad.getSelectedItem();

        ArrayList<Padece> listaContagios = dControladora.listarContagiosActivosPorBovinoPorEnfermedad(enfermedad.getIdEnfermedad(), bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            if (p.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPInicio = formato.format(p.getFechaInicio());
                String fechaPFinalizacion = formato.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), fechaPInicio, fechaPFinalizacion});
            }

        }

        jTableContagios.getTableHeader().setReorderingAllowed(false);
        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }

    private void llenarComboEnfermedad() {

        ArrayList<Enfermedad> listaEnfermedades = pEnfermedad.listarEnfermedades();

        for (Enfermedad enfermedad : listaEnfermedades) {

            cboEnfermedad.addItem(enfermedad);
        }

    }


    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked

        frmBuscarBovino form = new frmBuscarBovino();
        form.frm = "frmListaContagiosActivos";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMouseClicked

    private void jTableContagiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContagiosMouseClicked


    }//GEN-LAST:event_jTableContagiosMouseClicked

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed

        if (chkActivo.isSelected()) {
            if (!txtCaravanaBovino.getText().isEmpty() && cboEnfermedad.getSelectedIndex() != 0) {
                listarContagiosActivosPorBovinoPorEnfermedad();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarContagiosActivosPorBovino();
            } else if (cboEnfermedad.getSelectedIndex() != 0) {
                listarContagiosActivosPorEnfermedad();
            } else {
                listarContagiosActivos();
            }
        } else {
            if (!txtCaravanaBovino.getText().isEmpty() && cboEnfermedad.getSelectedIndex() != 0) {
                listarContagiosPorBovinoPorEnfermedad();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarContagiosPorBovino();
            } else if (cboEnfermedad.getSelectedIndex() != 0) {
                listarContagiosPorEnfermedad();
            } else {
                listarContagios();
            }
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void cboEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEnfermedadActionPerformed

        if (cboEnfermedad.getSelectedIndex() != 0) {
            if (!txtCaravanaBovino.getText().isEmpty() && chkActivo.isSelected()) {
                listarContagiosActivosPorBovinoPorEnfermedad();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarContagiosPorBovinoPorEnfermedad();
            } else if (chkActivo.isSelected()) {
                listarContagiosActivosPorEnfermedad();
            } else {
                listarContagiosPorEnfermedad();
            }
        } else {
            if (!txtCaravanaBovino.getText().isEmpty() && chkActivo.isSelected()) {
                listarContagiosActivosPorBovino();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarContagiosPorBovino();
            } else if (chkActivo.isSelected()) {
                listarContagiosActivos();
            } else {
                listarContagios();
            }
        }

    }//GEN-LAST:event_cboEnfermedadActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked

        this.txtCaravanaBovino.setText(null);
        if (cboEnfermedad.getSelectedIndex() != 0 && chkActivo.isSelected()) {
            listarContagiosActivosPorEnfermedad();
        } else if (cboEnfermedad.getSelectedIndex() != 0) {
            listarContagiosPorEnfermedad();
        } else if (chkActivo.isSelected()) {
            listarContagiosActivos();
        } else {
            listarContagios();
        }
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableContagios.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked

        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTableContagios);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Object> cboEnfermedad;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableContagios;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
