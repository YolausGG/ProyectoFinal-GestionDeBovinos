/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Aborto;
import clases.Celo;
import clases.EventoDeSanidad;
import clases.ExportarExcel;
import clases.Hembra;
import clases.Inseminacion;
import clases.Parto;
import clases.Secado;
import clases.Tacto;
import dominio.dControladora;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmListaEventosDeSanidad extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaEventosDeSanidad() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE EVENTOS DE SANIDAD");

        lblCaravanaMacho.setVisible(false);
        txtCaravanaMacho.setVisible(false);
        btnBuscarCaravanaMacho.setVisible(false);
        btnLimpiarMacho.setVisible(false);

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        txtCaravanaMacho.setText(frmBuscarMacho.caravana);

        if (cboTipoEvento.getSelectedIndex() == 3) {
            listarEventosDeSanidadPorTipoEventoCaravanas();
        }

        if (txtCaravanaHembra.getText().isEmpty()) {
            this.listarEventosDeSanidad();
        } else {
            this.listarEventosDeSanidadHembra();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaHembra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        btnLimpiarMacho = new javax.swing.JButton();
        cboTipoEvento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarCaravanaMacho = new javax.swing.JButton();
        txtCaravanaMacho = new javax.swing.JTextField();
        lblCaravanaMacho = new javax.swing.JLabel();
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

        btnLimpiarMacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar16px.png"))); // NOI18N
        btnLimpiarMacho.setText("Limpiar");
        btnLimpiarMacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMachoMouseClicked(evt);
            }
        });

        cboTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tacto", "Secado", "Inseminacion", "Celo", "Parto", "Aborto" }));
        cboTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoEventoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Evento");

        btnBuscarCaravanaMacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarCaravanaMacho.setText("Buscar Caravana");
        btnBuscarCaravanaMacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCaravanaMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMachoMouseClicked(evt);
            }
        });

        txtCaravanaMacho.setEditable(false);

        lblCaravanaMacho.setForeground(new java.awt.Color(255, 255, 255));
        lblCaravanaMacho.setText("Caravana Macho:");

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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCaravanaMacho))
                    .addComponent(btnLimpiarMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
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

    public void listarEventosDeSanidad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoDeSanidad> listaEventosDeSanidad = dControladora.listarEventosDeSanidad();

        model.addColumn("ID Evento De Sanidad");
        model.addColumn("Tipo");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Tipo");
        model.addColumn("Resultado");
        model.addColumn("Diagnóstico");
        model.addColumn("Caravana Macho");

        for (EventoDeSanidad e : listaEventosDeSanidad) {

            switch (e.getClass().getSimpleName()) {
                case "Inseminacion":
                    Inseminacion ins = (Inseminacion) e;
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaIns = formato.format(ins.getFecha());
                    model.addRow(new Object[]{
                        ins.getIdEventoDeSanidad(),
                        "Inseminacion",
                        ins.getHembra().getCaravanaBovino(),
                        fechaIns,
                        ins.getDetalle(),
                        "",
                        "",
                        "",
                        "",
                        ins.getMacho().getCaravanaBovino()});
                    break;
                case "Aborto":
                    Aborto abo = (Aborto) e;
                    SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaAborto = formato1.format(abo.getFecha());
                    model.addRow(new Object[]{
                        abo.getIdEventoDeSanidad(),
                        "Aborto",
                        abo.getHembra().getCaravanaBovino(),
                        fechaAborto,
                        abo.getDetalle(),
                        abo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Parto":
                    Parto par = (Parto) e;
                    SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaParto = formato2.format(par.getFecha());
                    model.addRow(new Object[]{
                        par.getIdEventoDeSanidad(),
                        "Parto",
                        par.getHembra().getCaravanaBovino(),
                        fechaParto,
                        par.getDetalle(),
                        "",
                        par.getTipo(),
                        "",
                        "",
                        ""});
                    break;
                case "Tacto":
                    Tacto tac = (Tacto) e;
                    SimpleDateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaTacto = formato3.format(tac.getFecha());
                    model.addRow(new Object[]{
                        tac.getIdEventoDeSanidad(),
                        "Tacto",
                        tac.getHembra().getCaravanaBovino(),
                        fechaTacto,
                        tac.getDetalle(),
                        "",
                        "",
                        tac.getResultado(),
                        tac.getDiagnostico(),
                        ""});
                    break;
                case "Secado":
                    Secado sec = (Secado) e;
                    SimpleDateFormat formato4 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaSecado = formato4.format(sec.getFecha());
                    model.addRow(new Object[]{
                        sec.getIdEventoDeSanidad(),
                        "Secado",
                        sec.getHembra().getCaravanaBovino(),
                        fechaSecado,
                        sec.getDetalle(),
                        sec.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Celo":
                    Celo celo = (Celo) e;
                    SimpleDateFormat formato5 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaCelo = formato5.format(celo.getFecha());
                    model.addRow(new Object[]{
                        celo.getIdEventoDeSanidad(),
                        "Celo",
                        celo.getHembra().getCaravanaBovino(),
                        fechaCelo,
                        celo.getDetalle(),
                        celo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                default:
                    throw new AssertionError();
            }

        }

        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosDeSanidadHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        Hembra hembra = dControladora.buscarHembraPorCaravana(txtCaravanaHembra.getText());

        ArrayList<EventoDeSanidad> listaEventosDeSanidadHembra = dControladora.listarEventosDeSanidadPorCaravana(hembra.getCaravanaBovino());

        model.addColumn("ID Evento De Sanidad");
        model.addColumn("Tipo");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Tipo");
        model.addColumn("Resultado");
        model.addColumn("Diagnóstico");
        model.addColumn("Caravana Macho");

        for (EventoDeSanidad e : listaEventosDeSanidadHembra) {

            switch (e.getClass().getSimpleName().toString()) {
                case "Inseminacion":
                    Inseminacion ins = (Inseminacion) e;
                    SimpleDateFormat formato6 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaIns = formato6.format(ins.getFecha());
                    model.addRow(new Object[]{
                        ins.getIdEventoDeSanidad(),
                        "Inseminacion",
                        ins.getHembra().getCaravanaBovino(),
                        fechaIns,
                        ins.getDetalle(),
                        "",
                        "",
                        "",
                        "",
                        ins.getMacho().getCaravanaBovino()});
                    break;
                case "Aborto":
                    Aborto abo = (Aborto) e;
                    SimpleDateFormat formato7 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaAborto = formato7.format(abo.getFecha());
                    model.addRow(new Object[]{
                        abo.getIdEventoDeSanidad(),
                        "Aborto",
                        abo.getHembra().getCaravanaBovino(),
                        fechaAborto,
                        abo.getDetalle(),
                        abo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Parto":
                    Parto par = (Parto) e;
                    SimpleDateFormat formato8 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaParto = formato8.format(par.getFecha());
                    model.addRow(new Object[]{
                        par.getIdEventoDeSanidad(),
                        "Parto",
                        par.getHembra().getCaravanaBovino(),
                        fechaParto,
                        par.getDetalle(),
                        "",
                        par.getTipo(),
                        "",
                        "",
                        ""});
                    break;
                case "Tacto":
                    Tacto tac = (Tacto) e;
                    SimpleDateFormat formato9 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaTacto = formato9.format(tac.getFecha());
                    model.addRow(new Object[]{
                        tac.getIdEventoDeSanidad(),
                        "Tacto",
                        tac.getHembra().getCaravanaBovino(),
                        fechaTacto,
                        tac.getDetalle(),
                        "",
                        "",
                        tac.getResultado(),
                        tac.getDiagnostico(),
                        ""});
                    break;
                case "Secado":
                    Secado sec = (Secado) e;
                    SimpleDateFormat formato10 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaSecado = formato10.format(sec.getFecha());
                    model.addRow(new Object[]{
                        sec.getIdEventoDeSanidad(),
                        "Secado",
                        sec.getHembra().getCaravanaBovino(),
                        fechaSecado,
                        sec.getDetalle(),
                        sec.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Celo":
                    Celo celo = (Celo) e;
                    SimpleDateFormat formato11 = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaCelo = formato11.format(celo.getFecha());
                    model.addRow(new Object[]{
                        celo.getIdEventoDeSanidad(),
                        "Celo",
                        celo.getHembra().getCaravanaBovino(),
                        fechaCelo,
                        celo.getDetalle(),
                        celo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                default:
                    throw new AssertionError();
            }
        }
        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosDeSanidadPorTipoEvento() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosDeSanidad();
                break;
            case "Tacto":
                ArrayList<Tacto> listaTactos = dControladora.listarTactos();

                model.addColumn("id Tacto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Resultado");
                model.addColumn("Diagnostico");

                for (Tacto t : listaTactos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaTacto = formato.format(t.getFecha());

                    model.addRow(new Object[]{t.getIdEventoDeSanidad(), t.getHembra().getCaravanaBovino(), fechaTacto, t.getDetalle(), t.getResultado(), t.getDiagnostico()});
                }
                break;
            case "Secado":
                ArrayList<Secado> listaSecados = dControladora.listarSecados();

                model.addColumn("id Secado");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Secado s : listaSecados) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaSecado = formato.format(s.getFecha());

                    model.addRow(new Object[]{s.getIdEventoDeSanidad(), s.getHembra().getCaravanaBovino(), fechaSecado, s.getDetalle(), s.getCausa()});
                }
                break;
            case "Inseminacion":
                ArrayList<Inseminacion> listaInseminaciones = dControladora.listarInseminaciones();

                model.addColumn("id Inseminacion");
                model.addColumn("Caravana Hembra");
                model.addColumn("Caravana Macho");
                model.addColumn("Fecha");
                model.addColumn("Detalle");

                for (Inseminacion i : listaInseminaciones) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaIns = formato.format(i.getFecha());

                    model.addRow(new Object[]{i.getIdEventoDeSanidad(), i.getHembra().getCaravanaBovino(), i.getMacho().getCaravanaBovino(), fechaIns, i.getDetalle()});
                }
                break;
            case "Celo":
                ArrayList<Celo> listaCelos = dControladora.listarCelos();

                model.addColumn("id Celo");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Celo c : listaCelos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaCelo = formato.format(c.getFecha());

                    model.addRow(new Object[]{c.getIdEventoDeSanidad(), c.getHembra().getCaravanaBovino(), fechaCelo, c.getDetalle(), c.getCausa()});
                }
                break;
            case "Parto":
                ArrayList<Parto> listaPartos = dControladora.listarPartos();

                model.addColumn("id Parto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Tipo");

                for (Parto p : listaPartos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaParto = formato.format(p.getFecha());

                    model.addRow(new Object[]{p.getIdEventoDeSanidad(), p.getHembra().getCaravanaBovino(), fechaParto, p.getDetalle(), p.getTipo()});
                }
                break;
            case "Aborto":
                ArrayList<Aborto> listaAbortos = dControladora.listarAbortos();

                model.addColumn("id Aborto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Aborto a : listaAbortos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaAborto = formato.format(a.getFecha());

                    model.addRow(new Object[]{a.getIdEventoDeSanidad(), a.getHembra().getCaravanaBovino(), fechaAborto, a.getDetalle(), a.getCausa()});
                }
                break;
            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.getTableHeader().setReorderingAllowed(false);
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosDeSanidadPorTipoEventoCaravanas() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        String caravana = txtCaravanaHembra.getText();

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosDeSanidad();
                break;
            case "Tacto":
                ArrayList<Tacto> listaTactos = dControladora.listarTactosPorCaravana(caravana);

                model.addColumn("id Tacto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Resultado");
                model.addColumn("Diagnostico");

                for (Tacto t : listaTactos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaTacto = formato.format(t.getFecha());

                    model.addRow(new Object[]{t.getIdEventoDeSanidad(), t.getHembra().getCaravanaBovino(), fechaTacto, t.getDetalle(), t.getResultado(), t.getDiagnostico()});
                }
                break;
            case "Secado":
                ArrayList<Secado> listaSecados = dControladora.listarSecadosPorCaravana(caravana);

                model.addColumn("id Secado");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Secado s : listaSecados) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaSecado = formato.format(s.getFecha());

                    model.addRow(new Object[]{s.getIdEventoDeSanidad(), s.getHembra().getCaravanaBovino(), fechaSecado, s.getDetalle(), s.getCausa()});
                }
                break;
            case "Inseminacion":

                ArrayList<Inseminacion> listaInseminaciones = new ArrayList<>();

                if (!txtCaravanaHembra.getText().isEmpty() && !txtCaravanaMacho.getText().isEmpty()) {
                    listaInseminaciones = dControladora.listarInseminacionesPorCaravanaHembraYMacho(txtCaravanaHembra.getText(), txtCaravanaMacho.getText());
                } else if (!txtCaravanaHembra.getText().isEmpty()) {
                    listaInseminaciones = dControladora.listarInseminacionesPorCaravana(txtCaravanaHembra.getText());
                } else if (!txtCaravanaMacho.getText().isEmpty()) {
                    listaInseminaciones = dControladora.listarInseminacionesPorCaravana(txtCaravanaMacho.getText());
                }
                model.addColumn("id Inseminacion");
                model.addColumn("Caravana Hembra");
                model.addColumn("Caravana Macho");
                model.addColumn("Fecha");
                model.addColumn("Detalle");

                for (Inseminacion i : listaInseminaciones) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaIns = formato.format(i.getFecha());

                    model.addRow(new Object[]{i.getIdEventoDeSanidad(), i.getHembra().getCaravanaBovino(), i.getMacho().getCaravanaBovino(), fechaIns, i.getDetalle()});
                }
                break;

            case "Celo":
                ArrayList<Celo> listaCelos = dControladora.listarCelosPorCaravana(caravana);

                model.addColumn("id Celo");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Celo c : listaCelos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaCelo = formato.format(c.getFecha());

                    model.addRow(new Object[]{c.getIdEventoDeSanidad(), c.getHembra().getCaravanaBovino(), fechaCelo, c.getDetalle(), c.getCausa()});
                }
                break;
            case "Parto":
                ArrayList<Parto> listaPartos = dControladora.listarPartosPorCaravana(caravana);

                model.addColumn("id Parto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Tipo");

                for (Parto p : listaPartos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaParto = formato.format(p.getFecha());

                    model.addRow(new Object[]{p.getIdEventoDeSanidad(), p.getHembra().getCaravanaBovino(), fechaParto, p.getDetalle(), p.getTipo()});
                }
                break;
            case "Aborto":
                ArrayList<Aborto> listaAbortos = dControladora.listarAbortosPorCaravana(caravana);

                model.addColumn("id Aborto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Aborto a : listaAbortos) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaAborto = formato.format(a.getFecha());

                    model.addRow(new Object[]{a.getIdEventoDeSanidad(), a.getHembra().getCaravanaBovino(), fechaAborto, a.getDetalle(), a.getCausa()});
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
        form.frm = "frmListaEventosDeSanidad";
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
            if (cboTipoEvento.getSelectedIndex() == 3) {
                lblCaravanaMacho.setVisible(true);
                txtCaravanaMacho.setVisible(true);
                btnBuscarCaravanaMacho.setVisible(true);
                btnLimpiarMacho.setVisible(true);
                if (!txtCaravanaHembra.getText().isEmpty() || !txtCaravanaMacho.getText().isEmpty()) {
                    listarEventosDeSanidadPorTipoEventoCaravanas();
                } else {
                    listarEventosDeSanidadPorTipoEvento();
                }
            } else {
                lblCaravanaMacho.setVisible(false);
                txtCaravanaMacho.setVisible(false);
                btnBuscarCaravanaMacho.setVisible(false);
                btnLimpiarMacho.setVisible(false);
            }
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadPorTipoEventoCaravanas();
            } else {
                listarEventosDeSanidadPorTipoEvento();
            }

        } else {
            lblCaravanaMacho.setVisible(false);
            txtCaravanaMacho.setVisible(false);
            btnBuscarCaravanaMacho.setVisible(false);
            btnLimpiarMacho.setVisible(false);
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadHembra();
            } else {
                listarEventosDeSanidad();
            }
        }
    }//GEN-LAST:event_cboTipoEventoActionPerformed

    private void btnLimpiarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarHembraMouseClicked

        txtCaravanaHembra.setText(null);
        if (cboTipoEvento.getSelectedIndex() != 0) {
            if (cboTipoEvento.getSelectedIndex() == 3) {
                lblCaravanaMacho.setVisible(true);
                txtCaravanaMacho.setVisible(true);
                btnBuscarCaravanaMacho.setVisible(true);
                btnLimpiarMacho.setVisible(true);
                if (!txtCaravanaMacho.getText().isEmpty()) {
                    listarEventosDeSanidadPorTipoEventoCaravanas();
                } else {
                    listarEventosDeSanidadPorTipoEvento();
                }
            } else {
                listarEventosDeSanidadPorTipoEvento();
                lblCaravanaMacho.setVisible(false);
                txtCaravanaMacho.setVisible(false);
                btnBuscarCaravanaMacho.setVisible(false);
                btnLimpiarMacho.setVisible(false);
            }

        } else {

            listarEventosDeSanidad();
        }
    }//GEN-LAST:event_btnLimpiarHembraMouseClicked

    private void btnBuscarCaravanaMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMachoMouseClicked
        frmBuscarMacho form = new frmBuscarMacho();
        form.frm = "frmListaEventosDeSanidad";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMachoMouseClicked

    private void btnLimpiarMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMachoMouseClicked

        this.txtCaravanaMacho.setText(null);

        if (cboTipoEvento.getSelectedIndex() != 0) {
            if (cboTipoEvento.getSelectedIndex() == 3) {
                lblCaravanaMacho.setVisible(true);
                txtCaravanaMacho.setVisible(true);
                btnBuscarCaravanaMacho.setVisible(true);
                btnLimpiarMacho.setVisible(true);
                if (!txtCaravanaHembra.getText().isEmpty()) {
                    listarEventosDeSanidadPorTipoEventoCaravanas();
                } else {
                    listarEventosDeSanidadPorTipoEvento();
                }
            } else {
                lblCaravanaMacho.setVisible(false);
                txtCaravanaMacho.setVisible(false);
                btnBuscarCaravanaMacho.setVisible(false);
                btnLimpiarMacho.setVisible(false);
            }
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadPorTipoEventoCaravanas();
            } else {
                listarEventosDeSanidadPorTipoEvento();
            }

        } else {

            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadHembra();
            } else {
                listarEventosDeSanidad();
            }
        }

    }//GEN-LAST:event_btnLimpiarMachoMouseClicked

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
    private javax.swing.JButton btnBuscarCaravanaMacho;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarHembra;
    private javax.swing.JButton btnLimpiarMacho;
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
    private javax.swing.JLabel lblCaravanaMacho;
    private javax.swing.JTextField txtCaravanaHembra;
    private javax.swing.JTextField txtCaravanaMacho;
    // End of variables declaration//GEN-END:variables
}
