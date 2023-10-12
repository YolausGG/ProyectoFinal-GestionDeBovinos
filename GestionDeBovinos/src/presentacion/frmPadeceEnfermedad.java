/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Enfermedad;
import clases.EstadoBovino;
import clases.EstadoDelBovino;
import clases.Padece;
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
import persistencia.pEnfermedad;
import static presentacion.frmInicio.jDkPEscritorio;

public class frmPadeceEnfermedad extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    JButton finalizar = new JButton("Finalizar");

    public static frmPadeceEnfermedad frmPadeceEnfermedad1 = null;

    public static Padece padece = new Padece();

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmPadeceEnfermedad() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("BOVINO PADECE ENFERMEDAD");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        finalizar.setName("btnFinalizar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        lblRCaravanaB.setVisible(false);
        lblRFechaInicioE.setVisible(false);
        lblREnfermedad.setVisible(false);
        llenarComboEnfermedad();

        txtCaravanaBovino.setText(frmBuscarBovino.caravana);

        if (txtCaravanaBovino.getText().isEmpty()) {
            actualizarTabla();

        } else {
            actualizarTablaPadeceB();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateFechaInicioE = new com.toedter.calendar.JDateChooser();
        jDateFechaFinalizacionE = new com.toedter.calendar.JDateChooser();
        txtCaravanaBovino = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        lblRCaravanaB = new javax.swing.JLabel();
        lblRFechaInicioE = new javax.swing.JLabel();
        lblREnfermedad = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboEnfermedad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePadeceEnfermedad = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caravana:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 30));
        jPanel2.add(jDateFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 200, 30));
        jPanel2.add(jDateFechaFinalizacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 210, 30));

        txtCaravanaBovino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaBovinoKeyReleased(evt);
            }
        });
        jPanel2.add(txtCaravanaBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 30));

        lblRCaravanaB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaB.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravanaB.setText("Requerido");
        jPanel2.add(lblRCaravanaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        lblRFechaInicioE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaInicioE.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInicioE.setText("Requerido");
        jPanel2.add(lblRFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 140, 30));

        lblREnfermedad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblREnfermedad.setForeground(new java.awt.Color(255, 51, 51));
        lblREnfermedad.setText("Requerido");
        jPanel2.add(lblREnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 30));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 237, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enfermedad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Finalización de Enfermedad:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 220, 30));

        cboEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel2.add(cboEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Comienzo de Enfermedad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 210, 30));

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
            jTablePadeceEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtCaravanaBovino.getText().equals("")) {
            lblRCaravanaB.setVisible(true);
            contador++;
        } else {
            lblRCaravanaB.setVisible(false);
        }
        if (jDateFechaInicioE.getDate() == null) {
            lblRFechaInicioE.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioE.setVisible(false);
        }
        if (cboEnfermedad.getSelectedIndex() == 0) {
            lblREnfermedad.setVisible(true);
            contador++;
        } else {
            lblREnfermedad.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtCaravanaBovino.setText(null);
        jDateFechaInicioE.setDate(null);
        jDateFechaFinalizacionE.setDate(null);
        cboEnfermedad.setSelectedIndex(0);

    }

    public void actualizarTabla() {

        jTablePadeceEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTablePadeceEnfermedad.setRowSorter(elQueOrdena);
        ArrayList<Padece> listaContagios = dControladora.listarContagios();

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Finalizar Enfermedad ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicio = formato.format(p.getFechaInicio());

            if (p.getFechaFinalizacion() == null) {
                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicio, p.getFechaFinalizacion(), finalizar, modificar, eliminar});
            } else {
                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacion = formato1.format(p.getFechaFinalizacion());
                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicio, fechaFinalizacion, finalizar, modificar, eliminar});
            }

        }

        jTablePadeceEnfermedad.getTableHeader().setReorderingAllowed(false);
        jTablePadeceEnfermedad.setModel(model);
        jTablePadeceEnfermedad.setRowHeight(25);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    public void actualizarTablaPadeceB() {

        jTablePadeceEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTablePadeceEnfermedad.setRowSorter(elQueOrdena);

        String caravana = txtCaravanaBovino.getText();

        Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

        ArrayList<Padece> listaContagiosB = dControladora.listarContagiosPorBovino(bovino.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Finalizar Enfermedad ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Padece p : listaContagiosB) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicio = formato.format(p.getFechaInicio());

            if (p.getFechaFinalizacion() == null) {
                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicio, p.getFechaFinalizacion(), finalizar, modificar, eliminar});
            } else {
                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacion = formato1.format(p.getFechaFinalizacion());
                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicio, fechaFinalizacion, finalizar, modificar, eliminar});
            }

        }

        jTablePadeceEnfermedad.getTableHeader().setReorderingAllowed(false);
        jTablePadeceEnfermedad.setModel(model);
        jTablePadeceEnfermedad.setRowHeight(25);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void llenarComboEnfermedad() {

        ArrayList<Enfermedad> listaEnfermedades = pEnfermedad.listarEnfermedades();

        for (Enfermedad enfermedad : listaEnfermedades) {

            cboEnfermedad.addItem(enfermedad);
        }

    }

    public static String caravana = null;
    public static String enfermedad = null;

    private void jTablePadeceEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePadeceEnfermedadMouseClicked

        if (evt.getClickCount() == 2) {
            if (jTablePadeceEnfermedad.getValueAt(jTablePadeceEnfermedad.getSelectedRow(), 4) == null) {

                int fila = jTablePadeceEnfermedad.getSelectedRow();

                if (fila != -1) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    caravana = jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                    padece.setIdBovino(bovino.getIdBovino());
                    padece.setIdEnfermedad(Integer.parseInt(this.jTablePadeceEnfermedad.getValueAt(fila, 1).toString()));
                    enfermedad = this.jTablePadeceEnfermedad.getValueAt(fila, 2).toString();
                    try {
                        Date fechaInicio = formato.parse((String) this.jTablePadeceEnfermedad.getValueAt(fila, 3));
                        padece.setFechaInicio(fechaInicio);
                    } catch (ParseException ex) {
                        Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (this.jTablePadeceEnfermedad.getValueAt(fila, 4) == null) {
                        padece.setFechaFinalizacion((Date) this.jTablePadeceEnfermedad.getValueAt(fila, 4));
                    } else {
                        try {
                            Date fechaFinalizacion = formato.parse((String) this.jTablePadeceEnfermedad.getValueAt(fila, 4));
                            padece.setFechaFinalizacion(fechaFinalizacion);
                        } catch (ParseException ex) {
                            Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    frmTratamiento frmtratamiento = new frmTratamiento();
                    jDkPEscritorio.add(frmtratamiento);
                    frmtratamiento.setVisible(true);
                }
            } else {

                JOptionPane.showMessageDialog(null, "La Enfermedad ya finalizo no se puede ingresar Tratamiento");
            }

        }

        columna = jTablePadeceEnfermedad.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTablePadeceEnfermedad.getRowHeight();
        if (columna <= jTablePadeceEnfermedad.getColumnCount() && columna >= 0 && row <= jTablePadeceEnfermedad.getRowCount() && row >= 0) {
            Object objeto = jTablePadeceEnfermedad.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTablePadeceEnfermedad.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                        caravana = this.jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
                        Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                        padece.setIdBovino(bovino.getIdBovino());
                        padece.setIdEnfermedad(Integer.parseInt(this.jTablePadeceEnfermedad.getValueAt(fila, 1).toString()));
                        enfermedad = this.jTablePadeceEnfermedad.getValueAt(fila, 2).toString();

                        try {
                            Date fechaInicio = formato.parse((String) this.jTablePadeceEnfermedad.getValueAt(fila, 3));
                            padece.setFechaInicio(fechaInicio);
                        } catch (ParseException ex) {
                            Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        if (this.jTablePadeceEnfermedad.getValueAt(fila, 4) == null) {
                            padece.setFechaFinalizacion((Date) this.jTablePadeceEnfermedad.getValueAt(fila, 4));
                        } else {
                            try {
                                Date fechaFinalizacion = formato.parse((String) this.jTablePadeceEnfermedad.getValueAt(fila, 4));
                                padece.setFechaFinalizacion(fechaFinalizacion);
                            } catch (ParseException ex) {
                                Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        this.dispose();
                        frmModificarPadeceEnfermedad modificarPadeceEnfermedad = new frmModificarPadeceEnfermedad();
                        frmInicio.jDkPEscritorio.add(modificarPadeceEnfermedad);
                        modificarPadeceEnfermedad.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                }
                if (botones.getName().equals("btnEliminar")) {
                    int fila = jTablePadeceEnfermedad.getSelectedRow();

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    String caravana = this.jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
                    int idEnfermedad = Integer.parseInt(this.jTablePadeceEnfermedad.getValueAt(fila, 1).toString());

                    Date fechaInicio = null;

                    try {

                        fechaInicio = formato.parse((String) this.jTablePadeceEnfermedad.getValueAt(fila, 3));
                        padece.setFechaInicio(fechaInicio);
                    } catch (ParseException ex) {
                        Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

                    Padece padece = new Padece(idEnfermedad, bovino.getIdBovino(), fechaInicio);

                    try {

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Bovino Enfermo?", "Eliminar Bovino Enfermo ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            boolean resultado = dControladora.deletePadece(padece);

                            if (resultado) {

                                JOptionPane.showMessageDialog(null, "Se Elimino correctamente el Bovino Enfermo");
                                actualizarTabla();
                                limpiarCajas(); // Limpiamos Caja de Texto

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Bovino Enfermo");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "El Bovino Enfermo no se Elimino");
                        }

                    } catch (Exception e) {
                        throw e;
                    }

                }
                if (botones.getName().equals("btnFinalizar")) {
                    int fila = jTablePadeceEnfermedad.getSelectedRow();

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    caravana = this.jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                    padece.setIdBovino(bovino.getIdBovino());
                    padece.setIdEnfermedad(Integer.parseInt(this.jTablePadeceEnfermedad.getValueAt(fila, 1).toString()));
                    enfermedad = this.jTablePadeceEnfermedad.getValueAt(fila, 2).toString();
                    try {
                        Date fechaInicio = formato.parse((String) this.jTablePadeceEnfermedad.getValueAt(fila, 3));
                        padece.setFechaInicio(fechaInicio);
                    } catch (ParseException ex) {
                        Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    frmFechaFinalizacionEnfermedad frmFechaF = new frmFechaFinalizacionEnfermedad();
                    frmInicio.jDkPEscritorio.add(frmFechaF);
                    frmFechaF.setVisible(true);

                    frmPadeceEnfermedad1 = this;
                }
            }
        }
    }//GEN-LAST:event_jTablePadeceEnfermedadMouseClicked

    private void txtCaravanaBovinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaBovinoKeyReleased
        if (txtCaravanaBovino.getText().isEmpty()) {
            actualizarTabla();

        }
    }//GEN-LAST:event_txtCaravanaBovinoKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked
        frmBuscarBovino buscarBovino = new frmBuscarBovino();

        frmBuscarBovino.frm = "frmPadeceEnfermedad";
        frmInicio.jDkPEscritorio.add(buscarBovino);
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaBovino.getText();
            Date fechaInicioE = jDateFechaInicioE.getDate();
            Date fechaFinalizacionE = jDateFechaFinalizacionE.getDate();
            Enfermedad enfermedad1 = (Enfermedad) cboEnfermedad.getSelectedItem();

            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            if (bovino != null) {
                Padece padece = new Padece(enfermedad1.getIdEnfermedad(), bovino.getIdBovino(), fechaInicioE);

                Padece padeceFechaF = new Padece(enfermedad1.getIdEnfermedad(), bovino.getIdBovino(), fechaInicioE, fechaFinalizacionE);

                try {
                    if (jDateFechaFinalizacionE.getDate() == null) {

                        boolean resultado = dControladora.altaPadeceFechaInicio(padece);

                        if (resultado) {

                            EstadoDelBovino estado = dControladora.buscarEstadoDelBovinoNombre("Enfermo");

                            EstadoBovino EB = new EstadoBovino(estado.getIdEstadoDelBovino(), padece.getIdBovino(), padece.getFechaInicio());

                            dControladora.altaEstadoBovinoFechaInicio(EB);

                            JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Bovino Enfermo");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Bovino Enfermo");
                        }
                    } else if (jDateFechaFinalizacionE.getDate().before(fechaInicioE)) {

                        JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                    } else {
                        boolean resultado = dControladora.altaPadece(padeceFechaF);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Bovino Enfermo");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Bovino Enfermo");
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
    }//GEN-LAST:event_btnIngresarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<Object> cboEnfermedad;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionE;
    private com.toedter.calendar.JDateChooser jDateFechaInicioE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePadeceEnfermedad;
    private javax.swing.JLabel lblRCaravanaB;
    private javax.swing.JLabel lblREnfermedad;
    private javax.swing.JLabel lblRFechaInicioE;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
