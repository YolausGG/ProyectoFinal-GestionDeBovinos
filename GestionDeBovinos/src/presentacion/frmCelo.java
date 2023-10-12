/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Celo;
import clases.EventoDeSanidad;
import clases.Hembra;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.Date;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmCelo extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");

    public static int idCelo = 0;
    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmCelo() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("CELO");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        lblRCausa.setVisible(false);
        lblRFechaCelo.setVisible(false);
        lblRHembra.setVisible(false);

        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        } else {
            actualizarTablaHembra();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaCelo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboCausa = new javax.swing.JComboBox<>();
        lblRCausa = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaCelo = new com.toedter.calendar.JDateChooser();
        lblRFechaCelo = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCelos = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Causa:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 160, 40));

        btnAltaCelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaCelo.setText("Agregar");
        btnAltaCelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltaCelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaCeloMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 40));

        cboCausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Natural", "Inducido" }));
        cboCausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 210, 30));

        lblRCausa.setForeground(new java.awt.Color(255, 51, 51));
        lblRCausa.setText("Requerido");
        jPanel2.add(lblRCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 70, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 40));
        jPanel2.add(jDateFechaCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaCelo.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaCelo.setText("Requerido");
        jPanel2.add(lblRFechaCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha Celo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 40));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 90));

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 100, 30));

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableCelos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableCelos.setBackground(new java.awt.Color(204, 255, 255));
        jTableCelos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCelos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboCausa.setSelectedIndex(0);
        jDateFechaCelo.setDate(null);
        txaDetalle.setText(null);
    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().equals("")) {
            lblRHembra.setVisible(true);
            contador++;
        } else {
            lblRHembra.setVisible(false);
        }
        if (cboCausa.getSelectedIndex() < 1) {
            lblRCausa.setVisible(true);
            contador++;
        } else {
            lblRCausa.setVisible(false);
        }
        if (jDateFechaCelo.getDate() == null) {
            lblRFechaCelo.setVisible(true);
            contador++;
        } else {
            lblRFechaCelo.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void actualizarTabla() {
        jTableCelos.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableCelos.setRowSorter(elQueOrdena);
        ArrayList<Celo> listaCelos = dControladora.listarCelos();

        model.addColumn("id Celo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Celo c : listaCelos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaCelo = formato.format(c.getFecha());

            model.addRow(new Object[]{c.getIdEventoDeSanidad(), c.getHembra().getCaravanaBovino(), fechaCelo, c.getDetalle(), c.getCausa(), modificar, eliminar});
        }

        jTableCelos.getTableHeader().setReorderingAllowed(false);
        jTableCelos.setModel(model);
        jTableCelos.setRowHeight(35);
    }

    public void actualizarTablaHembra() {
        jTableCelos.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableCelos.setRowSorter(elQueOrdena);

        ArrayList<Celo> listaCelos = dControladora.listarCelosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("id Celo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Celo c : listaCelos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaCelo = formato.format(c.getFecha());

            model.addRow(new Object[]{c.getIdEventoDeSanidad(), c.getHembra().getCaravanaBovino(), fechaCelo, c.getDetalle(), c.getCausa(), modificar, eliminar});
        }

        jTableCelos.getTableHeader().setReorderingAllowed(false);
        jTableCelos.setModel(model);
        jTableCelos.setRowHeight(35);
    }

    private void btnAltaCeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaCeloMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            if (hembra != null) {
                Date fechaCelo = jDateFechaCelo.getDate();

                String detalle = txaDetalle.getText();

                EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaCelo, detalle, hembra);

                try {

                    if (dControladora.altaEventoDeSanidad(eventoDeSanidad)) {

                        eventoDeSanidad = dControladora.buscarEventoDeSanidadUltimo();

                        String causa = cboCausa.getSelectedItem().toString();

                        Celo celo = new Celo(eventoDeSanidad.getIdEventoDeSanidad(), fechaCelo, detalle, hembra, causa);

                        if (dControladora.altaCelo(celo)) {
                            dControladora.agregarEventoDeSanidad(celo);
                            JOptionPane.showMessageDialog(null, "Celo Ingresado Correctamente");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto
                        } else {
                            JOptionPane.showMessageDialog(null, "Celo No Ingresado Correctamente");
                            limpiarCajas(); // Limpiamos Caja de Texto
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Evento de Sanidad");
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
    }//GEN-LAST:event_btnAltaCeloMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased
        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmCelo";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void jTableCelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCelosMouseClicked

        columna = jTableCelos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableCelos.getRowHeight();
        if (columna <= jTableCelos.getColumnCount() && columna >= 0 && row <= jTableCelos.getRowCount() && row >= 0) {
            Object objeto = jTableCelos.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableCelos.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idCelo = (int) jTableCelos.getValueAt(fila, 0);
                        this.dispose();

                        frmModificarCelo modificarCelo = new frmModificarCelo();
                        frmInicio.jDkPEscritorio.add(modificarCelo);
                        modificarCelo.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Celo a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableCelos.getSelectedRow();
                        int id = Integer.parseInt(this.jTableCelos.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Celo?", "Eliminar Celo ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                if (dControladora.bajaCelo(id)) {

                                    JOptionPane.showMessageDialog(null, "Se eliminó el Celo");
                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Celo");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Celo no se Eliminó");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableCelosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCelo;
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JComboBox<String> cboCausa;
    private com.toedter.calendar.JDateChooser jDateFechaCelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCelos;
    private java.awt.Label lblRCausa;
    private java.awt.Label lblRFechaCelo;
    private java.awt.Label lblRHembra;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
