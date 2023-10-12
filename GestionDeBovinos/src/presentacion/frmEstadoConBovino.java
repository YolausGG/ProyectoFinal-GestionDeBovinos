/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.EstadoBovino;
import clases.EstadoDelBovino;
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
import persistencia.pEstadoDelBovino;

public class frmEstadoConBovino extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    JButton finalizar = new JButton("Finalizar");

    public static frmEstadoConBovino frmEstadoConBovino1 = null;

    public static EstadoBovino estadoBovino = new EstadoBovino();

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public static String sexo = "";

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmEstadoConBovino() {
        initComponents();
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("ASIGNAR ESTADO A BOVINO");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        finalizar.setName("btnFinalizar");
        lblRCaravanaB.setVisible(false);
        lblRFechaInicioE.setVisible(false);
        lblREstado.setVisible(false);

        llenarComboEstado();

        txtCaravanaBovino.setText(frmBuscarBovino.caravana);

        if (txtCaravanaBovino.getText().isEmpty()) {
            actualizarTabla();

        } else {
            actualizarTablaEstadoB();
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
        lblREstado = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstadoConBovino = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caravana:");

        txtCaravanaBovino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaBovinoKeyReleased(evt);
            }
        });

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });

        lblRCaravanaB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaB.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravanaB.setText("Requerido");

        lblRFechaInicioE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaInicioE.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInicioE.setText("Requerido");

        lblREstado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblREstado.setForeground(new java.awt.Color(255, 51, 51));
        lblREstado.setText("Requerido");

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Finalización de Estado:");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cboEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Comienzo de Estado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblREstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnBuscarBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRCaravanaB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateFechaInicioE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jDateFechaFinalizacionE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRFechaInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jDateFechaInicioE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarBovino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRCaravanaB, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblRFechaInicioE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateFechaFinalizacionE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblREstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableEstadoConBovino = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableEstadoConBovino.setBackground(new java.awt.Color(204, 255, 255));
            jTableEstadoConBovino.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableEstadoConBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jTableEstadoConBovino.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableEstadoConBovinoMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableEstadoConBovino);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (cboEstado.getSelectedIndex() == 0) {
            lblREstado.setVisible(true);
            contador++;
        } else {
            lblREstado.setVisible(false);
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
        cboEstado.setSelectedIndex(0);

    }

    public void actualizarTabla() {
        jTableEstadoConBovino.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEstadoConBovino.setRowSorter(elQueOrdena);
        ArrayList<EstadoBovino> listaEstadoBovinos = dControladora.listarEstadosBovino();

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Estado");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Finalizar Estado ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EstadoBovino e : listaEstadoBovinos) {

            if (e.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(e.getFechaInicio());

                EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(e.getIdEstadoDelBovino());
                Bovino bovino = dControladora.buscarBovinoId(e.getIdBovino());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estado.getIdEstadoDelBovino(), estado.getEstado(), fechaInicio, e.getFechaFinalizacion(), finalizar, modificar, eliminar});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(e.getFechaInicio());

                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacion = formato1.format(e.getFechaFinalizacion());

                EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(e.getIdEstadoDelBovino());
                Bovino bovino = dControladora.buscarBovinoId(e.getIdBovino());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), estado.getIdEstadoDelBovino(), estado.getEstado(), fechaInicio, fechaFinalizacion, finalizar, modificar, eliminar});
            }

        }

        jTableEstadoConBovino.getTableHeader().setReorderingAllowed(false);
        jTableEstadoConBovino.setModel(model);
        jTableEstadoConBovino.setRowHeight(25);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMinWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    public void actualizarTablaEstadoB() {

        jTableEstadoConBovino.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEstadoConBovino.setRowSorter(elQueOrdena);

        String caravana = txtCaravanaBovino.getText();

        Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

        ArrayList<EstadoBovino> listaEstadoB = dControladora.listarEstadosBovinoPorBovino(bovino.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Estado");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Finalizar Estado ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EstadoBovino e : listaEstadoB) {

            if (e.getFechaFinalizacion() == null) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(e.getFechaInicio());

                EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(e.getIdEstadoDelBovino());
                Bovino bovinoE = dControladora.buscarBovinoId(e.getIdBovino());

                model.addRow(new Object[]{bovinoE.getCaravanaBovino(), estado.getIdEstadoDelBovino(), estado.getEstado(), fechaInicio, e.getFechaFinalizacion(), finalizar, modificar, eliminar});
            } else {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(e.getFechaInicio());

                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacion = formato1.format(e.getFechaFinalizacion());

                EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(e.getIdEstadoDelBovino());
                Bovino bovinoE = dControladora.buscarBovinoId(e.getIdBovino());

                model.addRow(new Object[]{bovinoE.getCaravanaBovino(), estado.getIdEstadoDelBovino(), estado.getEstado(), fechaInicio, fechaFinalizacion, finalizar, modificar, eliminar});
            }

        }

        jTableEstadoConBovino.getTableHeader().setReorderingAllowed(false);
        jTableEstadoConBovino.setModel(model);
        jTableEstadoConBovino.setRowHeight(25);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMinWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void llenarComboEstado() {

        ArrayList<EstadoDelBovino> listaEstados = pEstadoDelBovino.listarEstadosDelBovino();

        if (this.sexo.equals("Macho")) {
            for (EstadoDelBovino estado : listaEstados) {
                if (!estado.getEstado().equals("Preñez") && !estado.getEstado().equals("Secada") && !estado.getEstado().equals("Inseminada") && !estado.getEstado().equals("Produccion")) {
                    cboEstado.addItem(estado);
                }

            }
        } else {

            for (EstadoDelBovino estado : listaEstados) {

                cboEstado.addItem(estado);
            }
        }
    }

    public static String caravana = "";
    public static String estado = "";
    private void jTableEstadoConBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoConBovinoMouseClicked

        columna = jTableEstadoConBovino.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEstadoConBovino.getRowHeight();
        if (columna <= jTableEstadoConBovino.getColumnCount() && columna >= 0 && row <= jTableEstadoConBovino.getRowCount() && row >= 0) {
            Object objeto = jTableEstadoConBovino.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableEstadoConBovino.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                        caravana = this.jTableEstadoConBovino.getValueAt(fila, 0).toString();
                        Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                        estadoBovino.setIdBovino(bovino.getIdBovino());
                        estadoBovino.setIdEstadoDelBovino(Integer.parseInt(this.jTableEstadoConBovino.getValueAt(fila, 1).toString()));
                        estado = this.jTableEstadoConBovino.getValueAt(fila, 2).toString();
                        try {
                            Date fechaInicio = formato.parse((String) this.jTableEstadoConBovino.getValueAt(fila, 3));
                            estadoBovino.setFechaInicio(fechaInicio);
                        } catch (ParseException ex) {
                            Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        if (this.jTableEstadoConBovino.getValueAt(fila, 4) == null) {
                            estadoBovino.setFechaFinalizacion((Date) this.jTableEstadoConBovino.getValueAt(fila, 4));
                        } else {
                            try {
                                Date fechaFinalizacion = formato.parse((String) this.jTableEstadoConBovino.getValueAt(fila, 4));
                                estadoBovino.setFechaFinalizacion(fechaFinalizacion);
                            } catch (ParseException ex) {
                                Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        this.dispose();
                        frmModificarEstadoConBovino modificarEstadoConBovino = new frmModificarEstadoConBovino();
                        frmInicio.jDkPEscritorio.add(modificarEstadoConBovino);
                        modificarEstadoConBovino.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                }
                if (botones.getName().equals("btnEliminar")) {
                    int fila = jTableEstadoConBovino.getSelectedRow();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    String caravana = this.jTableEstadoConBovino.getValueAt(fila, 0).toString();
                    int idEstado = Integer.parseInt(this.jTableEstadoConBovino.getValueAt(fila, 1).toString());

                    Date fechaInicio = null;

                    try {

                        fechaInicio = formato.parse((String) this.jTableEstadoConBovino.getValueAt(fila, 3));
                        estadoBovino.setFechaInicio(fechaInicio);

                    } catch (ParseException ex) {
                        Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                    EstadoBovino estadoBovino = new EstadoBovino(idEstado, bovino.getIdBovino(), fechaInicio);

                    try {

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Estado Asignado al Bovino?", "Eliminar Estado del Bovino ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            boolean resultado = dControladora.deleteEstadoBovino(estadoBovino);

                            if (resultado) {

                                JOptionPane.showMessageDialog(null, "Se Elimino correctamente el Estado del Bovino");
                                actualizarTabla();
                                limpiarCajas(); // Limpiamos Caja de Texto

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Estado del Bovino");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "El Estado del Bovino no se Elimino");
                        }

                    } catch (Exception e) {
                        throw e;
                    }

                }
                if (botones.getName().equals("btnFinalizar")) {

                    int fila = jTableEstadoConBovino.getSelectedRow();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    caravana = this.jTableEstadoConBovino.getValueAt(fila, 0).toString();
                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                    estadoBovino.setIdBovino(bovino.getIdBovino());
                    estadoBovino.setIdEstadoDelBovino(Integer.parseInt(this.jTableEstadoConBovino.getValueAt(fila, 1).toString()));
                    estado = this.jTableEstadoConBovino.getValueAt(fila, 2).toString();
                    try {
                        Date fechaInicio = formato.parse((String) this.jTableEstadoConBovino.getValueAt(fila, 3));
                        estadoBovino.setFechaInicio(fechaInicio);
                    } catch (ParseException ex) {
                        Logger.getLogger(frmEstadoConBovino.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    frmFechaFinalizacionEstado frmFechaF = new frmFechaFinalizacionEstado();
                    frmInicio.jDkPEscritorio.add(frmFechaF);
                    frmFechaF.setVisible(true);

                    frmEstadoConBovino1 = this;
                }
            }
        }
    }//GEN-LAST:event_jTableEstadoConBovinoMouseClicked

    private void txtCaravanaBovinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaBovinoKeyReleased
        if (txtCaravanaBovino.getText().isEmpty()) {
            actualizarTabla();

        }
    }//GEN-LAST:event_txtCaravanaBovinoKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked
        frmBuscarBovino buscarBovino = new frmBuscarBovino();
        frmBuscarBovino.frm = "frmEstadoConBovino";
        frmInicio.jDkPEscritorio.add(buscarBovino);
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaBovino.getText();
            Date fechaInicioE = jDateFechaInicioE.getDate();
            Date fechaFinalizacionE = jDateFechaFinalizacionE.getDate();
            EstadoDelBovino estado = (EstadoDelBovino) cboEstado.getSelectedItem();

            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            if (bovino != null) {

                EstadoBovino estadoBovino = new EstadoBovino(estado.getIdEstadoDelBovino(), bovino.getIdBovino(), fechaInicioE);

                EstadoBovino estadoBovinoFechaF = new EstadoBovino(estado.getIdEstadoDelBovino(), bovino.getIdBovino(), fechaInicioE, fechaFinalizacionE);

                try {
                    if (jDateFechaFinalizacionE.getDate() == null) {

                        boolean resultado = dControladora.altaEstadoBovinoFechaInicio(estadoBovino);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Asigno Correctamente el Estado al Bovino");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto
                            sexo = "";
                            cboEstado.removeAllItems();
                            cboEstado.insertItemAt("Seleccionar", 0);
                            llenarComboEstado();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Asignar el Estado al Bovino");
                        }
                    } else if (jDateFechaFinalizacionE.getDate().before(fechaInicioE)) {

                        JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                    } else {
                        boolean resultado = dControladora.altaEstadoBovino(estadoBovinoFechaF);

                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Se Asigno Correctamente el Estado al Bovino");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Asignar el Estado al Bovino");
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
    private javax.swing.JComboBox<Object> cboEstado;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionE;
    private com.toedter.calendar.JDateChooser jDateFechaInicioE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstadoConBovino;
    private javax.swing.JLabel lblRCaravanaB;
    private javax.swing.JLabel lblREstado;
    private javax.swing.JLabel lblRFechaInicioE;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
