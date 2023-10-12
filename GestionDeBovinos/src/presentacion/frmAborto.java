/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Aborto;
import clases.BotonesTabla;
import clases.EventoDeSanidad;
import clases.Hembra;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmAborto extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");

    public static int idAborto = 0;
    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmAborto() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("ABORTO");
        actualizarTabla();
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        lblRCausa.setVisible(false);
        lblRFechaAborto.setVisible(false);
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
        btnAltaAborto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboCausa = new javax.swing.JComboBox<>();
        lblRCausa = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaAborto = new com.toedter.calendar.JDateChooser();
        lblRFechaAborto = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAborto = new javax.swing.JTable();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Causa:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 160, 40));

        btnAltaAborto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaAborto.setText("Agregar");
        btnAltaAborto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaAbortoMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaAborto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 40));

        cboCausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Natural", "Inducido" }));
        jPanel2.add(cboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 210, 30));

        lblRCausa.setForeground(new java.awt.Color(255, 51, 51));
        lblRCausa.setText("Requerido");
        jPanel2.add(lblRCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 70, 30));

        lblRHembra.setForeground(new java.awt.Color(255, 51, 51));
        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 40));
        jPanel2.add(jDateFechaAborto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaAborto.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaAborto.setText("Requerido");
        jPanel2.add(lblRFechaAborto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Aborto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

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

        jTableAborto = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableAborto.setBackground(new java.awt.Color(204, 255, 255));
        jTableAborto.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAborto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableAborto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAbortoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAborto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboCausa.setSelectedIndex(0);
        jDateFechaAborto.setDate(null);
        txaDetalle.setText(null);
    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().isEmpty()) {
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
        if (jDateFechaAborto.getDate() == null) {
            lblRFechaAborto.setVisible(true);
            contador++;
        } else {
            lblRFechaAborto.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void actualizarTabla() {
        jTableAborto.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableAborto.setRowSorter(elQueOrdena);

        ArrayList<Aborto> listaAbortos = dControladora.listarAbortos();

        model.addColumn("id Aborto");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Aborto a : listaAbortos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaAborto = formato.format(a.getFecha());

            model.addRow(new Object[]{a.getIdEventoDeSanidad(), a.getHembra().getCaravanaBovino(), fechaAborto, a.getDetalle(), a.getCausa(), modificar, eliminar});
        }

        jTableAborto.getTableHeader().setReorderingAllowed(false);
        jTableAborto.setModel(model);
        jTableAborto.setRowHeight(35);
    }

    public void actualizarTablaHembra() {
        jTableAborto.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableAborto.setRowSorter(elQueOrdena);

        ArrayList<Aborto> listaAbortos = dControladora.listarAbortosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("id Aborto");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Aborto a : listaAbortos) {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaAborto = formato.format(a.getFecha());

            model.addRow(new Object[]{a.getIdEventoDeSanidad(), a.getHembra().getCaravanaBovino(), fechaAborto, a.getDetalle(), a.getCausa(), modificar, eliminar});
        }

        jTableAborto.setModel(model);
        jTableAborto.setRowHeight(35);
    }

    private void btnAltaAbortoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaAbortoMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            if (hembra != null) {

                Date fechaAborto = jDateFechaAborto.getDate();

                String detalle = txaDetalle.getText();

                EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaAborto, detalle, hembra);

                try {

                    if (dControladora.altaEventoDeSanidad(eventoDeSanidad)) {

                        eventoDeSanidad = dControladora.buscarEventoDeSanidadUltimo();

                        String causa = cboCausa.getSelectedItem().toString();

                        Aborto aborto = new Aborto(eventoDeSanidad.getIdEventoDeSanidad(), fechaAborto, detalle, hembra, causa);

                        if (dControladora.altaAborto(aborto)) {
                            dControladora.agregarEventoDeSanidad(aborto);
                            JOptionPane.showMessageDialog(null, "Aborto Ingresado Correctamente");
                            actualizarTabla();
                            limpiarCajas(); // Limpiamos Caja de Texto
                        } else {
                            JOptionPane.showMessageDialog(null, "Aborto No Ingresado Correctamente");
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

    }//GEN-LAST:event_btnAltaAbortoMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased
        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmAborto";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void jTableAbortoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAbortoMouseClicked

        columna = jTableAborto.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableAborto.getRowHeight();
        if (columna <= jTableAborto.getColumnCount() && columna >= 0 && row <= jTableAborto.getRowCount() && row >= 0) {
            Object objeto = jTableAborto.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableAborto.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idAborto = (int) jTableAborto.getValueAt(fila, 0);
                        this.dispose();

                        frmModificarAborto modificarAborto = new frmModificarAborto();
                        frmInicio.jDkPEscritorio.add(modificarAborto);
                        modificarAborto.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Celo a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableAborto.getSelectedRow();
                        int id = Integer.parseInt(this.jTableAborto.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Aborto?", "Eliminar Aborto ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                if (dControladora.bajaAborto(id)) {

                                    JOptionPane.showMessageDialog(null, "Se Eliminó el Aborto");
                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Aborto");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Aborto no se Eliminó");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableAbortoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaAborto;
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JComboBox<String> cboCausa;
    private com.toedter.calendar.JDateChooser jDateFechaAborto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAborto;
    private java.awt.Label lblRCausa;
    private java.awt.Label lblRFechaAborto;
    private java.awt.Label lblRHembra;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
