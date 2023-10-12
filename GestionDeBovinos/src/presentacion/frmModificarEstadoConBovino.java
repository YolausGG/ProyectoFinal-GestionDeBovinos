/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.EstadoBovino;
import clases.EstadoDelBovino;
import dominio.dControladora;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.pEstadoDelBovino;
import static presentacion.frmModificarEstadoConBovino.caravana;

public class frmModificarEstadoConBovino extends javax.swing.JInternalFrame {

    public static String caravana ;

    public static String sexo = "Hembra";
    public frmModificarEstadoConBovino() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR ESTADO DEL BOVINO");
        lblRCaravanaB.setVisible(false);
        lblRFechaInicioE.setVisible(false);
        lblREstado.setVisible(false);
        llenarComboEstado();

        if (caravana != null) {
            txtModificarCaravanaBovino.setText(caravana);
        } else {
            txtModificarCaravanaBovino.setText(frmEstadoConBovino.caravana);
        }

        EstadoBovino estadoBovino = frmEstadoConBovino.estadoBovino;

        jDateModificarFechaIE.setDate(estadoBovino.getFechaInicio());
        jDateModificarFechaFE.setDate(estadoBovino.getFechaFinalizacion());
        int idEstado = estadoBovino.getIdEstadoDelBovino();
        EstadoDelBovino estadoDelBovino = dControladora.buscarEstadoDelBovino(idEstado);

        cboModificarEstado.getModel().setSelectedItem(estadoDelBovino);
        cboModificarEstado.setSelectedItem(estadoDelBovino);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateModificarFechaIE = new com.toedter.calendar.JDateChooser();
        jDateModificarFechaFE = new com.toedter.calendar.JDateChooser();
        txtModificarCaravanaBovino = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        lblRCaravanaB = new javax.swing.JLabel();
        lblRFechaInicioE = new javax.swing.JLabel();
        lblREstado = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboModificarEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

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
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 30));
        jPanel2.add(jDateModificarFechaIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, 30));
        jPanel2.add(jDateModificarFechaFE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 180, 30));
        jPanel2.add(txtModificarCaravanaBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 100, 30));

        lblRCaravanaB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaB.setForeground(new java.awt.Color(255, 51, 51));
        lblRCaravanaB.setText("Requerido");
        jPanel2.add(lblRCaravanaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        lblRFechaInicioE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaInicioE.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaInicioE.setText("Requerido");
        jPanel2.add(lblRFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 130, 30));

        lblREstado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblREstado.setForeground(new java.awt.Color(255, 51, 51));
        lblREstado.setText("Requerido");
        jPanel2.add(lblREstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 30));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Finalizacion de Estado:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 190, 30));

        cboModificarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cboModificarEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cboModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Comienzo de Estado:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtModificarCaravanaBovino.getText().equals("")) {
            lblRCaravanaB.setVisible(true);
            contador++;
        } else {
            lblRCaravanaB.setVisible(false);
        }
        if (jDateModificarFechaIE.getDate() == null) {
            lblRFechaInicioE.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioE.setVisible(false);
        }
        if (cboModificarEstado.getSelectedIndex() == 0) {
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

        txtModificarCaravanaBovino.setText(null);
        jDateModificarFechaIE.setDate(null);
        jDateModificarFechaFE.setDate(null);
        cboModificarEstado.setSelectedIndex(0);

    }

    private void llenarComboEstado() {

        ArrayList<EstadoDelBovino> listaEstados = pEstadoDelBovino.listarEstadosDelBovino();

        if (this.sexo.equals("Macho")) {
            for (EstadoDelBovino estado : listaEstados) {
                if (estado.getEstado().equals("Preñez") || estado.getEstado().equals("Secada") || estado.getEstado().equals("Inseminada") || estado.getEstado().equals("Produccion")) {
                    cboModificarEstado.addItem(estado);
                }

            }
        } else {

            for (EstadoDelBovino estado : listaEstados) {

                cboModificarEstado.addItem(estado);
            }
        }

    }

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked
        frmBuscarBovino buscarBovino = new frmBuscarBovino();
        frmBuscarBovino.frm = "frmModificarEstadoConBovino";
        frmInicio.jDkPEscritorio.add(buscarBovino);
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked

        if (validarCampos()) {

            EstadoBovino estadoBovino = frmEstadoConBovino.estadoBovino;

            String caravanaVieja = frmEstadoConBovino.caravana;
            Bovino bovinoViejo = dControladora.buscarBovinoCaravana(caravanaVieja);
            Date fechaIEVieja = estadoBovino.getFechaInicio();
            Date fechaFEVieja = estadoBovino.getFechaFinalizacion();
            EstadoDelBovino estadoViejo = dControladora.buscarEstadoDelBovino(estadoBovino.getIdEstadoDelBovino());

            String caravana = txtModificarCaravanaBovino.getText();
            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            if (bovino != null) {
                Date fechaIE = jDateModificarFechaIE.getDate();
                Date fechaFE = jDateModificarFechaFE.getDate();
                EstadoDelBovino estadoNuevo = (EstadoDelBovino) cboModificarEstado.getSelectedItem();

                EstadoBovino estadoBovinoViejo = new EstadoBovino(estadoViejo.getIdEstadoDelBovino(), bovinoViejo.getIdBovino(), fechaIEVieja);
                EstadoBovino estadoFechaInicio = new EstadoBovino(estadoNuevo.getIdEstadoDelBovino(), bovino.getIdBovino(), fechaIE);

                EstadoBovino estadoBViejo = new EstadoBovino(estadoViejo.getIdEstadoDelBovino(), bovinoViejo.getIdBovino(), fechaIEVieja, fechaFEVieja);
                EstadoBovino estadoBovinoCompleto = new EstadoBovino(estadoNuevo.getIdEstadoDelBovino(), bovino.getIdBovino(), fechaIE, fechaFE);

                try {
                    if (jDateModificarFechaFE.getDate() == null) {
                        boolean resultado = dControladora.modificarEstadoBovinoFechaInicio(estadoFechaInicio, estadoBovinoViejo);
                        if (resultado) {

                            JOptionPane.showMessageDialog(null, "Estado Asignado al Bovino Modificado Correctamente");
                            caravana = null;
                            limpiarCajas(); // Limpiamos Caja de Texto

                            this.dispose();
                            frmEstadoConBovino estadoConBovino = new frmEstadoConBovino();
                            frmInicio.jDkPEscritorio.add(estadoConBovino);
                            estadoConBovino.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Estado del Bovino");
                        }
                    } else if (jDateModificarFechaFE.getDate().before(fechaIE)) {

                        JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                    } else {
                        if (dControladora.modificarEstadoBovino(estadoBovinoCompleto, estadoBViejo)) {

                            JOptionPane.showMessageDialog(null, "Estado Asignado al Bovino Modificado Correctamente");
                            caravana = null;
                            limpiarCajas(); // Limpiamos Caja de Texto

                            this.dispose();
                            frmEstadoConBovino estadoConBovino = new frmEstadoConBovino();
                            frmInicio.jDkPEscritorio.add(estadoConBovino);
                            estadoConBovino.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Estado del Bovino");
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

    }//GEN-LAST:event_btnModificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Object> cboModificarEstado;
    private com.toedter.calendar.JDateChooser jDateModificarFechaFE;
    private com.toedter.calendar.JDateChooser jDateModificarFechaIE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRCaravanaB;
    private javax.swing.JLabel lblREstado;
    private javax.swing.JLabel lblRFechaInicioE;
    private javax.swing.JTextField txtModificarCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
