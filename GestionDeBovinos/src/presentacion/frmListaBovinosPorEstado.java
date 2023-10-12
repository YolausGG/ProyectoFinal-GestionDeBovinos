/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.EstadoBovino;
import clases.EstadoDelBovino;
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
import persistencia.pEstadoDelBovino;

public class frmListaBovinosPorEstado extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaBovinosPorEstado() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE BOVINOS POR ESTADO");

        this.llenarComboEstado();
        txtCaravanaBovino.setText(frmBuscarBovino.caravana);

        this.chkActivo.setSelected(true);

        if (txtCaravanaBovino.getText().isEmpty()) {
            this.listarEstadosActivosDeBovinos();
        } else {
            this.listarEstadosActivosDeBovinosPorBovino();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaBovino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox<>();
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
        jTableBovinosPorEstado = new javax.swing.JTable();

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

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cboEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");

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
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCaravana)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstado, 0, 193, Short.MAX_VALUE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(54, 67, 114));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableBovinosPorEstado = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableBovinosPorEstado.setBackground(new java.awt.Color(204, 255, 255));
            jTableBovinosPorEstado.setModel(new javax.swing.table.DefaultTableModel(
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
            jScrollPane1.setViewportView(jTableBovinosPorEstado);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
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

    private void llenarComboEstado() {

        ArrayList<EstadoDelBovino> listaEstados = pEstadoDelBovino.listarEstadosDelBovino();

        for (EstadoDelBovino estado : listaEstados) {

            cboEstado.addItem(estado);
        }

    }

    public void listarEstadosDeBovinos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovino();

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            EstadoDelBovino estadoDelBovino = dControladora.buscarEstadoDelBovino(eb.getIdEstadoDelBovino());
            Bovino bovino = dControladora.buscarBovinoId(eb.getIdBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }

        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadosActivosDeBovinos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoActivos();

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            EstadoDelBovino estadoDelBovino = dControladora.buscarEstadoDelBovino(eb.getIdEstadoDelBovino());
            Bovino bovino = dControladora.buscarBovinoId(eb.getIdBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadosDeBovinosPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        Bovino bovino = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoPorBovino(bovino.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            EstadoDelBovino estadoDelBovino = dControladora.buscarEstadoDelBovino(eb.getIdEstadoDelBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadosActivosDeBovinosPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        Bovino bovino = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoActivosPorBovino(bovino.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            EstadoDelBovino estadoDelBovino = dControladora.buscarEstadoDelBovino(eb.getIdEstadoDelBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadoDeBovinosPorEstado() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        EstadoDelBovino estadoDelBovino = (EstadoDelBovino) cboEstado.getSelectedItem();

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoPorEstado(estadoDelBovino.getIdEstadoDelBovino());

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            Bovino bovino = dControladora.buscarBovinoId(eb.getIdBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadoActivosDeBovinosPorEstado() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        EstadoDelBovino estadoDelBovino = (EstadoDelBovino) cboEstado.getSelectedItem();

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoActivosPorEstado(estadoDelBovino.getIdEstadoDelBovino());

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            Bovino bovino = dControladora.buscarBovinoId(eb.getIdBovino());

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadosDeBovinosPorEstadoPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        Bovino bovino = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        EstadoDelBovino estadoDelBovino = (EstadoDelBovino) cboEstado.getSelectedItem();

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoPorBovinoPorEstado(bovino.getIdBovino(), estadoDelBovino.getIdEstadoDelBovino());

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }

    public void listarEstadosActivosDeBovinosPorEstadoPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableBovinosPorEstado.setRowSorter(elQueOrdena);

        Bovino bovino = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        EstadoDelBovino estadoDelBovino = (EstadoDelBovino) cboEstado.getSelectedItem();

        ArrayList<EstadoBovino> listaEstadosBovino = dControladora.listarEstadosBovinoActivosPorBovinoPorEstado(bovino.getIdBovino(), estadoDelBovino.getIdEstadoDelBovino());

        model.addColumn("Caravana");
        model.addColumn("Estado");
        model.addColumn("FechaNacimeinto");
        model.addColumn("Raza");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (EstadoBovino eb : listaEstadosBovino) {

            if (eb.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, eb.getFechaFinalizacion()});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = formato.format(bovino.getFechaNacimiento());
                String fechaInicio = formato.format(eb.getFechaInicio());
                String fechaFinalizacion = formato.format(eb.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estadoDelBovino.getEstado(), fechaNacimiento, bovino.getRaza().getTipo(), fechaInicio, fechaFinalizacion});
            }
        }

        jTableBovinosPorEstado.getTableHeader().setReorderingAllowed(false);
        jTableBovinosPorEstado.setModel(model);
        jTableBovinosPorEstado.setRowHeight(25);
    }


    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked

        frmBuscarBovino form = new frmBuscarBovino();
        form.frm = "frmListaBovinosPorEstado";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMouseClicked


    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed

        if (chkActivo.isSelected()) {
            if (!txtCaravanaBovino.getText().isEmpty() && cboEstado.getSelectedIndex() != 0) {
                listarEstadosActivosDeBovinosPorEstadoPorBovino();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarEstadosActivosDeBovinosPorBovino();
            } else if (cboEstado.getSelectedIndex() != 0) {
                listarEstadoActivosDeBovinosPorEstado();
            } else {
                listarEstadosActivosDeBovinos();
            }
        } else {
            if (!txtCaravanaBovino.getText().isEmpty() && cboEstado.getSelectedIndex() != 0) {
                listarEstadosDeBovinosPorEstadoPorBovino();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarEstadosDeBovinosPorBovino();
            } else if (cboEstado.getSelectedIndex() != 0) {
                listarEstadoDeBovinosPorEstado();
            } else {
                listarEstadosDeBovinos();
            }
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked

        this.txtCaravanaBovino.setText(null);
        if (cboEstado.getSelectedIndex() != 0 && chkActivo.isSelected()) {
            listarEstadoActivosDeBovinosPorEstado();
        } else if (cboEstado.getSelectedIndex() != 0) {
            listarEstadoDeBovinosPorEstado();
        } else if (chkActivo.isSelected()) {
            listarEstadosActivosDeBovinos();
        } else {
            listarEstadosDeBovinos();
        }
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed

        if (cboEstado.getSelectedIndex() != 0) {
            if (!txtCaravanaBovino.getText().isEmpty() && chkActivo.isSelected()) {
                listarEstadosActivosDeBovinosPorEstadoPorBovino();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarEstadosDeBovinosPorEstadoPorBovino();
            } else if (chkActivo.isSelected()) {
                listarEstadoActivosDeBovinosPorEstado();
            } else {
                listarEstadoDeBovinosPorEstado();
            }
        } else {
            if (!txtCaravanaBovino.getText().isEmpty() && chkActivo.isSelected()) {
                listarEstadosActivosDeBovinosPorBovino();
            } else if (!txtCaravanaBovino.getText().isEmpty()) {
                listarEstadosDeBovinosPorBovino();
            } else if (chkActivo.isSelected()) {
                listarEstadosActivosDeBovinos();
            } else {
                listarEstadosDeBovinos();
            }
        }
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableBovinosPorEstado.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked

        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(jTableBovinosPorEstado);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Object> cboEstado;
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
    private javax.swing.JTable jTableBovinosPorEstado;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
