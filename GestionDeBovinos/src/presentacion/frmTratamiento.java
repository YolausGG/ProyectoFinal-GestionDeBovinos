/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Enfermedad;
import clases.Padece;
import clases.Tratamiento;
import dominio.dControladora;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static presentacion.frmTratamiento.columna;
import static presentacion.frmTratamiento.idTratamiento;
import static presentacion.frmTratamiento.row;

public class frmTratamiento extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    JButton finalizar = new JButton("Finalizar");

    public static int idTratamiento = 0;
    public static frmTratamiento frmTratamiento1 = null;

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmTratamiento() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("TRATAMIENTO ENFERMEDAD");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        finalizar.setName("btnFinalizar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        lblRFechaInicioT.setVisible(false);

        actualizarTabla();
        actualizarTablaContagiosActivos();

        if (frmPadeceEnfermedad.caravana != null) {

            txtCaravana.setText(frmPadeceEnfermedad.caravana);
            int idEnfermedad = frmPadeceEnfermedad.padece.getIdEnfermedad();
            Enfermedad enfermedad = dControladora.buscarEnfermedad(idEnfermedad);
            txtNomEnfermedad.setText(enfermedad.getNombre());
            Date fechaInicioE = frmPadeceEnfermedad.padece.getFechaInicio();
            Date fechaFinE = frmPadeceEnfermedad.padece.getFechaFinalizacion();

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicio = formato.format(fechaInicioE);

            if (fechaFinE == null) {
                txtFFPadece.setText("SIN FECHA FINALIZACIÓN");
            } else {
                String fechaFin = formato.format(fechaFinE);
                txtFFPadece.setText(fechaFin);
            }

            txtFIPadece.setText(fechaInicio);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAltaTratamiento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetalle = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jDateFechaFinalizacionT = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDateFechaInicioT = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        lblRFechaInicioT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePadeceEnfermedad = new javax.swing.JTable();
        txtFFPadece = new javax.swing.JTextField();
        txtNomEnfermedad = new javax.swing.JTextField();
        txtCaravana = new javax.swing.JTextField();
        txtFIPadece = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTratamiento = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAltaTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaTratamiento.setText("Ingresar");
        btnAltaTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaTratamientoMouseClicked(evt);
            }
        });

        jTextAreaDetalle.setColumns(20);
        jTextAreaDetalle.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDetalle);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Detalle:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Finalización de Tratamiento:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Comienzo de Tratamiento:");

        lblRFechaInicioT.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaInicioT.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInicioT.setText("Requerido");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARAVANA:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enfermedad:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Inicio Enfermedad:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha Fin Enfermedad:");

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enfermedades Activas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTablePadeceEnfermedad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTablePadeceEnfermedad.setBackground(new java.awt.Color(204, 255, 255));
            jTablePadeceEnfermedad.setModel(new javax.swing.table.DefaultTableModel(
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
            jTablePadeceEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTablePadeceEnfermedadMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTablePadeceEnfermedad);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            );

            txtFFPadece.setEditable(false);

            txtNomEnfermedad.setEditable(false);

            txtCaravana.setEditable(false);

            txtFIPadece.setEditable(false);
            txtFIPadece.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtFIPadeceActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jDateFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblRFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jDateFechaFinalizacionT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAltaTratamiento)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNomEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFIPadece, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFFPadece, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 31, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCaravana, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFIPadece, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomEnfermedad, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFFPadece)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateFechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateFechaFinalizacionT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addComponent(btnAltaTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31))
            );

            jPanel3.setBackground(new java.awt.Color(54, 67, 114));
            jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jTableTratamiento.setBackground(new java.awt.Color(204, 255, 255));
            jTableTratamiento.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableTratamientoMouseClicked(evt);
                }
            });
            jScrollPane3.setViewportView(jTableTratamiento);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (jDateFechaInicioT.getDate() == null) {
            lblRFechaInicioT.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioT.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        jDateFechaInicioT.setDate(null);
        jDateFechaFinalizacionT.setDate(null);
        jTextAreaDetalle.setText(null);

    }

    public void actualizarTabla() {
        jTableTratamiento.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableTratamiento.setRowSorter(elQueOrdena);

        ArrayList<Tratamiento> listaTratamientos = dControladora.listarTratamientos();

        model.addColumn("ID Tratamiento");
        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Detalle");
        model.addColumn("Finalizar Tratamiento ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Tratamiento t : listaTratamientos) {

            Bovino bovino = dControladora.buscarBovinoId(t.getPadece().getIdBovino());
            Enfermedad enfermedad = dControladora.buscarEnfermedad(t.getPadece().getIdEnfermedad());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioT = formato.format(t.getFechaInicio());

            if (t.getFechaFinalizacion() == null) {

                model.addRow(new Object[]{t.getIdTratamiento(), bovino.getCaravanaBovino(), enfermedad.getNombre(), t.getPadece().getFechaInicio(), fechaInicioT, t.getFechaFinalizacion(), t.getDetalle(), finalizar, modificar, eliminar});

            } else {

                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacionT = formato1.format(t.getFechaFinalizacion());

                model.addRow(new Object[]{t.getIdTratamiento(), bovino.getCaravanaBovino(), enfermedad.getNombre(), t.getPadece().getFechaInicio(), fechaInicioT, fechaFinalizacionT, t.getDetalle(), finalizar, modificar, eliminar});
            }

        }

        jTableTratamiento.getTableHeader().setReorderingAllowed(false);
        jTableTratamiento.setModel(model);
        jTableTratamiento.setRowHeight(25);
        jTableTratamiento.getColumnModel().getColumn(3).setMaxWidth(0);
        jTableTratamiento.getColumnModel().getColumn(3).setMinWidth(0);
        jTableTratamiento.getColumnModel().getColumn(3).setPreferredWidth(0);
    }

    public void actualizarTablaContagiosActivos() {

        jTablePadeceEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTablePadeceEnfermedad.setRowSorter(elQueOrdena);

        ArrayList<Padece> listaPadeceEnfermedad = dControladora.listarContagiosActivos();

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaPadeceEnfermedad) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioE = formato1.format(p.getFechaInicio());

            if (p.getFechaFinalizacion() == null) {

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicioE, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacionE = formato2.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicioE, fechaFinalizacionE});
            }
        }

        jTablePadeceEnfermedad.getTableHeader().setReorderingAllowed(false);
        jTablePadeceEnfermedad.setModel(model);
        jTablePadeceEnfermedad.setRowHeight(25);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void btnAltaTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaTratamientoMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravana.getText();
            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
            if (bovino != null) {
                Enfermedad enfermedad = dControladora.buscarEnfermedadNombre(txtNomEnfermedad.getText());
                int idEnfermedad = enfermedad.getIdEnfermedad();

                String fecha = txtFIPadece.getText();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaPadece = null;

                try {
                    fechaPadece = formato.parse(fecha);
                } catch (ParseException ex) {
                    Logger.getLogger(frmModificarTratamiento.class.getName()).log(Level.SEVERE, null, ex);
                }

                Padece padece = new Padece(idEnfermedad, bovino.getIdBovino(), fechaPadece);

                String detalle = jTextAreaDetalle.getText();
                Date fechaInicioT = jDateFechaInicioT.getDate();
                Date fechaFinalizacionT = jDateFechaFinalizacionT.getDate();

                Tratamiento tratamiento = new Tratamiento(padece, detalle, fechaInicioT);
                Tratamiento tratamientoFechaF = new Tratamiento(padece, detalle, fechaInicioT, fechaFinalizacionT);

                try {

                    if (jDateFechaFinalizacionT.getDate() == null) {
                        boolean resultado = dominio.dTratamiento.altaTratamientoFechaInicio(tratamiento);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Tratamiento al Bovino Enfermo");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Tratamiento al Bovino Enfermo");
                        }
                    } else if (jDateFechaFinalizacionT.getDate().before(fechaInicioT)) {

                        JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                    } else {
                        boolean resultado = dominio.dTratamiento.altaTratamiento(tratamientoFechaF);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Tratamiento al Bovino Enfermo");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Tratamiento al Bovino Enfermo");
                        }
                    }

                } catch (Exception e) {
                    throw e;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Caravana desconocida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnAltaTratamientoMouseClicked

    private void jTableTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTratamientoMouseClicked

        columna = jTableTratamiento.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableTratamiento.getRowHeight();
        if (columna <= jTableTratamiento.getColumnCount() && columna >= 0 && row <= jTableTratamiento.getRowCount() && row >= 0) {
            Object objeto = jTableTratamiento.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableTratamiento.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idTratamiento = (int) jTableTratamiento.getValueAt(fila, 0);

                        this.dispose();
                        frmModificarTratamiento modificarTratamiento = new frmModificarTratamiento();
                        frmInicio.jDkPEscritorio.add(modificarTratamiento);
                        modificarTratamiento.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                }
                if (botones.getName().equals("btnEliminar")) {
                    int fila = jTableTratamiento.getSelectedRow();

                    int idTratamiento = (int) this.jTableTratamiento.getValueAt(fila, 0);

                    try {

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Tratamiento del Bovino?", "Eliminar Tratamiento del Bovino ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            boolean resultado = dControladora.bajaTratamiento(idTratamiento);

                            if (resultado) {

                                JOptionPane.showMessageDialog(null, "Se Elimino correctamente el Tratamiento del Bovino");
                                actualizarTabla();
                                limpiarCajas(); // Limpiamos Caja de Texto

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Tratamiento");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "El Tratamiento del Bovino no se Elimino");
                        }

                    } catch (Exception e) {
                        throw e;
                    }

                }
                if (botones.getName().equals("btnFinalizar")) {

                    int fila = jTableTratamiento.getSelectedRow();

                    idTratamiento = (int) jTableTratamiento.getValueAt(fila, 0);

                    frmFechaFinalizacionTratamiento frmFechaFT = new frmFechaFinalizacionTratamiento();
                    frmInicio.jDkPEscritorio.add(frmFechaFT);
                    frmFechaFT.setVisible(true);

                    frmTratamiento1 = this;

                }
            }
        }
    }//GEN-LAST:event_jTableTratamientoMouseClicked

    private void jTablePadeceEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePadeceEnfermedadMouseClicked

        int fila = jTablePadeceEnfermedad.getSelectedRow();

        if (fila != -1) {

            String caravana = jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
            String enfermedad = jTablePadeceEnfermedad.getValueAt(fila, 2).toString();
            String fechaInicioE = (String) jTablePadeceEnfermedad.getValueAt(fila, 3);
            String fechaFinE = (String) jTablePadeceEnfermedad.getValueAt(fila, 4);

            if (fechaFinE == null) {
                txtFFPadece.setText("SIN FECHA FINALIZACIÓN");
            } else {

                txtFFPadece.setText(fechaFinE);
            }

            txtCaravana.setText(caravana);
            txtNomEnfermedad.setText(enfermedad);
            txtFIPadece.setText(fechaInicioE);

        } else {
            JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
        }
    }//GEN-LAST:event_jTablePadeceEnfermedadMouseClicked

    private void txtFIPadeceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIPadeceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIPadeceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaTratamiento;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionT;
    private com.toedter.calendar.JDateChooser jDateFechaInicioT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePadeceEnfermedad;
    private javax.swing.JTable jTableTratamiento;
    private javax.swing.JTextArea jTextAreaDetalle;
    private javax.swing.JLabel lblRFechaInicioT;
    private javax.swing.JTextField txtCaravana;
    private javax.swing.JTextField txtFFPadece;
    private javax.swing.JTextField txtFIPadece;
    private javax.swing.JTextField txtNomEnfermedad;
    // End of variables declaration//GEN-END:variables
}
